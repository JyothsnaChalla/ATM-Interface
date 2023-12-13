package in.functional.predicate;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
	public static void main(String[]args) {
		//Predicate<Integer>pI=(i) ->(i>10);
		//boolean test=pI.test(10);
		//System.out.print("test value="+test);
		Predicate<String> pStr= s->(s.length()>4&&s.indexOf('J')==0);
		System.out.println(pStr.test("Jyothsna"));
		
		
	}
}