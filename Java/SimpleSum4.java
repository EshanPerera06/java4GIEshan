public class SimpleSum4 
{
    static int SumI(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    static float SumF(float a, float b)
    {
        float sum = a + b;
        return sum;
    }
    
    static double SumD(double a, double b)
    {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args)
    {
        int x1i = 0, x2i = 0, sumi = 0;
        float x1f = 0, x2f = 0, sumf = 0;
        double x1d = 0, x2d = 0, sumd = 0;

        x1i = Integer.parseInt(args[0]);
        x2i = Integer.parseInt(args[1]);
        sumi = (SumI(x1i, x2i));
        System.out.println("sum(int, int) " + x1i + " + " + x2i + " = " + sumi);

        x1f = Float.parseFloat(args[0]);
        x2f = Float.parseFloat(args[1]);
        sumf = (SumF(x1f, x2f));
        System.out.println("sum(int, int) " + x1f + "F + " + x2f + "F = " + sumf);

        x1d = Double.parseDouble(args[0]);
        x2d = Double.parseDouble(args[1]);
        sumd = (SumD(x1d, x2d));
        System.out.println("sum(int, int) " + x1d + " + " + x2d + " = " + sumd);
    }    
}
