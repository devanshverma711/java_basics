public class capweight extends cap  {
    double weight ;

    public capweight(){
        this.weight=-1;
    }

    public capweight(double l,double w,double h,double weight){
        super(l,h,w);
        this.weight=weight;
    }
}
