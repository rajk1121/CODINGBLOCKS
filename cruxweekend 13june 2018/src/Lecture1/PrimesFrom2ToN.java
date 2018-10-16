package Lecture1;

import java.util.*;
public class PrimesFrom2ToN {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner (System.in);
        int n,i,j,k,count;
        n=s.nextInt();
        for(i=1 ; i <= n ; i++)
        {
            count=0;
            for(j=1 ; j<= i ; j++) {
                k=i%j;
                if(k==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
            }
        }
    }
}
