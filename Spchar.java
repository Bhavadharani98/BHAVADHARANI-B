import java.util.Scanner;
public class Schar {
public static void main(String[] args){
	Scanner v=new Scanner(System.in);
	int count=0;
	String number_of_words=v.nextLine();
	char []a=new char[number_of_words.length()];
	int l=a.length;
	for(int i=0;i<number_of_words.length();i++){
		a[i]=number_of_words.charAt(i);
		if(Character.isLetterOrDigit(a[i])){
			count++;
		}
}
	int Spchar=l-count;
	System.out.println(Spchar);
}
}
