package org.omg.CORBA.ValueDefPackage;


/**
 * Generated from IDL struct "FullValueDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class FullValueDescriptionHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FullValueDescriptionHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.id(),"FullValueDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("is_abstract", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("is_custom", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VersionSpecHelper.id(), "VersionSpec",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("operations", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OpDescriptionSeqHelper.id(), "OpDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.OperationDescriptionHelper.id(),"OperationDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VersionSpecHelper.id(), "VersionSpec",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("result", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.OperationModeHelper.id(),"OperationMode",new String[]{"OP_NORMAL","OP_ONEWAY"}), null),new org.omg.CORBA.StructMember("contexts", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ContextIdSeqHelper.id(), "ContextIdSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ContextIdentifierHelper.type())), null),new org.omg.CORBA.StructMember("parameters", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ParDescriptionSeqHelper.id(), "ParDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ParameterDescriptionHelper.id(),"ParameterDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("type_def", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/IDLType:1.0", "IDLType"), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.ParameterModeHelper.id(),"ParameterMode",new String[]{"PARAM_IN","PARAM_OUT","PARAM_INOUT"}), null)}))), null),new org.omg.CORBA.StructMember("exceptions", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ExcDescriptionSeqHelper.id(), "ExcDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ExceptionDescriptionHelper.id(),"ExceptionDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VersionSpecHelper.id(), "VersionSpec",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null)}))), null)}))), null),new org.omg.CORBA.StructMember("attributes", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.AttrDescriptionSeqHelper.id(), "AttrDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.AttributeDescriptionHelper.id(),"AttributeDescription",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VersionSpecHelper.id(), "VersionSpec",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CORBA.AttributeModeHelper.id(),"AttributeMode",new String[]{"ATTR_NORMAL","ATTR_READONLY"}), null)}))), null),new org.omg.CORBA.StructMember("members", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ValueMemberSeqHelper.id(), "ValueMemberSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.ValueMemberHelper.id(),"ValueMember",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("defined_in", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VersionSpecHelper.id(), "VersionSpec",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("type_def", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/IDLType:1.0", "IDLType"), null),new org.omg.CORBA.StructMember("access", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.VisibilityHelper.id(), "Visibility",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null)}))), null),new org.omg.CORBA.StructMember("initializers", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.InitializerSeqHelper.id(), "InitializerSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.InitializerHelper.id(),"Initializer",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("members", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.StructMemberSeqHelper.id(), "StructMemberSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CORBA.StructMemberHelper.id(),"StructMember",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null),new org.omg.CORBA.StructMember("type_def", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/IDLType:1.0", "IDLType"), null)}))), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.IdentifierHelper.id(), "Identifier",org.omg.CORBA.ORB.init().create_string_tc(0)), null)}))), null),new org.omg.CORBA.StructMember("supported_interfaces", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdSeqHelper.id(), "RepositoryIdSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.RepositoryIdHelper.type())), null),new org.omg.CORBA.StructMember("abstract_base_values", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdSeqHelper.id(), "RepositoryIdSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.RepositoryIdHelper.type())), null),new org.omg.CORBA.StructMember("is_truncatable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("base_value", org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.RepositoryIdHelper.id(), "RepositoryId",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_TypeCode), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.ValueDefPackage.FullValueDescription s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.ValueDefPackage.FullValueDescription extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ValueDef/FullValueDescription:1.0";
	}
	public static org.omg.CORBA.ValueDefPackage.FullValueDescription read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CORBA.ValueDefPackage.FullValueDescription result = new org.omg.CORBA.ValueDefPackage.FullValueDescription();
		result.name=in.read_string();
		result.id=in.read_string();
		result.is_abstract=in.read_boolean();
		result.is_custom=in.read_boolean();
		result.defined_in=in.read_string();
		result.version=in.read_string();
		result.operations = org.omg.CORBA.OpDescriptionSeqHelper.read(in);
		result.attributes = org.omg.CORBA.AttrDescriptionSeqHelper.read(in);
		result.members = org.omg.CORBA.ValueMemberSeqHelper.read(in);
		result.initializers = org.omg.CORBA.InitializerSeqHelper.read(in);
		result.supported_interfaces = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.abstract_base_values = org.omg.CORBA.RepositoryIdSeqHelper.read(in);
		result.is_truncatable=in.read_boolean();
		result.base_value=in.read_string();
		result.type=in.read_TypeCode();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.ValueDefPackage.FullValueDescription s)
	{
		java.lang.String tmpResult637 = s.name;
out.write_string( tmpResult637 );
		java.lang.String tmpResult638 = s.id;
out.write_string( tmpResult638 );
		out.write_boolean(s.is_abstract);
		out.write_boolean(s.is_custom);
		java.lang.String tmpResult639 = s.defined_in;
out.write_string( tmpResult639 );
		java.lang.String tmpResult640 = s.version;
out.write_string( tmpResult640 );
		org.omg.CORBA.OpDescriptionSeqHelper.write(out,s.operations);
		org.omg.CORBA.AttrDescriptionSeqHelper.write(out,s.attributes);
		org.omg.CORBA.ValueMemberSeqHelper.write(out,s.members);
		org.omg.CORBA.InitializerSeqHelper.write(out,s.initializers);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.supported_interfaces);
		org.omg.CORBA.RepositoryIdSeqHelper.write(out,s.abstract_base_values);
		out.write_boolean(s.is_truncatable);
		java.lang.String tmpResult641 = s.base_value;
out.write_string( tmpResult641 );
		out.write_TypeCode(s.type);
	}
}
