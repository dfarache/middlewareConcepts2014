package org.omg.PortableGroup;

/**
 * Generated from IDL exception "UnsupportedProperty".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnsupportedPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.UnsupportedProperty value;

	public UnsupportedPropertyHolder ()
	{
	}
	public UnsupportedPropertyHolder(final org.omg.PortableGroup.UnsupportedProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.UnsupportedPropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.UnsupportedPropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.UnsupportedPropertyHelper.write(_out, value);
	}
}
