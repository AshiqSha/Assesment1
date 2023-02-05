package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {

@Autowired
DemoRepository demoRepository;

public DemoModel getBooksById(int id) 
{
return demoRepository.findById(id).get();
}



public void saveOrUpdate(DemoModel books) 
{
demoRepository.save(books);
}



public void delete(int id) 
{
	demoRepository.deleteById(id);
}



public void update(DemoModel books, int bookid) 
{
	demoRepository.save(books);
}



public List<DemoModel> fetchBookList()
{
    return (List<DemoModel>)
        demoRepository.findAll();
}

}
