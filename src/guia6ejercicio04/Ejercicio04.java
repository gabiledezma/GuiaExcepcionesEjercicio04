package guia6ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) throws Exception {
        /*
4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
         */
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("2147483648 o más: "); // a partir de 2147483648 se supera el limite de los numeros Integer
            Integer aux = leer.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Ingreso por teclado erróneo. ");
        }
        try {
            String cadena = "Hola";
            int cad = Integer.parseInt(cadena);
        } catch (NumberFormatException b) {
            System.out.println("La cadena no puede convertirse a entero");
        }
        try {
            int num1 = 3, num2 = 0;
            double resultado = num1 / num2;
        } catch (ArithmeticException c) {
            System.out.println("No se puede dividir un número por cero");
        }
    }

}
