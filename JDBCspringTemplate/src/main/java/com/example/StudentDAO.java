package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO {
	private JdbcTemplate temp;
//select Setter Injection
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	/*JDBC - Driver,Connection,prepare a query, execute the query,close the conn
	 * */
	/*Driver,Connection-spring.xml*/

	//insert a student record
//	public int insert(Student s) {
//		//1,'karthik','k@c.c'
//		String sql="insert into student values("+s.getId()+",'"+s.getName()+"','"+s.getEmail()+"')";
//		System.out.println(sql);
//		//insert,update,delete-JDBC-executeUpdate() -JdbcTemplate-update()
//		return temp.update(sql);
//	}
	
//	public int update(Student s) {
//		String sql="update student set name='"+s.getName()+"' where sid="+s.getId()+"";
//		System.out.println(sql);
//		return temp.update(sql);
//	}
	
	public int delete(Student s) {
		String sql="delete from student where sid="+s.getId()+"";
		System.out.println(sql);
		return temp.update(sql);
	}
	
	//retrive - select -ResultSet- executeQuery()
		public List<Student> getallstudents(){
			String sql="select * from student";
			return temp.query(sql,new ResultSetExtractor<List<Student>>() {

				public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
					ArrayList<Student> al=new ArrayList<Student>();
					while(rs.next()) {
						Student s=new Student();
						s.setId(rs.getInt(1));
						s.setName(rs.getString(2));
						s.setEmail(rs.getString(3));
						al.add(s);
					}
					return al;
				}
				
				
			});

	
}
}

