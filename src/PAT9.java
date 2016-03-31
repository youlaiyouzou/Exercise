import java.util.Scanner;
public class PAT9 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();//nextLine可以读入带空格的字符
		String[] a = input.split(" +");
		for(int i =a.length-1;i>0;i--){
			System.out.print(a[i]+" ");
		}
		System.out.print(a[0]);
	}
}
