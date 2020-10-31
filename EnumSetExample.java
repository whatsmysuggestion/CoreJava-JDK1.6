import java.util.*;

enum Numbers
{
ONE,TWO,THREE,FOUR,FIVE	
};
public class EnumSetExample {

	public static void main(String[] args) {
		
		EnumSet<Numbers>set1=EnumSet.allOf(Numbers.class);
		System.out.println(set1);
		
		EnumSet<Numbers>set2=set1.clone();
		System.out.println(set2);
		
	}
	
}
