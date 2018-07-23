import java.util.Scanner;
public class Scount {
public static void main(String[] args){
	Scanner v=new Scanner(System.in);
	String number_of_words=v.nextLine();
	String []a=number_of_words.split(" ");
	if(a.length==0){
		System.out.println("1");
	}
	else if(a.length>=1 && a.length<=1000){
	System.out.println(a.length-1);
}
}
}
