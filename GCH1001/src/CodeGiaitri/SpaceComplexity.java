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
public class SpaceComplexity {
    int sum(int n )
    {
    int i, sum = 0;
    for ( i = n; i >= 1; i--)
        sum = sum + i;
                return sum;
    }
}
// 