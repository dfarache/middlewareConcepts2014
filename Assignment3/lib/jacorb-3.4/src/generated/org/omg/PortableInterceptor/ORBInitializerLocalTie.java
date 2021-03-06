package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ORBInitializer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ORBInitializerLocalTie
	extends _ORBInitializerLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ORBInitializerOperations _delegate;

	public ORBInitializerLocalTie(ORBInitializerOperations delegate)
	{
		_delegate = delegate;
	}
	public ORBInitializerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ORBInitializerOperations delegate)
	{
		_delegate = delegate;
	}
	public void post_init(org.omg.PortableInterceptor.ORBInitInfo info)
	{
_delegate.post_init(info);
	}

	public void pre_init(org.omg.PortableInterceptor.ORBInitInfo info)
	{
_delegate.pre_init(info);
	}

}
