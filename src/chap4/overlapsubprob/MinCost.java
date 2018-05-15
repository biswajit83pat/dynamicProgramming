package chap4.overlapsubprob;

public class MinCost {

	static int cost[][] = {{0,	10,	75,	94},
					{-1,0,	35,	50},
					{-1,-1,	0,	80},
					{-1,-1,	-1,	0}			
	};
	
	public static void main(String[] args) {
		System.out.println(calculateMinCost(0, 3));

	}
	
	public static int calculateMinCost(int s, int d) {
		if(s == d || s == d-1) {
			return cost[s][d];
		}
		
		int minCost = cost[s][d];
		
		for(int i = s+1; i <d; i++) {
			int temp = calculateMinCost(0, i) + calculateMinCost(i, d);
			if(temp < minCost) {
				minCost = temp;
			}
		}
		return minCost;
	}

}
