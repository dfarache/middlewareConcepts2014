package org.omg.CORBA;

/**
 * Generated from IDL struct "ExtAttributeDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtAttributeDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtAttributeDescription value;

	public ExtAttributeDescriptionHolder ()
	{
	}
	public ExtAttributeDescriptionHolder(final org.omg.CORBA.ExtAttributeDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ExtAttributeDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ExtAttributeDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ExtAttributeDescriptionHelper.write(_out, value);
	}
}
