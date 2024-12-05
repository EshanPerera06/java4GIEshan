import java.lang.Math;

public class TriangoloEquilatero {
    private float lato;

    public TriangoloEquilatero(float lato)
    {
        lato = this.lato;
    }

    protected float Arrotonda(float x, int K)
    {
        float temp1, temp2, temp3;
        
        temp1 = (float) (x * Math.pow(10, K));
        temp2 = Math.round(temp1);
        temp3 = (float) (temp2 / Math.pow(10, K));
        
        return temp3;
    }

    protected float Perimetro(float lato)
    {
        this.lato = lato;
        float perimetro;
        
        perimetro = lato * 3;
        
        return perimetro;
    }

    protected float Area(float lato)
    {
        this.lato = lato;
        float altezza = 0;
        float area = 0;

        altezza = (float) Math.sqrt(Math.pow(lato, 2) - Math.pow((lato/2), 2)) ;
        area = (lato * altezza) / 2;

        return area;
    }
}