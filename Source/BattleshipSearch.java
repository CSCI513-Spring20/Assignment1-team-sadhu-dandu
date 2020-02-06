package Source;

import java.io.*;
import java.util.StringTokenizer;

//Implementing the Searchmethods interface

public class BattleshipSearch implements SearchMethods {

	
	// Method for reading the file
	
    public void readFile(String pathURL) throws IOException {
        BattleshipSearch battleshipSearch=new BattleshipSearch();
        //Added new Object
        File file = new File(pathURL);// Passing the url to the File object
        // Buffered reader onject for reading the file
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
            	if tokenizer has more tokens go to next token and split it with ,.
            	
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
            String[] showResult=battleshipSearch.linearSweep(maingrid);
            System.out.println(showResult[0]);
            System.out.println(showResult[1]);
            System.out.println("Strategy: Random Search");
            System.out.println(battleshipSearch.randomSearch(maingrid));
            System.out.println(showResult[1]);
            System.out.println("Strategy: Strategic Search");
            System.out.println(battleshipSearch.strategicSearch(maingrid));
            System.out.println(showResult[1]);
            gameNum++;
        }
    }

    // linearsweep method for calculating the number of cells searched
    @Override
    public String[] linearSweep(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        for(int p=0;p<name.length;p++) {
            for(int j=0;j<name[0].length;j++) {
                if (name[p][j]=="C" || name[p][j]=="B"){
                    cnt++;
                    coordinates=coordinates+"("+p+","+j+")-";
                }
                cells++;
                if(cnt==8){
                	
                	// if count is equal to 8 then split the coordinates and find the number of cells searched
                	
                    String[] test=coordinates.split("-");
                    String[] retunArr=new String[2];
                    retunArr[0]="Number of cells searched:"+(cells-1);
                    retunArr[1]="Carrier found: "+test[0]+" to "+test[4]+" Submarine Found :"+test[5]+" to "+test[7];
                    return retunArr;
                }
            }
        }
        return null;
    }

    // method for the random search and the number of cells searched
    @Override
    public String randomSearch(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        while(cnt<8){
        	
        	// if count is less than 8 then execute the following condition
            int i=(int)(Math.random()*25);
            int j=(int)(Math.random()*25);
            if(name[i][j]=="C" || name[i][j]=="B"){
                cnt++;
            }
            cells++;
        }
        return "Number of cells searched:"+cells;
    }
// method for strategic search and the number of cells searched
    @Override
    public String strategicSearch(String[][] name) {
        return "Number of cells searched: Nothing written in the method yet";
    }
}
