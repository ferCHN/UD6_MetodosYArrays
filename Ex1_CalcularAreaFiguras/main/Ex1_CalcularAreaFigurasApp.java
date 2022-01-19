package main;

import javax.swing.JOptionPane;

public class Ex1_CalcularAreaFigurasApp {
	
	//Metodos para calcular el area de las 3 figuras
	public static double areaCirculo (double radio)
	{
		return Math.pow(radio, 2)*Math.PI;
	}
	public static double areaTriangulo (double base, double altura)
	{
		return base*altura/2;
	}
	public static double areaCuadrado (double lado) {
		return lado*lado;
	}

	public static void main(String[] args) {
		
		//definir variables
		double radio, base, altura, lado;
		double resultado=0;
		String texto = ""; 
		String seleccion = "";
		//variables inicializadas para el codigo que no funciona
		//String figuras[] = {"circulo","triangulo","cuadrado"};
		//boolean finalizado = false;
		
		//Mostrar un mensaje en pantalla para introducir la figura
        seleccion=JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
        
        switch (seleccion){ //Se realiza un switch para saber que figura es y posteriormente
        //se hacen los calculos
        case "circulo":
            texto=JOptionPane.showInputDialog("Introduce el radio");
            radio=Double.parseDouble(texto);
            resultado=areaCirculo(radio);
            JOptionPane.showMessageDialog(null, "El area del "+seleccion+" es: "+resultado);
            break;
        case "triangulo":
            texto=JOptionPane.showInputDialog("Introduce la base");
            base=Double.parseDouble(texto);
            texto=JOptionPane.showInputDialog("Introduce la altura");
            altura=Double.parseDouble(texto);
            resultado=areaTriangulo(base, altura);
            JOptionPane.showMessageDialog(null, "El area del "+seleccion+" es: "+resultado);
            break;
        case "cuadrado":
            texto=JOptionPane.showInputDialog("Introduce la medida de un lado");
            lado=Double.parseDouble(texto);
            resultado=areaCuadrado(lado);
            JOptionPane.showMessageDialog(null, "El area del "+seleccion+" es: "+resultado);
            break;
        default:
        	//muestra un mensaje sobre que no se ha escrito una figura correctamente
        	JOptionPane.showMessageDialog(null, "Error: No has introducido una figura correcta");
        }
   }
}
