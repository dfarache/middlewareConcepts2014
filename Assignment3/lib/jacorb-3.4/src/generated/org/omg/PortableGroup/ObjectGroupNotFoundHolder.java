package org.omg.PortableGroup;

/**
 * Generated from IDL exception "ObjectGroupNotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectGroupNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.ObjectGroupNotFound value;

	public ObjectGroupNotFoundHolder ()
	{
	}
	public ObjectGroupNotFoundHolder(final org.omg.PortableGroup.ObjectGroupNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.ObjectGroupNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.ObjectGroupNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.ObjectGroupNotFoundHelper.write(_out, value);
	}
}
