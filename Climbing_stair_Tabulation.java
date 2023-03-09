package Dynamic_Programming;

public class Climbing_stair_Tabulation {
    public static int countWays(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else {
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;

        System.out.println("So the number of ways to reach "+n+" th stairs is "+countWays(n));
    }
}
