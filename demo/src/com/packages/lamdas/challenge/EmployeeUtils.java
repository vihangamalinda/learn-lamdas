package com.packages.lamdas.challenge;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public String getFullName (Employee employee){
        Function<Employee,String > fullName = (Employee employee1)-> employee1.getFirstName() + " "+employee1.getLastName();
        return fullName.apply(employee);

    }

    public String getManagerLastName(Employee employee){
    Function<Employee,String> managerLastName = (Employee employee1)-> employee1.getManager().getLastName();
    return managerLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee){
        Predicate<Employee> isLongerEmployeement = (Employee employee1) -> employee1.getYearsOfService() > 5;
       return isLongerEmployeement.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee){
        Predicate<Employee> isMoreReports = (Employee employee1)->employee1.getNumberOfDirectReports()>3;
        return isMoreReports.test(employee);
    }

}
