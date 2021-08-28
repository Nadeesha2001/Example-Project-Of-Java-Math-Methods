import java.util.Scanner; // Import java Scanner Class

class Ceil_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Values.nextDouble();

        // Use Math Class Math.ceil() Method
        Double b = Math.ceil(a);

        System.out.println("Your Output is" + " " + b);
    }

}
