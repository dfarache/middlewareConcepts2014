package org.omg.dds;


/**
 * Generated from IDL interface "Publisher".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class PublisherHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PublisherHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/Publisher:1.0", "Publisher");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.Publisher s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.Publisher extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/dds/Publisher:1.0";
	}
	public static Publisher read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._PublisherStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.Publisher s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.Publisher narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.Publisher)
		{
			return (org.omg.dds.Publisher)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/Publisher:1.0"))
		{
			org.omg.dds._PublisherStub stub;
			stub = new org.omg.dds._PublisherStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.Publisher unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.Publisher)
		{
			return (org.omg.dds.Publisher)obj;
		}
		else
		{
			org.omg.dds._PublisherStub stub;
			stub = new org.omg.dds._PublisherStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
