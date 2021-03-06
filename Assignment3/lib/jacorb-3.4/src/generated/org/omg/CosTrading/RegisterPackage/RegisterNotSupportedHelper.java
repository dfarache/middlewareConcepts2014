package org.omg.CosTrading.RegisterPackage;


/**
 * Generated from IDL exception "RegisterNotSupported".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RegisterNotSupportedHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RegisterNotSupportedHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTrading.RegisterPackage.RegisterNotSupportedHelper.id(),"RegisterNotSupported",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.TraderNameHelper.id(), "TraderName",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosTrading.LinkNameSeqHelper.id(), "LinkNameSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosTrading.LinkNameHelper.type()))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.RegisterPackage.RegisterNotSupported s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.RegisterPackage.RegisterNotSupported extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosTrading/Register/RegisterNotSupported:1.0";
	}
	public static org.omg.CosTrading.RegisterPackage.RegisterNotSupported read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String[] x0;
		x0 = org.omg.CosTrading.LinkNameSeqHelper.read(in);
		final org.omg.CosTrading.RegisterPackage.RegisterNotSupported result = new org.omg.CosTrading.RegisterPackage.RegisterNotSupported(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.RegisterPackage.RegisterNotSupported s)
	{
		out.write_string(id());
		org.omg.CosTrading.LinkNameSeqHelper.write(out,s.name);
	}
}
