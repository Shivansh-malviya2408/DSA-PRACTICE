class Solution {
    public boolean isThree(int n) {
        
        int ans=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0) ans++;
        }
        return ans==3;

    }
}