import java.util.*;
public class Swap {
 public static void main(String [] args ){
	 Scanner  v=new Scanner(System.in);
	 String string1=v.nextLine();
	 int l=string1.length();
	 StringBuffer sb = new StringBuffer();
if(l%2==0){
	 for(int i=0;i<l-1;i=i+2){

			 char a=string1.charAt(i);
			 char b=string1.charAt(i+1);
		        sb.append(b).append(a);		
		        }
	 System.out.println(sb);
	 }
else{
	for(int i=0;i<l-1;i=i+2){
		 char a=string1.charAt(i);
		 char b=string1.charAt(i+1);
	        sb.append(b).append(a);		
	        }
sb.append(string1.charAt(l-1));
	System.out.println(sb);
}

	}

}
