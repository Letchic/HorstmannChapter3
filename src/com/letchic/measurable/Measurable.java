package com.letchic.measurable;

public interface Measurable {
    double getMeasure ();
    static double average (Measurable [ ] objects){
        double sum=0;
        for(Measurable emp:objects){
            sum += emp.getMeasure();
        }
        return objects.length>0?sum/objects.length:0;
    }

    static String largest (Measurable [ ] objects){
        double largest=0;
        String name = new String();
        for(Measurable emp:objects){
            if (emp.getMeasure()>largest && emp instanceof Employee) {
                largest = emp.getMeasure();
                name = ((Employee) emp).getName(); //We need a cast, because method getName belongs to class Employee
            }
        }
        return name;
    }
}
