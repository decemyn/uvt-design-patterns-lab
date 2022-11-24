package org.uvt;

import org.uvt.company.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Companie");
        Department department1 = new Department("Departament 1");
        Department department2 = new Department("Departament 2");
        department1.add(new Developer("Developer 1", 10000));
        department1.add(new Developer("Developer 2", 12000));
        department1.add(new Manager("Manager 1", 20000));
        department1.add(new Tester("Tester 1", 9000));
        department2.add(new Developer("Developer 2", 5000));
        department2.add(new Manager("Manager 2", 10000));
        department2.add(new Tester("Tester 3", 3000));
        department2.add(new Tester("Tester 4", 3500));
        company.add(department1);
        company.add(department2);
        //company.print();
        SalaryStatisticsVisitor salaryStatisticsVisitor = new SalaryStatisticsVisitor("Salary Statistics");
        company.accept(salaryStatisticsVisitor);
        salaryStatisticsVisitor.printSalaryStatistics();
    }
}
