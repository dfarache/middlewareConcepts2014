package org.omg.CORBA;

/**
 * Generated from IDL alias "ULongLongSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ULongLongSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public long[] value;

	public ULongLongSeqHolder ()
	{
	}
	public ULongLongSeqHolder (final long[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ULongLongSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ULongLongSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ULongLongSeqHelper.write (out,value);
	}
}
