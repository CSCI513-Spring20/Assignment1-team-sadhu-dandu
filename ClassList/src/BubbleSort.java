
public class BubbleSort implements SortStrategy{
	
	public void bubbleSort(int ar[])
	{
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j > i ; j++)
	      {
	         if (ar[j-1] > ar[j])
	         {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         } 
	       } 
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
