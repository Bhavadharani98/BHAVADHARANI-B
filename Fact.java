import java.util.Scanner;
public class Fact {
public static void main(String []args){
	Scanner v=new Scanner(System.in);
	int a=v.nextInt();
int b=1;
	while(a>0){
		b=b*a;
a--;		
	}
System.out.println(b);
}
}
