package org.omg.CosCollection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "KeySortedSetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class KeySortedSetFactoryPOATie
	extends KeySortedSetFactoryPOA
{
	private KeySortedSetFactoryOperations _delegate;

	private POA _poa;
	public KeySortedSetFactoryPOATie(KeySortedSetFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public KeySortedSetFactoryPOATie(KeySortedSetFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosCollection.KeySortedSetFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.KeySortedSetFactory __r = org.omg.CosCollection.KeySortedSetFactoryHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.KeySortedSetFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.KeySortedSetFactory __r = org.omg.CosCollection.KeySortedSetFactoryHelper.narrow(__o);
		return __r;
	}
	public KeySortedSetFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(KeySortedSetFactoryOperations delegate)
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
	public org.omg.CosCollection.KeySortedSet create(org.omg.CosCollection.Operations ops, int expected_size)
	{
		return _delegate.create(ops,expected_size);
	}

}
