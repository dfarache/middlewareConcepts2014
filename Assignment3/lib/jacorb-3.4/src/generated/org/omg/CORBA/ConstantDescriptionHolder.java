package org.omg.CORBA;

/**
 * Generated from IDL struct "ConstantDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConstantDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ConstantDescription value;

	public ConstantDescriptionHolder ()
	{
	}
	public ConstantDescriptionHolder(final org.omg.CORBA.ConstantDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ConstantDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ConstantDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ConstantDescriptionHelper.write(_out, value);
	}
}
