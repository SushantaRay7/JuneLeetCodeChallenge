class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int countA=0,countB=0;
        int n=costs.length;
        int sum=0;
        Arrays.sort(costs, (a, b) ->  Math.abs(b[0]-b[1]) - Math.abs(a[0] - a[1]));   
        for(int i=0;i<n;i++)
        {
            if(costs[i][0]<costs[i][1])
            {
                if(countA!=n/2)
                {
                    countA++;
                    sum+=costs[i][0];
                    
                }
                else
                {
                    countB++;
                    sum+=costs[i][1];
                    
                }
    
            }
            else
            {
                
                if(countB!=n/2)
                {
                    countB++;
                    sum+=costs[i][1];
                    
                }
                else
                {
                    countA++;
                    sum+=costs[i][0];
                    
                }
                
            }
            
        }
        
        return sum;
        
    }
}
