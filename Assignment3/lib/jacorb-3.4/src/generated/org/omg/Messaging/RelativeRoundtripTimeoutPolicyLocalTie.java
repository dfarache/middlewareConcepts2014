package org.omg.Messaging;


/**
 * Generated from IDL interface "RelativeRoundtripTimeoutPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RelativeRoundtripTimeoutPolicyLocalTie
	extends _RelativeRoundtripTimeoutPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private RelativeRoundtripTimeoutPolicyOperations _delegate;

	public RelativeRoundtripTimeoutPolicyLocalTie(RelativeRoundtripTimeoutPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RelativeRoundtripTimeoutPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RelativeRoundtripTimeoutPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public long relative_expiry()
	{
		return _delegate.relative_expiry();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
