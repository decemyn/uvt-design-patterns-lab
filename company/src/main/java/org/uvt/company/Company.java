package org.uvt.company;

public class Company extends Element{

    public Company(String companyName) {
        super(companyName);
    }

    @Override
    public void print() {
        System.out.print("Company: ");
        super.print();
        this.childElements.forEach(Element::print);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitCompany(this);
        super.accept(visitor);
    }
}
