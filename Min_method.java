import java.util.Scanner; //import java Scanner Class

class Min_method {

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

        // Use Math Class Math.min() Method
        int e = Math.min(a, b);
        int f = Math.min(c, d);

        int g = Math.min(e, f);
        System.out.println("Your Minimum Number is :-" + " " + g);
    }

}
