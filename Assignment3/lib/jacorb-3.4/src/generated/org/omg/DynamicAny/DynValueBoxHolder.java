package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynValueBox".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynValueBoxHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynValueBox value;
	public DynValueBoxHolder()
	{
	}
	public DynValueBoxHolder (final DynValueBox initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynValueBoxHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynValueBoxHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynValueBoxHelper.write (_out,value);
	}
}
