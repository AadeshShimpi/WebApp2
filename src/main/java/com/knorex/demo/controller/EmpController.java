package com.knorex.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.knorex.demo.dao.EmpRepo;
import com.knorex.demo.model.Emp;

import antlr.collections.List;

@Controller
public class EmpController
{
	@Autowired
	EmpRepo repo;
	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	@RequestMapping("/addEmp")
	public String addEmp(Emp emp)
	{
		repo.save(emp);
		return "home.jsp";
		
	}
	@RequestMapping("/emp")
	@ResponseBody
	public List getEmp()
	{
		
		return (List) repo.findAll();
		
	}
	
	@RequestMapping("/emp/{eid}")
	@ResponseBody
	public Optional<Emp> getEmp(@PathVariable("aid") int eid)
	{
		
		return repo.findById(eid);
		
	}
	
	

}
