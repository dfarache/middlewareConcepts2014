package c.client;


/**
* c.client/ResponderPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public abstract class ResponderPOA extends org.omg.PortableServer.Servant
 implements ResponderOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("push", new java.lang.Integer (0));
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
       case 0:  // c.client/Responder/push
       {
         Quote quote = QuoteHelper.read (in);
         this.push (quote);
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
    "IDL:c.client/Responder:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Responder _this() 
  {
    return ResponderHelper.narrow(
    super._this_object());
  }

  public Responder _this(org.omg.CORBA.ORB orb) 
  {
    return ResponderHelper.narrow(
    super._this_object(orb));
  }


} // class ResponderPOA