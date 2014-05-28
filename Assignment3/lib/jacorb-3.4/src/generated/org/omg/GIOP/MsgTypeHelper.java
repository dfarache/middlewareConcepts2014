package org.omg.GIOP;

/**
 * Generated from IDL alias "MsgType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class MsgTypeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.GIOP.MsgType_1_0 s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.GIOP.MsgType_1_0 extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MsgTypeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.GIOP.MsgTypeHelper.id(), "MsgType",org.omg.CORBA.ORB.init().create_enum_tc(org.omg.GIOP.MsgType_1_0Helper.id(),"MsgType_1_0",new String[]{"Request","Reply","CancelRequest","LocateRequest","LocateReply","CloseConnection","MessageError"}));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/GIOP/MsgType:1.0";
	}
	public static org.omg.GIOP.MsgType_1_0 read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.GIOP.MsgType_1_0 _result;
		_result=org.omg.GIOP.MsgType_1_0Helper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.GIOP.MsgType_1_0 _s)
	{
		org.omg.GIOP.MsgType_1_0Helper.write(_out,_s);
	}
}
