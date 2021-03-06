package org.omg.CosNaming.NamingContextPackage;


/**
 * Generated from IDL exception "NotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class NotFoundHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NotFoundHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id(),"NotFound",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("why", org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.id(),"NotFoundReason",new String[]{"missing_node","not_context","not_object"}), null),new org.omg.CORBA.StructMember("rest_of_name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNaming.NameHelper.id(), "Name",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosNaming.NameComponentHelper.id(),"NameComponent",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNaming.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("kind", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNaming.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0)), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.NamingContextPackage.NotFound s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.NamingContextPackage.NotFound extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosNaming/NamingContext/NotFound:1.0";
	}
	public static org.omg.CosNaming.NamingContextPackage.NotFound read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CosNaming.NamingContextPackage.NotFoundReason x0;
		x0=org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.read(in);
		org.omg.CosNaming.NameComponent[] x1;
		x1 = org.omg.CosNaming.NameHelper.read(in);
		final org.omg.CosNaming.NamingContextPackage.NotFound result = new org.omg.CosNaming.NamingContextPackage.NotFound(id, x0, x1);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.NamingContextPackage.NotFound s)
	{
		out.write_string(id());
		org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.write(out,s.why);
		org.omg.CosNaming.NameHelper.write(out,s.rest_of_name);
	}
}
