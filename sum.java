package codechef;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.*;
class ScanReader {
	  private byte[] buf = new byte[4 * 1024];
	    private int index;
	    private BufferedInputStream in;
	    private int total;

	    public ScanReader(InputStream inputStream) {
	        in = new BufferedInputStream(inputStream);
	    }

	    private int scan() {
	        if (index >= total) {
	            index = 0;
	            try {
	                total = in.read(buf);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            if (total <= 0) return -1;
	        }
	        return buf[index++];
	    }

	    public int scanInt() {
	        int integer = 0;
	        int n = scan();
	        while (isWhiteSpace(n)) n = scan();
	        int neg = 1;
	        if (n == '-') {
	            neg = -1;
	            n = scan();
	        }
	        while (!isWhiteSpace(n)) {
	            if (n >= '0' && n <= '9') {
	                integer *= 10;
	                integer += n - '0';
	                n = scan();
	            }
	        }
	        return neg * integer;
	    }

	    public String next() {
	        int c = scan();
	        if (c == -1) return null;
	        while (isWhiteSpace(c)) c = scan();
	        StringBuilder res = new StringBuilder();
	        do {
	            res.appendCodePoint(c);
	            c = scan();
	        } while (c != '\n' && c != -1);
	        return res.toString();
	    }

	    private boolean isWhiteSpace(int n) {
	        if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
	        else return false;
	    }

}

 class sum {

	public static void main(String[] args) {
		InputStream inputStream=System.in;
		 ScanReader sc = new ScanReader(inputStream);
		int t=sc.scanInt();
		int k=t;
		while(t!=0) {
			int a=sc.scanInt();
			int b=sc.scanInt();
			int s=a+b;
			int sum=0;
			while(s!=0) {
				sum+=stick(s%10);
				s=s/10;
			}
			if(t==k) {
				System.out.println();
			}
			System.out.println(sum);
			t--;
		}

	}
	public static int stick(int d) {
		if(d==0)
			return 6;
		if(d==1)
			return 2;
		if(d==2)
			return 5;
		if(d==3)
			return 5;
		if(d==4)
			return 4;
		if(d==5)
			return 5;
		if(d==6)
			return 6;
		if(d==7)
			return 3;
		if(d==8)
			return 7;
		if(d==9)
			return 6;
		return -1;
	}

}
