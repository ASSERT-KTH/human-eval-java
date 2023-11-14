package humaneval.buggy;

/*
 * You are given a rectangular grid of wells. Each row represents a single well,
    and each 1 in a row represents a single unit of water.
    Each well has a corresponding bucket that can be used to extract water from it, 
    and all buckets have the same capacity.
    Your task is to use the buckets to empty the wells.
    Output the number of times you need to lower the buckets.

    Example 1:
        Input: 
            grid : [[0,0,1,0], [0,1,0,0], [1,1,1,1]]
            bucket_capacity : 1
        Output: 6

    Example 2:
        Input: 
            grid : [[0,0,1,1], [0,0,0,0], [1,1,1,1], [0,1,1,1]]
            bucket_capacity : 2
        Output: 5
    
    Example 3:
        Input: 
            grid : [[0,0,0], [0,0,0]]
            bucket_capacity : 5
        Output: 0

    Constraints:
        * all wells have the same length
        * 1 <= grid.length <= 10^2
        * 1 <= grid[:,1].length <= 10^2
        * grid[i][j] -> 0 | 1
        * 1 <= capacity <= 10
 */

public class MAX_FILL {
    public static int max_fill(int[][] grid, int bucket_capacity) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            int row_capacity = 0;
            for(int j = 0; j < grid[j].length; j++) {
                row_capacity += grid[j][i];
            }
            result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
        }
        return result;
    }
}
