/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCH1001thayquan;

/**
 *
 * @author DELL
 */
public class EX04 {
//    public static void main(String[] args) {
//        System.out.println("*     *");
//        System.out.println("**   **");
//        System.out.println("*** ***");
//        System.out.println("*******");
//        System.out.println("*** ***");
//        System.out.println("**   **");
//        System.out.println("*     *");
//    }
//    
   
    public static void main(String[] args)
    {
       
        int n =7;
        for(int i=1; i<=n/2+1; i++){
        print(i, n);
        }
        for(int i=n/2; i>=1; i--){
        print(i, n);
        }
    }
    private static void print(int i, int n){
    for(int j=1; j<=n; j++) {
                 if(j>i && j<n-i+1)
                 System.out.print("  ");
                 else
                 System.out.print("* ");
             }
             System.out.println(); //xuống dòng, sang hàng mới
             //CÁCH 2
//              int n = 11;
//         for(int i=1; i<=n/2+1; i++){
//             for(int j=1; j<=n; j++) {
//                 if(j>i && j<n-i+1)
//                 System.out.print("  ");
//                 else
//                 System.out.print("* ");
//             }
//             System.out.println(); //xuống dòng, sang hàng mới
//         }
//         for(int i=n/2; i>=1; i--){
//             for(int j=1; j<=n; j++) {
//                 if(j>i && j<n-i+1)
//                 System.out.print("  ");
//                 else
//                 System.out.print("* ");
//             }
//             System.out.println(); //xuống dòng, sang hàng mới
//         }
//    }
    }
 }