class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            col[i]=new HashSet<>();
            row[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char x=board[i][j];

                if(x=='.') continue;

                int  b=(i/3)*3+(j/3);
                if(row[i].contains(x) ||
                    col[j].contains(x) ||
                    box[b].contains(x))
                {
                        return false;
                }
                else{
                    row[i].add(x);
                    col[j].add(x);
                    box[b].add(x);
                }
            }
        }
        return true;
    }
}
