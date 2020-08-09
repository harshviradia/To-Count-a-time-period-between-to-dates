import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * First coun... it's use for take dates,months,year,hours,min and secounds as input through user
         */
        int d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2;
        Scanner s = new Scanner(System.in);

        System.out.println("!!!!!!!!!!!!!!!!! BE SURE YOU MUST HAVE INPUT VALID DATES AND HOURS!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Enter date month and year: \n");
        System.out.println("Enter first date");
        d1 = s.nextInt();
        System.out.println("Enter first month");
        m1 = s.nextInt();
        System.out.println("Enter first year");
        y1 = s.nextInt();
        System.out.println("Enter second date");
        d2 = s.nextInt();
        System.out.println("Enter second month");
        m2 = s.nextInt();
        System.out.println("Enter second year");
        y2 = s.nextInt();
        System.out.println("Enter hour,min and sec: \n");
        System.out.println("Enter first data for first date");
        h1 = s.nextInt();
        M1 = s.nextInt();
        s1 = s.nextInt();
        System.out.println("Enter second data for second date");
        h2 = s.nextInt();
        M2 = s.nextInt();
        s2 = s.nextInt();

        Verifydate V = new Verifydate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
        Checker C = new Checker(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
    }
}
