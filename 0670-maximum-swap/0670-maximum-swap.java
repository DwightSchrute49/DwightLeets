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
               /* char temp=digits[i];
                digits[i]=digits[i+1];
                digits[i+1]=temp;
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
            /*arr[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
       // Arrays.sort(arr);
        int sorted=0;
        for(int i=0;i<arr.length;i++){
            sorted=sorted*10+arr[i];
        }
        return sorted;
    }
}*/