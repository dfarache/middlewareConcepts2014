package org.omg.GIOP;

/**
 * Generated from IDL struct "ReplyHeader_1_2".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReplyHeader_1_2
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ReplyHeader_1_2(){}
	public int request_id;
	public org.omg.GIOP.ReplyStatusType_1_2 reply_status;
	public org.omg.IOP.ServiceContext[] service_context;
	public ReplyHeader_1_2(int request_id, org.omg.GIOP.ReplyStatusType_1_2 reply_status, org.omg.IOP.ServiceContext[] service_context)
	{
		this.request_id = request_id;
		this.reply_status = reply_status;
		this.service_context = service_context;
	}
}
