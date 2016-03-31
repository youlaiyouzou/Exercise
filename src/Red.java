import java.util.Arrays;
import java.util.Scanner;


public class Red {

	public static int Gift(int[] gifts,int n ){
		Arrays.sort(gifts);
		int result = gifts[n/2];
		int num = 0;
		for(int i = 0;i<n;i++){
			if(gifts[i]==result){
				num++;
			}
		}
		return num<=n/2?0:result;
		
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] gifts = new int[n];
		for(int i = 0;i<n;i++){
			gifts[i]=scanner.nextInt();
		}
		System.out.print(Gift(gifts, n));
	}
}
