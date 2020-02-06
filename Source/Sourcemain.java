package  Source;
import java.io.*;

// class sourcemain
public class Sourcemain {
	
	//main method that throws an exception
	
    public static void main(String[] args) throws IOException {
    	// Battleship search class with the object
    	
        BattleshipSearch battleshipSearch=new BattleshipSearch();
        battleshipSearch.readFile("Assignment1/input.txt");
    }

}
