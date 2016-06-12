package org.speranza.ex04pag30;


import java.util.Random;

public class IsbnGenerator04 implements NumberGenerator04 {

  // ======================================
  // =          Business methods          =
  // ======================================

  @Override
public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}