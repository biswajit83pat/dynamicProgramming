package chap1.recursion;

public class HeadVsTailRecursion {
	public static void main(String[] args) {
		
		System.out.println();
		
		System.out.println("Head recursion --> start to end: ");
		headRecursion(5);//12345
		System.out.println();
		System.out.println("Tail recursion --> end to start: ");
		tailRecursion(5);//54321
		
	}
	
	private static void headRecursion(int n) {
		if(n == 0) {
			return ;
		} else {
			headRecursion(n - 1);
		}
		
		System.out.print(n);
	}
	
	private static void tailRecursion(int n) {
		if(n == 0 ) {
			return ;
		} else {
			System.out.print(n);
		}
		
		tailRecursion(n-1);
	}

}
