
public class ArrayRotate {

	
	public static int[] rotatearray(int[] arr, int order) {
		//int i, j, temp;
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		
		}
		return arr;

	}
	public void printArray(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotate ar = new ArrayRotate();
		int[] array = {0,1,2,3,4,5,6,7};
		ar.rotatearray(array, 3);
		ar.printArray(array, 8);
		//System.out.println( result);
		
		

	}

}
