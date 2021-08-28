import java.util.Scanner; // Import java Scanner Class

class Cbrt_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Values.nextDouble();

        // Use Math Class Math.cbrt() Method
        Double b = Math.cbrt(a);

        System.out.println("Your Output is" + " " + b);
    }
}
