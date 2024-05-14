package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JeuDeLaVie {
	public static void AfficherPlateau(HashMap<Integer, Cell> board) {
		// afficher le plateau de jeu
		HashMap<Integer, String> rows = new HashMap<>();
		for (int i = 1; i < 20; i++) {
			rows.put(i, "");
		}
		Iterator<Integer> keysIte = board.keySet().iterator();
		while (keysIte.hasNext()) {
			int curKey = keysIte.next();

			for (int i = 1; i < 20; i++) {
				String currentRow = rows.get(i);
				if (board.get(curKey).y == i) {
					if (board.get(curKey).isAlive == true) {
						currentRow = currentRow + "X";
					} else {
						currentRow = currentRow + "O";
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
		Iterator<Cell> valuesIte = allCell.values().iterator();
		Cell neighbour1 = new Cell(20, 20, false);
		Cell neighbour2 = new Cell(20, 20, false);
		Cell neighbour3 = new Cell(20, 20, false);
		Cell neighbour4 = new Cell(20, 20, false);
		Cell neighbour5 = new Cell(20, 20, false);
		Cell neighbour6 = new Cell(20, 20, false);
		Cell neighbour7 = new Cell(20,20, false);
		Cell neighbour8 = new Cell(20, 20, false);
		if (cell.y > 'A') {
			while (valuesIte.hasNext() && keysIte.hasNext()) {
				Cell curCel = valuesIte.next();
				if ((curCel.y == cell.y - 1) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
					neighbour1 = curCel;
					cluster.add(neighbour1);
				} else if ((curCel.y == cell.y - 1) && (curCel.x == cell.x)) {
					neighbour2 = curCel;
					cluster.add(neighbour2);
				} else if ((curCel.y == cell.y - 1) && (curCel.x == cell.x + 1) && (cell.x < 26)) {
					neighbour3 = curCel;
					cluster.add(neighbour3);
				}
			}
		}
		while (valuesIte.hasNext() && keysIte.hasNext()) {
			Cell curCel = valuesIte.next();
			if ((curCel.y == cell.y) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
				neighbour4 = curCel;
				cluster.add(neighbour4);
			} else if ((curCel.y == cell.y) && (curCel.x == cell.x + 1) && (cell.x < 26)) {
				neighbour5 = curCel;
				cluster.add(neighbour5);
			}
		}
		if (cell.y < 'Z') {
			while (valuesIte.hasNext() && keysIte.hasNext()) {
				Cell curCel = valuesIte.next();
				if ((curCel.y == cell.y + 1) && (curCel.x == cell.x - 1) && (cell.x > 1)) {
					neighbour6 = curCel;
					cluster.add(neighbour6);
				} else if ((curCel.y == cell.y + 1) && (curCel.x == cell.x)) {
					neighbour7 = curCel;
					cluster.add(neighbour7);
				} else if ((curCel.y == cell.y + 1) && (curCel.x == cell.x + 1) && (cell.x < 26)) {
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
		for (int i=0; i<cluster.size(); i++) {
			Cell curCell = cluster.get(i);
			if (curCell.isAlive) {
				cellsAlive++;
			}
		}
		switch (cellsAlive) {
		case (2):
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
			Cell currentCell = new Cell(oldBoard.get(key).y,oldBoard.get(key).x,oldBoard.get(key).isAlive );
			List<Cell> currentCluster = FindCluster(currentCell, oldBoard);
			currentCell.isAlive=GiveCellNewStatus(currentCell,currentCluster);
			newBoard.put(key, currentCell);
		}
		return newBoard;

	}

	public static void main(String[] args) {
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
		AfficherPlateau(board);
		int nbCelVivantes = CompterCelVivantes(board);
		while(nbCelVivantes>0){
			System.out.println("");
			board=NouvelleGeneration(board);
			AfficherPlateau(board);
			nbCelVivantes = CompterCelVivantes(board);
		};
		
	}

	private static int CompterCelVivantes(HashMap<Integer, Cell> board) {
		int celVivantes=0;
		Iterator<Integer> keysIte = board.keySet().iterator();
		while (keysIte.hasNext()) {
			int key = keysIte.next();
			if(board.get(key).isAlive) {
				celVivantes++;
			}
		}
		return celVivantes;
	}

}
