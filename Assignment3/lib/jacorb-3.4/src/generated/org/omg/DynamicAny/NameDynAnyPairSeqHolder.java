package org.omg.DynamicAny;

/**
 * Generated from IDL alias "NameDynAnyPairSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NameDynAnyPairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.NameDynAnyPair[] value;

	public NameDynAnyPairSeqHolder ()
	{
	}
	public NameDynAnyPairSeqHolder (final org.omg.DynamicAny.NameDynAnyPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NameDynAnyPairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NameDynAnyPairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NameDynAnyPairSeqHelper.write (out,value);
	}
}
