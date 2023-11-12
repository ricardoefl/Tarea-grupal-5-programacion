package tallergrupal5;
//Autor: Raw Alejandro de los Hombres G
import java.util.Scanner;
public class PlanillaLuz_10 {
    public static void main(String[] args) {
        Scanner foca1 = new Scanner(System.in);
        double foca, foca2, foca3, foca4, foca5;
        System.out.println("Hey mor");
        System.out.println("Pon tu edad pues");
        foca3 = foca1.nextDouble();
        System.out.println("Pon el valor del kilovatio por hora");
        foca = foca1.nextDouble();
        System.out.println("Pon el valor de los kilovatios consumidos en el mes");
        foca2 = foca1.nextDouble();
        foca4 = foca * foca2;
        if (foca3 > 65){
            foca5 = foca4 * 0.1;
            foca4 = foca4 - foca5;
        }
        System.out.println("El valor de la planilla es: " + foca4);
    }
}