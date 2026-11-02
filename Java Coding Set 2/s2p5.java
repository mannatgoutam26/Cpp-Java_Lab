// 5. Product Catalogue Using HashMap //
import java.util.HashMap;

class Product
{
  int prodId;
  String prodName;
  double cost;
  int stock;

  public Product( int prodId, String prodName, double cost, int stock )
  {
    this.prodId = prodId;
    this.prodName = prodName;
    this.cost = cost;
    this.stock = stock;
  }

  public void display()
  {
    System.out.println( "ID: " + prodId + " | Name: " + prodName + " | Price: Rs." + cost + " | Qty: " + stock );
  }
}

class Main
{
  public static void main( String[] args )
  {
    HashMap<Integer, Product> store = new HashMap<>();

    addProduct( store, new Product( 101, "Laptop", 899.99, 5 ) );
    addProduct( store, new Product( 102, "Smartphone", 499.99, 10 ) );

    addProduct( store, new Product( 101, "Tablet", 299.99, 3 ) );

    System.out.println( " All Products in Catalogue:" );
    displayAllProducts( store );

    System.out.println( " Searching for Product 102:" );
    searchProduct( store, 102 );

    System.out.println( " Updating price of Product 101:" );
    updatePrice( store, 101, 849.99 );

    System.out.println( " Removing Product 102:" );
    removeProduct( store, 102 );

    System.out.println( " Final Catalogue:" );
    displayAllProducts( store );
  }

  public static void addProduct( HashMap<Integer, Product> store, Product item )
  {
    if ( store.containsKey( item.prodId ) )
    {
      System.out.println( "Error: Product ID " + item.prodId + " already exists. Duplicate not inserted." );
    }
    else
    {
      store.put( item.prodId, item );
      System.out.println( "Added: " + item.prodName );
    }
  }

  public static void searchProduct( HashMap<Integer, Product> store, int key )
  {
    if ( store.containsKey( key ) )
    {
      store.get( key ).display();
    }
    else
    {
      System.out.println( "Product ID " + key + " not found." );
    }
  }

  public static void updatePrice( HashMap<Integer, Product> store, int key, double revised )
  {
    if ( store.containsKey( key ) )
    {
      store.get( key ).cost = revised;
      System.out.println( "Price updated successfully." );
    }
    else
    {
      System.out.println( "Product ID " + key + " not found to update price." );
    }
  }

  public static void removeProduct( HashMap<Integer, Product> store, int key )
  {
    if ( store.containsKey( key ) )
    {
      store.remove( key );
      System.out.println( "Product ID " + key + " removed successfully." );
    }
    else
    {
      System.out.println( "Product ID " + key + " not found." );
    }
  }

  public static void displayAllProducts( HashMap<Integer, Product> store )
  {
    if ( store.isEmpty() )
    {
      System.out.println( "Catalogue is empty." );
      return;
    }
    for ( Product item : store.values() )
    {
      item.display();
    }
  }
}
