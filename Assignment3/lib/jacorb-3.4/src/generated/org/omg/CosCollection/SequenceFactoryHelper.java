package org.omg.CosCollection;


/**
 * Generated from IDL interface "SequenceFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SequenceFactoryHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SequenceFactoryHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosCollection/SequenceFactory:1.0", "SequenceFactory");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosCollection.SequenceFactory s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosCollection.SequenceFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosCollection/SequenceFactory:1.0";
	}
	public static SequenceFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosCollection._SequenceFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosCollection.SequenceFactory s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosCollection.SequenceFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SequenceFactory)
		{
			return (org.omg.CosCollection.SequenceFactory)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosCollection/SequenceFactory:1.0"))
		{
			org.omg.CosCollection._SequenceFactoryStub stub;
			stub = new org.omg.CosCollection._SequenceFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosCollection.SequenceFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosCollection.SequenceFactory)
		{
			return (org.omg.CosCollection.SequenceFactory)obj;
		}
		else
		{
			org.omg.CosCollection._SequenceFactoryStub stub;
			stub = new org.omg.CosCollection._SequenceFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
