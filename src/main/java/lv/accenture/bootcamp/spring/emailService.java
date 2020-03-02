package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailService")
public class emailService implements NotificationChannel {

	@Value("${notification.email.from}")
	private String emailOperator;

	public void notifyUser(User user) {
		// TODO Auto-generated constructor stub

		System.out.println(user.getFullName() + " is notified by e-mail " + user.getEmail() + " from " + emailOperator);

	}

}
