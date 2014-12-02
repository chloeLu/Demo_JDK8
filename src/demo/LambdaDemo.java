package demo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
	
	public static void main (String[] args) {
		LambdaDemo demoObj = new LambdaDemo();
		demoObj.demoSort();
		demoObj.demoSort_jdk6();
	}
	
	public void demoForEach() {
		// Note: Iterable.forEach only introduced in Java 7
		Arrays.asList(1,2,3).forEach(e->{int a = 1; System.out.println(e + "test " + a);});
	}
	
	public void demoSort() {
		List<String> strList = Arrays.asList("hippo", "zebra", "mountain lion", "baboon");
		strList.sort((String s1, String s2) -> s2.length() - s1.length());
		strList.forEach(e->System.out.println(e));
	}
	
	public void demoSort_jdk6() {
		List<String> strList = Arrays.asList("hippo", "zebra", "mountain lion", "baboon");
		strList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o2.length() - o1.length() > 0) {
					return 0;
				} 
				return 1;
			};
		});
		for (String s: strList) {
			System.out.println(s);
		}
	}
}
