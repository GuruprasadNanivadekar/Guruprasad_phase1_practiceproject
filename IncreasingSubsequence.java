package IncreasingSub;

public class IncreasingSubsequence {
	
	static int max_start;
	
	static int lis(int arr[], int a) {
		if (a == 1)
            return 1;
		
		int res, max_end = 1;
		
		for (int i = 1; i < a; i++) {
            res = lis(arr, i);
            if (arr[i - 1] < arr[a - 1]
                && res + 1 > max_end)
                max_end = res + 1;
        }
		
		 if (max_start < max_end)
			 max_start = max_end;
		 
		 return max_end;
	}
	
	static int lis1(int arr[], int n) {
		max_start = 1;
		lis(arr, n);
		return max_start;
	}
	
	public static void main(String args[])
    {
        int arr[] = { 50, 27, 88, 45, 211, 70, 11, 30 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n)
                           + "\n");
    }
}
