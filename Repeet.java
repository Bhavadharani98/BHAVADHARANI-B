import java.util.*;
public class Repeet {
public static void main (String []args ){
	
	Scanner v=new Scanner(System.in);
			String string=v.nextLine();
			int max,c=0;
			int count[] =new int[string.length()];
int p=0;
			String [] a= new String[string.length()];
			for(int i=0;i<string.length();i++){
				a[i]=string.substring(i,i+1);
			}
			for(int i=0;i<string.length();i++){
				c=0;
				for(int j=0;j<string.length();j++){

				if(a[i].equals(a[j])){
					c++;
					}	
				}
				count[i] =c;
			}
		max=count[0];
	for(int i=1;i<string.length();i++){
		if(count[i]>max){
			max=count[i];
			p=i;
		}
	}System.out.println(a[p]);
}
}
