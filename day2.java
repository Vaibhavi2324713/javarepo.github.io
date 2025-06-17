public class day2 {
    public static void main(String[] args) 
    {
        String str = "Hello";
        String a = "vaibhavi";
        String b = "aochar";
        String c =str+ " " +a +" " + b;
        System.out.println(c);
        int x = 2, y = 7;
        String result = (x > y) ? "x is greater" : "y is greater";
        System.out.println(result);
        int num = 10;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + evenOdd);
        int year = 2025;
        int daysInFeb = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
        String leapYear = (daysInFeb == 29) ? "Leap year" : "Not a leap year";
        System.out.println(year + " has " + daysInFeb + " days in February. " + leapYear);
    }
}
