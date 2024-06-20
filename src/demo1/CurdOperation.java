package demo1;
import java.util.*;
class Employee1 {
    private int empno;
    private String ename;
    private int salary;
    Employee1(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public int getEmpno() {
        return empno;
    }
    public int getSalary() {
        return salary;
    }
    public String getEname() {
        return ename;
    }
    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}
class CurdOperation {
    public static void main(String args[]) {
        List <Employee1> c = new ArrayList <Employee1> ();
        Scanner s = new Scanner(System.in);
        
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.Count");
            System.out.println("7.Exit");
            System.out.print("Enter your choice : ");
            ch = s.nextInt();
            switch (ch) {
                //Insert Operation
                case 1:
                	//insert();
                    System.out.print("Enter Empno : ");
                    int eno = s.nextInt();
                    System.out.print("Enter Empname : ");
                    String ename = s.next();
                    System.out.print("Enter Salary : ");
                    int salary = s.nextInt();
                    Employee1 e1=new Employee1(eno, ename, salary);
                    c.add(e1);//Constructor
                    System.out.println("---------------------");
                    System.out.println("Record Inserted Sucessfully");
                    System.out.println("---------------------");
                    break;
                //Display Operation
                case 2:
                    System.out.println("---------------------");
                    Iterator < Employee1 > i = c.iterator();
                    while (i.hasNext()) {
                        Employee1 e = i.next();
                        System.out.println(e);//toString method
                    }
                    System.out.println("---------------------");
                    break;
                //Search Opeartion
                case 3:
                    boolean found = false;
                    System.out.print("Enter Empno to Search : ");
                    int empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee1 e = i.next();
                        if (e.getEmpno() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------");
                    break;
                //Delete Operation
                case 4:
                    found = false;
                    System.out.print("Enter Empno to Delete : ");
                    empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee1 e = i.next();
                        if (e.getEmpno() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                //Update Opeartion
                case 5:
                    found = false;
                    System.out.print("Enter Empno to Update : ");
                    empno = s.nextInt();
                    ListIterator < Employee1 > li = c.listIterator();
                    while (li.hasNext()) {
                        Employee1 e = li.next();
                        if (e.getEmpno() == empno) {
                            System.out.print("Enter new Name : ");
                            ename = s.nextLine();
                            System.out.print("Enter new Salary : ");
                            salary = s.nextInt();
                            li.set(new Employee1(empno, ename, salary));//update
                            found = true;
                        }
                    }
                    System.out.println("---------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } 
                    else {
                        System.out.println("Record is Updated Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                case 6:
                	System.out.println("Total no of emp:"+c.size());
                	break;
                case 7:
                	System.exit(0);
                	break;
            }
        }
        while (ch != 0);
    }

}