import java.util.Scanner; // import java Scanner Class

class Pow_Method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        System.out.println("Enter Your 1st Number");
        Double a = Values.nextDouble();

        System.out.println("Enter Your 2nd Number");
        Double b = Values.nextDouble();

        // Use Math Class Math.pow() Method
        Double c = Math.pow(a, b);

        System.out.println(a + " " + "^" + " " + b + " " + "=" + " " + c);

    }

}
