package Source;
public class Grid {
	private String[][] grid=new String[25][25]; //New String Array
	public String[][] returnGrid(){       //Creating Grid
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++){
				grid[i][j]="X";
			}
		}
		return grid;
	}
}




