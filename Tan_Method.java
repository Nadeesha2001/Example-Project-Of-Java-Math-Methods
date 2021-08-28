import java.util.Scanner; // Import java Scanner Class

class Tan_Method {

    public static void main(String[] args) {

        Scanner Velues = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Velues.nextDouble();

        // Use Math Class Math.tan() Method
        Double b = Math.tan(a);

        System.out.println("Your Cos Value" + " " + b);

    }

}
