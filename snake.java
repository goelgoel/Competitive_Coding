package codechef;
import java.util.*;
public class snake {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.next();
		    int sn=0,m=0;
		    if(s.charAt(0)=='m')
		    m++;
		    else if(s.charAt(0)=='s' && s.charAt(1)=='s')
		    sn++;
		   for(int i=1;i<s.length()-1;i++){
		       if(s.charAt(i)=='m')
		       m++;
		      else if(s.charAt(i-1)!='m'&& s.charAt(i+1)!='m')
		      sn++;
		   }
		   if(s.charAt(s.length()-1)=='m')
		    m++;
		    else if(s.charAt(s.length()-1)=='s' && s.charAt(s.length()-2)=='s')
		    sn++; 
		   if(sn>m)
			  System.out.println("snake");
		   else if(m>sn)
			   System.out.println("mongooses");
		   else System.out.println("tie");
		}  

	}

}

