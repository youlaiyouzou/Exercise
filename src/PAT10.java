import java.util.Scanner;
public class PAT10 {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);  
        boolean flag = false;  
        while (cin.hasNext()) {  
            int i = cin.nextInt();  
            int j = cin.nextInt();  
            if (i * j != 0) {  
                if (flag) { 
                    System.out.print(" ");  
                } else {  
                    flag = true;  
                }  
                int n = i * j;  
                int m = j - 1;  
                System.out.print(n + " " + m);  
            }  
            if (!flag) {  
                System.out.println("0 0");  
            }  
            //如果最后两个数字相乘等于0，那么不输出
        }  
	}
}
