package org.omg.CosCollection;


/**
 * Generated from IDL interface "RelationFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RelationFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.RelationFactoryOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "create", Integer.valueOf(0));
		m_opsHash.put ( "generic_create", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/RelationFactory:1.0","IDL:omg.org/CosCollection/CollectionFactory:1.0"};
	public org.omg.CosCollection.RelationFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.RelationFactory __r = org.omg.CosCollection.RelationFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.RelationFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.RelationFactory __r = org.omg.CosCollection.RelationFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // create
			{
				org.omg.CosCollection.Operations _arg0=org.omg.CosCollection.OperationsHelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				org.omg.CosCollection.RelationHelper.write(_out,create(_arg0,_arg1));
				break;
			}
			case 1: // generic_create
			{
			try
			{
				org.omg.CosCollection.NVPair[] _arg0=org.omg.CosCollection.ParameterListHelper.read(_input);
				_out = handler.createReply();
				org.omg.CosCollection.CollectionHelper.write(_out,generic_create(_arg0));
			}
			catch(org.omg.CosCollection.ParameterInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ParameterInvalidHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
