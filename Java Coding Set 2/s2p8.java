// 8. Course Registration Using ArrayList and HashMap //
import java.util.*;

class Course
{
  String courseCode;
  String courseName;
  int maxSeats;

  Course( String cc, String cn, int seats )
  {
    courseCode = cc;
    courseName = cn;
    maxSeats = seats;
  }
}

class CourseStudent
{
  String studentId;
  String studentName;

  CourseStudent( String sid, String sname )
  {
    studentId = sid;
    studentName = sname;
  }
}

class CourseMain
{
  public static void main( String[] args )
  {
    HashMap<String, Course> catalog = new HashMap<>();

    HashMap<String, ArrayList<CourseStudent>> enrolments =
        new HashMap<>();

    Course javaCourse = new Course( "C101", "Java", 2 );
    Course pyCourse = new Course( "C102", "Python", 3 );

    catalog.put( javaCourse.courseCode, javaCourse );
    catalog.put( pyCourse.courseCode, pyCourse );

    enrolments.put( "C101", new ArrayList<>() );
    enrolments.put( "C102", new ArrayList<>() );

    CourseStudent stuA = new CourseStudent( "101", "Aamir" );
    CourseStudent stuB = new CourseStudent( "102", "Sara" );
    CourseStudent stuC = new CourseStudent( "103", "Rahul" );

    registerStudent( "C101", stuA, catalog, enrolments );
    registerStudent( "C101", stuB, catalog, enrolments );
    registerStudent( "C101", stuA, catalog, enrolments );
    registerStudent( "C101", stuC, catalog, enrolments );

    registerStudent( "C102", stuA, catalog, enrolments );

    displayStudents( "C101", catalog, enrolments );
    displayStudents( "C102", catalog, enrolments );
  }

  static void registerStudent( String key, CourseStudent learner,
      HashMap<String, Course> catalog,
      HashMap<String, ArrayList<CourseStudent>> enrolments )
  {
    if ( !catalog.containsKey( key ) )
    {
      System.out.println( "Course not found." );
      return;
    }

    ArrayList<CourseStudent> roster = enrolments.get( key );

    for ( CourseStudent existing : roster )
    {
      if ( existing.studentId.equals( learner.studentId ) )
      {
        System.out.println( "Student already registered." );
        return;
      }
    }

    if ( roster.size() >= catalog.get( key ).maxSeats )
    {
      System.out.println( "Course is full." );
      return;
    }

    roster.add( learner );
    System.out.println( learner.studentName + " registered successfully." );
  }

  static void displayStudents( String key,
      HashMap<String, Course> catalog,
      HashMap<String, ArrayList<CourseStudent>> enrolments )
  {
    if ( !catalog.containsKey( key ) )
    {
      System.out.println( "Course not found." );
      return;
    }

    System.out.println( "\nCourse: " + catalog.get( key ).courseName );
    System.out.println( "Registered Students:" );

    for ( CourseStudent learner : enrolments.get( key ) )
    {
      System.out.println( learner.studentId + " " + learner.studentName );
    }
  }
}
