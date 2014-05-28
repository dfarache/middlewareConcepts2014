package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "SequencePushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SequencePushConsumerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosNotifyComm.SequencePushConsumerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "push_structured_events", Integer.valueOf(0));
		m_opsHash.put ( "disconnect_sequence_push_consumer", Integer.valueOf(1));
		m_opsHash.put ( "offer_change", Integer.valueOf(2));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0","IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};
	public org.omg.CosNotifyComm.SequencePushConsumer _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosNotifyComm.SequencePushConsumer __r = org.omg.CosNotifyComm.SequencePushConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosNotifyComm.SequencePushConsumer _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosNotifyComm.SequencePushConsumer __r = org.omg.CosNotifyComm.SequencePushConsumerHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // push_structured_events
			{
			try
			{
				org.omg.CosNotification.StructuredEvent[] _arg0=org.omg.CosNotification.EventBatchHelper.read(_input);
				_out = handler.createReply();
				push_structured_events(_arg0);
			}
			catch(org.omg.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // disconnect_sequence_push_consumer
			{
				_out = handler.createReply();
				disconnect_sequence_push_consumer();
				break;
			}
			case 2: // offer_change
			{
			try
			{
				org.omg.CosNotification.EventType[] _arg0=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.CosNotification.EventType[] _arg1=org.omg.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				offer_change(_arg0,_arg1);
			}
			catch(org.omg.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
