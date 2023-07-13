package myproject;
import java.util.*;
public class Search_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method--->1
        String s="goutham";
        char target='t';
        System.out.println(search(s,target));
        // Method--->2
        //Arrays.toString(s.toCharArray());
        System.out.println(search2(s,target));
	}
	// Method--->1
	static boolean search(String str,int target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	// Method--->2
	static boolean search2(String st,int target) {
		if(st.length()==0) {
			return false;
		}
		for(char ch:st.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}

}
