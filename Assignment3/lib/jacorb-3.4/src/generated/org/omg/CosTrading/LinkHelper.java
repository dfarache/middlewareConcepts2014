package org.omg.CosTrading;


/**
 * Generated from IDL interface "Link".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class LinkHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(LinkHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTrading/Link:1.0", "Link");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.Link s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTrading.Link extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTrading/Link:1.0";
	}
	public static Link read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTrading._LinkStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTrading.Link s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTrading.Link narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTrading.Link)
		{
			return (org.omg.CosTrading.Link)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTrading/Link:1.0"))
		{
			org.omg.CosTrading._LinkStub stub;
			stub = new org.omg.CosTrading._LinkStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTrading.Link unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTrading.Link)
		{
			return (org.omg.CosTrading.Link)obj;
		}
		else
		{
			org.omg.CosTrading._LinkStub stub;
			stub = new org.omg.CosTrading._LinkStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
