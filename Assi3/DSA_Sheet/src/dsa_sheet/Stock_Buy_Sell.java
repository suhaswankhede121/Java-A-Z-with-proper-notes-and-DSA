
package dsa_sheet;


public class Stock_Buy_Sell {
    static int Profit(int price[],int n){//GETTING PRICE per days
        int buy=price[0];//first day
        int maxprofit=0;//storing profit
        for(int i=0;i<n;i++){
        if(buy>price[i]){
            buy=price[i];
           }
        else if(price[i]-buy>maxprofit){
            maxprofit=price[i]-buy;
        }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int price[]=new int[]{2,7,3,6,9};
        int n=price.length;
        int maximumprofit=Profit(price,n);
        System.out.print(" "+maximumprofit);
    }
}
