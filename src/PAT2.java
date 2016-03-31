import java.math.BigInteger;
import java.util.Scanner;
public class PAT2 {
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		int sum =0;
		String[] Spell = new String[] { "ling", "yi", "er", "san", "si", "wu",  
	                "liu", "qi", "ba", "jiu" };  
		BigInteger bi10 =  new BigInteger("10");  
		while(n.compareTo(bi10)==1){
			BigInteger[] reulst = n.divideAndRemainder(bi10);  
            sum += reulst[1].intValue(); //Remainder  
            n = n.divide(bi10);  
        }  
        sum += n.intValue();  
      
        String[] result = new String[10];
        int l=0;
        while(sum>10){
        	result[l]=Spell[sum%10];
        	sum/=10;
        	l++;
        }
        result[l]=Spell[sum];
        for(int i=l;i>0;i--){
        	System.out.print(result[i]+" ");
        }
        System.out.print(result[0]); //不这样写就提交不过
	}
}
