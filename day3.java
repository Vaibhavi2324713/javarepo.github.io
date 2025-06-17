public class day3 {
    public static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        int result = factorial(a);
        System.out.println("The factorial of " + a + " is: " + result);
    }
}