package controller;

public class Zufallszahlen {

	public static int [] erstellen() {
		
		int maker[] = new int[4];
		int zufallsZahl = 0;
		
		for(int i=0; i<4; i++) {
			
			zufallsZahl  = 0;
			
			while( zufallsZahl == 0 | zufallsZahl > 6 ) {
				zufallsZahl  = (int) (Math.random() * 10);
			}
			
			maker[i] = zufallsZahl;

		}
		
		return maker;
	}
}
