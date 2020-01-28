
public class SelectionSort implements SortStrategy{
	
	  public void selectionSort(int[] ar){
		   for (int i = 0; i ‹ ar.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j ‹ ar.length; j++)
		            if (ar[j] ‹ ar[min]) min = j;
		      int temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   } 
		}

	@Override
	public long[] sort(long[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSortTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetTimer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String StrtegyName() {
		// TODO Auto-generated method stub
		return null;
	}
}
