package StockExchange;

/**
* StockExchange/ResponderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public final class ResponderHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchange.Responder value = null;

  public ResponderHolder ()
  {
  }

  public ResponderHolder (StockExchange.Responder initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchange.ResponderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchange.ResponderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchange.ResponderHelper.type ();
  }

}
