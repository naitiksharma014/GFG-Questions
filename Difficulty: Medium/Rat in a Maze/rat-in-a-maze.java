// TC: O(4^(n²))


class Solution {
    int n;
    ArrayList<String> result = new ArrayList<>();
    
    public void solve(int[][] maze, int r, int c, String path) {
        if(r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1) {
            return;
        }
        
        if(r == n - 1 && c == n - 1) {
            result.add(path);
            return;
        }
        
        maze[r][c] = -1;     // Visit
        
        solve(maze, r + 1, c, path + "D");
        solve(maze, r, c - 1, path + "L");
        solve(maze, r, c + 1, path + "R");
        solve(maze, r - 1, c, path + "U");
        
        maze[r][c] = 1;     // Un visit
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        n = maze.length;
        
        solve(maze, 0, 0, "");
        
        return result;
    }
}