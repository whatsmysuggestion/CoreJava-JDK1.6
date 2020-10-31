import java.util.logging.*;
public class LoggerExample {

	public static Logger lg=Logger.getLogger("Config Logging");
	
	public static void main(String[] args) {
		
		 lg.config("This Config Content");
		 lg.info("This Info Content");
		 lg.warning("This Warning Message");
		 
		  
		  

	}

}
