/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejercicioextra9;

import java.util.Scanner;

public class EjercicioExtra9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        System.out.print("Ingresa un número: ");
        int dividendo = entrada. nextInt();
        System.out.print("Ingresa otro número: ");
        int divisor = entrada.nextInt();
        
        if (dividendo <= 1 || divisor <= 1) {
            System.out.println("Los números deben ser mayores que uno.");           
        }
         
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        
        // Imprimir el resultado
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + dividendo);

    }
    
}
