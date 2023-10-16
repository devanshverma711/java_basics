public class capmain {
    public static void main(String[] args) {
        cap hat= new cap(10);
        cap hat1 = new cap(12, 13 ,14);
        System.out.println(hat.l +" "+ hat.h + " " + hat.w );
        System.out.println(hat1.l +" "+ hat1.h + " " + hat1.w);

        capweight hat2 = new capweight();
        System.out.println(hat2.w +" " + hat2.weight);
    }
}
