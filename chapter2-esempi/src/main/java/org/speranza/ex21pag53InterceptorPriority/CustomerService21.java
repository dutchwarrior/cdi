package org.speranza.ex21pag53InterceptorPriority;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Loggable21
public class CustomerService21 {
	
	@Inject
	private EntityManager em;
	
	@Auditable21
	public void saveCustomer(Customer21 customer) {
		em.persist(customer);
	}
	
	public Customer21 find(long id) {
		return em.find(Customer21.class, id);
	}
}

