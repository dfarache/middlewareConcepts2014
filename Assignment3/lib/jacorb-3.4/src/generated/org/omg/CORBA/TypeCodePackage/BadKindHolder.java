package org.omg.CORBA.TypeCodePackage;

/**
 * Generated from IDL exception "BadKind".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BadKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.TypeCodePackage.BadKind value;

	public BadKindHolder ()
	{
	}
	public BadKindHolder(final org.omg.CORBA.TypeCodePackage.BadKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.TypeCodePackage.BadKindHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.TypeCodePackage.BadKindHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.TypeCodePackage.BadKindHelper.write(_out, value);
	}
}
