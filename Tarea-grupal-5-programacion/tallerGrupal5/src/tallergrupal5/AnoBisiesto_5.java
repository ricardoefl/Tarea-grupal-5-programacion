package tallergrupal5;
//Autor: El ferxxo pues mor
import java.util.Scanner;
public class AnoBisiesto_5 {
    public static void main(String[] args) {
        Scanner osopanda = new Scanner(System.in);  
        int osopandita;
        System.out.println("Hola, ingresa un ano");
        osopandita = osopanda.nextInt();
       if((osopandita % 4 == 0 && osopandita % 100 != 0) || osopandita % 400 == 0)
           System.out.println("El ano es bisiesto");
       else
           System.out.println("El ano no es bisiesto");
    }   
}