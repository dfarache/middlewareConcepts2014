package org.omg.Security;
/**
 * Generated from IDL enum "SecurityContextType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecurityContextTypeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SecurityContextType value;

	public SecurityContextTypeHolder ()
	{
	}
	public SecurityContextTypeHolder (final SecurityContextType initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SecurityContextTypeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecurityContextTypeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SecurityContextTypeHelper.write (out,value);
	}
}
