public class task_16 {
    public static int countCombinations(int numDice, int targetSum) {
        if (numDice < 1 || numDice > 6 || targetSum < numDice || targetSum > 6 * numDice) {
            return 0;
        }

        // Initialize a 2D array to store the results of subproblems
        int[][] dp = new int[numDice + 1][targetSum + 1];

        // There is one way to achieve a sum of 0 with 0 dice
        dp[0][0] = 1;

        for (int i = 1; i <= numDice; i++) {
            for (int j = 1; j <= targetSum; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k >= 0) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }

        return dp[numDice][targetSum];
    }

    public static void main(String[] args) {
        System.out.println(countCombinations(3, 4));  // Output: 3
        System.out.println(countCombinations(3, 6)); // Output: 4221
    }
}

