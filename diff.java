// name: shubhangi goel
//email: goel.shubhangi3118@gmail.com
package sort;
import java.util.*;
public class diff {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int out[]=new int[n];
	subsetsSumK(arr,k,0,0,out,0);//function call
	}
	public static void subsetsSumK(int arr[],int k,int j,int s,int out[],int l){//function definition 
		if(s==k) {
			for(int i=0;i<l;i++) {
				System.out.print(out[i]+" ");
			}
			System.out.println();
		}
		if(j==arr.length-1)
			return;
		subsetsSumK(arr,k,j+1,s,out,l);//recursive call when arr[j] is not included in sum
		out[l++]=arr[j];
		subsetsSumK(arr,k,j+1,s+arr[j],out,l);//recursive call when arr[j] is included in the sum
	}

}
//time complexity :O(2^n)
// Since every element of an array is either included or not  included
//space complexity: O(n)
//Since an array out[] of length n is taken to store the subsets and maximum length of subset which sum to k can be of length n.
