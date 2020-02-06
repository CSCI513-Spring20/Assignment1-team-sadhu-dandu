package Source;

// class grid

public class Grid {
	
	// private array grid
	
	private String[][] grid=new String[25][25];
	public String[][] returnGrid(){
		
		// for loop
		
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++){
				grid[i][j]="X";
			}
		}
		return grid;
	}
}




