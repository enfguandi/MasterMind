import controller.*;


public class MMApp {

	public static void main(String[] args) {
		/*	MasterMind ist ein deduktives Spiel, das insbesondere Anfang der 70er Jahre sehr beliebt war.
			Ziel des Spiels ist es, einen Geheimcode zu entschlüsseln.

			In der klassischen Variante ordnet ein Spieler, genannt "codemaker", eine Sequenz von vier Symbolen
			geheim an. Praktisch geschieht dies mittels unterschiedlich oder teilweise bzw. gänzlich 
			gleich gefärbter Pins oder Murmeln in einer Reihe, wobei maximal sechs Farben zur Verfügung stehen. 
			
			Ein zweiter Spieler, genannt "codebreaker", versucht durch Testmuster, gleichfalls bestehend aus vier gereihten 
			Symbolen (Pins/Murmeln), den Code zu erraten. Hätte der codebreaker 6 * 6 * 6 * 6 = 1.296 Versuche zur Verfügung, 
			wäre dies kein Problem, allerdings wird die Anzahl der Tests als Spielregel auf zwölf (manchmal weniger) begrenzt.
			
			Als Responds auf ein Testmuster muss der codemaker zwei Informationen geben:
			
			1.) Wieviele Symbole im Testmuster stehen an exakt der gleicher Stelle wie im Geheimmuster (im Falle vier, wäre das
			Spiel für den codebreaker gewonnen) und 
			2.) wieviele Symbole (Pin-/Murmelfarben) sind sowohl im Geheim- als auch im Testmuster
			vorhanden, allerdings nicht in übereinstimmender Position in der Reihe.
			
			Die Programmieraufgabe bestehe nun darin, MasterMind interaktiv am PC zu simulieren, wobei der Computer als
			codemaker fungiert, der zunächst per Zufallsgenerator das Geheimmuster erzeugt. Anschließend sind sukzessive
			maximal zwölf Testmuster vom codebreaker (User) einzugeben und vom codemaker jeweils die zwei Fagen zu beantworten.
		 */
		
		//	Erklärung Array zahlenBreaker:
		//		Spalte 0 = Spielnummer
		//		Spalte 1 = UserZahl 1
		//		Spalte 2 = UserZahl 2
		//		Spalte 3 = UserZahl 3
		//		Spalte 4 = UserZahl 4
		//		Spalte 5 = Treffer Exakt
		//		Spalte 6 = Treffer Vorhanden
		
		int zahlenMaker[] = new int[4];
		int zahlenBreaker[][] = new int[12][7];
//		int trefferExakt = 0;
//		int trefferVorhanden = 0;
		int j = 0;
		
		Ausgabe.Begrüßung();
		zahlenMaker = Zufallszahlen.erstellen();
		
		for(int i=0;i<12;i++) {
			j = i;
			j++;
			
			zahlenBreaker[i][0] = i;
			Ausgabe.spielnummer(zahlenBreaker[i]);
			
			
			zahlenBreaker[i] = Ausgabe.UserEingabe();

	
			zahlenBreaker[i][5] = Zahlenkontrolle.kontrolleUserZahlenExakt(zahlenBreaker[i], zahlenMaker);
			zahlenBreaker[i][6] = Zahlenkontrolle.kontrolleUserZahlenVorhanden(zahlenBreaker[i], zahlenMaker);
			
			Ausgabe.ausgabeTreffer(zahlenBreaker[i][5], zahlenBreaker[i][6]);
			Ausgabe.rundenende(zahlenBreaker[i]);
			
			
//			trefferExakt = Zahlenkontrolle.kontrolleUserZahlenExakt(zahlenBreaker[i], zahlenMaker);
//			trefferVorhanden = Zahlenkontrolle.kontrolleUserZahlenVorhanden(zahlenBreaker[i], zahlenMaker);
			
//			Ausgabe.ausgabeTreffer(trefferExakt, trefferVorhanden);
//			Ausgabe.rundenende(trefferExakt, i);
		}
		
	}

}
