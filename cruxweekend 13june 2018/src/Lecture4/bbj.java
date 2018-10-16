import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = s.nextInt();
        }
        int m=s.nextInt();
        int[] arr1=new int[m];
        for(int i=0 ; i<m ; i++){
            arr1[i] = s.nextInt();
        }
        
	        int two=0;
	        int[] arr2; 
	        if(m<n){
	            arr2=new int[n];
	            for(int i=1;i<n;i++){
	                arr2[i]= arr1[i-1];
	            }
	            arr2[0] = 0;
	            int[] sum=new int[n];
	            for( int i=0 ; i<n ; i++){
	                sum[i] =two + arr2[i] + arr[i];
	                two=sum[i]/10;
	            
	             if(sum[i]/10!=0){
	                    sum[i]=sum[i]%10;
	                }
	            }
	           for(int i=0 ;i<n ; i++){
	                 System.out.println(sum[i]);
	            
	        }
	        }
	        else if(n<m){
	            arr2=new int[m];
	            for( int i=1;i<m;i++){
	                arr2[i]= arr[i-1];
	            }
	            arr2[0] = 0;
	            
	            int[] sum=new int[m];
	            for(int i=m-1 ; i>=0 ; i--){
	                sum[i] = two + arr2[i] + arr1[i];
	                two=sum[i]/10;
	                if(sum[i]/10!=0){
	                    sum[i]=sum[i]%10;
	                }
	            }
	             for(int i=0 ;i<m ; i++){
	                 System.out.println(sum[i]);
	            
	        }
	            }

        
        
    }
    
}ss