package lecture_17_08_tasks.members;

public class Member {
/*
    Create a class called “Member” that has 5 field and one method.
    Field: name (String), age(int), phoneNumber(String), address(String), int salary
    Method: printSalary() – no input arguments and it prints out members salary*/

    //5 fields
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    //1 method
    public void printSalary(){
        System.out.println("Members salary: " + salary);
    }
}
