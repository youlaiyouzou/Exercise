public class Test {  
    public int a;  
      
    static {  
        System.out.println("Test Static 静态语句块");  
    }  
    public Test() {  
        System.out.println("Test 默认无参构造器");  
    }  
    {  
        System.out.println("Test 非静态");  
    }  
}  
 
  
