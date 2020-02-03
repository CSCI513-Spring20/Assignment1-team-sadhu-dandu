package Source;

import java.io.*;
import java.util.StringTokenizer;

public class BattleshipSearch implements SearchMethods {

    public void readFile(String pathURL) throws IOException {
        BattleshipSearch battleshipSearch=new BattleshipSearch();
        File file = new File(pathURL);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int gameNum=1;
        while ((st = br.readLine()) != null){
            System.out.println(st);
            Grid grid=new Grid();
            String [][] maingrid=grid.returnGrid();
            int i=0;
            StringTokenizer tokenizer = new StringTokenizer(st, ")");
            while(tokenizer.hasMoreTokens()) {
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

    @Override
    public String randomSearch(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        while(cnt<8){
            int i=(int)(Math.random()*25);
            int j=(int)(Math.random()*25);
            if(name[i][j]=="C" || name[i][j]=="B"){
                cnt++;
            }
            cells++;
        }
        return "Number of cells searched:"+cells;
    }

    @Override
    public String strategicSearch(String[][] name) {
        return "Number of cells searched: Nothing written in the method yet";
    }
}
