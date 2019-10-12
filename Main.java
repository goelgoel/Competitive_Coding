
package codechef;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				 
				int t=sc.nextInt();
				int k=t;
				while(t--!=0) {
					
					int a1=sc.nextInt();
					int a2=sc.nextInt();
					int a3=sc.nextInt();
					int c1=sc.nextInt();
					int c2=sc.nextInt();
					int c3=sc.nextInt();
				if(t==(k-1)) {
					System.out.println();
				}
				 int a=ans(a1,a2,c1,c2);
				 int b=ans(a2,a3,c2,c3);
				 int c=ans(a3,a1,c3,c1);
				
				 if(a==1 && b==1 && c==1)
					 System.out.println("FAIR");
				 else
					 System.out.println("NOT FAIR");
				    
				}

	}
  public static int ans(int a1,int a2,int c1,int c2) {
	  if(a1==a2) {
		  if(c1==c2) {
		  return 1;}
		  else {
			  return 0;
		  }
	  }
	  if(a1>a2) {
		  if(c1>c2) {
		  return 1;}
		  else {
			 return 0;
		  }
	  }
	  if(a1<a2) {
		  if(c1<c2) {
		 return 1;}
		  else {
			  return 0;
		  }
	  }
	  return 0;
	  
  }
}
