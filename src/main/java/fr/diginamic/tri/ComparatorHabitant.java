package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.popTotale > ville2.getPopTotale()) {
			return 1;
		} else if (ville1.popTotale < ville2.getPopTotale()) {
			return -1;
		} else {
			return 0;
		}

	}

}
