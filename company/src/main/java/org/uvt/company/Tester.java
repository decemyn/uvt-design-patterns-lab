package org.uvt.company;

public class Tester extends Employee {
    public Tester(String employeeName, int employeeSalary) {
        super(employeeName, employeeSalary);
    }

    @Override
    public void print() {
        System.out.print("Tester name: ");
        super.print();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitTester(this);
        super.accept(visitor);
    }
}
