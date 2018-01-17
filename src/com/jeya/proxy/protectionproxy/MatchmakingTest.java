package com.jeya.proxy.protectionproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchmakingTest
{
  private Map<String, PersonBean> dummy = new HashMap<>();

  public static void main(String[] args)
  {
    MatchmakingTest matchmakingTest = new MatchmakingTest();
    matchmakingTest.drive();
  }

  private MatchmakingTest()
  {
    initializeDB();
  }

  private void drive()
  {
    PersonBean joe = getPersonFromDatabase("Joe JavaBean");
    PersonBean ownerProxy = getOwnerProxy(joe);
    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("bowling");
    System.out.println("Interests set from owner proxy");
    try
    {
      ownerProxy.setHotOrNotRating(10);
    }
    catch (Exception e)
    {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is : " + ownerProxy.getHotOrNotRating());

    PersonBean noOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("Name is " + noOwnerProxy.getName());
    try
    {
      noOwnerProxy.setInterests("Reading books");
    }
    catch (Exception e)
    {
      System.out.println("Can't set interests from non owner proxy");
    }
    noOwnerProxy.setHotOrNotRating(3);
    System.out.println("Rating is set from non owner proxy");
    System.out.println("Rating is " + noOwnerProxy.getHotOrNotRating());
  }

  private PersonBean getOwnerProxy(PersonBean person)
  {
    return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
        new OwnerInvocationHandler(person));
  }

  private PersonBean getNonOwnerProxy(PersonBean personBean)
  {
    return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
        personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
  }

  private PersonBean getPersonFromDatabase(String key)
  {
    return dummy.get(key);
  }

  private void initializeDB()
  {
    dummy.put("Joe JavaBean", new PersonBeanImpl("Joe JavaBean", "male"));
    dummy.put("John JavaBean", new PersonBeanImpl("John JavaBean", "male"));
    dummy.put("Magret JavaBean", new PersonBeanImpl("Magret JavaBean", "female"));
    dummy.put("Mary JavaBean", new PersonBeanImpl("John JavaBean", "female"));
  }
}