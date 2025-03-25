package strings;

public class string01 {

	public static void main(String[] args) {
		String s = "Hello world!";
		int l = s.length();
		System.out.println(l);
		System.out.println(s.length());
		System.out.println("Hello world!".length()); // different methods are available 
       // Concatination in java
		String s1="Well come ";
		String s2= "Java ";
		String s3="Automaction ";
		char s4 ='A';
		System.out.println(s1+s2+s3+s4);
		System.out.println(s1.concat(s2).concat(s3)+s4); // we can concat only same datatype variable only
		System.out.println("Well come "+"Java "+"Automaction "+'A');
		String w = "  Welldone   ";
		System.out.println(w);
		System.out.println("Before trimming :" +w.length());
		System.out.println(w.trim());
		System.out.println("After trim: "+w.trim().length());
		// return character
		System.out.println(w.trim().charAt(4));
		System.out.println(w.contains("Wel"));
		System.out.println(w.contains("wel")); // w is upper case in Welldone
		System.out.println(w.contains("done"));
		System.out.println(w.contentEquals("  Welldone   "));
		s1="Welcome";
		s2="Welcome";
		System.out.println(s1.equalsIgnoreCase("welcome"));
		System.out.println(s1.equalsIgnoreCase("welcom"));
		s3="Welcome java selenium training element java";		
		System.out.println(s3.replace('e','x'));
		System.out.println(s3.replaceAll("java","python"));
		System.out.println(s1.substring(0,5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}

}
