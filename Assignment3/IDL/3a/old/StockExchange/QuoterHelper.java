package StockExchange;


/**
* StockExchange/QuoterHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Saturday, 24 May 2014 15:04:29 o'clock CEST
*/

abstract public class QuoterHelper
{
  private static String  _id = "IDL:StockExchange/Quoter:1.0";

  public static void insert (org.omg.CORBA.Any a, StockExchange.Quoter that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StockExchange.Quoter extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StockExchange.QuoterHelper.id (), "Quoter");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StockExchange.Quoter read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_QuoterStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StockExchange.Quoter value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StockExchange.Quoter narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchange.Quoter)
      return (StockExchange.Quoter)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchange._QuoterStub stub = new StockExchange._QuoterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StockExchange.Quoter unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchange.Quoter)
      return (StockExchange.Quoter)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchange._QuoterStub stub = new StockExchange._QuoterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
