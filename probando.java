import java.util.Scanner;

public class Main {
    public static void main(String[] args) {     
           Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
           String nombre;
           double radio;
           int n;
           System.out.print("Introduzca su nombre: ");       
           nombre = sc.nextLine();  //leer un String
           System.out.println("Hola " + nombre + "!!!");
           System.out.print("Introduzca el radio de la circunferencia: ");
           radio = sc.nextDouble(); //leer un double
           System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
           System.out.print("Introduzca un número entero: ");
           n = sc.nextInt(); //leer un entero
           System.out.println("El cuadrado es: " + Math.pow(n,2));
     }
}
