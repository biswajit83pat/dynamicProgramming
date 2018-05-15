package chap1.recursion;

public class MultiplicationTableViaRecursion {
	
	public static void main(String[] args) {
		multiplicationRecursion(10, 1);
	}
	
	public static void multiplicationRecursion(int n, int i) {
		if(i > 10) return;
		System.out.printf("%d * %d = %d \n", n , i , (n*i));
		multiplicationRecursion(n, i+1);
	}

}
