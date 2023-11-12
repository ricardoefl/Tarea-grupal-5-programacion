package tallergrupal5;
//Autor: Yunikua de los Backyardigans
import java.util.Scanner;
public class CostoPedido_11 {
    public static void main(String[] args) {
        Scanner tapir = new Scanner(System.in);
        String tapir1;
        double tapir2, tapir3, tapir4, tapir5;
        System.out.println("Pon el nombre del producto que requieres");
        tapir1 = tapir.nextLine();
        System.out.println("Pon la cantidad de unidades que requieres");
        tapir3 = tapir.nextDouble();
        System.out.println("Pon el costo del producto");
        tapir2 = tapir.nextDouble();
        tapir4 = tapir2 * tapir3;
        if (tapir3 > 50){
            tapir5 = tapir4 * 0.15;
            tapir4 = tapir4 - tapir5;
        }
        System.out.println("Costo por unidad de " + tapir1 + ": " + tapir2 );
        System.out.println("Unidades: " + tapir3);
        System.out.println("TOTAL: " + tapir4);
    }
}