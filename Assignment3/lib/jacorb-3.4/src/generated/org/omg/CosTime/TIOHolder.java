package org.omg.CosTime;

/**
 * Generated from IDL interface "TIO".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TIOHolder	implements org.omg.CORBA.portable.Streamable{
	 public TIO value;
	public TIOHolder()
	{
	}
	public TIOHolder (final TIO initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TIOHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TIOHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TIOHelper.write (_out,value);
	}
}
