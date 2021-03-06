package org.omg.CosCollection;


/**
 * Generated from IDL interface "Iterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class IteratorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.IteratorOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "replace_element", Integer.valueOf(0));
		m_opsHash.put ( "assign", Integer.valueOf(1));
		m_opsHash.put ( "remove_next_n_elements", Integer.valueOf(2));
		m_opsHash.put ( "remove_element_set_to_next", Integer.valueOf(3));
		m_opsHash.put ( "retrieve_next_n_elements", Integer.valueOf(4));
		m_opsHash.put ( "replace_next_n_elements", Integer.valueOf(5));
		m_opsHash.put ( "is_equal", Integer.valueOf(6));
		m_opsHash.put ( "clone", Integer.valueOf(7));
		m_opsHash.put ( "retrieve_element_set_to_next", Integer.valueOf(8));
		m_opsHash.put ( "set_to_first_element", Integer.valueOf(9));
		m_opsHash.put ( "is_in_between", Integer.valueOf(10));
		m_opsHash.put ( "set_to_next_nth_element", Integer.valueOf(11));
		m_opsHash.put ( "not_equal_remove_element_set_to_next", Integer.valueOf(12));
		m_opsHash.put ( "replace_element_set_to_next", Integer.valueOf(13));
		m_opsHash.put ( "invalidate", Integer.valueOf(14));
		m_opsHash.put ( "not_equal_replace_element_set_to_next", Integer.valueOf(15));
		m_opsHash.put ( "set_to_next_element", Integer.valueOf(16));
		m_opsHash.put ( "is_for", Integer.valueOf(17));
		m_opsHash.put ( "remove_element", Integer.valueOf(18));
		m_opsHash.put ( "add_element_set_iterator", Integer.valueOf(19));
		m_opsHash.put ( "is_valid", Integer.valueOf(20));
		m_opsHash.put ( "is_const", Integer.valueOf(21));
		m_opsHash.put ( "retrieve_element", Integer.valueOf(22));
		m_opsHash.put ( "add_n_elements_set_iterator", Integer.valueOf(23));
		m_opsHash.put ( "not_equal_retrieve_element_set_to_next", Integer.valueOf(24));
		m_opsHash.put ( "destroy", Integer.valueOf(25));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/Iterator:1.0"};
	public org.omg.CosCollection.Iterator _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.Iterator __r = org.omg.CosCollection.IteratorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.Iterator _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.Iterator __r = org.omg.CosCollection.IteratorHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // replace_element
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				replace_element(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 1: // assign
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				assign(_arg0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // remove_next_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(remove_next_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 3: // remove_element_set_to_next
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(remove_element_set_to_next());
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 4: // retrieve_next_n_elements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.CosCollection.AnySequenceHolder _arg1= new org.omg.CosCollection.AnySequenceHolder();
				org.omg.CORBA.BooleanHolder _arg2= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_next_n_elements(_arg0,_arg1,_arg2));
				org.omg.CosCollection.AnySequenceHelper.write(_out,_arg1.value);
				_out.write_boolean(_arg2.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 5: // replace_next_n_elements
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(replace_next_n_elements(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 6: // is_equal
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_equal(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // clone
			{
				_out = handler.createReply();
				org.omg.CosCollection.IteratorHelper.write(_out,_clone());
				break;
			}
			case 8: // retrieve_element_set_to_next
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				org.omg.CORBA.BooleanHolder _arg1= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element_set_to_next(_arg0,_arg1));
				_out.write_any(_arg0.value);
				_out.write_boolean(_arg1.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 9: // set_to_first_element
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_first_element());
				break;
			}
			case 10: // is_in_between
			{
				_out = handler.createReply();
				_out.write_boolean(is_in_between());
				break;
			}
			case 11: // set_to_next_nth_element
			{
			try
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				_out.write_boolean(set_to_next_nth_element(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // not_equal_remove_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(not_equal_remove_element_set_to_next(_arg0));
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 13: // replace_element_set_to_next
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(replace_element_set_to_next(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 14: // invalidate
			{
				_out = handler.createReply();
				invalidate();
				break;
			}
			case 15: // not_equal_replace_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(not_equal_replace_element_set_to_next(_arg0,_arg1));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex1);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex2);
			}
				break;
			}
			case 16: // set_to_next_element
			{
			try
			{
				_out = handler.createReply();
				_out.write_boolean(set_to_next_element());
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // is_for
			{
				org.omg.CosCollection.Collection _arg0=org.omg.CosCollection.CollectionHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(is_for(_arg0));
				break;
			}
			case 18: // remove_element
			{
			try
			{
				_out = handler.createReply();
				remove_element();
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 19: // add_element_set_iterator
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(add_element_set_iterator(_arg0));
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // is_valid
			{
				_out = handler.createReply();
				_out.write_boolean(is_valid());
				break;
			}
			case 21: // is_const
			{
				_out = handler.createReply();
				_out.write_boolean(is_const());
				break;
			}
			case 22: // retrieve_element
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(retrieve_element(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 23: // add_n_elements_set_iterator
			{
			try
			{
				org.omg.CORBA.Any[] _arg0=org.omg.CosCollection.AnySequenceHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				_out.write_boolean(add_n_elements_set_iterator(_arg0,_arg1));
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // not_equal_retrieve_element_set_to_next
			{
			try
			{
				org.omg.CosCollection.Iterator _arg0=org.omg.CosCollection.IteratorHelper.read(_input);
				org.omg.CORBA.AnyHolder _arg1= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(not_equal_retrieve_element_set_to_next(_arg0,_arg1));
				_out.write_any(_arg1.value);
			}
			catch(org.omg.CosCollection.IteratorInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInvalidHelper.write(_out, _ex0);
			}
			catch(org.omg.CosCollection.IteratorInBetween _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.IteratorInBetweenHelper.write(_out, _ex1);
			}
				break;
			}
			case 25: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
