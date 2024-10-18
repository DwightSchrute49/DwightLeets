class Solution {
    public int maximumSwap(int num) {
        String str=Integer.toString(num);
        char digits[]=str.toCharArray();
        int len=digits.length;
        int arr[]=new int [len];
        int maxpos=len-1;
        arr[maxpos]=maxpos;
        for(int i=len-2;i>=0;i--){
            if(digits[i]>digits[maxpos]){
                maxpos=i;
            }
            arr[i]=maxpos;
        }
        for(int i=0;i<len;i++){
            if(digits[i]<digits[arr[i]]){
                char temp=digits[i];
                digits[i]=digits[arr[i]];
                digits[arr[i]]=temp;
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}