/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String str = sc.next();
		    
		    int ans = 0;
		    if(str.charAt(0) == '1')
		    ans = 1;
		    for(int i=1; i < n  ; i++){
		       if(str.charAt(i) == '1' && str.charAt(i-1) == '1'){
		       ans = 2;
		       break;
		       }
		       else if(str.charAt(i) == '1')
		       ans = 1;
		    }
		    System.out.println(ans);
		}
	}
}
