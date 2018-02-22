package com.jeya.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Planner
{
  private Map<Date, List<Plan>> listOfPlans = new HashMap<>();
  
  public void addPlan(Date date, Plan plan)
  {
    List<Plan> listOfPlansForThisDate = listOfPlans.get(date);
    if(listOfPlansForThisDate == null)
    {
      listOfPlansForThisDate = new ArrayList<>();
    }
    listOfPlansForThisDate.add(plan);
    listOfPlans.put(date, listOfPlansForThisDate);
  }

  public void print()
  {
    for(Entry<Date, List<Plan>> plan : listOfPlans.entrySet())
    {
      System.out.println(plan.getKey());
      List<Plan> list = plan.getValue();
      Iterator<Plan> iterator = list.iterator();
      while(iterator.hasNext())
      {
        Plan planU = iterator.next();
        System.out.println(planU);
      }
      System.out.println("*************************************************************************************************************");
    }
  }
}