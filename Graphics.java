package graphics;


import java.util.Scanner;
public class Graphics {

    
    public static void main(String[] args) {
    
       double l,b,b1,h,r,a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the the length and breadth of rectangle");
       l=sc.nextDouble();
       b=sc.nextDouble();
       
       System.out.println("Enter the the base and height of triangle");
       b1=sc.nextDouble();
       h=sc.nextDouble();
       
       System.out.println("Enter the the side square");
       a=sc.nextDouble();
       
       System.out.println();
       System.out.println("Enter the the radius of circle");
       r=sc.nextDouble();
       
       
       Rectangle r1=new Rectangle();
       r1.area(l, b);
       
       Triangle t1=new Triangle();
       t1.area(b, h);
       
       Square s1=new Square();
       s1.area(a);
       
       Circle c1=new Circle();
       c1.area(r);
       
       
    }

    private static class Rectangle {

        public Rectangle() {
        }

        private void area(double l, double b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Triangle {

        public Triangle() {
        }

        private void area(double b, double h) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Square {

        public Square() {
        }

        private void area(double a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Circle {

        public Circle() {
        }

        private void area(double r) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
