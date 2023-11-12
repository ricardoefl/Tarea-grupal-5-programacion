package tallergrupal5;
//Autor: Averigualo en el siguiente ejercicio
import java.util.Scanner;
public class mayorTresNumeros_3 {
    public static void main(String[] args) {
        Scanner hipopotamo = new Scanner(System.in);
        int hipopotamo1, hipopotamo2, hipopotamo3;
        System.out.println("Como tan muchacho, Que tal pal de chicle?");
        System.out.println("Vamos a ver cual es el mayor de tres numeros");
        System.out.println("Ingresa tres numeros, cada numero es un chicle fuera");
        System.out.println("La primera");
        hipopotamo1 = hipopotamo.nextInt();
        System.out.println("LA SEGUNDA");
        hipopotamo2 = hipopotamo.nextInt();
        System.out.println("OH, LA TERCERA");
        hipopotamo3 = hipopotamo.nextInt();
        System.out.println("No se lo diga a nadie, se ponen celoso");
        System.out.println("======================================");
        if (hipopotamo1 == hipopotamo2 && hipopotamo1 == hipopotamo3 )
            System.out.println("Los numeros son iguales pues, que eres bobo?");
        else 
            if (hipopotamo1 > hipopotamo2 && hipopotamo1 > hipopotamo3)
                System.out.println("El mayor es: " + hipopotamo1);
            else
                if (hipopotamo2 > hipopotamo1 && hipopotamo2 > hipopotamo3)
                    System.out.println("El mayor es: " + hipopotamo2);
                else
                    if (hipopotamo3 > hipopotamo1 && hipopotamo3 > hipopotamo2)
                        System.out.println("El mayor es: " + hipopotamo3);
    }
}