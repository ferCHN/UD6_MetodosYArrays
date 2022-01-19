package main;

import javax.swing.JOptionPane;

public class Ex6_ContarCifrasNumeroApp {

	public static void main(String[] args) {
		
		int num=0;
		String texto;
        do{
            texto=JOptionPane.showInputDialog("Introduce un numero entero no negativo");
            num=Integer.parseInt(texto);
        }while(num<0);
        int numCifras=cuentaCifras(num);
        //Se controla en el caso de que haya una cifra o mas
        if (numCifras==1){
        	JOptionPane.showMessageDialog(null, "El numero "+num+ " tiene "+numCifras+" cifra");
        }else{
        	JOptionPane.showMessageDialog(null, "El numero "+num+ " tiene "+numCifras+" cifras");
        }
    }
	//Metodo para contar las cifras de un numero
    public static int cuentaCifras (int num){
         int contador=0;
         
         for (int i=num;i>0;i/=10){
             //Incrementamos el contador
             contador++;
         }
         return contador;
    }
}

