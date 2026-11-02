// 9. Employee Directory with Sorting //
import java.util.*;

class Employee1
{
  int empNo;
  String empName;
  String dept;
  double pay;

  Employee1( int no, String nm, String dp, double sal )
  {
    empNo = no;
    empName = nm;
    dept = dp;
    pay = sal;
  }

  void display()
  {
    System.out.println( empNo + " " + empName + " " + dept + " " + pay );
  }
}

class EmpMain
{
  public static void main( String[] args )
  {
    ArrayList<Employee1> staff = new ArrayList<>();

    staff.add( new Employee1( 1, "Aamir", "IT", 50000 ) );
    staff.add( new Employee1( 2, "Sara", "HR", 40000 ) );
    staff.add( new Employee1( 3, "Rahul", "IT", 60000 ) );
    staff.add( new Employee1( 4, "Neha", "Sales", 35000 ) );
    staff.add( new Employee1( 5, "Ravi", "HR", 70000 ) );

    // Sort by salary in ascending order
    Collections.sort( staff, new Comparator<Employee1>()
    {
      public int compare( Employee1 a, Employee1 b )
      {
        return Double.compare( a.pay, b.pay );
      }
    } );

    System.out.println( "Employees by Salary:" );

    for ( Employee1 member : staff )
    {
      member.display();
    }

    // Sort by name alphabetically
    Collections.sort( staff, new Comparator<Employee1>()
    {
      public int compare( Employee1 a, Employee1 b )
      {
        return a.empName.compareTo( b.empName );
      }
    } );

    System.out.println( "\nEmployees by Name:" );

    for ( Employee1 member : staff )
    {
      member.display();
    }

    // Search employees by department
    String targetDept = "IT";

    System.out.println( "\nEmployees in IT Department:" );

    for ( Employee1 member : staff )
    {
      if ( member.dept.equalsIgnoreCase( targetDept ) )
      {
        member.display();
      }
    }

    // Display top three highest-paid employees
    Collections.sort( staff, new Comparator<Employee1>()
    {
      public int compare( Employee1 a, Employee1 b )
      {
        return Double.compare( b.pay, a.pay );
      }
    } );

    System.out.println( "\nTop Three Highest Paid Employees:" );

    for ( int k = 0; k < 3 && k < staff.size(); k++ )
    {
      staff.get( k ).display();
    }
  }
}
