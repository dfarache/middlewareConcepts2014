package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "InvalidGrammar".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidGrammarHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.InvalidGrammar value;

	public InvalidGrammarHolder ()
	{
	}
	public InvalidGrammarHolder(final org.omg.CosNotifyFilter.InvalidGrammar initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.InvalidGrammarHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.InvalidGrammarHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.InvalidGrammarHelper.write(_out, value);
	}
}
