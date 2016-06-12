package org.speranza.ex20pag51interceptorBilding;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@Transactional
@Loggable29
public class CustomerService29 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private EntityManager em;

  // ======================================
  // =           Public Methods           =
  // ======================================

  public void createCustomer(Customer29 customer) {
    em.persist(customer);
  }

  public Customer29 findCustomerById(Long id) {
    return em.find(Customer29.class, id);
  }
}