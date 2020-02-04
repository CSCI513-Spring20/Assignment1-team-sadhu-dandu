package  Source;
import java.io.*;
public class Sourcemain {
    public static void main(String[] args) throws IOException {
        BattleshipSearch battleshipSearch=new BattleshipSearch(); //object for Battleship Search class
        battleshipSearch.readFile("C:\\Users\\pavan\\Desktop\\coord.txt"); //calling readFile method
    }

}
