package org.omg.CORBA;
/**
 * Generated from IDL enum "SetOverrideType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SetOverrideTypeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SetOverrideTypeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.SetOverrideTypeHelper.id(),"SetOverrideType",new String[]{"SET_OVERRIDE","ADD_OVERRIDE"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.SetOverrideType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.SetOverrideType extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CORBA/SetOverrideType:1.0";
	}
	public static SetOverrideType read (final org.omg.CORBA.portable.InputStream in)
	{
		return SetOverrideType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SetOverrideType s)
	{
		out.write_long(s.value());
	}
}
