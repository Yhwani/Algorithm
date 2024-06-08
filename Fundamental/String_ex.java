package Fundamental;

public class String_ex {

	public static void main(String[] args) {
		String str1 = new String("123");
		String str2 = new String("123");
		String str3 = "123";
		String str4 = "123";
		String str5 = String.valueOf(123);
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str2 == str3);
		System.out.println(str3 == str5);
		System.out.println(str1 == str5);
		System.out.println(str1.getClass().getName());
		System.out.println(str3.getClass().getName());

	}

}
