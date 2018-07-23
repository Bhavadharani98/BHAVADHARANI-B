import java.util.*;
public class Srev {
public static void main(String []args){
	Scanner v=new Scanner(System.in);
	String string =v.nextLine();
	String g="";
	for(int i=string.length()-1;i>=0;i--){
		g=g+string.charAt(i);
	}
	String m=g.replaceAll("[aeiou]","");
	System.out.println(m);
}
}
