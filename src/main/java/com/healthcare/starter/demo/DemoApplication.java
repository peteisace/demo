package com.healthcare.starter.demo;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private ParentRepository parentRepository;

	@Override
	public void run(String... args) throws Exception {
		val myClass = MyBigClass.builder()
			.field1("hello")
			.field2("bye")
			.field3(12)
			.field4(13)
			.build();
	}
}
