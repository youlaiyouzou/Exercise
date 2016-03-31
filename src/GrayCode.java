import java.util.Scanner;


public class GrayCode {

	public static String[] Gray(int n ){
		String[] graycode = new String[(int)Math.pow(2, n)];
		if(n==1){
			graycode[0]="0";
			graycode[1]="1";
			return graycode;
		}
		
		String[] last = Gray(n-1);
		for(int i =0;i<last.length;i++){
			graycode[i]="0"+last[i];
			graycode[graycode.length-1-i]="1"+last[i];
		}
		return graycode;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] graycode = Gray(n);
		for(int i = 0;i<graycode.length;i++){
			System.out.println(graycode[i]);
		}	
	}
}
