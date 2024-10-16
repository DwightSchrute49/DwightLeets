class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=nums.length;
        ghoomar(nums,0,len-1);
        ghoomar(nums,0,k-1);
        ghoomar(nums,k,len-1);
    }
        void ghoomar(int nums[],int start,int finish){
            while(start<finish)
            {
                swapping(nums,start,finish);
                start++;
                finish--;
            }
        }
        void swapping(int nums[],int start,int finish)
        {
                int temp=nums[start];
                nums[start]=nums[finish];
                nums[finish]=temp;
            }           
    }