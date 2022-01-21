package main;

import javax.swing.JOptionPane;

public class Ex12_ArrayAleatorios1y300App {

	public static void main(String[] args) {
		//Se indica el tamaño del array
        String txt=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(txt)];
        int ultimoNum;
        do{
            txt=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            ultimoNum=Integer.parseInt(txt);
        }while(!(ultimoNum>=0 && ultimoNum<=9));
        //Se rellena el array
        rellenarAleatorioArray(num, 1, 300);
        //Se crea un array que contenga los numeros terminados en el numero especificado
        int terminadosEn[]=numTerminadosEn(num, ultimoNum);
        //Se muestra resultado, 
        mostrarArrayNumTerminadosEn(terminadosEn);
    }
    public static void rellenarAleatorioArray(int array[], int num1, int num2){
        for(int i=0;i<array.length;i++){
            //Se genera un número entre los parametros pasados
            array[i]=((int)Math.floor(Math.random()*(num1-num2)+num2));
        }
    }
    public static void mostrarArrayNumTerminadosEn(int array[]){
        for(int i=0;i<array.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(array[i]!=0){
                System.out.println("El numero "+array[i]+" finaliza con en el numero introducido");
            }
        }
    }
    public static int[] numTerminadosEn (int num[], int ultimoNum){
        //Array que almacena los numeros terminados con el num que se ha pedido al usuario
        int terminadosEn[]=new int[num.length];
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){
        	/* Se resta el numero por el mismo numero sin unidades al final del numero
               Ej: 125-120=5
             */
            numeroFinal=num[i]-(num[i]/10*10);
 
            //Si el numero obtenido es el buscado, se añade
            if (numeroFinal==ultimoNum){
                terminadosEn[i]=num[i];
            }
        }
        return terminadosEn;
    }

}