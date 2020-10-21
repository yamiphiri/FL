public class Faculty extends Employee {
  public static void main(String[] args) {
    new Faculty();
  }
  
  public Faculty() {
    super(); //will call the parent class
    System.out.println("(4) Faculty's no-arg constructor is invoked");
  }
}
class Employee extends Person {
  public Employee() {
    
    // new Employee("(2) Invoke Employee’s overloaded constructor");
    this("(2) Invoke Employee’s overloaded constructor");
    System.out.println("(3) Employee's no-arg constructor is invoked");
  }
  //overloaded constructor
  public Employee(String s) {
    System.out.println(s);
  }
}
class Person {
  public Person() {
    //Super(); //will call the parent class due to no explicit parent it will return an error    
    System.out.println("(1) Person's no-arg constructor is invoked");
  }
}
