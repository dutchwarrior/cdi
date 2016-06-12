package org.speranza.ex16pag47;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
public class CustomerService16 {

	@Inject
	private EntityManager em;
	@Interceptors(LoggingInterceptor.class)
	public void createCustomer(Customer16 customer) {
		em.persist(customer);
	}

	public Customer16 findCustomerById(Long id) {
		return em.find(Customer16.class, id);
	}
}
