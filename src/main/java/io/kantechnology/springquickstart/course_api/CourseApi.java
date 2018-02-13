package io.kantechnology.springquickstart.course_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CourseApi {

	public static void main(String[] args) {
		SpringApplication.run(CourseApi.class, args);//static class has .run methos which does every thing for us 
		//Creates a sevlet container 
		//host this app to servlet container 
	}

}
