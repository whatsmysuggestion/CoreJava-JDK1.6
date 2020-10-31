import java.util.*;

enum Numbers1
{
ONE,TWO,THREE,FOUR,FIVE	
};
public class EnumSetWithCollection {

	public static void main(String[] args) {
		
		Collection ct=new ArrayList();
		
		ct.add(Numbers1.ONE);
		ct.add(Numbers1.TWO);
		ct.add(Numbers1.THREE);
		ct.add(Numbers1.FOUR);
		ct.add(Numbers1.FIVE);
		
		EnumSet<Numbers1>set=EnumSet.copyOf(ct);
		System.out.println(set);	 

	}

}
