package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "ServantNotActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServantNotActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POAPackage.ServantNotActive value;

	public ServantNotActiveHolder ()
	{
	}
	public ServantNotActiveHolder(final org.omg.PortableServer.POAPackage.ServantNotActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableServer.POAPackage.ServantNotActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableServer.POAPackage.ServantNotActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableServer.POAPackage.ServantNotActiveHelper.write(_out, value);
	}
}
