package Source;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Random;
public class BattleshipSearch  {
    Random ra = new Random();
    SearchMethods horizontalSweep=new HorizontalSweep();  //object for Horizontalsweep
    SearchMethods randomSearch=new RandomSearch();        //object for RandomSearch
    SearchMethods strategicSearch=new StrategySearch();   //object for StrategySearch
    public void readFile(String pathURL) throws IOException {

        BattleshipSearch battleshipSearch=new BattleshipSearch();//Added new Object

        File file = new File(pathURL);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int gameNum=1;
        while ((st = br.readLine()) != null){
            System.out.println(st);
            Grid grid=new Grid();//object for the  class Grid
            String [][] maingrid=grid.returnGrid(); //copying the return grid to main grid
            int i=0;
            StringTokenizer tokenizer = new StringTokenizer(st, ")");
            while(tokenizer.hasMoreTokens()) {
                String t = tokenizer.nextToken();
                String parts[] = t.split(",");  //splitting the string based on comma
                String party1 = parts[0];
                String part1 = party1.substring(1);
                String party2 = parts[1];
                String part2 = party2.substring(0);
                if(i<5) {
                    maingrid[Integer.parseInt(part1)][Integer.parseInt(part2)]="C"; // placing the carrier on the grid
                }
                else {
                    maingrid[Integer.parseInt(part1)][Integer.parseInt(part2)]="B"; // placing the submarine on the grid
                }
                i++;

            }
            System.out.println("Game "+gameNum+":");
            System.out.println("Strategy: Horizontal Sweep");
            String[] showResult=horizontalSweep.Search(maingrid).split("@");
            System.out.println(showResult[0]);
            System.out.println(showResult[1]);
            System.out.println("Strategy: Random Search");
            System.out.println(randomSearch.Search(maingrid));
            System.out.println(showResult[1]);
            System.out.println("Strategy: Strategic Search");
            System.out.println(strategicSearch.Search(maingrid));
            System.out.println(showResult[1]);
            gameNum++;
        }
        System.out.println("\n");
    }

}

