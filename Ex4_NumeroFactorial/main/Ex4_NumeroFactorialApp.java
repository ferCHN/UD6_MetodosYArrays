package main;

import javax.swing.JOptionPane;

public class Ex4_NumeroFactorialApp {

	public static void main(String[] args) {
		//Declaro las variables
		String txt;
		int num;
		//Indico al usuario que introduzca un numero
		txt=JOptionPane.showInputDialog("Introduce un numero sin decimales: ");
        num =Integer.parseInt(txt);
        //Muestro por pantalla el factorial de num
        JOptionPane.showMessageDialog(null, "El factorial de "+num+ " es " +factorial(num));
    }
	//metodo para calcular el factorial de num
   public static int factorial (int num){
        int res=num;
        int contador;
        
        //tipo for que se inicia con el numero anterior al que el usuario introdujo
        for(contador=(num-1);contador>0;contador--){
            //Acumulo el resultado
            res=res*contador;
        }
        return res;
    }
}


