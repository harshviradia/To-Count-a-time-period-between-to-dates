
public class Verifydate {


    public Verifydate(int d1, int m1, int y1, int d2, int m2, int y2, int h1, int M1, int s1, int h2, int M2, int s2) {

        if(d1>31 & d2>31){
            System.exit(Integer.parseInt("!!!!!!!!!!!! OOPS.......You entered invalid date!!!!!!!!!!!!!!!!!!!"));
        }
        if(m1>31 & m2>12){
            System.exit(Integer.parseInt("!!!!!!!!!!!! OOPS.......You entered invalid month!!!!!!!!!!!!!!!!!!!"));
        }

        if(h1>24 & h2>24){
          System.exit(Integer.parseInt("!!!!!!!!!!!! OOPS.......You entered invalid hour!!!!!!!!!!!!!!!!!!!"));
        }

        if(M1>59 & M2>59){
            System.exit(Integer.parseInt("!!!!!!!!!!!! OOPS.......You entered invalid min!!!!!!!!!!!!!!!!!!!"));
        }

        if(s1>59 & s2>59){
            System.exit(Integer.parseInt("!!!!!!!!!!!! OOPS.......You entered invalid sec!!!!!!!!!!!!!!!!!!!"));
        }
    }
}
