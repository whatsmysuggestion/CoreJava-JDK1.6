import java.util.*; //I18n  L11n Localization
public class InternalizationExample {  

	public static void main(String[] args) {
		
		Locale lc=Locale.getDefault();
		
		System.out.println(lc.getCountry());
		System.out.println(lc.getDisplayLanguage());
		System.out.println(lc.getDisplayName());
		System.out.println(lc.getISO3Country());
		System.out.println(lc.getISO3Language());


		String countries[]=lc.getISOLanguages();
		for(int i=0;i<countries.length;i++)
			System.out.println(countries[i]);
		
 
	 

	}

}
