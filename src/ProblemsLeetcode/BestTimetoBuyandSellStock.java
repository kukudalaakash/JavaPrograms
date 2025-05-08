package ProblemsLeetcode;

public class BestTimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
		int maxprofit = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				int profit = prices[i] - min;
				if (profit >= 0 && profit > maxprofit) {
					maxprofit = profit;
				}
				System.out.println(min + " " + prices[i] + " " + profit + " " + maxprofit);
			}
		}
		return maxprofit;
	}
	public static void main(String[] args) {
		int arr[] = { 7, 6, 5, 3 };
		System.out.println(maxProfit(arr));
	}

}
