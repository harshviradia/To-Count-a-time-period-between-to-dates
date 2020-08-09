public class Fordate {

    int fh=0,fd=0,fm=0,fs=0,FM=0,fy=0;


    public Fordate(int d1, int m1, int y1, int d2, int m2, int y2, int h1, int M1, int s1, int h2, int M2, int s2) {
int tm;
tm=m2-m1;
        if(m2-m1==1){
            fd=d1+d2;
            h1=24-h1;
            fh=h1+h2;
            if(fh>24){
                fh=fh-24;
                fd++;
            }

            M1=60-M1;
            FM=M1+M2;
            s1=60-s1;
            fs=s1+s2;

            if(fs>60){
                fs=fs-60;
                FM++;
            }
            if(FM>60){
                FM=FM-60;
                fh=fh+1;
            }
            int x=y2-y1;
            if(x>1){
                fy=x-1;
                fm=12;
                fm=(fm*x)-1;
            }
           new Print(fy,fm,fd,fh,FM,fs);
        }
        if(m2-m1>1 | m2-m1==0){

            tm=tm-1;
            fm=tm;

            fd=d1+d2;
            if(fd>30){
                fd=fd-30;
                fm++;
            }
            h1=24-h1;
            fh=h1+h2;
            if(fh>24){
                fh=fh-24;
                fd++;
            }

            M1=60-M1;
            FM=M1+M2;
            s1=60-s1;
            fs=s1+s2;

            if(fs>60){
                fs=fs-60;
                FM++;
            }
            if(FM>60){
                FM=FM-60;
                System.out.println(FM);
                fh=fh+1;
            }
            int x=y2-y1;
            if(m2-m1==0){
                fm=11;
                if(x>1){
                    fy=x-1;
                    fm=12;
                    fm=(fm*x)-1;
                }
            }
            new Print(fy,fm,fd,fh,FM,fs);
        }
    }
}
