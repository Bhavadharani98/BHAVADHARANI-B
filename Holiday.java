import java.util.Scanner;
public class Holiday {
	public static void main(String []args){
		Scanner v=new Scanner(System.in);
		String a1=v.nextLine();
		if(a1.equals("Monday")|| a1.equals("Tuesday") || a1.equals("Wednesday") || a1.equals("Thursday")||a1.equals("Friday")){
			System.out.println("no");
		}
		else if(a1.equals("Saturday") || a1.equals("Sunday")){
			System.out.println("yes");
		}
		else{
			System.out.println("invalid input");
		}
	}

}
