package org.omg.CosTrading;


/**
 * Generated from IDL interface "Proxy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ProxyHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProxyHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/Proxy:1.0", "Proxy");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Proxy s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTrading.Proxy extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Proxy:1.0";
	}
	public static Proxy read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTrading._ProxyStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.Proxy s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.Proxy narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTrading.Proxy)
		{
			return (org.omg.CosTrading.Proxy)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTrading/Proxy:1.0"))
		{
			org.omg.CosTrading._ProxyStub stub;
			stub = new org.omg.CosTrading._ProxyStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTrading.Proxy unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTrading.Proxy)
		{
			return (org.omg.CosTrading.Proxy)obj;
		}
		else
		{
			org.omg.CosTrading._ProxyStub stub;
			stub = new org.omg.CosTrading._ProxyStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
