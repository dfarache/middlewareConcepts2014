package org.omg.PortableServer;
/**
 * Generated from IDL enum "IdAssignmentPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class IdAssignmentPolicyValueHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(IdAssignmentPolicyValueHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.PortableServer.IdAssignmentPolicyValueHelper.id(),"IdAssignmentPolicyValue",new String[]{"USER_ID","SYSTEM_ID"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableServer.IdAssignmentPolicyValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableServer.IdAssignmentPolicyValue extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/PortableServer/IdAssignmentPolicyValue:1.0";
	}
	public static IdAssignmentPolicyValue read (final org.omg.CORBA.portable.InputStream in)
	{
		return IdAssignmentPolicyValue.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final IdAssignmentPolicyValue s)
	{
		out.write_long(s.value());
	}
}
