class Rectangle1 {

    public static void displayArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle1: " + area);
    }
}

class Rectangle2 {
   public  void displayArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle2: " + area);
    }
}

public class Rectangles {
    public static void main(String[] args) {
       
        Rectangle1.displayArea(5, 10);

      
        Rectangle2 rectangle2 = new Rectangle2();
        
        rectangle2.displayArea(3, 7);
    }
}
