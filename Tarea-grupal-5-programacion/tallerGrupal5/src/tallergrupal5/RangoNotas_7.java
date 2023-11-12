package tallergrupal5;
//Autor: Mordecai de un show mas.
import java.util.Scanner;
public class RangoNotas_7 {
    public static void main(String[] args) {
        Scanner gaviota = new Scanner(System.in);
        int gaviotita ;
        System.out.println("Ingresa tu nota, ahora si te carga la verga vago!!");
        gaviotita = gaviota.nextInt();
        if (gaviotita >= 90 && gaviotita <= 100) 
            System.out.println("TIENES A :)"); 
        else 
            if (gaviotita >= 80 && gaviotita <= 89) 
                System.out.println("TIENES B :|"); 
            else
                if (gaviotita >= 70 && gaviotita <= 79) 
                    System.out.println("TIENES C :(");
                else
                    if (gaviotita >= 60 && gaviotita <= 69) 
                        System.out.println("TIENES D :(");
                    else
                        if (gaviotita >= 50 && gaviotita <= 59) 
                            System.out.println("TIENES E :O");
                        else
                            System.out.println("Estudia mas que ni para eso no vales");
    }
}
