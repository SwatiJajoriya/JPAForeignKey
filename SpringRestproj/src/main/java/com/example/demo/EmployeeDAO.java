package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
	
//used for autogeneration of a reference for an object	
	@Autowired
	EmployeeRepo repo;

	
	public Employee insert(Employee e) {
		
		return repo.save(e);
	}
	
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	public List<Employee> insertall(List<Employee> emp){
		return repo.saveAll(emp);

}
	
	//get record by id
	//Service

	public Optional<Employee> getbyid(int id){
			return repo.findById(id);

}
	
	//delete a record with id 
	//service
	public void deletebyid(int id) {
			repo.deleteById(id);
		}

	/*in jpa we dont have an inbuilt update command
	 * 1.fetch the data -find
	 * 2.set the new values
	 * 3.perform a insert operation-save
	 * 
	 * 1.fetch the data -find
	 * {
        "empno": 32,
        "empname": "kk",
        "phono": "123456"
    }->store it in an object->newemp
    2.set the new values
    with the object newemp -setempname with a new record of name-"karthik"
    3.insert 
	 * */
	//{32,"karthik"}->json
	
	public Employee updateByName(Employee e) {
		Employee ee=repo.findById(e.getEmpno()).orElse(null);
		/*{
        "empno": 32,
        "empname": "kk",
        "phono": "123456"
    }*/
		ee.setEmpname(e.getEmpname());
		ee.setPhono(e.getPhono());
	return	repo.save(ee);
		
	}

	//service
	//customize query
		public String findbyname(String name,int id){
			return repo.findByname(name, id);
		}



}

