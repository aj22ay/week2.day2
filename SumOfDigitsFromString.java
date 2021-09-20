package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String str="tes12le79af65";
		int sum=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				sum=sum+Character.getNumericValue(arr[i]);
			}
		}
		System.out.println(sum);
	}

}
