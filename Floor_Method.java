import java.util.Scanner; // Import java Scanner Class

class Floor_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Values.nextDouble();

        // Use Math Class Math.floor() Method
        Double b = Math.floor(a);

        System.out.println("Your Output is" + " " + b);
    }

}
