package controller;

public class Zufallszahlen {

//	Erstellen von 4 Zufallszahlen und spiechern dieser in dem Maker Array
	public static void erstellen(int [] maker) {
		
//		int maker[] = new int[4];
		int zufallsZahl = 0;
		
		for(int i=0; i<4; i++) {
			
			zufallsZahl  = 0;
			
			while( zufallsZahl == 0 | zufallsZahl > 6 ) {
				zufallsZahl  = (int) (Math.random() * 10);
			}
			
			maker[i] = zufallsZahl;

		}
		
//		return maker;
	}
}
