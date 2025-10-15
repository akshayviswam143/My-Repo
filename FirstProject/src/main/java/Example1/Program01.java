package Example1;

public class Program01 {
 public static void main(String args[]) {
	 String s = "Akshay";
	 System.out.println(s);
	 String s1=new String ("How are you");
	 System.out.println(s1);
	 //charAt -> Used to return character in a string
	 char c1 = s.charAt(3);
	 System.out.println(c1);
     // Length ()->to return the size of the string
     System.out.println(s.length());
     //Concat : Add to strings
     System.out.println(s.concat(s1));
     System.out.println(s);
     //Contains: To check whether a word or string present in the string
     //to check value true or false
     System.out.println(s.contains(s1));//false condition
     System.out.println(s.contains("sh"));//true condition
     //To Upper Case: Convert small letters to upper case
     System.out.println(s.toUpperCase());
     //to lower case: convert capital to small
     System.out.println(s.toLowerCase());
     System.out.println(s); //check immutable);
     //is empty: check string is empty or not
     System.out.println(s.isEmpty()); //false condition
     String s2 = "";
     System.out.println(s2.isEmpty()); //True condition
     //value(): To convert any datatype to string
     int i1=12;
     System.out.println(String.valueOf(i1)); //converted to string from int
     //equals: 
     String s3 = "java";
     String s4 = "Java";
     String s5 = "java";
     String s6 = "selenium";
     System.out.println(s3.equals(s4)); //false condition
     System.out.println(s3.equals(s5)); //True condition
     System.out.println(s3.equals(s6)); //False
     //equals ignore case
     System.out.println(s3.equalsIgnoreCase(s4));
     System.out.println(s3.equalsIgnoreCase(s6));
     //== operator 
     System.out.println(s3==s5);
     String s7 = new String("java");
     System.out.println(s3==s7); //
 }
}
