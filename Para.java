import java.util.Scanner;
public class Para {
public static void main(String[] args){
	Scanner v=new Scanner(System.in);
	String number_of_words=v.nextLine();
	String []a=number_of_words.split("\\.");
	System.out.println(a.length);
}
}
