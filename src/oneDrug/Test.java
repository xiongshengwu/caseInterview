package oneDrug;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "he"+new String("llo");
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true

		System.out.println(getResult(2)); //4
	}
	
	public static int getResult(int i){
		int result = 0;
		switch (i) {
		case 1:
			result=result * 1;
			break;
		case 2:
			result+= i * 2;
			break;
		case 3:
			result = result * i * 3;
			break;
		default:
			break;
		}
		return result;
	}

}

