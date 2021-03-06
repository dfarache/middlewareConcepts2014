package org.omg.CORBA;


/**
 * Generated from IDL interface "OperationDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class OperationDefHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(OperationDefHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/OperationDef:1.0", "OperationDef");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.OperationDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.OperationDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/OperationDef:1.0";
	}
	public static OperationDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._OperationDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.OperationDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.OperationDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.OperationDef)
		{
			return (org.omg.CORBA.OperationDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/OperationDef:1.0"))
		{
			org.omg.CORBA._OperationDefStub stub;
			stub = new org.omg.CORBA._OperationDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.OperationDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.OperationDef)
		{
			return (org.omg.CORBA.OperationDef)obj;
		}
		else
		{
			org.omg.CORBA._OperationDefStub stub;
			stub = new org.omg.CORBA._OperationDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
