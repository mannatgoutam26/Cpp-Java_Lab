// 2. Bank Account with Constructor Overloading //
class BankAccount
{
  String holderName;
  int accNo;
  private float funds;

  BankAccount( int num, String person )
  {
    accNo = num;
    holderName = person;
  }

  BankAccount( int num, String person, float opening )
  {
    accNo = num;
    holderName = person;
    funds = opening;
  }

  public void deposit( float amt )
  {
    funds = funds + amt;
    System.out.println( "Amount Deposited: " + amt );
    System.out.println( "Updated Balance: " + funds );
  }

  public void withdraw( float amt )
  {
    if ( funds >= amt )
    {
      funds = funds - amt;
      System.out.println( "Withdrawn Amount: " + amt );
      System.out.println( "Updated Balance: " + funds );
    }
    else
    {
      System.out.println( "Insufficient Balance!" );
    }
  }

  public void displayAccount()
  {
    System.out.println( "Account Number: " + accNo );
    System.out.println( "Account Holder: " + holderName );
    System.out.println( "Account Balance: " + funds );
  }
}

class bankMain
{
  public static void main( String[] args )
  {
    BankAccount acc1 = new BankAccount( 123, "AJAY" );
    acc1.displayAccount();

    BankAccount acc2 = new BankAccount( 456, "RAVI", 1000.0f );
    acc2.displayAccount();

    acc2.deposit( 2000.0f );
    acc2.withdraw( 500.0f );
  }
}
