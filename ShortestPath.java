public class ShortestPath {
    public static void main(String[] args) {
        String direction ="WNEENESENNN";
        shortestpath(direction);
    }

    private static void shortestpath(String direction) {
        int x=0,y=0;
        for(int i =0;i<direction.length();i++){
            if(direction.charAt(i)=='W'){
                y-=1;
            }
            if(direction.charAt(i)=='E'){
                y+=1;
            }
            if(direction.charAt(i)=='N'){
                x+=1;
            }
            if(direction.charAt(i)=='S'){
                x-=1;
            }
        }
        double shortest =  Math.sqrt((x*x)+(y*y));
        System.out.println("Shortest path is " + shortest);
    }
}
