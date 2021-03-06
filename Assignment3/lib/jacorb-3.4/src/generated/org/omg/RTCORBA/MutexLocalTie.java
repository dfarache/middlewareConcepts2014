package org.omg.RTCORBA;


/**
 * Generated from IDL interface "Mutex".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class MutexLocalTie
	extends _MutexLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private MutexOperations _delegate;

	public MutexLocalTie(MutexOperations delegate)
	{
		_delegate = delegate;
	}
	public MutexOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MutexOperations delegate)
	{
		_delegate = delegate;
	}
	public void lock()
	{
_delegate.lock();
	}

	public void unlock()
	{
_delegate.unlock();
	}

	public boolean try_lock(long max_wait)
	{
		return _delegate.try_lock(max_wait);
	}

}
