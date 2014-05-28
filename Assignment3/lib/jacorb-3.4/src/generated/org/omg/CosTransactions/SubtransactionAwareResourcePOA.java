package org.omg.CosTransactions;


/**
 * Generated from IDL interface "SubtransactionAwareResource".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class SubtransactionAwareResourcePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTransactions.SubtransactionAwareResourceOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "rollback_subtransaction", Integer.valueOf(0));
		m_opsHash.put ( "rollback", Integer.valueOf(1));
		m_opsHash.put ( "commit_subtransaction", Integer.valueOf(2));
		m_opsHash.put ( "commit", Integer.valueOf(3));
		m_opsHash.put ( "prepare", Integer.valueOf(4));
		m_opsHash.put ( "commit_one_phase", Integer.valueOf(5));
		m_opsHash.put ( "forget", Integer.valueOf(6));
	}
	private String[] ids = {"IDL:omg.org/CosTransactions/SubtransactionAwareResource:1.0","IDL:omg.org/CosTransactions/Resource:1.0"};
	public org.omg.CosTransactions.SubtransactionAwareResource _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosTransactions.SubtransactionAwareResource __r = org.omg.CosTransactions.SubtransactionAwareResourceHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosTransactions.SubtransactionAwareResource _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosTransactions.SubtransactionAwareResource __r = org.omg.CosTransactions.SubtransactionAwareResourceHelper.narrow(__o);
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
			case 0: // rollback_subtransaction
			{
				_out = handler.createReply();
				rollback_subtransaction();
				break;
			}
			case 1: // rollback
			{
			try
			{
				_out = handler.createReply();
				rollback();
			}
			catch(org.omg.CosTransactions.HeuristicHazard _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicHazardHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.HeuristicMixed _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicMixedHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTransactions.HeuristicCommit _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicCommitHelper.write(_out, _ex2);
			}
				break;
			}
			case 2: // commit_subtransaction
			{
				org.omg.CosTransactions.Coordinator _arg0=org.omg.CosTransactions.CoordinatorHelper.read(_input);
				_out = handler.createReply();
				commit_subtransaction(_arg0);
				break;
			}
			case 3: // commit
			{
			try
			{
				_out = handler.createReply();
				commit();
			}
			catch(org.omg.CosTransactions.NotPrepared _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.NotPreparedHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.HeuristicHazard _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicHazardHelper.write(_out, _ex1);
			}
			catch(org.omg.CosTransactions.HeuristicMixed _ex2)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicMixedHelper.write(_out, _ex2);
			}
			catch(org.omg.CosTransactions.HeuristicRollback _ex3)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicRollbackHelper.write(_out, _ex3);
			}
				break;
			}
			case 4: // prepare
			{
			try
			{
				_out = handler.createReply();
				org.omg.CosTransactions.VoteHelper.write(_out,prepare());
			}
			catch(org.omg.CosTransactions.HeuristicHazard _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicHazardHelper.write(_out, _ex0);
			}
			catch(org.omg.CosTransactions.HeuristicMixed _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicMixedHelper.write(_out, _ex1);
			}
				break;
			}
			case 5: // commit_one_phase
			{
			try
			{
				_out = handler.createReply();
				commit_one_phase();
			}
			catch(org.omg.CosTransactions.HeuristicHazard _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTransactions.HeuristicHazardHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // forget
			{
				_out = handler.createReply();
				forget();
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
