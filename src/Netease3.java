import java.util.Scanner;
public class Netease3 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[9];
		while(scanner.hasNext()){
			for(int i=0;i<9;i++){
				input[i]=scanner.nextInt();
			}
			int result=0;
			int[] R =new int[3];
			R[0]=(int) Math.pow((double)(input[1]-input[7]),2)+(int) Math.pow((double)(input[2]-input[8]),2);
			R[1]=(int) Math.pow((double)(input[3]-input[7]),2)+(int) Math.pow((double)(input[4]-input[8]),2);
			R[2]=(int) Math.pow((double)(input[5]-input[7]),2)+(int) Math.pow((double)(input[6]-input[8]),2);
			for(int i=0;i<3;i++){
				if(R[i]<=input[0]*input[0])result++;
			}
			System.out.print(result+"x");
		}		
	}
}
