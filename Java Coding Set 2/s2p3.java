// 3. Employee Salary Management //
class Employee
{
  private String empId;
  private String empName;
  private double basePay;

  public Employee( String empId, String empName, double basePay )
  {
    this.empId = empId;
    this.empName = empName;
    this.basePay = basePay;
  }

  public double calculateGrossSalary()
  {
    double houseAllow = 0.20 * basePay;
    double dearAllow = 0.10 * basePay;
    double extra = 0.0;

    if ( basePay > 50000 )
    {
      extra = 0.05 * basePay;
    }

    return basePay + houseAllow + dearAllow + extra;
  }

  public void displaySalaryDetails()
  {
    System.out.println( "Employee ID : " + empId );
    System.out.println( "Name        : " + empName );
    System.out.println( "Basic Salary: Rs. " + basePay );
    System.out.println( "Gross Salary: Rs. " + calculateGrossSalary() );
  }

  public static Employee getHigherPaidEmployee( Employee first, Employee second )
  {
    if ( first.calculateGrossSalary() >= second.calculateGrossSalary() )
    {
      return first;
    }
    else
    {
      return second;
    }
  }

  public String getName()
  {
    return empName;
  }
}

class employeeMain
{
  public static void main( String[] args )
  {
    Employee worker1 = new Employee( "123", "Amit Sharma", 45000 );
    Employee worker2 = new Employee( "456", "Priya Patel", 60000 );
    Employee worker3 = new Employee( "789", "Rohan Das", 55000 );

    System.out.println( " Employee Salary Details: " );
    worker1.displaySalaryDetails();
    worker2.displaySalaryDetails();
    worker3.displaySalaryDetails();

    System.out.println( " Comparing Salaries: " );
    Employee winner = Employee.getHigherPaidEmployee( worker1, worker2 );
    System.out.println( "Between " + worker1.getName() + " and " + worker2.getName() + ", the higher paid employee is: " + winner.getName() );
  }
}
