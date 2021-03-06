package org.omg.Messaging;


/**
 * Abstract base class for implementations of local interface RebindPolicy
 * @author JacORB IDL compiler.
 */

public abstract class _RebindPolicyLocalBase
	extends org.omg.CORBA.LocalObject
	implements RebindPolicy
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] _type_ids = {"IDL:omg.org/Messaging/RebindPolicy:1.0","IDL:omg.org/CORBA/Policy:1.0"};
	public String[] _ids()	{
		return(String[])_type_ids.clone();
	}
}
