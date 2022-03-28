import java.util.Scanner;
public class sample{
    public static void main(String args[])
    {
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=Integer.parseInt(sc.next());//parsing is a wraper class in Integer
        if(a>b){
        System.out.print(a+b);
        }
        else    
            System.out.println("b>a");
        final int x=5;
        switch(5){//important things in switch cases 
            case 96+1:System.out.println("true");
            break;
            case 96+'a':System.out.println("true");
            break;
            case x:System.out.println("b>a");
            break;
        }
    }
}