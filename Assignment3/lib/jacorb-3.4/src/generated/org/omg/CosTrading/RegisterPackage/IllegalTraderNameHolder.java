package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "IllegalTraderName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalTraderNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.IllegalTraderName value;

	public IllegalTraderNameHolder ()
	{
	}
	public IllegalTraderNameHolder(final org.omg.CosTrading.RegisterPackage.IllegalTraderName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.IllegalTraderNameHelper.write(_out, value);
	}
}
