package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.DemoModel;

public interface DemoRepository extends JpaRepository< DemoModel , Integer>{

}
