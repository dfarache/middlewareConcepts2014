package org.omg.Dynamic;

/**
 * Generated from IDL alias "ExceptionList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ExceptionListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.TypeCode[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.TypeCode[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ExceptionListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Dynamic.ExceptionListHelper.id(), "ExceptionList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode)));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Dynamic/ExceptionList:1.0";
	}
	public static org.omg.CORBA.TypeCode[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.TypeCode[] _result;
		int _l_result64 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result64 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result64);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.TypeCode[_l_result64];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=_in.read_TypeCode();
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.TypeCode[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			_out.write_TypeCode(_s[i]);
		}

	}
}
