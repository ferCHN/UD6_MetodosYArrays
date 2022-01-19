package main;

import javax.swing.JOptionPane;

public class Ex7_CambioDivisasApp {

/*	public static void main(String[] args) {
		//declaro variables
		String txt, moneda;
		double cantidad;
		
		txt=JOptionPane.showInputDialog("Escribe una cantidad en euros");
        cantidad=Double.parseDouble(txt);
       if(isNumeric(cantidad))
       {
    	   System.out.println(cantidad + " es un numero");
           
       }
       else {
    	   System.out.println(cantidad + " NO es un numero");	
       }
        moneda=JOptionPane.showInputDialog("Puedes selecionar libras, dolares o yenes. "
        		+ "Escribe la moneda a la que quieres convertir:");
        conversor(cantidad, moneda);
    }
	public static boolean isNumeric(int euros){
		try {
			Integer.parseInteger(euros);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}*/
	//metodo para convertir euros a otra divisa
	public static void conversor (double cantidad, String moneda){
        double resultado=0;
 
        //Este boolean se utiliza en caso de que el usuario no introduzca un nombre de moneda correcto
        boolean correcto = true;
        //Segun la moneda, se calcula la cantidad
        switch (moneda){
        case "libras":
            resultado=cantidad*0.86;
            break;
        case "dolares":
            resultado=cantidad*1.29;
            break;
        case "yenes":
            resultado=cantidad*129.852;
            break;
        default:
        	JOptionPane.showMessageDialog(null, "No has introducido una moneda correcta");
            correcto=false;
        }
        //Solo si es correcto muestra el mensaje
        if (correcto){
        	JOptionPane.showMessageDialog(null, cantidad+ " euros en " +moneda+ " son " +resultado);
        }
	}
}
