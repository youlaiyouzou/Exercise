import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class PAT8 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n;i++){
			list.add(scanner.nextInt());
		}
		for(int i=0;i<m;i++){
			 int temp = ((LinkedList<Integer>)list).removeLast();//removeLast() Removes and returns the last element from this list
			 ((LinkedList<Integer>)list).addFirst(temp);
		}
		for(int i = 0; i < n-1;i++){
			System.out.print(list.get(i)+ " ");
		}
		System.out.print(list.get(n-1));
	}
}
