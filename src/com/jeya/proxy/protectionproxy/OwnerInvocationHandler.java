package com.jeya.proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler
{
  private PersonBean person;

  public OwnerInvocationHandler(PersonBean personBean)
  {
    this.person = personBean;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException
  {
    Object result = null;
    try
    {
      String methodName = method.getName();
      if (methodName.equals("setHotOrNotRating"))
      {
        throw new IllegalAccessException();
      }
      else if (methodName.startsWith("set") || methodName.startsWith("get"))
      {
        result = method.invoke(person, args);
      }
    }
    catch (InvocationTargetException e)
    {
      e.printStackTrace();
    }
    return result;
  }
}