import java.util.Scanner;

public class ShapesOver {
    
    float side,length,breadth;
    double radius;

    public void area(float s){
        side=s;
        System.out.println("Area of square :"+(side*side));
        
    }
    
    public void area(float l,float b){
        length=l;
        breadth=b;
        System.out.println("Area of rectangle :"+(length*breadth));
    }
     
    public void area(double r){
        double area;
        radius=r;
        area=2*Math.PI*radius;
        System.out.println("Area of circle :"+Math.round(area));
    }
    
    public static void main(String[] args) {
        float l,b,s;
        double r;
        
        Scanner sc=new Scanner(System.in);
        ShapesOver s1=new ShapesOver();
        
        System.out.println("enter the side of square");
        s=sc.nextFloat();
        
         System.out.println("enter the length and breadth of rectangle");
         l=sc.nextFloat();
         b=sc.nextFloat();
         
        System.out.println("enter the radius of cicrle");
        r=sc.nextDouble();
        
        s1.area(s);
        s1.area(l,b);
        s1.area(r);
    }
    
}

