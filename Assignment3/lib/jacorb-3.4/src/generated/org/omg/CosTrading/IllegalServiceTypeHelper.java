package org.omg.CosTrading;


/**
 * Generated from IDL exception "IllegalServiceType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class IllegalServiceTypeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(IllegalServiceTypeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTrading.IllegalServiceTypeHelper.id(),"IllegalServiceType",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.ServiceTypeNameHelper.id(), "ServiceTypeName",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.IllegalServiceType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.IllegalServiceType extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/IllegalServiceType:1.0";
	}
	public static org.omg.CosTrading.IllegalServiceType read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0=in.read_string();
		final org.omg.CosTrading.IllegalServiceType result = new org.omg.CosTrading.IllegalServiceType(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.IllegalServiceType s)
	{
		out.write_string(id());
		java.lang.String tmpResult1043 = s.type;
out.write_string( tmpResult1043 );
	}
}
