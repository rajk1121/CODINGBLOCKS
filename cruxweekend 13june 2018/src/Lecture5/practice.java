package Lecture5;

import java.util.ArrayList;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        Sum(arr,n, target);
}
public static void Sum(int[] arr, int n, int target){
    int k=0;
    int l=0;
    for(int i=0; i<n ; i++){
            for(int j=0 ; j< n ;j++){
                if(arr[i]+arr[j]==target){
                    if(arr[i]<=arr[j]){
                        System.out.println(arr[i]+" and "+arr[j]);
                    }
                    if(arr[i]==arr[j]){
                        k=arr[i];
                        l++;
                    }
                    
                    
                }
            }
        }
        if(l>=0){
            System.out.print(k+" and "+k);
        }
}
}
       

