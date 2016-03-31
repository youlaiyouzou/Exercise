public class Test1 extends Test {  
    public int i;  
    public double d;  
      
    static {  
        System.out.println("Test1 Static 静态语句块");  
    }  
      
    public Test1 () {  
        System.out.println("Test1 默认无参构造器");  
    }  
      
    {  
        System.out.println("Test1 非静态");  
    }  
      
    public static void main(String[] args) {  
        Test1 t = new Test1();  
          
    }  
}  