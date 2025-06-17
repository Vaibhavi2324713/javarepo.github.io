public class forloop {
    public static void main(String[] args) {
        for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // while loop
        int k = 1;      
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
        // do while loop
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }   
        // switch case
        int day = 3;        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
}
}
