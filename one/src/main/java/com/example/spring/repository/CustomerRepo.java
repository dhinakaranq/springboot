package com.example.spring.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	List<Customer> findAllByAddressInAndGender(Set<String> add,String gen);
    
	
	String rawQuery = "SELECT * FROM Customer WHERE address IN (:add)";

	//raw
	@Query(nativeQuery =  true, value = rawQuery)
	List<Customer> getCustomerByAdd(@Param("add") Set<String> add);


}
