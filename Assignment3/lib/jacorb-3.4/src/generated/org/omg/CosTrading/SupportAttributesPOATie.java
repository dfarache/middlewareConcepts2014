package org.omg.CosTrading;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SupportAttributes".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SupportAttributesPOATie
	extends SupportAttributesPOA
{
	private SupportAttributesOperations _delegate;

	private POA _poa;
	public SupportAttributesPOATie(SupportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public SupportAttributesPOATie(SupportAttributesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.SupportAttributes _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTrading.SupportAttributes __r = org.omg.CosTrading.SupportAttributesHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTrading.SupportAttributes _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTrading.SupportAttributes __r = org.omg.CosTrading.SupportAttributesHelper.narrow(__o);
		return __r;
	}
	public SupportAttributesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SupportAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public boolean supports_proxy_offers()
	{
		return _delegate.supports_proxy_offers();
	}

	public org.omg.CORBA.Object type_repos()
	{
		return _delegate.type_repos();
	}

	public boolean supports_dynamic_properties()
	{
		return _delegate.supports_dynamic_properties();
	}

	public boolean supports_modifiable_properties()
	{
		return _delegate.supports_modifiable_properties();
	}

}
