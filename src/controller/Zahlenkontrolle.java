package controller;

public class Zahlenkontrolle {

//	Kontrolle der Userzahlen
	public static boolean kontrolleUserEingabe(int usrZahl) {
		boolean eingabe = false;
//		Wenn die eingegebene Userzahl nicht 0 ist und kleiner als 7 dann ist die Eingabe richtig
		if(usrZahl>0 & usrZahl<7) {
			eingabe = true;
		}
		
		return eingabe;
	}
	
//	Kontrolle ob eine Userzahl exakt mit einer Zahl des Makers übereinstimmt und speichern des Ergebnisses in einem Array
	public static int kontrolleUserZahlenExakt(int []breakerZahlen, int []makerZahlen, int [] zahlenTreffer) {
		int treffer = 0;
//		j ist eine Zahl höher als i um die Daten an dem richtigen Arrayplatz zu speichern
		int j = 1;
//		Prüfen aller 4 Zahlen
		for(int i=0; i<4; i++) {
//			Wenn die Userzahl exakt mit der Makerzahl übereinstimmt wird der Treffer hochgezählt und in einem Array gespeichert
			if(makerZahlen[i] == breakerZahlen[j]) {
				treffer ++;
				zahlenTreffer[j] = 1;
			}
			j++;
		}
		return treffer;
	}
	
//	Kontrolle ob die eingegebenen Userzahlen bei den Makerzahlen vorhanden sind aber nicht exakt getroffen wurden
	public static int kontrolleUserZahlenVorhanden(int []breakerZahlen, int []makerZahlen, int [] zahlenTreffer) {
		int treffer = 0;
		
//		Überprüfen jeder vom User eingegebenen Zahl mit jeder vom Maker erstellten Zahl
		for(int i=0; i<4; i++) {
			for(int j=1; j<5; j++) {
//				Wenn die Zahlen vom Maker und User übereinstimmen UND die Zahl nicht von der exakten Prüfung schon gezählt wurde
//				Zähle den Treffer eins hoch und speicher den Treffer in dem Array
				if(makerZahlen[i] == breakerZahlen[j] & zahlenTreffer[j] != 1) {
					treffer ++;
					zahlenTreffer[j] = 1;
				}
			}
		}
		return treffer;
	}
}
