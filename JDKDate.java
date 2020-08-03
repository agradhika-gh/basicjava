import java.time.format.*;
import java.time.*;
public class JDKDate {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println("Today's date is :"+ now);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today's time with time component: "+dtf.format(dateTime));

	}

}
