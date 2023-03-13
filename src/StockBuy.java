public class StockBuy {

  public static int maxProfit(int[] prices) {
    int maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1])
      maxprofit += prices[i] - prices[i - 1];
    }
    return maxprofit;
  }
  //92. Best time to buy and sell stock: need to sell only once
  //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  public static int maxProfit1(int[] prices) {
    if (prices == null || prices.length == 0) return 0;
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minPrice); }
    return maxProfit;
  }

  public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4};
    System.out.println(maxProfit(arr));
    System.out.println(maxProfit1(arr));
  }
}
