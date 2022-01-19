package main;
import javax.swing.JOptionPane;

public class Ex5_NumeroDecimalABinarioApp {

	public static void main(String[] args) {
		//Declaro variables
		int num;
		String txt;
		String binario;
		
		//Pido al usuario un num sin decimales
		txt=JOptionPane.showInputDialog("Introduce un numero sin decimales");
        num=Integer.parseInt(txt);
        //Llamo a la metodo para guardarlo en la variable binario y lo muestro por pantalla
        binario=decimalBinario(num);
        JOptionPane.showMessageDialog(null, "El numero "+num+ " en binario es "+binario);
    }
	//metodo para calcular el binario de un numero
	public static String decimalBinario (int num){
        //Declaro variables
		String binario="";
        String digito;
        int i;
        for(i=num;i>0;i/=2){ //for que asigna la i el num introducido i mira si se puede dividir entre 2
            if(i%2==1){// si el residuo da 1, se guarda a la variable digito el 1 
                digito="1";
            }else{ //de lo contrario se guarda el 0
                digito="0";
            }
            //Se guarda la informacion a la variable binario para devolverla al usuario
            binario=digito+binario;
        }
        return binario;
    }

}

