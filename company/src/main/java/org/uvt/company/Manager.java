package org.uvt.company;

public class Manager extends Employee{

    public Manager(String employeeName, int employeeSalary) {
        super(employeeName, employeeSalary);
    }

    @Override
    public void print() {
        System.out.print("Manager name: ");
        super.print();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitManager(this);
        super.accept(visitor);
    }
}
