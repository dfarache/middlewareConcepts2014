package org.omg.dds;

/**
 * Generated from IDL struct "UserDataQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UserDataQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.UserDataQosPolicy value;

	public UserDataQosPolicyHolder ()
	{
	}
	public UserDataQosPolicyHolder(final org.omg.dds.UserDataQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.UserDataQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.UserDataQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.UserDataQosPolicyHelper.write(_out, value);
	}
}
