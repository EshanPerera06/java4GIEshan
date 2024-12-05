import java.awt.*;

/**
 * Test the Point2d class.
 * @author marco.aprea@marconiverona.edu.it
 * @version 3.0 20241015
 */
public class Point2dApp {
    /**
     * Program's entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Point2d a = new Point2d("a");
        Point2d b = new Point2d("b", 1, 1);
        Point2d c = new Point2d();

        System.out.println(a.toString());
        System.out.println(b);
        System.out.println(c);
        System.out.println("Numero di punti creati: "+ Point2d.count());
        System.out.println("Distance(a, b) = "+ Point2d.distance(a, b));
    }
}