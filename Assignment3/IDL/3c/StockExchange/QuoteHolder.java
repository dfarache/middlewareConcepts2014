package StockExchange;

/**
* StockExchange/QuoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public final class QuoteHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchange.Quote value = null;

  public QuoteHolder ()
  {
  }

  public QuoteHolder (StockExchange.Quote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchange.QuoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchange.QuoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchange.QuoteHelper.type ();
  }

}
