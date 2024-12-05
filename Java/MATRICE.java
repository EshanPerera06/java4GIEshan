import java.io.*;

public class MATRICE 
{
	
	public static void StampaSomCol(int matr[][], int righe, int colonne)
    {
        int SOM_COLONNE[] = new int[4];

        for (int riga = 0; riga < righe; riga++)
        {
            for (int colonna = 0; colonna < colonne; colonna++)
            {
                System.out.print(matr[riga][colonna] + " "); 
                SOM_COLONNE[colonna] += matr[riga][colonna];
            }
            System.out.println();
        }

        for (int colonna = 0; colonna < NUMCOLONNE; colonna++)
        {
            System.out.print(SOM_COLONNE[colonna] + " "); 
        }
    }
	
    static int NUMRIGHE = 7;
    static int NUMCOLONNE = 4;

    public static void main(String[] args)
    {
        int matr[][] = new int[NUMRIGHE][NUMCOLONNE];
        int tras[][] = new int[NUMCOLONNE][NUMRIGHE];

        for (int riga = 0; riga < NUMRIGHE; riga++)
        {
            for (int colonna = 0; colonna < NUMCOLONNE; colonna++)
            {
                matr[riga][colonna] = (int) (Math.random()*10);
                System.out.print(matr[riga][colonna] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int riga = 0; riga < NUMRIGHE; riga++)
        {
            int SOM_RIGHE = 0;

            for (int colonna = 0; colonna < NUMCOLONNE; colonna++)
            {
                System.out.print(matr[riga][colonna] + " ");
                SOM_RIGHE += matr[riga][colonna]; 
            }
            
            System.out.print(SOM_RIGHE);
            System.out.println();
        }
        
        System.out.println();
    }
}