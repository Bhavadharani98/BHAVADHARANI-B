import java.util.*;
public class Swap1 {
public static void main(String []args){
	Scanner v=new Scanner(System.in);
	int a=v.nextInt();
	int b=v.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
