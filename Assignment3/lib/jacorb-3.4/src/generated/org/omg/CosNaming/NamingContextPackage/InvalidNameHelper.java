package org.omg.CosNaming.NamingContextPackage;


/**
 * Generated from IDL exception "InvalidName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class InvalidNameHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(InvalidNameHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.id(),"InvalidName",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.InvalidName s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.InvalidName extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.InvalidName read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosNaming.NamingContextPackage.InvalidName result = new org.omg.CosNaming.NamingContextPackage.InvalidName(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.InvalidName s)
	{
		out.write_string(id());
	}
}
