package program;
import java.util.*;
public class Anagram {
public static void main(String[]args){
	Scanner v=new Scanner(System.in);
	String a=v.nextLine();
	char[] b=a.toCharArray();
	String c="dhoni";
	char []d=c.toCharArray();
	Arrays.sort(b);
	Arrays.sort(d);
	String g="",k="";
	for(int i=0;i<b.length;i++){
	//	System.out.println(b[i]+" "+d[i]);
		g=g+d[i];
		k=k+b[i];
	}if(k.equals(g)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
