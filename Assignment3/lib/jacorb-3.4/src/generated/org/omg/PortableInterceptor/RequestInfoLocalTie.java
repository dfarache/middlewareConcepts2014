package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "RequestInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RequestInfoLocalTie
	extends _RequestInfoLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private RequestInfoOperations _delegate;

	public RequestInfoLocalTie(RequestInfoOperations delegate)
	{
		_delegate = delegate;
	}
	public RequestInfoOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RequestInfoOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.IOP.ServiceContext get_request_service_context(int id)
	{
		return _delegate.get_request_service_context(id);
	}

	public org.omg.IOP.ServiceContext get_reply_service_context(int id)
	{
		return _delegate.get_reply_service_context(id);
	}

	public org.omg.CORBA.Object forward_reference()
	{
		return _delegate.forward_reference();
	}

	public java.lang.String[] operation_context()
	{
		return _delegate.operation_context();
	}

	public org.omg.CORBA.TypeCode[] exceptions()
	{
		return _delegate.exceptions();
	}

	public short sync_scope()
	{
		return _delegate.sync_scope();
	}

	public short reply_status()
	{
		return _delegate.reply_status();
	}

	public boolean response_expected()
	{
		return _delegate.response_expected();
	}

	public java.lang.String[] contexts()
	{
		return _delegate.contexts();
	}

	public java.lang.String operation()
	{
		return _delegate.operation();
	}

	public org.omg.Dynamic.Parameter[] arguments()
	{
		return _delegate.arguments();
	}

	public org.omg.CORBA.Any result()
	{
		return _delegate.result();
	}

	public org.omg.CORBA.Any get_slot(int id) throws org.omg.PortableInterceptor.InvalidSlot
	{
		return _delegate.get_slot(id);
	}

	public int request_id()
	{
		return _delegate.request_id();
	}

}
