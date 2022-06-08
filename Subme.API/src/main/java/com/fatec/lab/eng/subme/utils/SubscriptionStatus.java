package com.fatec.lab.eng.subme.utils;

public enum SubscriptionStatus {
 ACTIVE(0), SUSPENDED(1), CANCELED(2);
 public int value;

 SubscriptionStatus(int value) {
  this.value = value;
 }

}
