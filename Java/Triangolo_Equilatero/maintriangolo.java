import java.util.Scanner;

import javax.security.sasl.SaslClientFactory;

public class maintriangolo {
    public static void main(String[] args)
    {
        float lato1, lato2;
        float perimetro1, perimetro2;
        float area1, area2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserire la lunghezza del lato del primo triangolo: ");
        lato1 = scan.nextFloat();
        System.out.print("Inserire la lunghezza del lato del secondo triangolo: ");
        lato2 = scan.nextFloat();

        TriangoloEquilatero triangolo1 = new TriangoloEquilatero(lato1);
        TriangoloEquilatero triangolo2 = new TriangoloEquilatero(lato2);
        
        perimetro1 = triangolo1.Perimetro(lato1);
        perimetro2 = triangolo2.Perimetro(lato2);
        area1 = triangolo1.Area(lato1);
        area2 = triangolo2.Area(lato2);

        area1 = triangolo1.Arrotonda(area1, 2);
        area2 = triangolo1.Arrotonda(area2, 2);


        System.out.println("Il perimetro del primo triangolo è: " + perimetro1 + 
                           "\nL'area del primo triangolo è: " + area1);
        System.out.println("\n\n");
        System.out.println("Il perimetro del secondo triangolo è: " + perimetro2 + 
                           "\nL'area del secondo triangolo è: " + area2);
        
        scan.close();
    }
}
