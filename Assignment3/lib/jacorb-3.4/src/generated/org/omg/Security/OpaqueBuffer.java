package org.omg.Security;

/**
 * Generated from IDL struct "OpaqueBuffer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OpaqueBuffer
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OpaqueBuffer(){}
	public byte[] buffer;
	public int startpos;
	public int endpos;
	public OpaqueBuffer(byte[] buffer, int startpos, int endpos)
	{
		this.buffer = buffer;
		this.startpos = startpos;
		this.endpos = endpos;
	}
}
