package org.uvt.company;

public class Employee extends Element {
    protected int employeeSalary = 0;
    private Department employeeDepartment = null;

    public Employee(String employeeName, int employeeSalary) {
        super(employeeName);
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeDepartment(Element deparment) {
        this.employeeDepartment = (Department) deparment;
    }

    public Department getEmployeeDepartment() {
        return this.employeeDepartment;
    }

    public int getSalary(){
        return this.employeeSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Salary: %s%n", this.employeeSalary);
        System.out.println();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitEmployee(this);
        super.accept(visitor);
    }
}
