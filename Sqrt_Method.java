import java.util.Scanner; // Import java Scanner Class

class Sqrt_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Values.nextDouble();

        // Use Math Class Math.sqrt() Method
        Double b = Math.sqrt(a);

        System.out.println("Your Output is" + " " + b);
    }

}
