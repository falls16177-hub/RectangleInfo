import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variables
        double width;
        double height;
        // loops
        while(true){
            System.out.print("Enter width: ");
            if (input.hasNextDouble()){
                width = input.nextDouble();
                break;
            } else {
                System.out.print("Invalid input try again: ");
                input.next();
            }
        }

        while(true){
            System.out.print("Enter height: ");
            if (input.hasNextDouble()){
                height = input.nextDouble();
                break;
            } else  {
                System.out.print("Invalid input try again: ");
                input.next();
            }
        }
        double area = width * height;
        double perimeter = 2 * (width + height);


        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);

    }
}