package tallergrupal5;
//Autor: Gustavo Ceratti de AC/DC
import java.util.Scanner;
public class CalIMC_8 {
    public static void main(String[] args) {
        Scanner pinguino = new Scanner(System.in);
        double pinguino1, pinguino2, pinguino3;
        System.out.println("Ingresa tu peso en kilos");
        pinguino1 = pinguino.nextDouble();
        System.out.println("Ingresa tu altura en metros. Ejemplo: 1,70 (usando la coma)");
        pinguino2 = pinguino.nextDouble();
        pinguino3 = pinguino1 / (pinguino2 * pinguino2);
        if(pinguino3 < 18) {
            System.out.println("Estas desnutrido, come atun mmv");
            System.out.println("Tu IMC es: " + pinguino3);
        }    
        else {
            if(pinguino3 < 25){
                System.out.println("Estas en tu peso ideal, toda una bichota");
                System.out.println("Tu IMC es: " + pinguino3);
            }
            else {
                if(pinguino3 < 30){
                    System.out.println("Estas con sobrepeso, deja de comer tanto pan");
                    System.out.println("Tu IMC es: " + pinguino3);
                }        
                else {
                    System.out.println("Estas con obesidad, ciudate brother");
                    System.out.println("Tu IMC es: " + pinguino3);
                }
            }    
        }
    }
}