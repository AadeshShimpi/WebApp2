package com.knorex.demo.controller;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.knorex.demo.dao.EmpRepo;
import com.knorex.demo.model.Emp;


@RestController
public class EmpController
{
	@Autowired
	EmpRepo repo;
	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	
	@DeleteMapping("/emp/{eid}")
	public String deleteEmp(@PathVariable int eid)
	{
		Emp e = repo.getOne(eid);
		repo.delete(e);
		return "Employee deleted";
	}
	
	@PostMapping(path="/emp",consumes= {"application/json"})
	public Emp addEmp(@RequestBody Emp emp)
	{
		repo.save(emp);
		return emp;
		
	}
	
	@PutMapping(path="/emp",consumes= {"application/json"})
	public Emp saveOrUpdateEmp(@RequestBody Emp emp)
	{
		repo.save(emp);
		return emp;
		
	}
	
	
	@GetMapping(path="/emps")
	
	public List<Emp> getEmps()
	{
		
		return repo.findAll();
		
	}
	
	@RequestMapping("/emp/{eid}")
	public Optional<Emp> getEmp(@PathVariable("eid") int eid)
	{
		
		return repo.findById(eid);
		
	}
	

}
