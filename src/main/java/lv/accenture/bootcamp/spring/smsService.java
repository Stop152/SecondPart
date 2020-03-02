package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("smsService")
public class smsService implements NotificationChannel {	
	
	@Value("${notification.sms.operator}")
	private String operator;
		

	public void notifyUser(User user) {
		// TODO Auto-generated constructor stub
		
	System.out.println(user.getFullName() + " is notified by sms by operator " + operator + " on number " + user.getName()); 
	
	}
}


