//  4. Library Book Inventory Using ArrayList //
import java.util.ArrayList;

class Book
{
  String code, bookTitle, writer;
  double cost;

  Book( String code, String bookTitle, String writer, double cost )
  {
    this.code = code;
    this.bookTitle = bookTitle;
    this.writer = writer;
    this.cost = cost;
  }
}

class BookMain
{
  static ArrayList<Book> shelf = new ArrayList<>();

  public static void main( String[] args )
  {
    System.out.println( " Adding Books " );
    addBook( new Book( "B101", "The Java Handbook", "Tom Henry", 29.99 ) );
    addBook( new Book( "B102", "Data Structures", "Jane Doe", 45.50 ) );
    addBook( new Book( "B103", "Algorithms", "Matt Henry", 45.50 ) );
    addBook( new Book( "B101", "Duplicate Book", "Test", 10.00 ) ); // Test Requirement 5

    System.out.println( " Searching ISBN B102 " );
    searchBook( "B102" );

    System.out.println( " Removing ISBN B101 " );
    removeBook( "B101" );

    System.out.println( " Displaying Remaining Books " );
    displayAll();
  }

  static void addBook( Book incoming )
  {
    for ( Book entry : shelf )
    {
      if ( entry.code.equals( incoming.code ) )
      {
        System.out.println( "Error: ISBN " + incoming.code + " already exists!" );
        return;
      }
    }
    shelf.add( incoming );
    System.out.println( "Added: " + incoming.bookTitle );
  }

  static void searchBook( String key )
  {
    for ( Book entry : shelf )
    {
      if ( entry.code.equals( key ) )
      {
        System.out.println( "Found: " + entry.bookTitle + " by " + entry.writer );
      }
    }
  }

  static void removeBook( String key )
  {
    for ( int pos = 0; pos < shelf.size(); pos++ )
    {
      if ( shelf.get( pos ).code.equals( key ) )
      {
        System.out.println( "Removed: " + shelf.get( pos ).bookTitle );
        shelf.remove( pos );
        break;
      }
    }
  }

  static void displayAll()
  {
    for ( Book entry : shelf )
    {
      System.out.println( entry.code + " | " + entry.bookTitle + " | $" + entry.cost );
    }
  }
}
