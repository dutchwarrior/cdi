package org.speranza.ex17pag48;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
public class CustomerService17 {

	@Inject
	private EntityManager em;
	@Interceptors(LoggingInterceptor.class)
	public void createCustomer(Customer17 customer) {
		em.persist(customer);
	}

	public Customer17 findCustomerById(Long id) {
		return em.find(Customer17.class, id);
	}
}
