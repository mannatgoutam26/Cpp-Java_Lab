// 1. Student Result Management System //
class Student
{
  private int roll;
  private String studentName;
  private float m1, m2, m3;
  private float sum;
  private float pct;
  private String letter;

  Student( int rn, String nm, float a, float b, float c )
  {
    roll = rn;
    studentName = nm;
    m1 = a;
    m2 = b;
    m3 = c;

    System.out.println( "Roll No: " + rn );
    System.out.println( "Student Name: " + nm );
    System.out.println( "Marks 1: " + a );
    System.out.println( "Marks 2: " + b );
    System.out.println( "Marks 3: " + c );
  }

  public int getRollNo()
  {
    return roll;
  }

  public String getName()
  {
    return studentName;
  }

  public float getMarks1()
  {
    return m1;
  }

  public float getMarks2()
  {
    return m2;
  }

  public float getMarks3()
  {
    return m3;
  }

  public void result()
  {
    sum = m1 + m2 + m3;
    System.out.println( "Total Marks: " + sum + " / 300" );

    pct = ( sum / 300 ) * 100;
    System.out.println( "Percentage: " + pct + "%" );

    if ( pct >= 90 )
    {
      letter = "A";
    }
    else if ( pct >= 75 )
    {
      letter = "B";
    }
    else if ( pct >= 60 )
    {
      letter = "C";
    }
    else
    {
      letter = "D";
    }

    System.out.println( "Grade: " + letter );
  }
}

class Main
{
  public static void main( String[] args )
  {
    System.out.println( "Student Details:" );

    Student pupil = new Student( 13, "Aman", 76, 89, 78 );
    pupil.result();
  }
}
