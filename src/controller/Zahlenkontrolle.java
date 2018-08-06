package controller;

public class Zahlenkontrolle {

	public static boolean kontrolleUserEingabe(int usrZahl) {
		
		boolean eingabe = false;
		
		if(usrZahl>0 & usrZahl<7) {
			eingabe = true;
		}
		
		return eingabe;
	}
	
	public static int kontrolleUserZahlenExakt(int []breakerZahlen, int []makerZahlen) {
		int treffer = 0;
		
		for(int i=0; i<4; i++) {
			if(makerZahlen[i] == breakerZahlen[i]) {
				treffer ++;
			}
		}
		
		return treffer;
	}
	
	public static int kontrolleUserZahlenVorhanden(int []breakerZahlen, int []makerZahlen) {
		int treffer = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(makerZahlen[i] == breakerZahlen[j]) {
					treffer ++;
				}
			}
		}
		
		return treffer;
	}
}
