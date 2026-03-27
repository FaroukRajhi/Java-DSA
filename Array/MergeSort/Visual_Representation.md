Level 0: [8, 3, 5, 1, 4, 2, 7, 6]     ← split
Level 1: [8,3,5,1]     [4,2,7,6]       ← split
Level 2: [8,3] [5,1]   [4,2] [7,6]     ← split
Level 3: [8][3] [5][1] [4][2] [7][6]   ← base case (n single elements)
         ↓    ↓    ↓    ↓    ↓    ↓
Level 3: [3,8] [1,5] [2,4] [6,7]      ← merge
Level 2: [1,3,5,8]     [2,4,6,7]      ← merge
Level 1: [1,2,3,4,5,6,7,8]            ← merge
Level 0: done


# Complexity

Time: O(n log n) — fast and consistent

Space: O(n) — requires extra memory for the temporary arrays during merging