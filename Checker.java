public class Checker {

    public Checker(int d1, int m1, int y1, int d2, int m2, int y2, int h1, int M1, int s1, int h2, int M2, int s2) {

        if(y1<y2) {

            if (m1 == m2 | m2-m1>=1 | m1-m2>1 ) {

                if (d1 > d2 | d1 < d2) {

                   if(m1==4 | m1==6 | m1==9 | m1==11){
                        d1=30-d1;
                        new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                    }

                    else if(m1==1 | m1==3 | m1==5 | m1==7 | m1==8 | m1==10 | m1==12){
                        d1=31-d1;
                        new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                    }

                    else if(m1==2){
                        if(y1%4==0){
                            d1=29-d1;
                            new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                        }
                        else{
                            d1=28-d1;
                            new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                        }
                    }
                }
            }
        }

        if(y1==y2){

            if(m1==m2){

                new Forfinal(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);

            }

            else{

                if(m1==4 | m1==6 | m1==9 | m1==11){
                    d1=30-d1;
                    new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                }

                else if(m1==1 || m1==3 || m1==5 || m1==7 || m1==8 || m1==10 || m1==12){
                    d1=31-d1;
                    new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                }

                else if(m1==2){
                    if(y1%4==0){
                        d1=29-d1;
                        new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                    }
                    else{
                        d1=28-d1;
                        new Fordate(d1,m1,y1,d2,m2,y2,h1,M1,s1,h2,M2,s2);
                    }
                }

            }

        }
    }
}
