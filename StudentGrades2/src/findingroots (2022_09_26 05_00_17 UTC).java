import java.util.*;
public class findingroots {
    public static void main(String[] args) {
    float r1,r2;
        Scanner ss = new Scanner(System.in);
        float a = ss.nextFloat();
        float b = ss.nextFloat();
        float c = ss.nextFloat();
        float root1;
        float root2;
        float determinant = (float)(b*b-4*a*c);
        if (determinant > 0) {
            root1 = (float)((-b + Math.sqrt(determinant))/ (2 * a));
            root2 = (float)((-b - Math.sqrt(determinant)) / (2 * a));
            System.out.format("%.2f\n%.2f", root1, root2);
        }
        else if (determinant == 0) {
            root1 = root2 = (float)(-b / (2 * a));
            System.out.format("%.2f;", root1);
        }
        else {
            float real = (float)(-b / (2 * a));
            float imaginary =(float)(Math.sqrt(-determinant) / (2 * a));
            System.out.format("%.2f+i%.2f",real,imaginary);
            System.out.format("\n%.2f-i%.2f",real,imaginary);
        }

    }
}