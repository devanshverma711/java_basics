public class BuyandSellStocks {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        maxprofit(prices);
    }

    private static void maxprofit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0; ;

        for(int i = 1;i<prices.length;i++){
            if(buyprice<prices[i]){
                int p = prices[i]-buyprice;
                profit=Math.max(profit,p);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println(profit);
    }
}
