package main;

import javax.swing.JOptionPane;

public class Ex3_NumeroPrimoApp {

	public static void main(String[] args) {
		//Declaro las variables
		String txt= "";
		int num;
		
		txt=JOptionPane.showInputDialog("Introduce un numero");
        num=Integer.parseInt(txt);
        //Si el num es primo, devuelve true o false y lo muestra por pantalla si lo es o no"
        if (esPrimo(num)){
        	JOptionPane.showMessageDialog(null, "El numero "+num+" es primo");  
        }else{
        	JOptionPane.showMessageDialog(null, "El numero "+num+" no es primo");
        }
    }
	//metodo boolean para indicar si el num es primo o no
    public static boolean esPrimo (int num){
        int contador=0;
        int divisor = 0;
        
    	//Si el num es menor o igual que 1, entonces no es primo.
        if (num<=1){
            return false;
        }
        //La variable divisor que se declara es igual a la raiz cuadrada del num que se introduce
        for (divisor=(int)Math.sqrt(num);divisor>1;divisor--){
            //contabilizo los num divisibles"
                if (num % divisor==0){
                contador+=1;
            }
        }
        //Devuelve el valor según el numero de divisibles si es o no primo"
        if (contador>=1){
            return false;
        }else{
            return true;
        }
	}
}
