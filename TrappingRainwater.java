public class TrappingRainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        collected(height);
    }

    static void collected(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        right[height.length-1]=height[height.length-1];
        left[0]=height[0];
        int i =0;
        for(int j=1;j<height.length;j++){
            if(left[i]>height[j]){
                left[j]=left[i];
            }
            else{
                    left[j]=height[j];
                }
        i++;
        }
        for(int k=0;k<left.length;k++){
            System.out.print(left[k]);
        }
        System.out.println();
        int p=height.length-1;
        for(int j =height.length-2;j>=0;j--){
            if(right[p]>height[j]){
                right[j]=right[p];
            }
            else{
                right[j]=height[j];
            }
            p--;
        }
        for(int k=0;k<left.length;k++){
            System.out.print(right[k]);
        }
        System.out.println();

        trappedwater(right,left,height);
    }

    static void trappedwater(int[] right, int[] left,int[] height) {
        int trapped = 0;
        for(int i =0;i<height.length;i++){
            trapped = trapped + (Math.min( left[i],right[i])-height[i]);
        }
        System.out.println(trapped);
    }
}
