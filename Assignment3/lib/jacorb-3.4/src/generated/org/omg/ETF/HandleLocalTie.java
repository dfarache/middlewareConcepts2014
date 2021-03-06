package org.omg.ETF;


/**
 * Generated from IDL interface "Handle".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class HandleLocalTie
	extends _HandleLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private HandleOperations _delegate;

	public HandleLocalTie(HandleOperations delegate)
	{
		_delegate = delegate;
	}
	public HandleOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HandleOperations delegate)
	{
		_delegate = delegate;
	}
	public void signal_data_available(org.omg.ETF.Connection conn)
	{
_delegate.signal_data_available(conn);
	}

	public void closed_by_peer(org.omg.ETF.Connection conn)
	{
_delegate.closed_by_peer(conn);
	}

	public boolean add_input(org.omg.ETF.Connection conn)
	{
		return _delegate.add_input(conn);
	}

}
