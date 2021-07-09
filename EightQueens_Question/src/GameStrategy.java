public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
        return cellId%8;
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		return cellId/8;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		//same row
		for(int i=0;i<8;i++) {
			if(placedQueens[row][i]) {
				return false;
			}
		}
		// same column
		for(int i=0;i<8;i++) {
			if(placedQueens[i][col]) {
				return false;
			}
		}
		//diagonals
		for(int i=row+1,j=col+1;i<8 && j<8;i++,j++) {
			if(placedQueens[i][j]) {
				return false;
			}
		}
		
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(placedQueens[i][j]) {
				return false;
			}
		}
		
		for(int i = row+1,j=col-1;i<8 && j>=0 ;i++,j--) {
			if(placedQueens[i][j]) {
				return false;
			}
		}
		for(int i = row-1,j=col+1;i>=0 && j<8 ;i--,j++) {
			if(placedQueens[i][j]) {
				return false;
			}
		}
		if(isValid) {
			placedQueens[i][j] = true;
			numQueens++;
		}
		
		return isValid;
	}
}














