package org.uvt.company;

public class Department extends Element{

    public Department(String departmentName) {
        super(departmentName);
    }

    @Override
    public void add(Element element) {
        super.add(element);
        if (element instanceof Employee) {
            ((Employee) element).setEmployeeDepartment(this);
        }
    }

    @Override
    public void print() {
        System.out.print("Department: ");
        super.print();
        this.childElements.forEach(Element::print);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitDepartment(this);
        super.accept(visitor);
    }
}
