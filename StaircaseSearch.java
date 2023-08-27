public class StaircaseSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        
        int key =14;
        staircase(matrix,key);
    }

    private static boolean staircase(int[][] matrix, int key) {
        int row =0,col=matrix[row].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at "+row+" "+col);
                return true;
            }
            else if(key>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }    
        System.out.println("Key does no exixts");
        return false;
    }
}
