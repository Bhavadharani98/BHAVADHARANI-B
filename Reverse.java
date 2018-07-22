import java.util.*;
public class Reverse {
	public static void main(String []args){
		Scanner v=new Scanner(System.in);
		String S=v.nextLine();
		int a=S.length();
		String b="";
for(int i=a-1;i>=0;i--){
	b=b+S.charAt(i);
}
System.out.println(b);
	}

}
