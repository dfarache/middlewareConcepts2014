package org.omg.GIOP;

/**
 * Generated from IDL struct "MessageHeader_1_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MessageHeader_1_1
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MessageHeader_1_1(){}
	public char[] magic;
	public org.omg.GIOP.Version GIOP_version;
	public byte flags;
	public byte message_type;
	public int message_size;
	public MessageHeader_1_1(char[] magic, org.omg.GIOP.Version GIOP_version, byte flags, byte message_type, int message_size)
	{
		this.magic = magic;
		this.GIOP_version = GIOP_version;
		this.flags = flags;
		this.message_type = message_type;
		this.message_size = message_size;
	}
}
