import java.util.Scanner; // Import java Scanner Class

class Aavarage {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        // Input User Values
        System.out.println("Enter Your 1st Number");
        int a = Values.nextInt();

        System.out.println("Enter Your 2nd Number");
        int b = Values.nextInt();

        System.out.println("Enter Your 3rd Number");
        int c = Values.nextInt();

        System.out.println("Enter Your 4th Number");
        int d = Values.nextInt();

        // Calculate Average
        int e = (a + b + c + d) / 4;

        // Output
        System.out.println("Your Average Value is" + " " + e);
    }
}
