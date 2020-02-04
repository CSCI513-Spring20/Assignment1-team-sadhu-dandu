package Source;
public class RandomSearch implements SearchMethods{
    @Override
    public String Search(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        while(cnt<8){

            int i= (int)(Math.random()*25);
            int j=(int)(Math.random()*25);

            if(name[i][j]=="C" || name[i][j]=="B"){
                cnt++;
            }
            cells++;
        }
        return "Number of cells searched:"+cells;
    }
}
