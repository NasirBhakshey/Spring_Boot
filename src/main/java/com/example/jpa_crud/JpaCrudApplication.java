package com.example.jpa_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jpa_crud.service.StudentImp;
import com.example.jpa_crud.service.Studentservice;

@SpringBootApplication
public class JpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpaCrudApplication.class, args);
		Studentservice studentservice=context.getBean(StudentImp.class);

		// Students students=new Students();
		// students.setName("Sami");
		// students.setRollno(25);
		// students.setMarks(75);

		// boolean status=studentservice.AddDetail(students);
		// if(status)
		// {
		// 	System.out.println("Add Data Success...");
		// }else
		// {
		// 	System.out.println("Error");
		// }

		// List<Students> stdlist=studentservice.getallList();
		// for(Students stdlist1:stdlist)
		// {
		// 	System.out.println(stdlist1.toString());
		// }

		// Students students=studentservice.getbyId(3);
		// System.out.println(students.toString());

		// Students std=new Students();
		// std.setId(2);
		// std.setName("Shoaib");
		// std.setRollno(63);
		// std.setMarks(85.6f);
		// boolean status=studentservice.updatedetail(std, 2);
		// if(status)
		// {
		// 	System.out.println("Data Updated");
		// }else{
		// 	System.out.println("Error");
		// }

		boolean status=studentservice.deletestd(4);
		if(status)
		{
			System.out.println("Data Deleted Successfully...");
		}else{
			System.out.println("Error...");
		}
	}

}
