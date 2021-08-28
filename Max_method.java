import java.util.Scanner; // Import java Scanner Class

class Max_method {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in); // Create a New Scanner Object is Values

        // Input User Values
        System.out.println("Enter Your 1st Number");
        int a = Values.nextInt();

        System.out.println("Enter Your 2nd Number");
        int b = Values.nextInt();

        // Use Math Class Math.max() Method
        int c = Math.max(a, b);
        System.out.println("Your Maximun Number is :-" + " " + c);

    }

}
