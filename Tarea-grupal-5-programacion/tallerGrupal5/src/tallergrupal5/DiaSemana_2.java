package tallergrupal5;
//Autor: Ozuna, el negrito de ojos claros hey you.
import java.util.Scanner;
public class DiaSemana_2 {
    public static void main(String[] args) {
        Scanner pezFueraDeControl = new Scanner(System.in);
        double PezDisciplinado;
        System.out.println("Hola bebe, vienvenido");
        System.out.println("Ya se que bienvenido se escribe con b, pero yo hago lo que me da la gana como bad bunny");
        System.out.println("Ingresa un numero");
        PezDisciplinado = pezFueraDeControl.nextInt();
        if (PezDisciplinado == 1)
            System.out.println("Hoy es Lunes, que arrechera");
        else
            if(PezDisciplinado == 2)
                System.out.println("Hoy es martes para amarte");
            else
                if (PezDisciplinado ==  3)
                    System.out.println("Hoy es miercoles belico");
                else
                    if (PezDisciplinado == 4)
                        System.out.println("Hoy es Jueves de no te ahueves");
                    else
                        if (PezDisciplinado == 5)
                            System.out.println("Hoy es viernes, y el cuerpo lo sabe");
                        else
                            if (PezDisciplinado == 6)
                                System.out.println("Hoy es sabado, y hay gaysnight");
                            else
                                if (PezDisciplinado == 7){
                                    System.out.println("Hoy es Domingo, parrillada en familia");
                                    System.out.println("Porque como dijo Toreto, la familia es primero");
                                }
                                else
                                    System.out.println("Numero equivocado canto de cabron");                  
    }    
}