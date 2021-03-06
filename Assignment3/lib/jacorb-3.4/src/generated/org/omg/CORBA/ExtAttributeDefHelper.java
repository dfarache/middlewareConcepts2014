package org.omg.CORBA;


/**
 * Generated from IDL interface "ExtAttributeDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ExtAttributeDefHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ExtAttributeDefHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/ExtAttributeDef:1.0", "ExtAttributeDef");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ExtAttributeDef s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CORBA.ExtAttributeDef extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CORBA/ExtAttributeDef:1.0";
	}
	public static ExtAttributeDef read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CORBA._ExtAttributeDefStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CORBA.ExtAttributeDef s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CORBA.ExtAttributeDef narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ExtAttributeDef)
		{
			return (org.omg.CORBA.ExtAttributeDef)obj;
		}
		else if (obj._is_a("IDL:omg.org/CORBA/ExtAttributeDef:1.0"))
		{
			org.omg.CORBA._ExtAttributeDefStub stub;
			stub = new org.omg.CORBA._ExtAttributeDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CORBA.ExtAttributeDef unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CORBA.ExtAttributeDef)
		{
			return (org.omg.CORBA.ExtAttributeDef)obj;
		}
		else
		{
			org.omg.CORBA._ExtAttributeDefStub stub;
			stub = new org.omg.CORBA._ExtAttributeDefStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
