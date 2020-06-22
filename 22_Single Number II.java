class Solution {
    public int singleNumber(int[] nums) {
        
        int value=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i : nums){
            map.put( i , map.getOrDefault(i,0)+1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i)==1){
                value=i;
                break;
            }
        }
        return value;
    }
}
