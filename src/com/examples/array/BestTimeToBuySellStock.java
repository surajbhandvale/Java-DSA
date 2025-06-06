package com.examples.array;

public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    /*public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=1; j<prices.length - 1; j++){
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }*/

    public static void main(String [] args){
        BestTimeToBuySellStock obj = new BestTimeToBuySellStock();
        int [] prices = {7,1,5,3,6,4};
        int result = obj.maxProfit(prices);
        System.out.println(result);
    }

}
