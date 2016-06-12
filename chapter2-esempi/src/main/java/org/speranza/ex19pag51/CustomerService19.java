package org.speranza.ex19pag51;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Interceptors({I1.class, I2.class})
public class CustomerService19 {

	@Inject
	private EntityManager em;
	
	@PostConstruct
	private void init() {
		System.out.println();
	}
	
	@Interceptors({I3.class, I4.class})
	public Customer19 findById(Integer id) {
		return em.find(Customer19.class, id);
	}
}
