package org.omg.CORBA;


/**
 * Generated from IDL struct "StructMember".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class StructMemberHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(StructMemberHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.StructMemberHelper.id(),"StructMember",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("type_def", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/IDLType:1.0", "IDLType"), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.StructMember s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.StructMember extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CORBA/StructMember:1.0";
	}
	public static org.omg.CORBA.StructMember read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.StructMember result = new org.omg.CORBA.StructMember();
		result.name=in.read_string();
		result.type=in.read_TypeCode();
		result.type_def=org.omg.CORBA.IDLTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.StructMember s)
	{
		java.lang.String tmpResult13 = s.name;
out.write_string( tmpResult13 );
		out.write_TypeCode(s.type);
		org.omg.CORBA.IDLTypeHelper.write(out,s.type_def);
	}
}
