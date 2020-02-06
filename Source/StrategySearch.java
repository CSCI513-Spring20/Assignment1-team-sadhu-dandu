package Source;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class StrategySearch implements SearchMethods {
    @Override
    public String Search(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        /*ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<25;i++) {
            for (int j = 0; j < 25; j++) {

                list.add(name[i][j]);
                */



         for(int p=0;p<name.length;p++) {
            for(int j=0;j<name[0].length;j++) {
                if (name[j][p]=="C" || name[j][p]=="B"){
                    cnt++;
                }
                cells++;
                if(cnt==8){
                    return  "Number of cells searched:"+(cells-1);
                }
            }
        }

        return null;
    }

}

