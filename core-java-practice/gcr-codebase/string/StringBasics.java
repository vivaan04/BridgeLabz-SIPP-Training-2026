public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Manu";
		System.out.println(s);
		//String length
		//.length()
		System.out.println(s.length());
		//String access by using charat()
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//using loop
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		//String comparison
		//s1 and s2 are different object
		String s1= "hello";
		String s2="hello"; //s1 and s2 both are store in string pool
		System.out.println(s1.equals(s2));
		//new keyword use for new location and different object memory outside the String pool
		
		//String immutability
		String s3 ="hello";
		s3.toUpperCase(); //not change still hello
		System.out.println(s3);
		//to change use we copy it another variable
		String k= s3.toUpperCase();
		//here s3 now point to HELLO in string pool and hello become garbage in String poll
		//s3 = s3.toUpperCase(); 
		System.out.println(k);
		//String Reverse
		String str = "hello";
		String result="";
		for(int i=str.length() - 1;i>=0;i--) {
			result = result+str.charAt(i);
		}
		System.out.println(result);
	}

}
