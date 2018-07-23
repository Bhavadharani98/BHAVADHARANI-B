import java.util.*;
public class Numeric {
public static void main(String[] args){
	Scanner v=new Scanner(System.in);
	int count=0;
	String number_of_words=v.nextLine();
	char []a=new char[number_of_words.length()];
	for(int i=0;i<number_of_words.length();i++){
		a[i]=number_of_words.charAt(i);
		if(Character.isDigit(a[i])){
			count++;
	}
	}System.out.println(count);
	
}
}
