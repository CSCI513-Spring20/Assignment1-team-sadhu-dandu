
public class InsertionSort implements SortStrategy{

		public void insertionSort(int[] ar)
		{
		   for (int i=1; i ‹ ar.length; i++)
		   {
		      int index = ar[i]; int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
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
