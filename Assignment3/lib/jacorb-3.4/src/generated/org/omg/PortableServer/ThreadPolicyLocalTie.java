package org.omg.PortableServer;


/**
 * Generated from IDL interface "ThreadPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ThreadPolicyLocalTie
	extends _ThreadPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ThreadPolicyOperations _delegate;

	public ThreadPolicyLocalTie(ThreadPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ThreadPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ThreadPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.ThreadPolicyValue value()
	{
		return _delegate.value();
	}

	public int policy_type()
	{
		return _delegate.policy_type();
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
