public class ArgsIntSum {
    public static void main(Integer[] args){
        int a=0,b=0,tot=0;
        a = (args[0]);
        b = (args[1]);
        tot = a+b;
        System.out.println("La somma tra " + a + " e " + b + " è uguale a: " + tot);
    }
}