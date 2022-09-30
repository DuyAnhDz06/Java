/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeGiaitri;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ex01p2 {
    public static void main(String[] args) {
		// Sum = 1 + 2 + ... + n
                System.out.println("Please Input N: ");
		int n = new Scanner(System.in).nextInt();
		      
		//C1: Equation
                /*
                T(n) = 4
                Số bước thực hiện trong C1 không phụ thuộc vào kích thước của n (input size)
                => Big O: O(1) - Constant time
                */
		int sum = n * (n+1)/2;
		System.out.println("Result = " + sum);
		
		//C2: Iteration
		sum = tinh_tong(n);
		System.out.println("Result = " + sum);
                
		
		//C3: Recursion
                
                //Time complexity - O(n); Space Conplexity - O(n)
		sum = s(n);
		System.out.println("Result = " + sum);
	}

	private static int s(int n) { //Recursive function : Time complexity : O(n)
		if(n==0) return 0;
		else
			return s(n-1) + n;
	}

	private static int tinh_tong(int n) { //Iterative function: Time complexity : O(n)
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum = sum + i;
		return sum;
                 /*
        sum = 0        //1
        i = 1          //1
        i <= n         //(n + 1) times
        i++            // n times
        sum = sum + i  // 2 * n times
        
        */
        // T(n) = 4n + 3
        // => O(n): Liner time
	}
        
        long getOperationCount(int n)
{
long counter = 0;
for (int i = 0; i < n; i++)
{
int j = 0;
for ( j = 0; j < n; j++)
    counter++;
}

return counter;
}
        /*
        Câu lệnh 52: counter++ là câu lệnh chạy nhiều lần nhất khi các giá trị i & j là hợp lệ
        i = 0; j = 0 => (n - 1): Có n giá trị khác nhau của j
        i = 1; j = 0 => (n - 1): Có n giá trị khác nhau của j
        i = 2; j = 0 => (n - 1): Có n giá trị khác nhau của j
        ...
        i = n - 1; j = 0 => (n-1): Có n giá trị khác nhau của j
        Với mỗi giá trị hợp lệ của i, thì j chạy n lần.
        i có giá trị hợp lệ, vậy tổng số bước câu lệnh counter++ thực hiện là: n * n bước
        => Sử dụng ký hiệu Big O, ta có độ phức thời gian của thuật toán trên là O(n)
        */
/*
        counter = 0       //1
        i = 0             //1
        i < n             //(n+1) times
        i++               //n
        j = 0             //n
        j < n             // Mỗi bước lặp của i, thì (j < n) chạy (n + 1) times
                             Tổng: n * (n + 1) = (n * n) + n
        j++               // n * n
        counter++         // n * n
        */
        // T(n) = 3n^2 + 4n + 3
        // => O(n^2)
        
       
}
