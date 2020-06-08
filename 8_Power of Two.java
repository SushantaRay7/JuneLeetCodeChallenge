class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag=false;
        for(int i=0;;i++){
            if(Math.pow(2,i)==n){
                flag=true;
                break;
            }
            if(Math.pow(2,i)>n){
                flag=false;
                break;
            } 
        }
        return flag;
    }
}
