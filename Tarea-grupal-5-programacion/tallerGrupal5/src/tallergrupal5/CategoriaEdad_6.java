package tallergrupal5;
//Autor: Jhaico Jay cortez, me sigue o no me sigue todavia?
import java.util.Scanner;
public class CategoriaEdad_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Pon tu edad pues");
        edad = sc.nextInt();
        if(edad >= 18)
            System.out.println("Eres veterano");
        else 
            if(edad >= 12)
                System.out.println("Eres puberto");
            else
                System.out.println("Eres pelado");
    }
}