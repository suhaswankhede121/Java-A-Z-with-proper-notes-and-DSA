

class main{
    static int FindNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int NoOfDigit=digit(num);
        return NoOfDigit%2==0;

    }
    static int digit(int num){
        int count=0;
        if(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String args[]){
        int[]nums=new int[]{1,12,123,1234};
        int getdataitem=FindNumbers(nums);
        System.out.print(getdataitem);
    }
}