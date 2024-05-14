package fr.diginamic.automates;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JeuDeLaVie {
	public static void AfficherPlateau(HashMap<Integer, Cell> board) {
		// afficher le plateau de jeu
		HashMap<Integer, String> rows = new HashMap<>();
		for (int i = 1; i < board.size() + 1; i++) {
			rows.put(i, "");
		}
		Iterator<Integer> keysIte = board.keySet().iterator();
		while (keysIte.hasNext()) {
			int curKey = keysIte.next();

			for (int i = 1; i < board.size() + 1; i++) {
				String currentRow = rows.get(i);
				if (board.get(curKey).y == i) {
					if (board.get(curKey).isAlive == true) {
						currentRow = currentRow + "X";
					} else {
						currentRow = currentRow + ".";
					}
				}
				rows.put(i, currentRow);
			}
		}
		for (int i = 1; i < 20; i++) {
			System.out.println(rows.get(i));
		}
	}

	// Créer une liste de toutes les cellules voisines d'une cellule donnée
	public static List<Cell> FindCluster(Cell cell, HashMap<Integer, Cell> allCell) {
		List<Cell> cluster = new ArrayList<>();
		Iterator<Integer> keysIte = allCell.keySet().iterator();
		Cell neighbour1 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour2 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour3 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour4 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour5 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour6 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour7 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		Cell neighbour8 = new Cell(allCell.size() + 1, allCell.size() + 1, false);
		while (keysIte.hasNext()) {
			Cell curCel = allCell.get(keysIte.next());
			if (cell.y > 1) {
				if ((curCel.y == cell.y - 1) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
					neighbour1 = curCel;
					cluster.add(neighbour1);
				}
				if ((curCel.y == cell.y - 1) && (curCel.x == cell.x)) {
					neighbour2 = curCel;
					cluster.add(neighbour2);
				}
				if ((curCel.y == cell.y - 1) && (curCel.x == cell.x + 1) && (cell.x < allCell.size() + 1)) {
					neighbour3 = curCel;
					cluster.add(neighbour3);
				}
			}
			if ((curCel.y == cell.y) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
				neighbour4 = curCel;
				cluster.add(neighbour4);
			}
			if ((curCel.y == cell.y) && (curCel.x == cell.x + 1) && (cell.x < allCell.size() + 1)) {
				neighbour5 = curCel;
				cluster.add(neighbour5);
			}
			if (cell.y < allCell.size() + 1) {
				if ((curCel.y == cell.y + 1) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
					neighbour6 = curCel;
					cluster.add(neighbour6);
				}
				if ((curCel.y == cell.y + 1) && (curCel.x == cell.x)) {
					neighbour7 = curCel;
					cluster.add(neighbour7);
				}
				if ((curCel.y == cell.y + 1) && (curCel.x == cell.x + 1) && (cell.x < allCell.size() + 1)) {
					neighbour8 = curCel;
					cluster.add(neighbour8);
				}
			}

		}

		return cluster;

	}

	// Compter les cellules vivantes dans un cluster et renvoyer l'état de la
	// cellule au tour suivant
	public static boolean GiveCellNewStatus(Cell cell, List<Cell> cluster) {
		boolean isAlive = cell.isAlive;
		int cellsAlive = 0;
		for (int i = 0; i < cluster.size(); i++) {
			Cell curCell = cluster.get(i);
			if (curCell.isAlive) {
				cellsAlive++;
			}
		}
		switch (cellsAlive) {
		case (2):
			break;
		case (3):
			isAlive = true;
			break;
		default:
			isAlive = false;
		}
		return isAlive;
	}

	public static HashMap<Integer, Cell> NouvelleGeneration(HashMap<Integer, Cell> oldBoard) {
		HashMap<Integer, Cell> newBoard = new HashMap<>();
		Iterator<Integer> keysIte = oldBoard.keySet().iterator();
		while (keysIte.hasNext()) {
			int key = keysIte.next();
			Cell currentCell = new Cell(oldBoard.get(key).y, oldBoard.get(key).x, oldBoard.get(key).isAlive);
			List<Cell> currentCluster = FindCluster(currentCell, oldBoard);
			currentCell.isAlive = GiveCellNewStatus(currentCell, currentCluster);
			newBoard.put(key, currentCell);
		}
		return newBoard;

	}

	public static void main(String[] args) throws IOException {

		HashMap<Integer, Cell> board = new HashMap<>();
		System.out.println("Choisissez un type de jeu");
		System.out.println("1. Oscillatoire");
		System.out.println("2. Aléatoire");
		Scanner scanner = new Scanner(System.in);
		;
		int choix = Integer.parseInt(scanner.nextLine());
		switch (choix) {
		case 1:
			board = GenererPlateauOscillateur();
			break;
		case 2:
			board = GenererPlateauAleatoire19x19();
			break;
		}

		AfficherPlateau(board);
		int nbCelVivantes = CompterCelVivantes(board);
		while (nbCelVivantes > 0) {
			System.out.println("");
			board = NouvelleGeneration(board);
			AfficherPlateau(board);
			nbCelVivantes = CompterCelVivantes(board);
		}
		;

	}

	private static HashMap<Integer, Cell> GenererPlateauAleatoire19x19() {
		// Créer un plateau de jeu de manière aléatoire
		HashMap<Integer, Cell> board = new HashMap<>();
		int key = 0;
		for (char i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				key++;
				boolean etat = false;
				int random = (int) Math.floor(Math.random() * 10);
				if (random > 6) {
					etat = true;
				}
				board.put(key, new Cell(i, j, etat));
			}
		}
		return board;
	}

	private static int CompterCelVivantes(HashMap<Integer, Cell> board) {
		int celVivantes = 0;
		Iterator<Integer> keysIte = board.keySet().iterator();
		while (keysIte.hasNext()) {
			int key = keysIte.next();
			if (board.get(key).isAlive) {
				celVivantes++;
			}
		}
		return celVivantes;
	}

	private static HashMap<Integer, Cell> GenererPlateauOscillateur() throws IOException {
		// Créer un plateau de jeu contenant un oscillateur
		HashMap<Integer, Cell> board = new HashMap<>();
		Path fichier = Paths.get(
				"C:\\Users\\nlete\\git\\approche-objet\\src\\main\\java\\fr\\diginamic\\automates\\oscillateur.csv");
		List<String> lines = Files.readAllLines(fichier, StandardCharsets.UTF_8);
		int key = 0;
		Iterator<String> iterator = lines.iterator();
		while (iterator.hasNext()) {
			key++;
			String ligneCourante = iterator.next();
			String[] tab = ligneCourante.split(";");
			int a = Integer.parseInt(tab[1]);
			int b = Integer.parseInt(tab[2]);
			boolean isAlive = true;
			String c = tab[3];
			if (c.endsWith("false")) {
				isAlive = false;
			}
			Cell currentCell = new Cell(a, b, isAlive);
			board.put(key, currentCell);
		}
		return board;
	}

}
