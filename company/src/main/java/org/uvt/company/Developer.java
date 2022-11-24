package org.uvt.company;

public class Developer extends Employee {

    public Developer(String employeeName, int employeeSalary) {
        super(employeeName, employeeSalary);
    }

    @Override
    public void print() {
        System.out.print("Developer name: ");
        super.print();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitDeveloper(this);
        super.accept(visitor);
    }
}
