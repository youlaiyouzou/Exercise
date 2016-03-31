import java.util.Arrays;
import java.util.Scanner;
public class PAT5 {
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[]a = new int[n];
		int[]flag = new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			flag[i]=1;
		}
		for(int i=0;i<n;i++){
			if(flag[i]==1){
				int temp;
				temp=a[i];
				while(temp!=1){
					if(temp%2==0)temp/=2;
					else temp=(3*temp+1)/2;
					for(int j=0;j<n;j++){
						if(flag[j]==1)
						{
							if(a[j]==temp){
								flag[j]=0;
								break;
							}
						}
					}
				}
			}
		}
		int[]b = new int[n];
		int j=0;
		for(int i=0;i<n;i++){
			if(flag[i]==1){
				b[j]=a[i];								
				j++;
			}	
		}
		Arrays.sort(b);
		
		for(int i=b.length-1;i>0;i--){			
			if(flag[i]==0){
				System.out.print(b[i]+" ");
			}			
		}
	}
}
