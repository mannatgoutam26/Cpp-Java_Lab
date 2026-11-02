// 10. E-Commerce Shopping Cart //
import java.util.*;

class Product1
{
  int pid;
  String title;
  double rate;

  Product1( int idv, String ttl, double rt )
  {
    pid = idv;
    title = ttl;
    rate = rt;
  }
}

class CartItem
{
  Product1 goods;
  int count;

  CartItem( Product1 g, int cnt )
  {
    goods = g;
    count = cnt;
  }
}

class ShoppingCart
{
  private HashMap<Integer, CartItem> basket = new HashMap<>();

  // Add product to cart
  void addProduct( Product1 prod, int qty )
  {
    if ( qty <= 0 )
    {
      System.out.println( "Invalid quantity." );
      return;
    }

    if ( basket.containsKey( prod.pid ) )
    {
      basket.get( prod.pid ).count += qty;
    }
    else
    {
      basket.put( prod.pid, new CartItem( prod, qty ) );
    }

    System.out.println( prod.title + " added to cart." );
  }

  // Update product quantity
  void updateQuantity( int key, int qty )
  {
    if ( qty <= 0 )
    {
      System.out.println( "Invalid quantity." );
      return;
    }

    if ( basket.containsKey( key ) )
    {
      basket.get( key ).count = qty;
      System.out.println( "Quantity updated." );
    }
    else
    {
      System.out.println( "Product not found." );
    }
  }

  // Remove product
  void removeProduct( int key )
  {
    if ( basket.containsKey( key ) )
    {
      basket.remove( key );
      System.out.println( "Product with id: " + key + " removed." );
    }
    else
    {
      System.out.println( "Product not found." );
    }
  }

  // Display cart and calculate bill
  void displayCart()
  {
    double sum = 0;

    System.out.println( "\nProduct\t\tQuantity\tAmount" );

    for ( CartItem line : basket.values() )
    {
      double lineTotal = line.goods.rate * line.count;

      sum += lineTotal;

      System.out.println( line.goods.title + "\t\t" +
          line.count + "\t\t" +
          String.format( "%.2f", lineTotal ) );
    }

    double rebate = 0;

    if ( sum >= 5000 )
    {
      rebate = sum * 0.10;
    }
    else if ( sum >= 1000 )
    {
      rebate = sum * 0.05;
    }

    double payable = sum - rebate;

    System.out.println( "----------------------------------" );

    System.out.printf( "Subtotal: %.2f%n", sum );

    System.out.printf( "Discount: %.2f%n", rebate );

    System.out.printf( "Final Amount: %.2f%n", payable );
  }
}

class ProductMain
{
  public static void main( String[] args )
  {
    Product1 item1 = new Product1( 1, "Keyboard", 800 );
    Product1 item2 = new Product1( 2, "Mouse", 700 );
    Product1 item3 = new Product1( 3, "Monitor", 4000 );

    ShoppingCart trolley = new ShoppingCart();

    trolley.addProduct( item1, 2 );
    trolley.addProduct( item2, 1 );
    trolley.addProduct( item3, 1 );

    trolley.addProduct( item2, 1 );

    trolley.updateQuantity( 2, 1 );

    trolley.removeProduct( 3 );

    trolley.displayCart();
  }
}
