package lecture_17_08_tasks.members;

public class JobClassCalling {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Velta";
        employee.age = 27;
        employee.phoneNumber = "22222222";
        employee.address = "Putnu iela";
        employee.salary = 890;
        employee.specialization = "Front-end developer";

        Manager manager = new Manager();
        manager.name = "Rubija";
        manager.age = 33;
        manager.phoneNumber  = "23333333";
        manager.address = "Salu iela";
        manager.salary = 1560;
        manager.department = "Something";

        employee.printSalary();
        manager.printSalary();

    }
}
