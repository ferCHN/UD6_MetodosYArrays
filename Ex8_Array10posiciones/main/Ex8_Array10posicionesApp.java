package main;

import javax.swing.JOptionPane;

public class Ex8_Array10posicionesApp {

	public static void main(String[] args) {
		int Array[] = new int[10];
		
		rellenarValores(Array);
		mostrarValores(Array);
	}
	public static void rellenarValores (int Array[])
	{
		String txt;
		for (int i = 0; i < Array.length; i++) {
			txt= JOptionPane.showInputDialog("Introduce un numero para rellenar el array");
			Array[i] = Integer.parseInt(txt);
		}
	}
	public static void mostrarValores (int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			System.out.println("En la posicion "+i+" se encuentra el valor: "+ Array[i]);
		}
	}

}