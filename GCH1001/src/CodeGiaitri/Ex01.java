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
public class Ex01 {
    //Sum = 1 + 2 + ... + n
    // Cach 1: su dung do-while
    public static void main(String[] args) {
        System.out.println("Input N: ");
  int n = new Scanner(System.in).nextInt();  
  
  int sum = 0; 
  int i=1; 
   do{ 
    sum = sum + i; 
    i++; 
    }
   while(i<=n) ;
   System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum); 
        System.out.println("-----------Cach 1-------------");
        } 
}
//=====================================================================   
        //Cach 2: Dung for
//   System.out.println("Input N: ");
//  int n = new Scanner(System.in).nextInt();  
//  for(int i=1;i<=n;i++) { 
//      sum = sum + i ; 
//   } 
//     System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum); 
//     System.out.println("-----------Cach 2-------------");
//    }}
//======================================================================
// Cach 3: Equation
//int sum = n * (n+1)/2;
//     System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum);  
//     System.out.println("-----------Cach 3-------------");
//}}
//======================================================================
// Cach 4: Recursion
//sum = s(n);
//  System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum);  
  
//}}