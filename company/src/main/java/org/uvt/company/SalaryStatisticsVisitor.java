package org.uvt.company;

import java.util.HashMap;
import java.util.Map;

public class SalaryStatisticsVisitor implements IVisitor {
    private final Map<String, Map<String, Integer>> salaryMap = new HashMap<>();


    public SalaryStatisticsVisitor(String visitorName) {
        System.out.println(visitorName);
    }

    @Override
    public void visitCompany(Company company) {
        ;
    }

    @Override
    public void visitDepartment(Department department) {
        this.salaryMap.put(department.getMasterContent(), new HashMap<String,Integer>());
    }

    @Override
    public void visitEmployee(Employee employee) {
        ;
    }

    @Override
    public void visitDeveloper(Developer developer) {
        String employeeDeparment = developer.getEmployeeDepartment().getMasterContent();
        if (this.salaryMap.get(employeeDeparment).containsKey(developer.getClass().getName())) {
            this.salaryMap.get(employeeDeparment).put(developer.getClass().getName(),
                    this.salaryMap.get(employeeDeparment).get(developer.getClass().getName() + 1));
        }
        else{
            this.salaryMap.get(employeeDeparment).put(developer.getClass().getName(), developer.getSalary());
        }
    }

    @Override
    public void visitManager(Manager manager) {
        String employeeDeparment = manager.getEmployeeDepartment().getMasterContent();
        if (this.salaryMap.get(employeeDeparment).containsKey(manager.getClass().getName())) {
            this.salaryMap.get(employeeDeparment).put(manager.getClass().getName(),
                    this.salaryMap.get(employeeDeparment).get(manager.getClass().getName()+ 1));
        }
        else{
            this.salaryMap.get(employeeDeparment).put(manager.getClass().getName(), manager.getSalary());
        }
    }

    @Override
    public void visitTester(Tester tester) {
        String employeeDeparment = tester.getEmployeeDepartment().getMasterContent();
        if (this.salaryMap.get(employeeDeparment).containsKey(tester.getClass().getName())) {
            this.salaryMap.get(employeeDeparment).put(tester.getClass().getName(),
                    this.salaryMap.get(employeeDeparment).get(tester.getClass().getName() + 1));
        }
        else{
            this.salaryMap.get(employeeDeparment).put(tester.getClass().getName(), tester.getSalary());
        }
    }

    public void printSalaryStatistics() {
        System.out.println(this.salaryMap);
    }
}
