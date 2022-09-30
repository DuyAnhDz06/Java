/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeGiaitri;

/**
 *
 * @author DELL
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        long mem[] = new long[n + 1];
//        System.out.println(fib_mem(n, mem));
//System.out.println(fib(n));
fib_mem(n, mem);
for(int i = 1; i < mem.length; i ++)
{
    System.out.println(mem[i]);
}       
    }
    private static long fib (int n){  //O(2^n)
            if(n <= 2)
    return 1;
    return fib(n-1) + fib(n-2);
}
// Memorization technique used in Recursion
    private static long fib_mem(int n, long[] mem) {   // O(n)
        if(n <= 2) mem[n] = 1;
        else
        {
            if(mem[n]==0)
                mem[n] = fib_mem(n-1, mem) + fib_mem(n-2, mem);
        }
        return mem[n];
      
    }
    
}
