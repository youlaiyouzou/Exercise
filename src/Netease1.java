import java.util.Scanner;


public class Netease1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt(); //表示怪物的数量
			int a =scan.nextInt();//表示初始能力
			int[] b = new int[n];//表示每个动物的防御能力
			for(int i=0;i<n;i++){
				b[i] = scan.nextInt();
			}
			for(int j=0;j<n;j++){
				if(a>=b[j]){
					a+=b[j];
				}
				else{
					int add = gys(a, b[j]);
					a+=add;
				}
			}	
			System.out.print(a);
		}
	}
	//求公约数的函数
	public static int gys(int a,int b){
		if(b==0){
			return a;
		}else{
			return gys(b, a%b);
		}
	}
}
