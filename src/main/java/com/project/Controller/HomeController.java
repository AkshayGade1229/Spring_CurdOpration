package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Controller.Services;
import com.project.Controller.Entitys;

@Controller
public class HomeController {
	
	@Autowired
	Services s;
		
			@RequestMapping("/")
			public String home() {
				
				return "home";

			}
			@RequestMapping("/registerForm")
			public String display(){
				return"add";
			}
			
			@RequestMapping("/register")
			public String register(@ModelAttribute Entitys e, Model m){
				
				boolean isAdded= s.addData(e);
				
				if(isAdded){
					m.addAttribute("successMsg","Employee Added Successfully...");
				}else{
					m.addAttribute("errMsg","Unable to Add...");
								
				}
				
				return"add";
				
			}
//****************************************************************************************************************
			@RequestMapping("/updateForm")
			public String update(){
				return"update";
			}
			
			@RequestMapping("/update")
			public String updatedata(@ModelAttribute Entitys e, Model m ){
			boolean update=	s.updatedata(e);
			  
			  if(update){
					m.addAttribute("successMsg","Employee update Successfully...");
				}else{
					m.addAttribute("errMsg","Unable to update...");
				}
			  return "update";
			}
//******************************************************************************************************************
			@RequestMapping("/deleteForm")
			public String deleted(){
				return"delete";
			}
			
			@RequestMapping("/deleteEmployee")
			public String deletedata(@RequestParam int id,Model m){
				
			boolean empdelete	=s.deletedata(id);
			
			 if(empdelete){
					m.addAttribute("successMsg","Employee delete Successfully...");
				}else{
					m.addAttribute("errMsg","Unable to deleted...");
				}
				
				return"selectall";
			}
//******************************************************************************************************************
			@RequestMapping("/selectById")
			public String EmployeeById(){
				return"select";
			}
			
			@RequestMapping("/selectByEmployee")
			public String SingleId(@RequestParam int id,Model m){
				Entitys e=s.singledata(id);
				
				m.addAttribute("empData",e);
				
				return"display";
			}
//******************************************************************************************************************
			@RequestMapping("/selectall")
			public String selectAll(Model m){
				
				List<Entitys> list	=	s.selectAll();
				m.addAttribute("empList",list);
				return "selectall";
			}
}
