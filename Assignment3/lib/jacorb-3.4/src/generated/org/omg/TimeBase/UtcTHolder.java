package org.omg.TimeBase;

/**
 * Generated from IDL struct "UtcT".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UtcTHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.TimeBase.UtcT value;

	public UtcTHolder ()
	{
	}
	public UtcTHolder(final org.omg.TimeBase.UtcT initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.TimeBase.UtcTHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.TimeBase.UtcTHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.TimeBase.UtcTHelper.write(_out, value);
	}
}
