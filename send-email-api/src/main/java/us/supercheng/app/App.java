package us.supercheng.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import java.util.Properties;

@SpringBootApplication
@ComponentScan("us.supercheng")
@PropertySource("classpath:application.properties")
public class App {

	@Bean("emailProps")
	public Properties emailProps(@Value("${mail.transport.protocol}") String MAIL_TRANSPORT_PROTOCOL,
								 @Value("${mail.smtp.host}") String MAIL_SMTP_HOST,
								 @Value("${mail.smtp.port}") String MAIL_SMTP_PORT,
								 @Value("${mail.smtp.from}") String MAIL_SMTP_FROM,
								 @Value("${mail.smtp.debug}") String MAIL_SMTP_DEBUG,
								 @Value("${mail.smtp.ssl.enable}") String MAIL_SSL_ENABLE) {
		Properties props = new Properties();
		System.out.println("Checking: " + MAIL_TRANSPORT_PROTOCOL);
		props.put("mail.transport.protocol", MAIL_TRANSPORT_PROTOCOL);
		props.put("mail.smtp.host", MAIL_SMTP_HOST);
		props.put("mail.smtp.port", MAIL_SMTP_PORT);
		props.put("mail.smtp.from", MAIL_SMTP_FROM);
		props.put("mail.smtp.ssl.enable", MAIL_SSL_ENABLE);
		// props.put("mail.smtp.socketFactory.fallback", "true");
		props.put("mail.smtp.debug", MAIL_SMTP_DEBUG);
		return props;
	}


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}