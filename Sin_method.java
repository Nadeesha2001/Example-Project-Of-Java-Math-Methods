import java.util.Scanner; // Import java Scanner Class

class Sin_method {

    public static void main(String[] args) {

        Scanner Velues = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Velues.nextDouble();

        // Use Math Class Math.sin() Method
        Double b = Math.sin(a);

        System.out.println("Your Sin Value" + " " + b);

    }

}
