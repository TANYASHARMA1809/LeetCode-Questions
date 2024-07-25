class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums,0,nums.length-1);

        
    }
    public static int [] mergesort(int [] arr,int lo,int hi){
        if(lo==hi){
            int [] a=new int[1];
            a[0]=arr[lo];
            return a;//address return kre h
        }

        int mid=(lo+hi)/2;
        int[] fs=mergesort(arr,lo,mid);
        int[] ss=mergesort(arr,mid+1,hi);
        return MergeTwoSortedArray(fs,ss);
    }

    public static int [] MergeTwoSortedArray(int [] arr1,int [] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int [] ans=new int[n+m];
        int i=0;//track of arr1
        int j=0;//arr2
        int k=0;//ans
        while(i<n && j<m ){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;

            }else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;

        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}