import java.util.*;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversionByCountry
{
	public static void main(String args[])
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the name of a country to get its time in this format(Continent_Name/City_Name): ");
        	String country = sc.next();
        	try
			{
            		ZoneId zID = ZoneId.of(country);
            		LocalDateTime localDT = LocalDateTime.now(zID);
            		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
            		String formattedTime = localDT.format(fmt);
            		System.out.println("The current time in " + country + " is: ");
			System.out.println(formattedTime);
        	}
		catch(Exception e)
		{
            		System.out.println("Could not find a time zone for " + country + ". Make sure you've written the continent_name/city_name in correct format!");
        	}
    	}
}
