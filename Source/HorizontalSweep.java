package Source;

public class HorizontalSweep implements SearchMethods {
    @Override
    public String Search(String[][] name) {
        int cnt=0;
        int cells=0;
        String coordinates="";
        for(int p=0;p<name.length;p++) {
            for(int j=0;j<name[0].length;j++) {
                if (name[p][j]=="C" || name[p][j]=="B"){
                    cnt++;
                    coordinates=coordinates+"("+p+","+j+")-";// pushing the submarine and carrier coordinates into string
                }
                cells++;
                if(cnt==8){
                    String[] test=coordinates.split("-");// Retrieving the coordinates by splitting string using "-"
                    return "Number of cells searched:"+(cells-1)+"@"+"Carrier found: "+test[0]+" to "+test[4]+" Submarine Found :"+test[5]+" to"+test[7];
                }
            }
        }
        return null;
    }
}

