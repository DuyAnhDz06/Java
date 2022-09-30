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
public class Ex02 {

    // given a & b, caculate a sum of all even numbers in [a,b]
    public static void main(String[] args) {
//========================================================================================
// Cach 1: For and IF

		int number = 0;
                int i = 0;
                int evenSum = 0;
                Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("n The Sum of Even Numbers up to " + number + "  =  " + evenSum);
//========================================================================================

//Cach 2: equation
//        int a = 11;
//        int b = 90;
//        int sum = 0;
//        for (int i = a; i <= b; i++)
//        {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
////========================================================================================
//        int k = (a % 2 == 0) ? a : (a + 1);
//        for (int i = k; i <= b; i += 2)
//        {
//            sum = sum + i;
//        }
//        boolean evenSum = false;
//        String number = null;
//        System.out.println("n The Sum of Even Numbers up to " + number + "  =  " + evenSum);
//========================================================================================

//Cach 3 : Iteration
//int sum = 0;
//int k = (a % 2 == 0) ? a : (a + 1);
//for(int i = k; i <= b; i += 2)
//{
//sum = sum + i;
//}

//========================================================================================

//cach 4: van la equation nhung xin hon

//int start = ( a % 2 == 0) ? a : (a + 1);
//int end = ( b % 2 == 0) ? b : (b - 1);
//int sum = (start + end) * ((end - start) / 2 + 1) / 2;
//
//System.out.println("result = " + sum);

//========================================================================================

//Cach 5: Recursion

//private static int s (int start, int end)
//{
//    if(start == end)
//        return end;
//    else
//        return s(start + 2, end) + start;

}
}