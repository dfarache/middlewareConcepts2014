package org.omg.Security;

/**
 * Generated from IDL alias "RightsList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RightsListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.Right[] value;

	public RightsListHolder ()
	{
	}
	public RightsListHolder (final org.omg.Security.Right[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RightsListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RightsListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RightsListHelper.write (out,value);
	}
}
