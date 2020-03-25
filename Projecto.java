package projecto;

import java.util.Scanner;

public class Projecto {

    public static void main(String[] args) {
        
Scanner entrada = new Scanner (System.in);

int num1 ; 
int num2 ; 
int operacion ;
	float suma, resta, multi, divi ;
	
	System.out.println("Bienvenido en la Calculadora de JuHEd");
	System.out.print(" ");
	
	System.out.printf("Dame un numero");
	num1 = entrada.nextInt();
	
	System.out.printf("Dame otro numero");
	num2 = entrada.nextInt();
	
	
	System.out.printf("Que operacion desseas realisar: ");
	
	System.out.println("Para sumar, Presta 1 - Restar, presta 2 - Multiplicacion, presta 3 - Dividir, presta 4 ");		
         operacion = entrada.nextInt();
        
	if (operacion == 1 ) {
		suma = num1 + num2 ;
		System.out.println("El resultado es: "+suma);
        }
        
	 if (operacion == 2 ) {
		resta = num1 - num2 ;
		System.out.println("El resultado es: "+resta);
         }
         
	if (operacion == 3 ) {
		multi = num1 * num2 ;
               System.out.println("El resultado es: "+multi);
        }
        
	 if (operacion == 4 ) {
		divi = num1 / num2 ;
		System.out.println("El resultado es: "+divi);
    }
}
}