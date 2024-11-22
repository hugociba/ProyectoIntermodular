import java.util.Scanner;
public class FormatosPrinf {
   public static void main(String[] args) {

      double decimal = 999.235;
      long entero = 456;
      String cadena = "hola mundo";

      // imprimimos un número entero y saltamos de línea
      System.out.printf (entero +" = %d km %n", entero + "hola");

      // imprimimos una cadena
      System.out.printf (cadena +" = %s %n", cadena);

      // tres decimales
      System.out.printf (decimal +" = %.3f %n", decimal ); 

      // dos decimales
      System.out.printf (decimal +" = %.2f %n", decimal);

      // un decimal
      System.out.printf (decimal +" = %.1f %n", decimal);

      // un cero delante de la parte entera y 4 decimales
      System.out.printf (decimal +" = %09.4f %n", decimal);
   }
}