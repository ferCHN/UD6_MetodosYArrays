package main;

import javax.swing.JOptionPane;

public class Ex11_MultiplicarDosArrayApp {

	public static void main(String[] args) {
		//Se indica la dimension
        String texto=JOptionPane.showInputDialog("Introduce la dimension del array:");
        int dimension=Integer.parseInt(texto);
        //Se crea los arrays
        int array1[]=new int [dimension];
        int array2[];
        //Se rellena el array1
        rellenarNumAleatorioArray(array1, 10, 100);
        //Se apunta el array2 al array1
        array2=array1;
        //Se crea un nuevo array, usando el array1. Array1 tiene una nueva direccion.
        array1=new int[dimension];
        //Se vuelve a rellenar, ya que al crear el array de nuevo no tiene los numeros anteriores
        rellenarNumAleatorioArray(array1, 10, 100);
        //Se crea el array 3 con el resultado de multiplicar los valores de los arrays
        int array3[]=multiplicador(array1, array2);
        //Se muestra el contenido de los arrays
        System.out.println("Array 1");
        mostrarArray(array1);
        System.out.println("-------");
        System.out.println("Array 2");
        mostrarArray(array2);
        System.out.println("-------");
        System.out.println("Array 3");
        mostrarArray(array3);
    }
	//metodo para rellenar numeros aleatorios en el array
    public static void rellenarNumAleatorioArray(int array[], int num1, int num2){
        for(int i=0;i<array.length;i++){
            //Se genera un número entre los parametros pasados
            array[i]=((int)Math.floor(Math.random()*(num1-num2)+num2));
        }
    }
    //metodo para mostrar el array
    public static void mostrarArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+array[i]);
        }
    }
    //metodo para multiplicar los dos arrays
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}