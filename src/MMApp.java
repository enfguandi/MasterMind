import controller.*;


public class MMApp {

	public static void main(String[] args) {
/*			
 			MasterMind ist ein deduktives Spiel, das insbesondere Anfang der 70er Jahre sehr beliebt war.
			Ziel des Spiels ist es, einen Geheimcode zu entschl�sseln.

			In der klassischen Variante ordnet ein Spieler, genannt "codemaker", eine Sequenz von vier Symbolen
			geheim an. Praktisch geschieht dies mittels unterschiedlich oder teilweise bzw. g�nzlich 
			gleich gef�rbter Pins oder Murmeln in einer Reihe, wobei maximal sechs Farben zur Verf�gung stehen. 
			
			Ein zweiter Spieler, genannt "codebreaker", versucht durch Testmuster, gleichfalls bestehend aus vier gereihten 
			Symbolen (Pins/Murmeln), den Code zu erraten. H�tte der codebreaker 6 * 6 * 6 * 6 = 1.296 Versuche zur Verf�gung, 
			w�re dies kein Problem, allerdings wird die Anzahl der Tests als Spielregel auf zw�lf (manchmal weniger) begrenzt.
			
			Als Responds auf ein Testmuster muss der codemaker zwei Informationen geben:
			
			1.) Wieviele Symbole im Testmuster stehen an exakt der gleicher Stelle wie im Geheimmuster (im Falle vier, w�re das
			Spiel f�r den codebreaker gewonnen) und 
			2.) wieviele Symbole (Pin-/Murmelfarben) sind sowohl im Geheim- als auch im Testmuster
			vorhanden, allerdings nicht in �bereinstimmender Position in der Reihe.
			
			Die Programmieraufgabe bestehe nun darin, MasterMind interaktiv am PC zu simulieren, wobei der Computer als
			codemaker fungiert, der zun�chst per Zufallsgenerator das Geheimmuster erzeugt. Anschlie�end sind sukzessive
			maximal zw�lf Testmuster vom codebreaker (User) einzugeben und vom codemaker jeweils die zwei Fagen zu beantworten.
*/
		
//			Erkl�rung Array zahlenBreaker:
//				Spalte 0 = Spielnummer
//				Spalte 1 = UserZahl 1
//				Spalte 2 = UserZahl 2
//				Spalte 3 = UserZahl 3
//				Spalte 4 = UserZahl 4
//				Spalte 5 = Treffer Exakt
//				Spalte 6 = Treffer Vorhanden
		
// 		zahlenMaker ist das Array in dem die Zufallszahlen des Makers gespeichert werden
		int zahlenMaker[] = new int[4];
		int zahlenBreaker[][] = new int[12][7];
// 		zahlenTreffer - hier werden die exakten und vorhandenen Zahlentreffer gespeichert um keine Doppelz�hlung zu haben
		int zahlenTreffer[] = new int[5];
		
//		Kleine Begr��ung
		Ausgabe.Begr��ung(); 
//		Erstellung von 4 Zufallszahlen und speichern in dem dazugeh�rigen Array
		Zufallszahlen.erstellen(zahlenMaker);
//		F�r Testzwecke Ausgabe der Maker Zahlen
//		Ausgabe.test(zahlenMaker);
		
//		Spiell�nge 12 Runden
		for(int i=0;i<12;i++) {
//			Zuweisen der Spielnummer an dazugeh�rige Position
			int x = i+1;
			zahlenBreaker[i][0] = x;
//			Ausgeben der Spielnummer
			Ausgabe.spielnummer(zahlenBreaker[i]);
//			Abfragen der Userzahlen und speichern im dazugeh�rigen Arrayblock
			Ausgabe.UserEingabe(zahlenBreaker[i]);
//			Kontrolle ob der User eine Zahl exakt eingegeben hat
			zahlenBreaker[i][5] = Zahlenkontrolle.kontrolleUserZahlenExakt(zahlenBreaker[i], zahlenMaker, zahlenTreffer);
//			Kontrolle ob der User eine richtige Zahl eingegeben hat die aber nicht am richtigen Platz ist
			zahlenBreaker[i][6] = Zahlenkontrolle.kontrolleUserZahlenVorhanden(zahlenBreaker[i], zahlenMaker, zahlenTreffer);
//			Ausgabe der Spielrunge, der vom User eingegebenen Zahlen und der Treffer f�r alle bisher gespielten Runden
			for(int j=0; j<=i; j++) {
				Ausgabe.ausgabeTreffer(zahlenBreaker[j]);
			}
//			Ausgabe ob neue Runde oder Spielende
			Ausgabe.rundenende(zahlenBreaker[i]);
//			Zur�cksetzen der getroffenen Zahlen f�r die neue Runde
			for(int k=0;k<5;k++) {
				zahlenTreffer[k] = 0;
			}
		}
		
	}

}
