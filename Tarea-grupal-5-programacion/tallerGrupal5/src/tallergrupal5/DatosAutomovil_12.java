package tallergrupal5;
//Autor: Babo de cartel de santa
import java.util.Scanner;
public class DatosAutomovil_12 {
    public static void main(String[] args) {
        Scanner antilope = new Scanner(System.in);
        String antilope1, antilope2;
        double antilope3, antilope4;
        System.out.println("Pon los datos de tu chatarra");
        System.out.println("Ingresa la marca de tu carro");
        antilope1 = antilope.nextLine();
        System.out.println("Ingresa el pais de origen de tu fierro viejo");
        antilope2 = antilope.nextLine();
        System.out.println("Ingresa el costo del carro");
        antilope3 = antilope.nextDouble();
        if (antilope2.equals("Alemania")){
            antilope4 = antilope3 * 0.2;
            antilope3 = antilope3 + antilope4;
            System.out.println("Impuesto " + antilope1 + ": " + antilope4);
            System.out.println("TOTAL: " + antilope3);
        }    
        else { 
            if (antilope2.equals("Japon")){
                antilope4 = antilope3 * 0.3;
                antilope3 = antilope3 + antilope4;
                System.out.println("Impuesto " + antilope1 + ": " + antilope4);
                System.out.println("TOTAL: " + antilope3);
            }
            else {
                if (antilope2.equals("Italia")){
                    antilope4 = antilope3 * 0.15;
                    antilope3 = antilope3 + antilope4;
                    System.out.println("Impuesto " + antilope1 + ": " + antilope4);
                    System.out.println("TOTAL: " + antilope3);
                }    
                else {
                    if (antilope2.equals("USA")){
                        antilope4 = antilope3 * 0.08;
                        antilope3 = antilope3 + antilope4;
                        System.out.println("Impuesto " + antilope1 + ": " + antilope4);
                        System.out.println("TOTAL: " + antilope3);
                    }    
                }
            }
        }
    }   
}