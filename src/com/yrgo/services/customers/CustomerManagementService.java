package com.yrgo.services.customers;

import java.util.List;

import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerManagementService {

	public void newCustomer(Customer newCustomer);


	public void updateCustomer(Customer changedCustomer) throws CustomerNotFoundException;


	public void deleteCustomer(Customer oldCustomer) throws CustomerNotFoundException;


	public Customer findCustomerById(String customerId) throws CustomerNotFoundException;

	public List<Customer> findCustomersByName (String name);

	public List<Customer> getAllCustomers();


	public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException;

	
	public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException;
}
