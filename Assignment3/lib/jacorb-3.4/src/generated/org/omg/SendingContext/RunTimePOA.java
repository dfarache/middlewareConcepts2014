package org.omg.SendingContext;


/**
 * Generated from IDL interface "RunTime".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RunTimePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.SendingContext.RunTimeOperations
{
	private String[] ids = {"IDL:omg.org/SendingContext/RunTime:1.0"};
	public org.omg.SendingContext.RunTime _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.SendingContext.RunTime __r = org.omg.SendingContext.RunTimeHelper.narrow(__o);
		return __r;
	}
	public org.omg.SendingContext.RunTime _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.SendingContext.RunTime __r = org.omg.SendingContext.RunTimeHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
