package org.omg.PortableGroup;

/**
 * Generated from IDL struct "FactoryInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FactoryInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.FactoryInfo value;

	public FactoryInfoHolder ()
	{
	}
	public FactoryInfoHolder(final org.omg.PortableGroup.FactoryInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.FactoryInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.FactoryInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.FactoryInfoHelper.write(_out, value);
	}
}
