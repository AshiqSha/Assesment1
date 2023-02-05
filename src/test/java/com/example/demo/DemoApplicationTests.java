package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;

@SpringBootTest
class DemoApplicationTests {
	  
	  @Mock
	  DemoRepository demoRepository;
	  
	  @InjectMocks
	  DemoService demoService;
	  
	  DemoModel demoModel;
	  
	  List<DemoModel> demoModelList;
	  
//	  @Before(value = "")
//	  public void setUp() {
//	    demoModel = new DemoModel(1, "Test Book", "Ashiq");
//	    demoModelList = new ArrayList<>();
//	    demoModelList.add(demoModel);
//	  }
	  
//	  @Test
//	  public void testGetBooksById() {
//	    when(demoRepository.findById(1)).thenReturn(java.util.Optional.of(demoModel));
//	    assertEquals(demoModel, demoService.getBooksById(1));
//	  }
	  
	  @Test
	  public void testSaveOrUpdate() {
	    demoService.saveOrUpdate(demoModel);
	  }
	  
	  @Test
	  public void testDelete() {
	    demoService.delete(1);
	  }
	  
	  @Test
	  public void testUpdate() {
	    demoService.update(demoModel, 1);
	  }
	  
//	  @Test
//	  public void testFetchBookList() {
//	    when(demoRepository.findAll()).thenReturn(demoModelList);
//	    assertEquals(demoModelList, demoService.fetchBookList());
//	  }
}
