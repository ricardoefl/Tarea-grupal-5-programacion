package tallergrupal5;
//Autor: El mismisimo hombre araña.
import java.util.Scanner;
public class EdadVotar_1 {
    public static void main(String[] args) {
        Scanner ballenaGrande = new Scanner(System.in);
        double ballenaPequeña;
        System.out.println("Ingresa tu edad rascabicho");
        ballenaPequeña = ballenaGrande.nextDouble();
        if (ballenaPequeña >= 18)
            System.out.println("Eres apto para votar estimado ciudadano");
        else
            System.out.println("No eres apto para votar pelado");
    }   
}