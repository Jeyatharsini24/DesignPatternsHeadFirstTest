package com.jeya.proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler
{
  private PersonBean person;

  public NonOwnerInvocationHandler(PersonBean person)
  {
    super();
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException
  {
    try
    {
      if (method.getName().equals("setHotOrNotRating") || method.getName().startsWith("get"))
      {
        return method.invoke(person, args);
      }
      else
      {
        throw new IllegalAccessException();
      }
    }
    catch (InvocationTargetException e)
    {
      e.printStackTrace();
    }
    return null;
  }
}