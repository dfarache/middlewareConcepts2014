package StockExchange;

/**
* StockExchange/NonExistingStockHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public final class NonExistingStockHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchange.NonExistingStock value = null;

  public NonExistingStockHolder ()
  {
  }

  public NonExistingStockHolder (StockExchange.NonExistingStock initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchange.NonExistingStockHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchange.NonExistingStockHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchange.NonExistingStockHelper.type ();
  }

}
