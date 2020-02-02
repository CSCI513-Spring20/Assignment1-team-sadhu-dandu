package Source;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class Grid {
	public void readFile() {
		String[][] maingrid=new String[25][25];
		
		  for(int i=0;i<maingrid.length;i++) { 
			  for(int j=0;j<maingrid[0].length;j++) {
				  maingrid[i][j]="."; 
				  } 
			  }
		 
		try
		{
		FileReader inputFile = new FileReader("C:\\Users\\pavan\\Desktop\\coord.txt");
		BufferedReader br = new BufferedReader(inputFile);
		String line;
		int lineNumber;
		 for (lineNumber =1; lineNumber <= 3; lineNumber++) {
		        if (lineNumber == 1) {
		          line = br.readLine();
		         
		   int i=0;
		   StringTokenizer tokenizer = new StringTokenizer(line, ")");
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
			
			
			

		System.out.println(line);
		 }
		}
		br.close();
		}
	   catch (Exception e){
		e.printStackTrace();
		}
		
		
		  for(int i=0;i<maingrid.length;i++) {
			  for(int j=0;j<maingrid[0].length;j++) {
				  System.out.print(maingrid[i][j]+" "); 
				  } 
			  System.out.println(""); 
			  }
		 }
	  
	public static void main(String[] args) {
		Grid grid = new Grid();
		   
		grid.readFile();	  
	    
	}

	}




