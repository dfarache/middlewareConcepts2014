package org.omg.CORBA.InterfaceAttrExtensionPackage;

/**
 * Generated from IDL struct "ExtFullInterfaceDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtFullInterfaceDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.InterfaceAttrExtensionPackage.ExtFullInterfaceDescription value;

	public ExtFullInterfaceDescriptionHolder ()
	{
	}
	public ExtFullInterfaceDescriptionHolder(final org.omg.CORBA.InterfaceAttrExtensionPackage.ExtFullInterfaceDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.InterfaceAttrExtensionPackage.ExtFullInterfaceDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.InterfaceAttrExtensionPackage.ExtFullInterfaceDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.InterfaceAttrExtensionPackage.ExtFullInterfaceDescriptionHelper.write(_out, value);
	}
}
