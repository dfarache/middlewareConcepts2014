package org.omg.SendingContext;


/**
 * Generated from IDL interface "RunTime".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class RunTimeHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RunTimeHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/SendingContext/RunTime:1.0", "RunTime");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.SendingContext.RunTime s)
	{
			any.insert_Object(s);
	}
	public static org.omg.SendingContext.RunTime extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/SendingContext/RunTime:1.0";
	}
	public static RunTime read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.SendingContext._RunTimeStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.SendingContext.RunTime s)
	{
		_out.write_Object(s);
	}
	public static org.omg.SendingContext.RunTime narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SendingContext.RunTime)
		{
			return (org.omg.SendingContext.RunTime)obj;
		}
		else if (obj._is_a("IDL:omg.org/SendingContext/RunTime:1.0"))
		{
			org.omg.SendingContext._RunTimeStub stub;
			stub = new org.omg.SendingContext._RunTimeStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.SendingContext.RunTime unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.SendingContext.RunTime)
		{
			return (org.omg.SendingContext.RunTime)obj;
		}
		else
		{
			org.omg.SendingContext._RunTimeStub stub;
			stub = new org.omg.SendingContext._RunTimeStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
