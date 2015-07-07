package testOther;

public class testOthers {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        double f = 3.40;
        System.out.println(f);
        short s1 =1 ;
        s1 += 1;
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;  
        
        System.out.println(f1 == f2);  
        System.out.println(f3 == f4); 
        
        String a = "Programming";  
        String b = new String("Programming");  
        String c = "Program" + "ming";  
        System.out.println("Programinga==b");
        System.out.println("Programinga==b" + a == b);  
        System.out.println(a == c);  
        System.out.println(a.equals(b));  
        System.out.println(a.equals(c));  
        System.out.println(a.intern() == b.intern());
        System.out.println("test string null");
        String stringnull = null;
        String as = "as" + stringnull;
        System.out.println(as);
        
        
        String ss1 = "a";

        String s2 = ss1 + "b";

        String s3 = "a" + "b";

        System.out.println(s2.equals("ab"));

        System.out.println(s3 == "ab");
        
        Integer i1 = 1;
        Integer i2 =1;
        System.out.println(i1.equals(i2));
     }

}
