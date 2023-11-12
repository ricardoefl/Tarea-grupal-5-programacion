package tallergrupal5;
//Autor: Clarence
import java.util.Scanner;
public class DescuentoCompras_4 {
    public static void main(String[] args) {
        Scanner Lemur = new Scanner(System.in);
        double Lemur1, Lemur2;
        System.out.println("Ingresa el precio del producto rapido, que no tengo todo el dia");
        Lemur1 = Lemur.nextDouble();
        if (Lemur1 > 100){
            Lemur2 = Lemur1 * 0.1;
            Lemur1 = Lemur1 - Lemur2;
        } 
        System.out.println("El precio final del producto es: " + Lemur1); 
    }
}