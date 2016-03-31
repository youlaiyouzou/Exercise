import java.util.Scanner;
public class BucketSort {

	public static void main(String[] args){
		int input[] = new int[1000];
		Scanner scan = new Scanner(System.in);
		//初始化input数组
		for(int i=0;i<1000;i++){
			input[i]=0;
		}
		//输入N个数
		System.out.print("请输入N");
		int N = scan.nextInt();
		for(int i=0;i<N;i++){
			int a = scan.nextInt();
			input[a]++;
		}
		for(int i= 0;i<1000;i++){
			
			if (input[i]!=0) {
				System.out.print(i);
			}
		}
	}
	

}
