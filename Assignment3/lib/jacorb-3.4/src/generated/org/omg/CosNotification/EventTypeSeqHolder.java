package org.omg.CosNotification;

/**
 * Generated from IDL alias "EventTypeSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EventTypeSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.EventType[] value;

	public EventTypeSeqHolder ()
	{
	}
	public EventTypeSeqHolder (final org.omg.CosNotification.EventType[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventTypeSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventTypeSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventTypeSeqHelper.write (out,value);
	}
}
