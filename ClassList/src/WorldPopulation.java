import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

import jdk.internal.util.xml.impl.Input;
import sun.management.counter.StringCounter;

public class WorldPopulation {

	SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
//		sortStrategy = new #; // Set the default strategy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		int counter = 0;
		try {
			File InputFile = new File(fileName);
			FileReader filereader = new FileReader(InputFile);
			BufferedReader bufferreader = new BufferedReader(filereader);
			String line;
			
			while(line = reader.readLine()!= null) {
				StringTokenizer tokenizer = new StringTokenizer(line,",");
				String CountryName = tokenizer.nextToken();
				String year = 
			}
		}
	  
		return population;
	}
	
	
	public void sortPopulation(){		
		BubbleSort bubblesort = new BubbleSort();
		bubblesort.bubbleSort(population);
		double timetaken = bubblesort.getSortTime();
		System.out.println("Time for bubblesort:", timetaken);
		
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.insertionSort(population);
		double timetaken = insertionsort.getSortTime();
		System.out.println("Time for insertionsort:", timetaken);
		
		SelectionSort selectionsort = new SelectionSort();
		selectionsort.selectionSort(population);
		double timetaken = selectionsort.getSortTime();
		System.out.println("Time for selectionsort:", timetaken);
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(); 
		worldPopulation.sortPopulation();	
	}

}
