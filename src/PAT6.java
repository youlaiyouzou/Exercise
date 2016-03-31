import java.util.Scanner;
public class PAT6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input<=0||input>1000){
			System.out.println("error input");
		}
		else{
			int shi = input/10%10;
			int bai = input/100;
			int ge = input%10;
			String S="";
			String B="";
			
			for(int i =0;i<bai;i++){
				System.out.print("B");
			}
			for(int i =0;i<shi;i++){
				System.out.print("S");
			}
			for(int i =0;i<ge;i++){
				System.out.print(i+1);
			}
		}		
	}
}
