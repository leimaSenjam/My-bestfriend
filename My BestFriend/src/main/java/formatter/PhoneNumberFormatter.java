package formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.friend.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("inside PhoneNumberFormatter");
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		
		System.out.println("inside parse method");
		Phone phone = new Phone();
		String[] phoneNumberArray = completePhoneNumber.split("-");
		
		int index= completePhoneNumber.indexOf("-");
		if(index== -1 || completePhoneNumber.startsWith("-")) {
			
			phone.setCountryCode("91");
			
			if(completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(phoneNumberArray[1]);
			}
			phone.setUserNumber(phoneNumberArray[0]);
			
		} 
		else {
		phone.setCountryCode(phoneNumberArray[0]);
		phone.setUserNumber(phoneNumberArray[1]);
		
		
	}
		return phone;
	}
	
}