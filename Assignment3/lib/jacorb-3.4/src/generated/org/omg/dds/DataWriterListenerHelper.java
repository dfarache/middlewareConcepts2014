package org.omg.dds;


/**
 * Generated from IDL interface "DataWriterListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class DataWriterListenerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DataWriterListenerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/DataWriterListener:1.0", "DataWriterListener");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DataWriterListener s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.DataWriterListener extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/dds/DataWriterListener:1.0";
	}
	public static DataWriterListener read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._DataWriterListenerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.DataWriterListener s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.DataWriterListener narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DataWriterListener)
		{
			return (org.omg.dds.DataWriterListener)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/DataWriterListener:1.0"))
		{
			org.omg.dds._DataWriterListenerStub stub;
			stub = new org.omg.dds._DataWriterListenerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.DataWriterListener unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DataWriterListener)
		{
			return (org.omg.dds.DataWriterListener)obj;
		}
		else
		{
			org.omg.dds._DataWriterListenerStub stub;
			stub = new org.omg.dds._DataWriterListenerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
