import java.util.*;

enum Numbers2{
ONE,TWO,THREE,FOUR,FIVE	
};

public class EnumMapExample {
	
	public static void main(String[] args) {
	
	EnumMap<Numbers2, String> mp1=new EnumMap<Numbers2, String>(Numbers2.class);	
	
	mp1.put(Numbers2.ONE, "1");
	mp1.put(Numbers2.TWO, "2");
	mp1.put(Numbers2.THREE, "3");
	mp1.put(Numbers2.FOUR, "4");
	mp1.put(Numbers2.FIVE, "5");

	System.out.println(mp1);
		
	}

}
