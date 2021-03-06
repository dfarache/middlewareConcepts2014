package org.omg.RTCORBA;

/**
 * Generated from IDL alias "ThreadpoolLanes".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ThreadpoolLanesHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.RTCORBA.ThreadpoolLane[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.RTCORBA.ThreadpoolLane[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ThreadpoolLanesHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.RTCORBA.ThreadpoolLanesHelper.id(), "ThreadpoolLanes",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.RTCORBA.ThreadpoolLaneHelper.id(),"ThreadpoolLane",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("lane_priority", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.RTCORBA.PriorityHelper.id(), "Priority",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("static_threads", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("dynamic_threads", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/RTCORBA/ThreadpoolLanes:1.0";
	}
	public static org.omg.RTCORBA.ThreadpoolLane[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.RTCORBA.ThreadpoolLane[] _result;
		int _l_result59 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result59 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result59);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.RTCORBA.ThreadpoolLane[_l_result59];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.RTCORBA.ThreadpoolLaneHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.RTCORBA.ThreadpoolLane[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.RTCORBA.ThreadpoolLaneHelper.write(_out,_s[i]);
		}

	}
}
