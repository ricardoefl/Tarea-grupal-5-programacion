package tallergrupal5;
//Autor: Ricardo, quien mas?
import java.util.Scanner;
public class Hosteria_13 {
    public static void main(String[] args) {
        Scanner flamengo = new Scanner(System.in);
        int flamengo1;
        double flamengo2, flamengo3, flamengo4, flamengo5;
        System.out.println("Ingresa el numero de dias que te vas a hospedar en el motel");
        flamengo1 = flamengo.nextInt();
        System.out.println("Ingresa el valor del costo por dia de tu putisuite");
        flamengo2 = flamengo.nextDouble();
        flamengo4 = flamengo1 * flamengo2;
        flamengo5 = flamengo1 * flamengo2;
        flamengo3 = 0;
        if (flamengo1 > 15){
            flamengo3 = flamengo5 * 0.2;
            flamengo5 = flamengo5 - flamengo3;
        }
        else {
            if (flamengo1 > 10){
                flamengo3 = flamengo5 * 0.15;
                flamengo5 = flamengo5 - flamengo3;
            }
            else{
                if (flamengo1 > 5){
                    flamengo3 = flamengo5 * 0.1;
                    flamengo5 = flamengo5 - flamengo3;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("SUBTOTAL: " + flamengo4);
        System.out.println("DESCUENTO: " + flamengo3);
        System.out.println("TOTAL: " + flamengo5);
        System.out.println("El precio incluye cama de agua y techo con espejo");
    }
}