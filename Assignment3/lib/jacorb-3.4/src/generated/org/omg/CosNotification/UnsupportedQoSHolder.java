package org.omg.CosNotification;

/**
 * Generated from IDL exception "UnsupportedQoS".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnsupportedQoSHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.UnsupportedQoS value;

	public UnsupportedQoSHolder ()
	{
	}
	public UnsupportedQoSHolder(final org.omg.CosNotification.UnsupportedQoS initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.UnsupportedQoSHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.UnsupportedQoSHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.UnsupportedQoSHelper.write(_out, value);
	}
}
