import java.util.Scanner;
public class PAT4 {
	public static void main(String[]args){
		class Stu{
			String Name;
			String No;
			int score;			
		}
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stu[] stus = new Stu[n];
		int max = 0,min = 100;
		int maxf = 0,minf = 0;
		for(int i =0;i<n;i++){	
			stus[i] = new Stu();
			stus[i].Name = scanner.next();
			stus[i].No = scanner.next();
			stus[i].score = scanner.nextInt();		
			if(stus[i].score>max){
				max = stus[i].score;
				maxf = i;
			}
			if(stus[i].score<min){
				min = stus[i].score;
				minf = i;
			}
		}
		System.out.println(stus[maxf].Name+" "+stus[maxf].No);
		System.out.println(stus[minf].Name+" "+stus[minf].No);
	}
}
