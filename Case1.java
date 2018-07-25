import java.util.*;
public class Case1 {
public static void main(String[]args){
	Scanner v=new Scanner(System.in);
	int a=v.nextInt();
	int b=0,e=0,d=0;
	int arr[]=new int[a];
	for(int i=0;i<a;i++){
		arr[i]=v.nextInt();
	}
	for(int j=0;j<a;j++){
		b=0;
		b=b+arr[j];
		System.out.println(b);
		d=d+(b-1);
		e=e+d;
	}
	System.out.println(e);
			}
}
