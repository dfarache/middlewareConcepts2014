package org.omg.CosTransactions;

/**
 * Generated from IDL exception "NotSubtransaction".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotSubtransactionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.NotSubtransaction value;

	public NotSubtransactionHolder ()
	{
	}
	public NotSubtransactionHolder(final org.omg.CosTransactions.NotSubtransaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.NotSubtransactionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.NotSubtransactionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.NotSubtransactionHelper.write(_out, value);
	}
}
