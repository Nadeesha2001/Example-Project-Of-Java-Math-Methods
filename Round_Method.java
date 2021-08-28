import java.util.Scanner; // Import java Scanner Class

class Round_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your Number");
        Double a = Values.nextDouble();

        // Use Math Class Math.round() Method
        Long b = Math.round(a);

        System.out.println("Your Rounded Number is" + " " + b);
    }
}
