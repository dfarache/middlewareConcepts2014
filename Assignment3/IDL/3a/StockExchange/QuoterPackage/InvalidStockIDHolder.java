package StockExchange.QuoterPackage;

/**
* StockExchange/QuoterPackage/InvalidStockIDHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Wednesday, 28 May 2014 11:00:38 o'clock CEST
*/

public final class InvalidStockIDHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchange.QuoterPackage.InvalidStockID value = null;

  public InvalidStockIDHolder ()
  {
  }

  public InvalidStockIDHolder (StockExchange.QuoterPackage.InvalidStockID initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchange.QuoterPackage.InvalidStockIDHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchange.QuoterPackage.InvalidStockIDHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchange.QuoterPackage.InvalidStockIDHelper.type ();
  }

}
