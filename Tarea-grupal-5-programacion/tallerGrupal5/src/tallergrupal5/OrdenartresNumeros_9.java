package tallergrupal5;
//Autor: Michael Jackson de Morat
import java.util.Scanner;
public class OrdenartresNumeros_9 {
    public static void main(String[] args) {
        Scanner nutria = new Scanner(System.in);
        int nutria1, nutria2, nutria3;
        System.out.println("Ingresa 3 numeros canto de bellaco");
        nutria1 = nutria.nextInt();
        nutria2 = nutria.nextInt();
        nutria3 = nutria.nextInt();
        if(nutria1 >= nutria2 && nutria2 >= nutria3)
            System.out.println("Los numeros ordenados: " + nutria3 + ", " + nutria2 + ", " + nutria1);  
        else 
            if(nutria1 >= nutria3 && nutria3 >= nutria2)
                System.out.println("Los numeros ordenados: " + nutria2 + ", " + nutria3 + ", " + nutria1);
            else 
                if(nutria2 >= nutria3 && nutria3 >= nutria1)
                    System.out.println("Los numeros ordenados: " + nutria1 + ", " + nutria3 + ", " + nutria2);
                else 
                    if(nutria2 >= nutria1 && nutria1 >= nutria3)
                        System.out.println("Los numeros ordenados: " + nutria3 + ", " + nutria1 + ", " + nutria2);
                    else 
                        if(nutria3 >= nutria2 && nutria2 >= nutria1)
                            System.out.println("Los numeros ordenados: " + nutria1 + ", " + nutria2 + ", " + nutria3);
                        else 
                            if(nutria3 >= nutria1 && nutria1 >= nutria2){
                                System.out.println("Los numeros ordenados: " + nutria2 + ", " + nutria1 + ", " + nutria3);
        }
    }
}                                                                             