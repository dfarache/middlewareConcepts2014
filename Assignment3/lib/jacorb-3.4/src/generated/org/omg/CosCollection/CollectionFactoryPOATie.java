package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CollectionFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class CollectionFactoryPOATie
	extends CollectionFactoryPOA
{
	private CollectionFactoryOperations _delegate;

	private POA _poa;
	public CollectionFactoryPOATie(CollectionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionFactoryPOATie(CollectionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.CollectionFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.CollectionFactory __r = org.omg.CosCollection.CollectionFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.CollectionFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.CollectionFactory __r = org.omg.CosCollection.CollectionFactoryHelper.narrow(__o);
		return __r;
	}
	public CollectionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionFactoryOperations delegate)
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
	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		return _delegate.generic_create(parameters);
	}

}
