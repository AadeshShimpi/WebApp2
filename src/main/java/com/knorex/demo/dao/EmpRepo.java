package com.knorex.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.knorex.demo.model.Emp;
import java.util.List;

public interface EmpRepo extends JpaRepository<Emp,Integer>
{
	

}
