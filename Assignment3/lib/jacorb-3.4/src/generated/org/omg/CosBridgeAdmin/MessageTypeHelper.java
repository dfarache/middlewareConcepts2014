package org.omg.CosBridgeAdmin;
/**
 * Generated from IDL enum "MessageType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class MessageTypeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MessageTypeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosBridgeAdmin.MessageTypeHelper.id(),"MessageType",new String[]{"JMS_MESSAGE","STRUCTURED_EVENT","SEQUENCE_EVENT"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosBridgeAdmin.MessageType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosBridgeAdmin.MessageType extract (final org.omg.CORBA.Any any)
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
		return "IDL:omg.org/CosBridgeAdmin/MessageType:1.0";
	}
	public static MessageType read (final org.omg.CORBA.portable.InputStream in)
	{
		return MessageType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final MessageType s)
	{
		out.write_long(s.value());
	}
}
