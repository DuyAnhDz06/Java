package CodeGiaitri;


public class Ex02p2 {

	public static void main(String[] args) {
		// Given a & b, calculate a sum of all even numbers in [a,b]
		int a = 11;
		int b = 90;
		//C1: Equation
		int start = (a%2==0) ? a : (a+1);
		int end = (b%2==0) ? b : (b-1);
		int sum = (start+end) * ((end-start)/2+1)/2;
		System.out.println("Result = " + sum);
		
		//C2: Iteration
		sum = tinh_tong(a, b);
		System.out.println("Result = " + sum);
		
		//C3: Recursion
		sum = s(start,end);
		System.out.println("Result = " + sum);
	}

	private static int s(int start, int end) {
		if(start == end) return end;
		else
			return s(start+2, end) + start;
	}

	private static int tinh_tong(int a, int b) { //Iterative function
		int sum = 0;
//		for(int i=a; i<=b; i++) {
//			if(i%2==0)
//				sum = sum + i;
//		}
//		//------------------------------------
		int k = (a%2==0) ? a : (a+1); //k is always an even number (nearest to a)
		for(int i=k; i<=b; i+=2) {
			sum = sum + i;
		}
		return sum;
	}

}
