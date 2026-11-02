// 6.  Unique Student Registration Using HashSet  //
import java.util.HashSet;

class Student1
{
  int regId;
  String fullName;

  Student1( int rid, String nm )
  {
    regId = rid;
    fullName = nm;
  }

  @Override
  public boolean equals( Object obj )
  {
    Student1 other = (Student1) obj;
    return regId == other.regId;
  }

  @Override
  public int hashCode()
  {
    return regId;
  }

  void display()
  {
    System.out.println( "Registration No: " + regId );
    System.out.println( "Name: " + fullName );
  }
}

class StudentMain
{
  public static void main( String[] args )
  {
    HashSet<Student1> pool = new HashSet<>();

    Student1 first = new Student1( 101, "Aamir" );
    Student1 second = new Student1( 101, "Aamir Khan" );
    Student1 third = new Student1( 102, "Sara" );

    pool.add( first );
    pool.add( second );
    pool.add( third );

    System.out.println( "Registered Students:" );

    for ( Student1 entry : pool )
    {
      entry.display();
      System.out.println();
    }

    if ( pool.contains( second ) )
    {
      System.out.println( "Student is already registered." );
    }
  }
}
