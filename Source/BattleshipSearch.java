package Source;

import java.io.*;
import java.util.StringTokenizer;



public class BattleshipSearch  {
    SearchMethods linearSweep = new HorizontalSweep();
    SearchMethods randomSearch = new RandomSearch();
    SearchMethods strategicSearch = new StrategySearch();
	
	// Method for reading the file
	
    public void readFile(String pathURL) throws IOException {
        BattleshipSearch battleshipSearch=new BattleshipSearch();
        //Added new Object
        File file = new File(pathURL);// Passing the url to the File object
        // Buffered reader object for reading the file
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int gameNum=1;
        while ((st = br.readLine()) != null){
            System.out.println(st);
            
            // Grid object
            Grid grid=new Grid();
            
            
            String [][] maingrid=grid.returnGrid();
            int i=0;
            // String tokenizer for tokenizing
            StringTokenizer tokenizer = new StringTokenizer(st, ")");
            while(tokenizer.hasMoreTokens()) {
            	//if tokenizer has more tokens go to next token and split it with ,.
            	
                String t = tokenizer.nextToken();
                String parts[] = t.split(",");
                String party1 = parts[0];
                String part1 = party1.substring(1);
                String party2 = parts[1];
                String part2 = party2.substring(0);
                if(i<5) {
                    maingrid[Integer.parseInt(part1)][Integer.parseInt(part2)]="C";
                }
                else {
                    maingrid[Integer.parseInt(part1)][Integer.parseInt(part2)]="B";
                }
                i++;

            }
            System.out.println("Game "+gameNum+":");
            System.out.println("Strategy: Horizontal Sweep");
            String[] showResult=linearSweep.Search(maingrid).split("@");
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
    }


    }


