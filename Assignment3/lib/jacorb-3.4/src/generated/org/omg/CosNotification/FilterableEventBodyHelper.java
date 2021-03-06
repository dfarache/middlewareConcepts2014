package org.omg.CosNotification;

/**
 * Generated from IDL alias "FilterableEventBody".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class FilterableEventBodyHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosNotification.Property[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosNotification.Property[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FilterableEventBodyHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.FilterableEventBodyHelper.id(), "FilterableEventBody",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.PropertySeqHelper.id(), "PropertySeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosNotification.PropertyHelper.id(),"Property",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.PropertyNameHelper.id(), "PropertyName",org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.IstringHelper.id(), "Istring",org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNotification.PropertyValueHelper.id(), "PropertyValue",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11))), null)}))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/FilterableEventBody:1.0";
	}
	public static org.omg.CosNotification.Property[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosNotification.Property[] _result;
		_result = org.omg.CosNotification.PropertySeqHelper.read(_in);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosNotification.Property[] _s)
	{
		org.omg.CosNotification.PropertySeqHelper.write(_out,_s);
	}
}
