package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtLocalInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ExtLocalInterfaceDefSeqHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.ExtLocalInterfaceDef[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.ExtLocalInterfaceDef[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ExtLocalInterfaceDefSeqHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ExtLocalInterfaceDefSeqHelper.id(), "ExtLocalInterfaceDefSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/ExtLocalInterfaceDef:1.0", "ExtLocalInterfaceDef")));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ExtLocalInterfaceDefSeq:1.0";
	}
	public static org.omg.CORBA.ExtLocalInterfaceDef[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.ExtLocalInterfaceDef[] _result;
		int _l_result11 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result11 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result11);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.ExtLocalInterfaceDef[_l_result11];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.ExtLocalInterfaceDefHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.ExtLocalInterfaceDef[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.ExtLocalInterfaceDefHelper.write(_out,_s[i]);
		}

	}
}
