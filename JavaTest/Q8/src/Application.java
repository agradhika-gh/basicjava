import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		
		System.out.println("Today's time with time component: "+dt.toString());

		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println("Today's date is :"+ now);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today's time with time component: "+dtf.format(dateTime));

	}

}
