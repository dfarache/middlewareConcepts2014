package org.omg.CORBA;


/**
 * Generated from IDL interface "LocalInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class LocalInterfaceDefPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CORBA.LocalInterfaceDefOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "create_value", Integer.valueOf(0));
		m_opsHash.put ( "_get_id", Integer.valueOf(1));
		m_opsHash.put ( "is_a", Integer.valueOf(2));
		m_opsHash.put ( "_get_absolute_name", Integer.valueOf(3));
		m_opsHash.put ( "create_struct", Integer.valueOf(4));
		m_opsHash.put ( "describe_contents", Integer.valueOf(5));
		m_opsHash.put ( "create_alias", Integer.valueOf(6));
		m_opsHash.put ( "create_enum", Integer.valueOf(7));
		m_opsHash.put ( "lookup", Integer.valueOf(8));
		m_opsHash.put ( "_set_version", Integer.valueOf(9));
		m_opsHash.put ( "create_ext_value", Integer.valueOf(10));
		m_opsHash.put ( "describe", Integer.valueOf(11));
		m_opsHash.put ( "_set_name", Integer.valueOf(12));
		m_opsHash.put ( "_get_defined_in", Integer.valueOf(13));
		m_opsHash.put ( "create_operation", Integer.valueOf(14));
		m_opsHash.put ( "_get_containing_repository", Integer.valueOf(15));
		m_opsHash.put ( "create_module", Integer.valueOf(16));
		m_opsHash.put ( "move", Integer.valueOf(17));
		m_opsHash.put ( "create_abstract_interface", Integer.valueOf(18));
		m_opsHash.put ( "_get_version", Integer.valueOf(19));
		m_opsHash.put ( "create_constant", Integer.valueOf(20));
		m_opsHash.put ( "destroy", Integer.valueOf(21));
		m_opsHash.put ( "lookup_name", Integer.valueOf(22));
		m_opsHash.put ( "_get_type", Integer.valueOf(23));
		m_opsHash.put ( "_set_id", Integer.valueOf(24));
		m_opsHash.put ( "contents", Integer.valueOf(25));
		m_opsHash.put ( "create_local_interface", Integer.valueOf(26));
		m_opsHash.put ( "_get_def_kind", Integer.valueOf(27));
		m_opsHash.put ( "_get_base_interfaces", Integer.valueOf(28));
		m_opsHash.put ( "_set_base_interfaces", Integer.valueOf(29));
		m_opsHash.put ( "create_value_box", Integer.valueOf(30));
		m_opsHash.put ( "describe_interface", Integer.valueOf(31));
		m_opsHash.put ( "create_attribute", Integer.valueOf(32));
		m_opsHash.put ( "create_union", Integer.valueOf(33));
		m_opsHash.put ( "create_exception", Integer.valueOf(34));
		m_opsHash.put ( "_get_name", Integer.valueOf(35));
		m_opsHash.put ( "create_interface", Integer.valueOf(36));
		m_opsHash.put ( "create_native", Integer.valueOf(37));
	}
	private String[] ids = {"IDL:omg.org/CORBA/LocalInterfaceDef:1.0","IDL:omg.org/CORBA/Container:1.0","IDL:omg.org/CORBA/Contained:1.0","IDL:omg.org/CORBA/IDLType:1.0","IDL:omg.org/CORBA/IRObject:1.0","IDL:omg.org/CORBA/InterfaceDef:1.0"};
	public org.omg.CORBA.LocalInterfaceDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.LocalInterfaceDef __r = org.omg.CORBA.LocalInterfaceDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.LocalInterfaceDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.LocalInterfaceDef __r = org.omg.CORBA.LocalInterfaceDefHelper.narrow(__o);
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
			case 0: // create_value
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				boolean _arg4=_input.read_boolean();
				org.omg.CORBA.ValueDef _arg5=org.omg.CORBA.ValueDefHelper.read(_input);
				boolean _arg6=_input.read_boolean();
				org.omg.CORBA.ValueDef[] _arg7=org.omg.CORBA.ValueDefSeqHelper.read(_input);
				org.omg.CORBA.InterfaceDef[] _arg8=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				org.omg.CORBA.Initializer[] _arg9=org.omg.CORBA.InitializerSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ValueDefHelper.write(_out,create_value(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9));
				break;
			}
			case 1: // _get_id
			{
			_out = handler.createReply();
			java.lang.String tmpResult906 = id();
_out.write_string( tmpResult906 );
				break;
			}
			case 2: // is_a
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(is_a(_arg0));
				break;
			}
			case 3: // _get_absolute_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult907 = absolute_name();
_out.write_string( tmpResult907 );
				break;
			}
			case 4: // create_struct
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.StructDefHelper.write(_out,create_struct(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 5: // describe_contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_long();
				_out = handler.createReply();
				org.omg.CORBA.ContainerPackage.DescriptionSeqHelper.write(_out,describe_contents(_arg0,_arg1,_arg2));
				break;
			}
			case 6: // create_alias
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AliasDefHelper.write(_out,create_alias(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 7: // create_enum
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String[] _arg3=org.omg.CORBA.EnumMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.EnumDefHelper.write(_out,create_enum(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 8: // lookup
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ContainedHelper.write(_out,lookup(_arg0));
				break;
			}
			case 9: // _set_version
			{
			_out = handler.createReply();
			version(_input.read_string());
				break;
			}
			case 10: // create_ext_value
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				boolean _arg4=_input.read_boolean();
				org.omg.CORBA.ValueDef _arg5=org.omg.CORBA.ValueDefHelper.read(_input);
				boolean _arg6=_input.read_boolean();
				org.omg.CORBA.ValueDef[] _arg7=org.omg.CORBA.ValueDefSeqHelper.read(_input);
				org.omg.CORBA.InterfaceDef[] _arg8=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				org.omg.CORBA.ExtInitializer[] _arg9=org.omg.CORBA.ExtInitializerSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ExtValueDefHelper.write(_out,create_ext_value(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9));
				break;
			}
			case 11: // describe
			{
				_out = handler.createReply();
				org.omg.CORBA.ContainedPackage.DescriptionHelper.write(_out,describe());
				break;
			}
			case 12: // _set_name
			{
			_out = handler.createReply();
			name(_input.read_string());
				break;
			}
			case 13: // _get_defined_in
			{
			_out = handler.createReply();
			org.omg.CORBA.ContainerHelper.write(_out,defined_in());
				break;
			}
			case 14: // create_operation
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.OperationMode _arg4=org.omg.CORBA.OperationModeHelper.read(_input);
				org.omg.CORBA.ParameterDescription[] _arg5=org.omg.CORBA.ParDescriptionSeqHelper.read(_input);
				org.omg.CORBA.ExceptionDef[] _arg6=org.omg.CORBA.ExceptionDefSeqHelper.read(_input);
				java.lang.String[] _arg7=org.omg.CORBA.ContextIdSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.OperationDefHelper.write(_out,create_operation(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7));
				break;
			}
			case 15: // _get_containing_repository
			{
			_out = handler.createReply();
			org.omg.CORBA.RepositoryHelper.write(_out,containing_repository());
				break;
			}
			case 16: // create_module
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.ModuleDefHelper.write(_out,create_module(_arg0,_arg1,_arg2));
				break;
			}
			case 17: // move
			{
				org.omg.CORBA.Container _arg0=org.omg.CORBA.ContainerHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				move(_arg0,_arg1,_arg2);
				break;
			}
			case 18: // create_abstract_interface
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.AbstractInterfaceDef[] _arg3=org.omg.CORBA.AbstractInterfaceDefSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AbstractInterfaceDefHelper.write(_out,create_abstract_interface(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 19: // _get_version
			{
			_out = handler.createReply();
			java.lang.String tmpResult908 = version();
_out.write_string( tmpResult908 );
				break;
			}
			case 20: // create_constant
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.Any _arg4=_input.read_any();
				_out = handler.createReply();
				org.omg.CORBA.ConstantDefHelper.write(_out,create_constant(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 21: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 22: // lookup_name
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_long();
				org.omg.CORBA.DefinitionKind _arg2=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg3=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,lookup_name(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 23: // _get_type
			{
			_out = handler.createReply();
			_out.write_TypeCode(type());
				break;
			}
			case 24: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_string());
				break;
			}
			case 25: // contents
			{
				org.omg.CORBA.DefinitionKind _arg0=org.omg.CORBA.DefinitionKindHelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				org.omg.CORBA.ContainedSeqHelper.write(_out,contents(_arg0,_arg1));
				break;
			}
			case 26: // create_local_interface
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.InterfaceDef[] _arg3=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.LocalInterfaceDefHelper.write(_out,create_local_interface(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 27: // _get_def_kind
			{
			_out = handler.createReply();
			org.omg.CORBA.DefinitionKindHelper.write(_out,def_kind());
				break;
			}
			case 28: // _get_base_interfaces
			{
			_out = handler.createReply();
			org.omg.CORBA.InterfaceDefSeqHelper.write(_out,base_interfaces());
				break;
			}
			case 29: // _set_base_interfaces
			{
			_out = handler.createReply();
			base_interfaces(org.omg.CORBA.InterfaceDefSeqHelper.read(_input));
				break;
			}
			case 30: // create_value_box
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ValueBoxDefHelper.write(_out,create_value_box(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 31: // describe_interface
			{
				_out = handler.createReply();
				org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.write(_out,describe_interface());
				break;
			}
			case 32: // create_attribute
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.AttributeMode _arg4=org.omg.CORBA.AttributeModeHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.AttributeDefHelper.write(_out,create_attribute(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 33: // create_union
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.IDLType _arg3=org.omg.CORBA.IDLTypeHelper.read(_input);
				org.omg.CORBA.UnionMember[] _arg4=org.omg.CORBA.UnionMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.UnionDefHelper.write(_out,create_union(_arg0,_arg1,_arg2,_arg3,_arg4));
				break;
			}
			case 34: // create_exception
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.StructMember[] _arg3=org.omg.CORBA.StructMemberSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.ExceptionDefHelper.write(_out,create_exception(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 35: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult909 = name();
_out.write_string( tmpResult909 );
				break;
			}
			case 36: // create_interface
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.CORBA.InterfaceDef[] _arg3=org.omg.CORBA.InterfaceDefSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.CORBA.InterfaceDefHelper.write(_out,create_interface(_arg0,_arg1,_arg2,_arg3));
				break;
			}
			case 37: // create_native
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				org.omg.CORBA.NativeDefHelper.write(_out,create_native(_arg0,_arg1,_arg2));
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
