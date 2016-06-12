package org.speranza.ex15pag45;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;

public class CustomerService15 {

	@Inject
	private EntityManager entityManager;

	@Inject
	private Logger logger;

	public void createCustomer(Customer15 customer) {
		entityManager.getTransaction().begin();

		entityManager.persist(customer);
		entityManager.getTransaction().commit();
	}

	public Customer15 findCustomerById(Long id) {
		return entityManager.find(Customer15.class, id);
	}

	@AroundInvoke
	private Object logMethod(InvocationContext ic) throws Exception {
		logger.entering(ic.getTarget().toString(), ic.getMethod().getName());
		logger.severe(">>>" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
		try {
			return ic.proceed();
		} finally {
			logger.exiting(ic.getTarget().toString(), ic.getMethod().getName());
			logger.severe("<<<" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
		}
	}
}
