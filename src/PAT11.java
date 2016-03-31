import java.math.BigInteger;
import java.util.Scanner;
public class PAT11 {
	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		while(scanner.hasNext()){
//			for(int j =1;j<=n;j++){			
//				int a =scanner.nextInt();
//				int b = scanner.nextInt();
//				int c = scanner.nextInt();
//				if(a+b>c){
//					System.out.println("Case #"+j+": true");
//				}
//				else{
//					System.out.println("Case #"+j+": false");
//				}
//			}
//		}
		 
	        Scanner cin = new Scanner(System.in);  
	        while (cin.hasNext()) {  
	            int t = cin.nextInt();  
	            for (int i = 1; i <= t; i++) {  
	                boolean flag = false;  
	                BigInteger a = cin.nextBigInteger();  
	                BigInteger b = cin.nextBigInteger();  
	                BigInteger c = cin.nextBigInteger();  
	                if (a.add(b).compareTo(c) > 0) {  
	                    flag = true;  
	                }  
	                System.out.println("Case #" + i + ": " + flag);  
	            }  
	        }  
	    }  
}
