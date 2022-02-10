//Write a Java program to search a specific string from a given set of strings using regular expressions
import java.util.regex.*;

public class regularExpnAssisted 
{

public static void main(String[] args) 
{

	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
