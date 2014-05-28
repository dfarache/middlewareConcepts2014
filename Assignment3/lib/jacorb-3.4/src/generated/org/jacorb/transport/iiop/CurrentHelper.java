package org.jacorb.transport.iiop;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public abstract class CurrentHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CurrentHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:jacorb.org/org/jacorb/transport/iiop/Current:1.0", "Current");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.transport.iiop.Current s)
	{
			any.insert_Object(s);
	}
	public static org.jacorb.transport.iiop.Current extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:jacorb.org/org/jacorb/transport/iiop/Current:1.0";
	}
	public static Current read(final org.omg.CORBA.portable.InputStream in)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.jacorb.transport.iiop.Current s)
	{
		throw new org.omg.CORBA.MARSHAL();
	}
	public static org.jacorb.transport.iiop.Current narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.transport.iiop.Current)
		{
			return (org.jacorb.transport.iiop.Current)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.jacorb.transport.iiop.Current unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.jacorb.transport.iiop.Current)
		{
			return (org.jacorb.transport.iiop.Current)obj;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
}
