package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "SequencePushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SequencePushConsumerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SequencePushConsumerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0", "SequencePushConsumer");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyComm.SequencePushConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosNotifyComm.SequencePushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0";
	}
	public static SequencePushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosNotifyComm._SequencePushConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosNotifyComm.SequencePushConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosNotifyComm.SequencePushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.SequencePushConsumer)
		{
			return (org.omg.CosNotifyComm.SequencePushConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0"))
		{
			org.omg.CosNotifyComm._SequencePushConsumerStub stub;
			stub = new org.omg.CosNotifyComm._SequencePushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosNotifyComm.SequencePushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosNotifyComm.SequencePushConsumer)
		{
			return (org.omg.CosNotifyComm.SequencePushConsumer)obj;
		}
		else
		{
			org.omg.CosNotifyComm._SequencePushConsumerStub stub;
			stub = new org.omg.CosNotifyComm._SequencePushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
