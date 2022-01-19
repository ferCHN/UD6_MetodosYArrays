package main;

import javax.swing.JOptionPane;

public class Ex10_ArrayPrimosApp {

	public static void main(String[] args) {
		//Pido al usuario el tamaño del array
        String txt, txt1;
        int primoMasGrande, num2;
		txt=JOptionPane.showInputDialog("Introduce un tamaño del array");
        int num[]=new int[Integer.parseInt(txt)];
        txt1=JOptionPane.showInputDialog("El numero minimo es 1. Por lo tanto introduce el numero "
        		+ "maximo");
        num2 = Integer.parseInt(txt1);
        
        //Invoco las funciones
        rellenarNumPrimosAleatorioArray(num, 1, num2);
        mostrarArray(num); 
        //Saco el primo mayor
        primoMasGrande=mayor(num);
        System.out.println("El numero primo más grande es el: "+primoMasGrande);
    }
    public static void rellenarNumPrimosAleatorioArray(int lista[], int num1, int num2){
        int i=0;
        //Uso mejor un while, ya que solo aumentara el indice cuando se genere un primo
        while(i<lista.length){           
            int num=((int)Math.floor(Math.random()*(num1-num2)+num2));           
            if (esPrimo(num)){              
                lista[i]=num;               
                i++;            
            }       
        }   
    }
    //metodo para calcular si el num es primo o no
    private static boolean esPrimo (int num){        
        //El 0 y el 1, son directamente no primos.
        if (num<=1){
            return false;
        }else{
            //declaracion       
            int prueba;         
            int contador=0;
            //Se hace la raiz cuadrada y se usa para dividir el numero original
            prueba=(int)Math.sqrt(num);
            //Bucle que cuenta los numeros divisibles
            for (;prueba>1;prueba--){
                if (num%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }    
        return mayor;
    }

}
