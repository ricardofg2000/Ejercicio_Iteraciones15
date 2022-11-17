package unico;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pinte una pirámide rellena con un carácter
		 * introducido por teclado que podrá ser una letra, un número o un símbolo como
		 * *, +, -, $, &,etc. El programa debe permitir al usuario mediante un menú
		 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
		 * hacia la izquierda o hacia la derecha.
		 */

		Scanner leer = new Scanner(System.in);

		final int TAMAÑO = 3;
		String caracter;
		int opc;

		System.out.print("Introduzca el caracter con el que quiere realizar la pirámide: ");
		caracter = leer.nextLine();
		System.out.println("Hacia donde quieres que apunte la pirámide :");
		System.out.println("1.- Arriba");
		System.out.println("2.- Abajo");
		System.out.println("3.- Izquierda");
		System.out.println("4.- Derecha");
		opc = Integer.parseInt(leer.nextLine());

		switch (opc) {
		case 1:
			System.out.println();
			for (int altura = 1; altura <= TAMAÑO; altura++) {
				// Espacios en blanco
				for (int blancos = 1; blancos <= TAMAÑO - altura; blancos++) {
					System.out.print(" ");
				}

				// Figura
				for (int figura = 1; figura <= (altura * 2) - 1; figura++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println();
			for (int altura = 1; altura <= TAMAÑO; altura++) {
				// Espacios en blanco
				for (int blancos = 1; blancos <= altura - 1; blancos++) {
					System.out.print(" ");
				}

				// Figura
				for (int figura = 1; figura <= ((TAMAÑO - altura) * 2 + 1); figura++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println();
			for (int altura = 1; altura <= TAMAÑO * 2 - 1; altura++) {
				// Espacios en blanco
				for (int blancos = 1; blancos <= TAMAÑO - altura || blancos <= altura - TAMAÑO; blancos++) {
					System.out.print(" ");
				}

				// Figura
				for (int figura = 1; figura <= altura && figura <= TAMAÑO * 2 - altura; figura++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println();
			for (int altura = 1; altura <= TAMAÑO * 2 - 1; altura++) {
				//Figura
				for (int figura = 1; figura <= altura && figura <= TAMAÑO * 2 - altura; figura++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
		default:
			System.out.println("Error");
		}

	}
}
