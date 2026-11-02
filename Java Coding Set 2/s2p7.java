// 7.  Hospital Patient Queue Using PriorityQueue //
import java.util.*;

class Patient
{
  int pid;
  String pname;
  int urgency;
  int arrivalOrder;

  Patient( int idv, String nm, int urg, int arr )
  {
    pid = idv;
    pname = nm;
    urgency = urg;
    arrivalOrder = arr;
  }

  void display()
  {
    System.out.println( "Patient: " + pname +
        " - Priority " + urgency );
  }
}

class PatientMain
{
  public static void main( String[] args )
  {
    PriorityQueue<Patient> line = new PriorityQueue<>(
        new Comparator<Patient>()
        {
          public int compare( Patient x, Patient y )
          {
            if ( x.urgency != y.urgency )
            {
              return x.urgency - y.urgency;
            }

            return x.arrivalOrder - y.arrivalOrder;
          }
        }
    );

    line.add( new Patient( 1, "Patient A", 1, 1 ) );
    line.add( new Patient( 2, "Patient B", 2, 2 ) );
    line.add( new Patient( 3, "Patient C", 1, 3 ) );
    line.add( new Patient( 4, "Patient D", 3, 4 ) );

    System.out.println( "Patient Processing Order:" );

    while ( !line.isEmpty() )
    {
      Patient next = line.poll();
      next.display();
    }
  }
}
