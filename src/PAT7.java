import java.util.Scanner;
public class PAT7 {
	public static boolean isPrime(int number){	
		if(number==2){
			return true;
		}
		int len = (int)Math.sqrt(number);
		for(int i =2;i<=len;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int lastprime = 1;
		for(int i =2;i<=n;i++){
			if(isPrime(i)){				
				if(i-lastprime==2){
					count++;
				}
				lastprime = i;
			}	
		}
		System.out.println(count);
	}

}
