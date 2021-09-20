package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test="feeling goods";
		String test2="";
		char[] arr=test.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			test2=test2+arr[i];
		}
		System.out.println(test2);
	}

}
