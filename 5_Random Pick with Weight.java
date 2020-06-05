class Solution {
    
    int[] w_sum;
    public Solution(int[] w){
        w_sum= new int[w.length];
        int sum=0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            w_sum[i]=sum;
        }
    }
    public int pickIndex() {
        int randomNo= (int)(w_sum[w_sum.length-1]*Math.random());
        int res=-1;
        int si=0,ei=w_sum.length-1;
        while(si<=ei){
            int mid=(si + (ei-si)/2);
            if(randomNo < w_sum[mid]){
                res=mid;
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
