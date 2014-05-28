package org.omg.CORBA;


/**
 * Generated from IDL interface "AliasDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class AliasDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.AliasDefOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_def_kind", Integer.valueOf(0));
		m_opsHash.put ( "_get_type", Integer.valueOf(1));
		m_opsHash.put ( "_get_absolute_name", Integer.valueOf(2));
		m_opsHash.put ( "_set_id", Integer.valueOf(3));
		m_opsHash.put ( "_get_name", Integer.valueOf(4));
		m_opsHash.put ( "_get_version", Integer.valueOf(5));
		m_opsHash.put ( "_get_original_type_def", Integer.valueOf(6));
		m_opsHash.put ( "describe", Integer.valueOf(7));
		m_opsHash.put ( "_set_version", Integer.valueOf(8));
		m_opsHash.put ( "_set_original_type_def", Integer.valueOf(9));
		m_opsHash.put ( "_get_id", Integer.valueOf(10));
		m_opsHash.put ( "_get_containing_repository", Integer.valueOf(11));
		m_opsHash.put ( "destroy", Integer.valueOf(12));
		m_opsHash.put ( "_get_defined_in", Integer.valueOf(13));
		m_opsHash.put ( "move", Integer.valueOf(14));
		m_opsHash.put ( "_set_name", Integer.valueOf(15));
	}
	private String[] ids = {"IDL:omg.org/CORBA/AliasDef:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/TypedefDef:1.0","IDL:omg.org/CORBA/IRObject:1.0"};
	public org.omg.CORBA.AliasDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.AliasDef __r = org.omg.CORBA.AliasDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.AliasDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.AliasDef __r = org.omg.CORBA.AliasDefHelper.narrow(__o);
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
			case 0: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 1: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 2: // _get_absolute_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult314 = absolute_name();
_out.write_string( tmpResult314 );
				break;
			}
			case 3: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
				break;
			}
			case 4: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult315 = name();
_out.write_string( tmpResult315 );
				break;
			}
			case 5: // _get_version
			{
			_out = handler.createReply();
			java.lang.String tmpResult316 = version();
_out.write_string( tmpResult316 );
				break;
			}
			case 6: // _get_original_type_def
			{
			_out = handler.createReply();
			org.omg.CORBA.IDLTypeHelper.write(_out,original_type_def());
				break;
			}
			case 7: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 8: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 9: // _set_original_type_def
			{
			_out = handler.createReply();
			original_type_def(org.omg.CORBA.IDLTypeHelper.read(_input));
				break;
			}
			case 10: // _get_id
			{
			_out = handler.createReply();
			java.lang.String tmpResult317 = id();
_out.write_string( tmpResult317 );
				break;
			}
			case 11: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 12: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 13: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 14: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 15: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
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
