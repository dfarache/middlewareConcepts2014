package StockExchange;


/**
* StockExchange/ServerCommunicationPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public abstract class ServerCommunicationPOA extends org.omg.PortableServer.Servant
 implements StockExchange.ServerCommunicationOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("register_callback", new java.lang.Integer (0));
    _methods.put ("unregister_callback", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // StockExchange/ServerCommunication/register_callback
       {
         String Quote_info = in.read_string ();
         StockExchange.Responder responder = StockExchange.ResponderHelper.read (in);
         this.register_callback (Quote_info, responder);
         out = $rh.createReply();
         break;
       }

       case 1:  // StockExchange/ServerCommunication/unregister_callback
       {
         StockExchange.Responder responder = StockExchange.ResponderHelper.read (in);
         this.unregister_callback (responder);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:StockExchange/ServerCommunication:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ServerCommunication _this() 
  {
    return ServerCommunicationHelper.narrow(
    super._this_object());
  }

  public ServerCommunication _this(org.omg.CORBA.ORB orb) 
  {
    return ServerCommunicationHelper.narrow(
    super._this_object(orb));
  }


} // class ServerCommunicationPOA
