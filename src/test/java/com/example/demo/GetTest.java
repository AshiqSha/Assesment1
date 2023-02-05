package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;




class GetTest {

	@InjectMocks
	DemoModel demoModel;

	@Mock
	DemoService demoService;

	//@Before
	//public void init() {
		//MockitoAnnotations.openMocks(this);
	//}
	@Autowired
	//DemoModel demoModel1;

	
	@Test
	public void getEmployeeByIdTest()
	
	
	{	DemoModel demoModel=new DemoModel();
		demoModel.setBookname("Corerrf and Advance Java");
		demoModel.setAuthor("R. Nageswara Rao");
		demoModel.setBookid(1);
		
	
		when(demoService.getBooksById(5478)).thenReturn(demoModel);

		DemoModel emp = demoService.getBooksById(1);

		//assertEquals("Lokesh", emp.getBookid());
		assertEquals("Corerrf and Advance Java", emp.getBookname());
		assertEquals("R. Nageswara Rao", emp.getAuthor());
	}
	
	

	
}