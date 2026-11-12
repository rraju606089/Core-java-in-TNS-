package Day05.Inheritance;
class Emp{
    int EmpID;
    String EmpName;
    double Salary;

    Emp(int id, String name, double Salary){
        this.EmpId = id;
        this.EmpName = name;
        this.EmpSalary = sal;
    }

    void displayEmpDetails(){
        System.out.printl("Emp Id " + EmpId);
        System.out.println("Emp name " + EmpName);
        System.out.println("Emp Salary" + Salary);
    }

    void calcultesalary(){
        System.out.println("Monthly Salary " + Salary);
    }

}

class Developer extends Emp {
    String programmingLanguaage;

    Developer(int id, String name, double sal, String lang){
        super(id, name, sal);
        this.programmingLanguaage = lang;
    }

class Testing extends Emp{
    String lang = "java sal";
    void disp
}

    void displayDeveloperDetails(){
        displayEmpDetails();
        System.out.println("")
    }
}

public class ExpSingleLevel {
    
}
