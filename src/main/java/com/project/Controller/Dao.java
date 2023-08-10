package com.project.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.project.Controller.Entitys;

@Repository
public class Dao {

	@Autowired
	JdbcTemplate template;
	private List<Entitys> list;
//	***********************************************************************************************************************************
	public Entitys singledata(int id) {
		Entitys e = null;
		try {

			Object[] args = { id };
			e = template.queryForObject("select * from student where id = ?", args,
					new RowMapper<Entitys>() {

						public Entitys mapRow(ResultSet rs, int rowNum) throws SQLException {
							return new Entitys(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
									rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9));
						}
					});

		} catch (Exception e2) {
       e2.printStackTrace();
		}
		return e;
	}
//	***********************************************************************************************************************************
	public boolean deletedata(int id) {
	
		try {

			Object[] args = { id };
			int data = template.update("delete from student where id = ?", args);
			 
			 if(data==1){
				 return true;
			 }
				
				

		} catch (Exception e2) {
         System.out.println(e2);
		}
		return false;
	}
//	***********************************************************************************************************************************
	public List<Entitys>  selectAll() {
		List<Entitys> list= null;
		try {
			list = template.query("select * from student", new RowMapper<Entitys>() {

				public Entitys mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Entitys(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9));
				}
			});

		} catch (Exception e) {
			e.printStackTrace();		}
		return list;
	}
	//**********************************************************************************************************************
	
	public boolean addData(Entitys e) {
		try {

			Object[] args = { e.getFristname(),e.getLastname(),e.getEmail(),e.getMobile(),e.getBirthdate(),e.getGender(),e.getCountry(), e.getPassword() };
			int a = template.update("insert into student(`fristname`,`lastname`,`email`,`mobile`,`birthdate`,`gender`,`country`,`password`) values(?,?,?,?,?,?,?,?)",args);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {
           e2.printStackTrace();
		}
		return false;
	}
	//*****************************************************************************************************************************
	public boolean updatedata(Entitys e) {
		try {

			Object[] args = {e.getFristname(),e.getLastname(),e.getEmail(),e.getMobile(),e.getBirthdate(),e.getGender(),e.getCountry(),e.getPassword(),e.getId() };
			int a = template.update("update student set fristname = ?, lastname = ?, email = ?, mobile = ?, birthdate = ?, gender = ?, country = ?, password = ? where id = ?",args);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {
           e2.printStackTrace();
		}
		return false;
		
	}

	

}

