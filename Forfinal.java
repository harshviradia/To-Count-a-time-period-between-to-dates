public class Forfinal {


    public Forfinal(int d1, int m1, int y1, int d2, int m2, int y2, int h1, int M1, int s1, int h2, int M2, int s2) {
        int fh=0,fd=0,fm=0,fs=0,FM=0,fy=0;
        if(d1==d2){
            fd=0;
            fh=h2-h1;
            M1=60-M1;
            FM=M1+M2;
            int x=FM;
            s1=60-s1;
            fs=s1+s2;
            if(fs>60){
                fs=fs-60;
                FM=FM+1;
            }
           if(FM>60){
                FM=x-60;
                fh=fh+1;
            }
            new Print(fy,fm,fd,fh,FM,fs);
        }

        else{
            fd=d2-d1;
            h1=24-h1;
            fh=h1+h2;
            if(fh>24){
                fh=fh-24;
                fd++;
            }
            m1=60-m1;
            fm=m1+m2;
            s1=60-s1;
            fs=s1+s2;
            new Print(fy,FM,fd,fh,fm,fs);
        }
    }
}
