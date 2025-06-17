public class array {
    public static void main(String[] args) {
        int[] dailySteps = {4500, 7600, 8800, 5300, 6200, 9100, 7000};

        int totalSteps = 0;
        for (int i = 0; i < dailySteps.length; i++) {
            totalSteps += dailySteps[i];
        }

        System.out.println("Total steps this week: " + totalSteps);
    }
}