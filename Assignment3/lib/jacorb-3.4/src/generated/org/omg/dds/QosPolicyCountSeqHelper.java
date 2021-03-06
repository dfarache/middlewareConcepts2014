package org.omg.dds;

/**
 * Generated from IDL alias "QosPolicyCountSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class QosPolicyCountSeqHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, org.omg.dds.QosPolicyCount[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.dds.QosPolicyCount[] extract (final org.omg.CORBA.Any any)
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
			synchronized(QosPolicyCountSeqHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.QosPolicyCountSeqHelper.id(), "QosPolicyCountSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.QosPolicyCountHelper.id(),"QosPolicyCount",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("policy_id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.dds.QosPolicyId_tHelper.id(), "QosPolicyId_t",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3))), null),new org.omg.CORBA.StructMember("count", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/dds/QosPolicyCountSeq:1.0";
	}
	public static org.omg.dds.QosPolicyCount[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.dds.QosPolicyCount[] _result;
		int _l_result98 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result98 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result98);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.dds.QosPolicyCount[_l_result98];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.dds.QosPolicyCountHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.dds.QosPolicyCount[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.dds.QosPolicyCountHelper.write(_out,_s[i]);
		}

	}
}
