package StockExchange.QuoterPackage;


/**
* StockExchange/QuoterPackage/InvalidStockName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Saturday, 24 May 2014 15:04:29 o'clock CEST
*/

public final class InvalidStockName extends org.omg.CORBA.UserException
{

  public InvalidStockName ()
  {
    super(InvalidStockNameHelper.id());
  } // ctor


  public InvalidStockName (String $reason)
  {
    super(InvalidStockNameHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidStockName
