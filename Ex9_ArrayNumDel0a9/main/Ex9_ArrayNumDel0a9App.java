package main;

import javax.swing.JOptionPane;

public class Ex9_ArrayNumDel0a9App {

	public static void main(String[] args) {
		
		//Declaro variable
		String txt;
		//Pido al usuario el tamaño del array
		txt = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int Array [] = new int[Integer.parseInt(txt)];
		
		//invoco los metodos para rellenar y mostrar el array
		rellenarArray(Array, 0, 9);
		mostrarArray(Array);
	}
	//metodo rellenar array
	public static void rellenarArray (int Array[], int num1, int num2)
	{
		for (int i = 0; i < Array.length; i++) {
			Array[i]=((int)Math.floor(Math.random()*(num1-num2)+num2));
		}
	}
	//metodo mostrar array
	public static void mostrarArray(int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}

}