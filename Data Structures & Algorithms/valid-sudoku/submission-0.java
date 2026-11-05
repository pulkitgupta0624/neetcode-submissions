class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            Set<Character> seen = new HashSet<>();

            for(int j=0; j<9; j++){

                char ch = board[i][j];

                if(ch == '.') continue;

                if(seen.contains(ch)) return false;

                seen.add(ch);
            }
        }

        for(int i=0; i<9; i++){
            Set<Character> seen = new HashSet<>();

            for(int j=0; j<9; j++){

                char ch = board[j][i];

                if(ch == '.') continue;

                if(seen.contains(ch)) return false;

                seen.add(ch);
            }
        }

        for(int sq=0; sq<9; sq++){
            Set<Character> seen = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){

                    int r = (sq/3)*3 + i;
                    int c = (sq%3)*3 + j;

                    char ch = board[r][c];

                    if(ch == '.') continue;

                    if(seen.contains(ch)) return false;

                    seen.add(ch);
                }
            }
        }

        return true;
    }
}
