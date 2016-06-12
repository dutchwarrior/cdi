package org.speranza.ex18pag50;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Interceptors(ProfileInterceptor18.class)
public class CustomerService18 {

	@Inject
	private EntityManager em;
	
	@Inject
	private Logger logger;
	
	@PostConstruct
	public void initvalue() {
		logger.severe("dopo costruttore CustomerService18");
	}
	
	public void createCustomer(Customer18 customer) {
		em.persist(customer);
	}
	
	public Customer18 findCustomerById(Long id) {
		return em.find(Customer18.class, id);
	}
}
