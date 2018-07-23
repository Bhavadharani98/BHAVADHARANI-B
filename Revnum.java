import java.util.Scanner;
public class Revnum {
public static void main(String [] args){
	Scanner v=new Scanner(System.in);
	int a=v.nextInt();
	int sum=0 ,b;
	while(a!=0){
		b=a%10;
		sum=(sum*10)+b;
		a=a/10;
	}
	System.out.println(sum);
}
}
