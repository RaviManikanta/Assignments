public class StringDemoExample
{
	public static void main(String args[])
	{
		String str1 = "Madhav";
		String str2 = "Yash Technologies";
		String str3 = new String("  Yash");

		System.out.println("Substring: "+str1.substring(4));
		System.out.println("Substring using beginning and ending index: "+str2.substring(3, 9));
		System.out.println("Lowercase: "+str1.toLowerCase());
		System.out.println("trim: "+str3.trim());
		System.out.println("Str3: "+str3);
		System.out.println("Concenate: "+str1.concat(str3));
		System.out.println("Replace: "+str3.replace(' ', 'W'));
		System.out.println("Replace char sequence: "+str2.replace("Technologies", "Infogram"));
		System.out.println("Replace char sequence: "+str2.replace(" ", "Infogram"));
		System.out.println("Str3: "+str3);
		System.out.println("Character at: "+str2.charAt(4));
		System.out.println("Length of str2: "+str2.length());
		System.out.println("Length of str3: "+str3.length());
		System.out.println("Length of str3: "+str3.trim().length());
		System.out.println("Concenate: "+str1.trim().concat(str3));
	}
}