package programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExamples {

	public static void main(String[] args) {
		String a="abcdefg12345hijkl678910";
		String b="abcdefg 12345h ijk l678910";
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher(a);
		/*if(m.find())
		System.out.println("FOUND");
		else
		System.out.println("MISSING");
		*/while(m.find())
		{	System.out.println("For integer"+m.start());
		System.out.println("For integer "+m.end());
		System.out.println("For String"+m.start());
		System.out.println("For String"+m.end());
		}
		
		String ab=("A(red|yellow)?B");
		System.out.println("AredB".matches(ab));
		String x =a.replaceAll("\\d", "");
		String y =b.replaceAll("[^0-9]+", "");
		String z =a.replaceAll("[^a-z$]+", "");
		System.out.println("Remove numbers only from a ="+x);
		System.out.println("Get numbers only from b ="+y);
		System.out.println("Get alphabats only from a ="+z);
		
	}

}
