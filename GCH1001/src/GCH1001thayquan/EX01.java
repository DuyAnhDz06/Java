/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCH1001thayquan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Integer: ");
        //Input
        int x = scanner.nextInt();
        
        //Process: Kiểm tra x có phải số chính phương hay không
        if(Math.sqrt(x) % 1 == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println("-----------------------------------");
        // cach 1 cua thay
//        int a = (int) Math.sqrt(x);
//        if(a * a == x)
//        {
//            System.out.println("Is a perfect square");
//        }
//        else
//        {
//            System.out.println("Is not a perfect square");
//        }
//        System.out.println("-----------------------------------");



//for (int a = 1; a < x ; a++)
//    {
//        if (a * a == x) {
//            System.out.println("a = " + a);
//            System.out.println("This is a perfect square");
//        }
//        else if (a * a < x)
//                {
//               System.out.println( "a = " + a);
//                    System.out.println(" This is not a perfect square");
//               System.out.println("-----------------------------------");
//                }
//    }

        System.out.println("--------------------------");
        int i = 1;
        for(; i * i < x; i++ );
        if(i * i == x)
        {
            System.out.println("i = " + i);
            System.out.println("YES");
        }
        else
        {
             System.out.println("i = " + i);
             System.out.println("No");
        }
        
    }   
}
