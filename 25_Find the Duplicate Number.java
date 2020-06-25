class Solution {
    public int findDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        int number=0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i)>1){
                number=i;
                break;
            }
        }
        return number;
    }
}
