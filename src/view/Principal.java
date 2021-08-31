package view;

import controller.ThreadCalc;
import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		/*
		 * for (int idThread = 0; idThread < 5; idThread++) { ThreadController thread =
		 * new ThreadController(idThread); thread.start(); }
		 */
		
		int a = 10;
		int b = 2;
		
		for (int op = 0; op < 4; op++) {
			ThreadCalc tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}

}