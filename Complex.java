package complex;
import java.util.Scanner;
/**
 *
 * @author sjcet
 */
public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        float b, c ,d, e;
        Scanner a=new Scanner(System.in);
        System.out.println("enter the real number");
        b=a.nextInt();
        System.out.println("enter the imaginary number");
        c=a.nextInt();
        System.out.println("enter the real number");
        d=a.nextInt();
        System.out.println("enter the imaginary number");
        e=a.nextInt();
        Complex n1 = new Complex(b, c),
                n2 = new Complex(d, e),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}