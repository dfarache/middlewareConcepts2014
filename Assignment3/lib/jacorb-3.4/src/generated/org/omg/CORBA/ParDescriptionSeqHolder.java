package org.omg.CORBA;

/**
 * Generated from IDL alias "ParDescriptionSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParDescriptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ParameterDescription[] value;

	public ParDescriptionSeqHolder ()
	{
	}
	public ParDescriptionSeqHolder (final org.omg.CORBA.ParameterDescription[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ParDescriptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ParDescriptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ParDescriptionSeqHelper.write (out,value);
	}
}
