package chap5.memoization;

public class FibonacciWithMemoization {
	
	static int[] arr = new int[10];
	
	
	public static void main(String[] args) {
		
		System.out.println("Kth fibonacci term is --> " + calcFibonacci(3));
	}
	
	public static int calcFibonacci(int n) {
		
		if(n<0) return 1;
		
		if(arr[n] != 0) {
			return arr[n];
		}
		
		if ((n == 1) || (n ==2)) {
			arr[n] = 1;
		}
		
		arr[n] = calcFibonacci(n-1) + calcFibonacci(n-2);
		
		return arr[n];
	}
}
