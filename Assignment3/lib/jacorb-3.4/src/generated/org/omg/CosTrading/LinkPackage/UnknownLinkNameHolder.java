package org.omg.CosTrading.LinkPackage;

/**
 * Generated from IDL exception "UnknownLinkName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownLinkNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.LinkPackage.UnknownLinkName value;

	public UnknownLinkNameHolder ()
	{
	}
	public UnknownLinkNameHolder(final org.omg.CosTrading.LinkPackage.UnknownLinkName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.write(_out, value);
	}
}
