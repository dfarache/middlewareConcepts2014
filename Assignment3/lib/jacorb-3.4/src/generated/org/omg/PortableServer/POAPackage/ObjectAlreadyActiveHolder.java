package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "ObjectAlreadyActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectAlreadyActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POAPackage.ObjectAlreadyActive value;

	public ObjectAlreadyActiveHolder ()
	{
	}
	public ObjectAlreadyActiveHolder(final org.omg.PortableServer.POAPackage.ObjectAlreadyActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper.write(_out, value);
	}
}
