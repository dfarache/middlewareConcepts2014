package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "ObjectNotActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectNotActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POAPackage.ObjectNotActive value;

	public ObjectNotActiveHolder ()
	{
	}
	public ObjectNotActiveHolder(final org.omg.PortableServer.POAPackage.ObjectNotActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableServer.POAPackage.ObjectNotActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableServer.POAPackage.ObjectNotActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableServer.POAPackage.ObjectNotActiveHelper.write(_out, value);
	}
}
