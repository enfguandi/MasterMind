package controller;

import java.util.Scanner;

public class Ausgabe {

	public static void Begrüßung() {
		System.out.println("Willkommen bei MasterMind.");
		System.out.println("Der CodeMaker wünscht dir viel Glück!");
	}
	
	public static int [] UserEingabe() {
		
		boolean eingabe = false;
		int x = 0;
		int y= 0;
		int usrZahl[] = new int[4];
		Scanner myScanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			y = i;
			y++;
			 do{
				System.out.println("Bitte gib deine " + y + ". Zahl zwischen 1 und 6 ein:");
				x = myScanner.nextInt();
				eingabe = Zahlenkontrolle.kontrolleUserEingabe(x);
			}while(eingabe == false);
			usrZahl[i] = x;
		}
		
		return usrZahl;
	}
	
	public static void ausgabeTreffer(int trefferExakt, int trefferVorhanden) {
		System.out.println("Treffer Exakt: " + trefferExakt + " Vorhanden: " + trefferVorhanden);
	}
	
	public static void spielnummer(int []x) {
		System.out.println("Dies ist Spiel Nummer: " + x[0]);
	}
	
	public static void rundenende(int []x) {
		if(x[5] == 4) {
			System.out.println("Sie haben gewonnen!");
			System.exit(1);
		}else if(x[0]==11){
			System.out.println("Leider Verloren!");
		}else {
			System.out.println("Neuer Verusch!");
		}
	}
}
