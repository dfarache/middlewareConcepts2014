package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "JMSDestination".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class JMSDestinationHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosBridgeAdmin.JMSDestination value;

	public JMSDestinationHolder ()
	{
	}
	public JMSDestinationHolder(final org.omg.CosBridgeAdmin.JMSDestination initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosBridgeAdmin.JMSDestinationHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosBridgeAdmin.JMSDestinationHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosBridgeAdmin.JMSDestinationHelper.write(_out, value);
	}
}
