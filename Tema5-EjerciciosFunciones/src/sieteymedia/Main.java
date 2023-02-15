package sieteymedia;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {
	public static Scanner read = new Scanner(System.in);
	public static double tabla[] = { 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 };

	public static void main(String[] args) {
		Funciones.turnoJugador1(tabla);
		Funciones.turnoJugador2(tabla);
		Funciones.esGanador();
	}

}