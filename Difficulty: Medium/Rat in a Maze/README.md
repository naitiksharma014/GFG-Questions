<h2><a href="https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1">Rat in a Maze</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a binary matrix <strong>maze[][]</strong> of size<strong> n × n</strong> containing values <strong>0</strong> and <strong>1</strong>, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).</span></p>
<ul>
<li><span style="font-size: 14pt;">1 represents an open cell through which the rat can move.</span></li>
<li><span style="font-size: 14pt;">0 represents a blocked cell that cannot be traversed.</span></li>
</ul>
<p><span style="font-size: 14pt;">The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
<strong>Output: </strong>[<span class="hljs-string">"DDRDRR"</span>, <span class="hljs-string">"DRDDRR"</span>]
<strong>Explanation</strong>: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929574/Web/Other/blobid0_1781254127.png" width="301" height="127"><br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: maze[][] = [[1, 0], [1, 0]]
<strong>Output: </strong>[]
<strong>Explanation</strong>: No path exists as the destination cell (1, 1) is blocked.
</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>2 ≤ n ≤ 5<br>0 ≤ maze[i][j] ≤ 1</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Backtracking</code>&nbsp;<code>Algorithms</code>&nbsp;