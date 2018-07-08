package task; 
public class Leetcode {
	public static void main(String[] args) {
		String s1="leetcode";
		String s2="loveleetcode";
		String s3="aabbccdd";
		System.out.println(fun(s1));
		System.out.println(fun(s2));
		System.out.println(fun(s3));
	}
	public static int fun(String s) {
		int i,n = 0;
		for(i=0;i<s.length();i++) {
			char a=s.charAt(i);
			int first=s.indexOf(a);
			int last=s.lastIndexOf(a);
			if(first==last) {
				n=first;
				break;
			}
		}
		if(i==s.length()) n=-1;
		return n;
	}
}
