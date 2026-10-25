package Com.DemoWebShop_GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	public String localDateString()	{
		String value = LocalDateTime.now().toString().replace(":", "").replace(".", "").replace("-", "");
		return value ;
	}
}
