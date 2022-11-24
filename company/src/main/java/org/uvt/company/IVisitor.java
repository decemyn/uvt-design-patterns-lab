package org.uvt.company;

public interface IVisitor {

    void visitCompany(Company company);

    void visitDepartment(Department department);

    void visitEmployee(Employee employee);

    void visitDeveloper(Developer developer);

    void visitManager(Manager manager);

    void visitTester(Tester tester);
}
