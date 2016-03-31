import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class PAT13 {
	public static boolean isPrime(int n){
		int len = (int) Math.sqrt(n);
		if(n==2){
			return true;
		}
		for(int i =2;i<=len;i++){
			if(n%i==0){
				return false;
			}			
		}
		return true;
	}
	public static void main(String[]agrs){
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int count = 0;
		int number = 2;
		List<Integer> list = new LinkedList<Integer>();
		while(count<end){
			if(isPrime(number)){
				count++;				
				list.add(number);				
			}
			number++;
		}
		int cnt = 0;
		for(int i =start;i<=end;i++){
		 if(cnt == 0)  
	        {  
			 	System.out.print(list.get(i-1)); 
	        }  
	        else  
	        {  
	        	System.out.print(" "+list.get(i-1)); 
	        }  
	  
	        if(cnt == 9)  
	        {  
	        	System.out.println(); 
	            cnt = 0;  
	        }  
	        else  
	        {  
	            cnt++;  
	        }  			
		}
	}

}
