🎒 The Knapsack Problem (0-1 Knapsack)
Problem Statement:
Given a set of items, each with a weight and a value, determine the maximum total value you can put into a knapsack of capacity W. Each item can be either included once or not at all.

Approach:
Use dynamic programming to build a table where:

dp[i][w] represents the maximum value achievable using the first i items with a weight limit of w.

📝 Example with Explanation
Let’s consider:

Item	Weight	Value
1	2	12
2	1	10
3	3	20
4	2	15

Knapsack Capacity (W) = 5

🚀 Java Code
java
Copy
Edit
public class Knapsack {
    // Returns the maximum value that can be put in a knapsack of capacity W
    public static int knapsack(int[] weights, int[] values, int n, int W) {
        int[][] dp = new int[n + 1][W + 1];

        // Build dp table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;  // base case: no items or 0 capacity
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        values[i - 1] + dp[i - 1][w - weights[i - 1]],  // include item
                        dp[i - 1][w]                                   // exclude item
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];  // can't include item
                }
            }
        }

        // The bottom-right cell contains the answer
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {2, 1, 3, 2};
        int[] values = {12, 10, 20, 15};
        int capacity = 5;
        int n = weights.length;

        int maxValue = knapsack(weights, values, n, capacity);
        System.out.println("Maximum value achievable: " + maxValue);
    }
}
🔎 Explanation:
✅ Initialization:

The first row and first column in dp are filled with zeros, representing the base case:

0 items → 0 value

0 capacity → 0 value

✅ Choice Diagram:
For each item i and capacity w:

If weights[i-1] <= w:

Either include the item and add its value + best value achievable with remaining capacity (w - weights[i-1]),

Or exclude the item and carry forward the best value from the previous row.

We take the maximum of both choices.

✅ Example Progression:

At i=3 and w=5, weights[2]=3 <= 5:

Include: value 20 + dp[2][2]

Exclude: dp[2][5]

dp[3][5] = max(include, exclude)

✅ Result:

dp[n][W] holds the final answer: maximum value.

✅ Output:

yaml
Copy
Edit
Maximum value achievable: 37
(For this example: items 2 (10), 4 (15), and 1 (12) together = 37.)

