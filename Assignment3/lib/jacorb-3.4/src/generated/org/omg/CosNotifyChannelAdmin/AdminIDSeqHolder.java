package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL alias "AdminIDSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AdminIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public AdminIDSeqHolder ()
	{
	}
	public AdminIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AdminIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdminIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AdminIDSeqHelper.write (out,value);
	}
}