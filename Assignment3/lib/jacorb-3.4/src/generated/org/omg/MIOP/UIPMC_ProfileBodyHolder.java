package org.omg.MIOP;

/**
 * Generated from IDL struct "UIPMC_ProfileBody".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UIPMC_ProfileBodyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.MIOP.UIPMC_ProfileBody value;

	public UIPMC_ProfileBodyHolder ()
	{
	}
	public UIPMC_ProfileBodyHolder(final org.omg.MIOP.UIPMC_ProfileBody initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.MIOP.UIPMC_ProfileBodyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.MIOP.UIPMC_ProfileBodyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.MIOP.UIPMC_ProfileBodyHelper.write(_out, value);
	}
}
