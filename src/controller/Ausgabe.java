package controller;

import java.util.Scanner;

public class Ausgabe {

// 	Begr��ungstext
	public static void Begr��ung() {
		System.out.println("Willkommen bei MasterMind.");
		System.out.println("Der CodeMaker w�nscht dir viel Gl�ck!");
	}
	
//	Eingabe der Userzahlen
	public static void UserEingabe(int []usrZahl) {
		boolean eingabe = false;
		int x = 0;
		
		Scanner myScanner = new Scanner(System.in);
//		Schleife f�r die Eingabe von 4 Zahlen ab 1 da 0 in dem Array die Rundennummer enth�lt
		for(int i=1; i<5; i++) {
//			Auffordern f�r die eingabe einer Zahl und Kontrolle
			 do{
				System.out.println("Bitte gib deine " + i + ". Zahl zwischen 1 und 6 ein:");
				x = myScanner.nextInt();
//				Aufrufen der Methode f�r die Kontrolle der Eingabe
				eingabe = Zahlenkontrolle.kontrolleUserEingabe(x);
//			Die Zahl muss so lange eingegeben werden bis sie den Vorgaben entspricht
			}while(eingabe == false);
//			Abspeichern der eingegebenen und gepr�ften Userzahl im Array
			usrZahl[i] = x;
		}
	}
	
//	Ausgabe der Spielnummer, Usereingabe und der Treffer
	public static void ausgabeTreffer(int []x) {
		System.out.print("Spiel Nr: " + x[0] + " - Deine Eingabe: ");
		for(int i=1; i<5;i++) {
			System.out.print(x[i]);
			if(i<4) {
				System.out.print(", ");
			}
		}
		System.out.println(" - Treffer Exakt: " + x[5] + " - Vorhanden: " + x[6]);
	}
	
//	Ausgabe der Rundennummer
	public static void spielnummer(int []x) {
		System.out.println("Dies ist Spiel Nummer: " + x[0]);
	}
	
//	Ausgabe des weiteren Spielverlaufs
	public static void rundenende(int []x) {
//		Pr�fen ob das Spiel gewonnen wurde und Ausgabe
		if(x[5] == 4) {
			System.out.println("Sie haben gewonnen!");
			System.out.println("Spielende...");
//			Beenden des Spieles
			System.exit(1);
//		Pr�fen ob die Rundenzahl erreicht wurde und das Spiel verloren
		}else if(x[0]==11){
			System.out.println("Leider Verloren!");
		}else {
			System.out.println("Neuer Verusch!");
		}
	}
	
//	Ausgabe der Makerzahlen f�r Testzwecke
//	public static void test(int [] zahlenMaker) {
//		for(int i=0; i<4;i++) {
//			System.out.print(zahlenMaker[i] + " ");
//		}
//		System.out.println("");
//	}
}
