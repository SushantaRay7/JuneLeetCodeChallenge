class Solution {
    public void reverseString(char[] s) {
        
        for(int i =0, l=s.length-1; i<l ; i++,l--){
            char temp=s[i];
            s[i]=s[l];
            s[l]=temp;
        }
    }
}
