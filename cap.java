
public class cap {
    double l;
    double w;
    double  h;

    cap(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    cap(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    cap(double l,double h,double w ){
        this.h=h;
        this.l=l;
        this.w=w;
    }

    cap(cap old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("Cap is there");
    }


    
}
