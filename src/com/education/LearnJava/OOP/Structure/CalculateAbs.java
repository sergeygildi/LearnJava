package com.education.LearnJava.OOP.Structure;

public abstract class CalculateAbs implements CalculateInterface {

  @Override
  public double minus(int a, int b) {
    return a - b;
  }

  @Override
  public double plus(int a, int b) {
    return a + b;
  }

  @Override
  public double division(int a, int b) {
    return a / b;
  }

  @Override
  public double multiplication(int a, int b) {
    return a * b;
  }

}