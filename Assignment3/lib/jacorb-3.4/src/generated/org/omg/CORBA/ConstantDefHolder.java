package org.omg.CORBA;

/**
 * Generated from IDL interface "ConstantDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConstantDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ConstantDef value;
	public ConstantDefHolder()
	{
	}
	public ConstantDefHolder (final ConstantDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConstantDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConstantDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConstantDefHelper.write (_out,value);
	}
}
