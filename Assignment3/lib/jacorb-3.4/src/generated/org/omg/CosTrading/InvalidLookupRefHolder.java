package org.omg.CosTrading;

/**
 * Generated from IDL exception "InvalidLookupRef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidLookupRefHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.InvalidLookupRef value;

	public InvalidLookupRefHolder ()
	{
	}
	public InvalidLookupRefHolder(final org.omg.CosTrading.InvalidLookupRef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.InvalidLookupRefHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.InvalidLookupRefHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.InvalidLookupRefHelper.write(_out, value);
	}
}
