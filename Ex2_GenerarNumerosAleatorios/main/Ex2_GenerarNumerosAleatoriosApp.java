package main;

import javax.swing.JOptionPane;

public class Ex2_GenerarNumerosAleatoriosApp {

	public static void main(String[] args) {
		
		//declaro las variables
		String texto = "";
		int limite, num1, num2;
		//se introduce los datos necesarrios 
        texto=JOptionPane.showInputDialog("Introduce la cantidad de numeros para mostrar");
        limite=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce un numero para establecer el rango minimo");
        num1=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce otro numero para el maximo");
        num2=Integer.parseInt(texto);
        //genero los numeros
        System.out.println("Los numeros generados entre esos dos numeros son los siguientes:");
        for(int i=0;i<limite;i++){
            System.out.println(generaNumero(num1, num2));
        }
    }
   public static int generaNumero(int num1, int num2){
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }
}

