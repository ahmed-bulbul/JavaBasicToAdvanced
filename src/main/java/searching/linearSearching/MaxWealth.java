package searching.linearSearching;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int i : account) {
                rowSum = rowSum + i;
            }
            if (rowSum > ans)
                ans = rowSum;
        }
        return ans;
    }

}
