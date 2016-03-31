import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class PAT12 {
	public static void main(String[] srgs){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] input = new int[n];
		int[] a = new int[6];
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list4 = new LinkedList<Integer>();
		int max = 0;
		for(int i = 0;i<n;i++){
			input[i] = scanner.nextInt();
			if(input[i]%10==0&&input[i]!=0){
				a[1]+=input[i];
			}
			if(input[i]%5==1){
				list2.add(input[i]);				
			}
			if(input[i]%5==2){
				a[3]++;			
			}
			if(input[i]%5==3){
				list4.add(input[i]);	
			}
			if(input[i]%5==4){
				if(input[i]>max)max = input[i];		
			}
			System.out.println(input[i]);
		}
		//A1
		if(a[1]==0){
			System.out.print("N ");
		}
		else{
			System.out.print(a[1]+" ");
		}
		//A2
		if(list2.size()==0){
			System.out.print("N ");
		}
		else{
			for(int i = 0;i<list2.size();i++){
				if(i%2==0){
					a[2]+=list2.get(i);
				}
				else{
					a[2]-=list2.get(i);
				}
			}
			System.out.print(a[2]+" ");
		}
		//A3
		if(a[3]==0){
			System.out.print("N ");
		}
		else{
			System.out.print(a[3]+" ");
		}
		//A4
		if(list4.size()==0){
			System.out.print("N ");
		}
		else{
			String sum;
			double result = 0.0;
			DecimalFormat df = new DecimalFormat("0.0");
			for(int i = 0;i<list4.size();i++){
				result+=list4.get(i);
			}
			result/=list4.size();
			sum = df.format(result);
			System.out.print(sum+" ");
		}
		//A5
		System.out.print(max);
	}
}
