/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCH1001thayquan;
import java.util.Scanner;

/**
 * // HOMEwork
 * // 1. Cho 1 mảng arr và 1 giá trị k, tìm các cặp có tổng = k 
 * ví dụ: arr = {1, 9, 2, 8, 2, 7, 0, 4, 1, 6} 
 * k = 10
 * out put: (1, 9); (2, 8), (4, 6)
 * // 2. Tìm dãy tăng liên tiếp dài nhất trong 1 mảng
 * VÍ Dụ: arr = {3,2,1,4,5,2,4,7,9,10,2,3}
 * Output:
 * Dãy tăng tiếp tiếp dài nhất là: 2,4,7,8,10
 * @author DELL
 */
public class EX02 {
    

 
    public static void main(String[] args) {
        // Cho số x, phân tích x thành tích các thừa số nguyên tố
        // Ví dụ: 88 = 11 * 2 * 2 * 2k
        // 100 = 5 * 5 * 2 * 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print(" Input X: ");
        int x = scanner.nextInt();
     //Process

              float i = (float) 2.0;
              while(x!=1){
              if(x%i==0){
                  System.out.print("Total of number: ");
                  System.out.println(i + " ");
                  x = (int) (x/i);
                  
              }
			  else 
			  {
              i++;
              }
              }

         //Cach 2:     
      System.out.println("\n----------------------");
               x =265;
              for(i=2; x!=1; i++){
              if(x%i==0) {
                  System.out.print(i + " ");
                  x = (int) (x/i);
                  i--;
              }
              }


//        System.out.println("-----------------------------------");
//        System.out.print(" Input Arr: ");
//        int arr = 0;
//         String[] a = {"3,2,1,4,5,2,4,7,9,10,2,3"};
//        System.out.println( a + "arr");
//      

    }
}

