public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
    char[][] sudoku = new char[9][9];
    int i=0;
	// convert array of String to array of character array
    for (String str : A) {
		sudoku[i] = (char[]) str.toCharArray();
		i++;
    }
    
    if (sudoku == null || sudoku.length != 9 || sudoku[0].length != 9)
        return 0;
    // check each column
    for (i = 0; i < 9; i++) {
        boolean[] m = new boolean[9];
        for (int j = 0; j < 9; j++) {
            if (sudoku[i][j] != '.') {
                if (m[(int) (sudoku[i][j] - '1')]) {
                    return 0;
                }
                m[(int) (sudoku[i][j] - '1')] = true;
            }
        }
    }
 
    //check each row
    for (int j = 0; j < 9; j++) {
        boolean[] m = new boolean[9];
        for (i = 0; i < 9; i++) {
            if (sudoku[i][j] != '.') {
                if (m[(int) (sudoku[i][j] - '1')]) {
                    return 0;
                }
                m[(int) (sudoku[i][j] - '1')] = true;
            }
        }
    }
 
    //check each 3*3 matrix
    for (int block = 0; block < 9; block++) {
        boolean[] m = new boolean[9];
        for (i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
            for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                if (sudoku[i][j] != '.') {
                    if (m[(int) (sudoku[i][j] - '1')]) {
                        return 0;
                    }
                    m[(int) (sudoku[i][j] - '1')] = true;
                }
            }
        }
    }
 
    return 1;
        
    }
}