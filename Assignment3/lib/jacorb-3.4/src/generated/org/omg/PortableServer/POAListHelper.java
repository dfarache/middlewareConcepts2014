package org.omg.PortableServer;

/**
 * Generated from IDL alias "POAList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class POAListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.PortableServer.POA[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.PortableServer.POA[] extract (final org.omg.CORBA.Any any)
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
			synchronized(POAListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.PortableServer.POAListHelper.id(), "POAList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_local_interface_tc("IDL:omg.org/PortableServer/POA:1.0", "POA")));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/PortableServer/POAList:1.0";
	}
	public static org.omg.PortableServer.POA[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.PortableServer.POA[] _result;
		int _l_result47 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result47 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result47);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.PortableServer.POA[_l_result47];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.PortableServer.POAHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.PortableServer.POA[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.PortableServer.POAHelper.write(_out,_s[i]);
		}

	}
}
