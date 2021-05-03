package pruebas;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        double res = 0;
        String operacion;
        boolean comprobar = false;
 
        do{
            
            //Pregunta qué operación desea realizar,la operacion sera en función del número que introduzca el usuario
            do {
                System.out.println("\n ¿Que operación desea hacer?");
                System.out.println("Teniendo en cuenta que: \n 1 = sumar \n 2 = restar \n"
                        + " 3 = multiplicar \n 4 = dividir \n ");
            operacion = sc.nextLine();
                if (operacion.equals("1") || operacion.equals("2") || operacion.equals("3") ||
                    operacion.equals("4")) {
                    comprobar = true;
                }else { comprobar = false; }
            } while (comprobar != true);
 
            do{
                comprobar = true;
		    
		     System.out.println("\n Introduzca el primer número de la operación. ");
                     n1 = sc.nextFloat();
                     System.out.println("\n Introduzca el segundo número de la operación.");
                     n2 = sc.nextFloat();
		    
                switch(operacion){
                    case "1":
                        res = n1 + n2;
                        System.out.println("\n El resultado de la suma es: "+res);
                        break;
                    case "2":
                        res = n1 - n2;
                        System.out.println("\n El resultado de la resta es: "+res);
                        break;
                    case "3":
                        res = n1 * n2;
                        System.out.println("\n El resultado de la multiplicacion es: "+res);
                        break;
                    case "4":
                        res = n1 / n2;
                        System.out.println("\n El resultado de la division es: "+res);
                        break;
                }
            }while(comprobar != true);
 
            System.out.println("(" + n1 + ") " + "operacion" + " (" + n2 + ")" + " = " + res);
            /*Pregunta al usuario si desea realizar otra operación o quiere salir */
            System.out.println("\n ¿Desea hacer alguna otra operación? \n");
            System.out.println(" [s/n]");
            do{
                comprobar = true;
                operacion = sc.next();
 
                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, ponga un literal valido. \n");
                        comprobar = false;
                }
            }while(comprobar != true);
        }while(operacion.equals("s") || operacion.equals("S"));
        
    }

}
