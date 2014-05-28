package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "SupplierAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SupplierAdminHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SupplierAdminHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0", "SupplierAdmin");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventChannelAdmin.SupplierAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.SupplierAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0";
	}
	public static SupplierAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosEventChannelAdmin._SupplierAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosEventChannelAdmin.SupplierAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosEventChannelAdmin.SupplierAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.SupplierAdmin)
		{
			return (org.omg.CosEventChannelAdmin.SupplierAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0"))
		{
			org.omg.CosEventChannelAdmin._SupplierAdminStub stub;
			stub = new org.omg.CosEventChannelAdmin._SupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosEventChannelAdmin.SupplierAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosEventChannelAdmin.SupplierAdmin)
		{
			return (org.omg.CosEventChannelAdmin.SupplierAdmin)obj;
		}
		else
		{
			org.omg.CosEventChannelAdmin._SupplierAdminStub stub;
			stub = new org.omg.CosEventChannelAdmin._SupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
