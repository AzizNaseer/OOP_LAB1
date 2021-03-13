public class Employee {
    public int EmpCode;
    public String Emp_Name;
    public Employee(int C,String N){
        this.EmpCode=C;
        this.Emp_Name=N;
        System.out.println("Employee name is "+Emp_Name);
        System.out.println("Employee code is "+EmpCode);
    }
}
