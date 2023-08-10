package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Controller.Dao;

@Service
public class Services {
	
		
		@Autowired
		Dao empDao;

		public boolean addData(Entitys e){
			
			
			return empDao.addData(e);
			
		}

		public boolean updatedata(Entitys e) {
			
			return empDao.updatedata(e);
			
		}

		public Entitys singledata(int id) {
			
			return empDao.singledata(id);
			
		}

		public boolean deletedata(int id) {
			
			return empDao.deletedata(id);
			
		}

		public List<Entitys> selectAll() {
			return  empDao.selectAll();
			
		}

		

	

	

}
