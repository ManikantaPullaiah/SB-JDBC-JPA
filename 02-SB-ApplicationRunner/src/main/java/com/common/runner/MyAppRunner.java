package com.common.runner;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.common.model.EmailHandler;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Set<String> optionNames = args.getOptionNames();
		EmailHandler handler = new EmailHandler();
		
		optionNames.forEach(name->{
			if("smtp.host".equalsIgnoreCase(name))
			{
				handler.setHost(args.getOptionValues(name).get(0));
			}else if("smtp.port".equalsIgnoreCase(name))
			{
				handler.setPort(args.getOptionValues(name).get(0));
			}else if("username".equalsIgnoreCase(name)) {
				handler.setUsername(args.getOptionValues(name).get(0));
			}else if("password".equalsIgnoreCase(name))
			{
				handler.setPassword(args.getOptionValues(name).get(0));
			}
		});
System.out.println(handler);
	}

}
