import java.util.Scanner;
class Box{
    double length, width, height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getA(){
        return 2*(length * width + width * height + height * length)
    }

    public double getV(){
        return length*width*height;
    }
}

public class TableCal {

    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);

// input box1
        System.out.println(x: "Enter dimension for Box 1:");
        System.out.println(s:"Length:");
        double length1 = scanner.nextDouble();
        System.out.println(s: "Width:");
        double width1 = scanner.nextDouble();
        System.out.println("Height: ");
        double height1 = scanner.nextDouble();
        
        // input box2

        System.out.println("\nEnter dimensions for Box 2:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Width: ");
        double width2 = scanner.nextDouble();
        System.out.print("Height: ");
        double height2 = scanner.nextDouble();  



               // Cte Box objects with user input
               Box box1 = new Box(length1, width1, height1);
               Box box2 = new Box(length2, width2, height2);
       
               // Display results for Box 1
               System.out.println("\nBox 1 - A: " + box1.getA() + ", V: " + box1.getV());
       
               // Display results for Box 2
               System.out.println("Box 2 - A: " + box2.getA() + ", V: " + box2.getV());
       
               scanner.close(); // Close scanner


        
    }
}