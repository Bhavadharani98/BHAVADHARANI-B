import java.util.*;
public class Space {
public static void main(String[]args){
	Scanner v=new Scanner(System.in);
	String word1=v.nextLine();
	
	String g=word1.replaceAll(" ","");
	int l=g.length();
	System.out.println(l);
}
}
