package org.omg.CORBA;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ValueDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ValueDefPOATie
	extends ValueDefPOA
{
	private ValueDefOperations _delegate;

	private POA _poa;
	public ValueDefPOATie(ValueDefOperations delegate)
	{
		_delegate = delegate;
	}
	public ValueDefPOATie(ValueDefOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CORBA.ValueDef _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CORBA.ValueDef __r = org.omg.CORBA.ValueDefHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.ValueDef _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CORBA.ValueDef __r = org.omg.CORBA.ValueDefHelper.narrow(__o);
		return __r;
	}
	public ValueDefOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ValueDefOperations delegate)
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
	public org.omg.CORBA.ValueDef create_value(java.lang.String id, java.lang.String name, java.lang.String version, boolean is_custom, boolean is_abstract, org.omg.CORBA.ValueDef base_value, boolean is_truncatable, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers)
	{
		return _delegate.create_value(id,name,version,is_custom,is_abstract,base_value,is_truncatable,abstract_base_values,supported_interfaces,initializers);
	}

	public void is_truncatable(boolean a)
	{
		_delegate.is_truncatable(a);
	}

	public java.lang.String id()
	{
		return _delegate.id();
	}

	public java.lang.String absolute_name()
	{
		return _delegate.absolute_name();
	}

	public boolean is_a(java.lang.String id)
	{
		return _delegate.is_a(id);
	}

	public void abstract_base_values(org.omg.CORBA.ValueDef[] a)
	{
		_delegate.abstract_base_values(a);
	}

	public org.omg.CORBA.Initializer[] initializers()
	{
		return _delegate.initializers();
	}

	public org.omg.CORBA.StructDef create_struct(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_struct(id,name,version,members);
	}

	public org.omg.CORBA.ContainerPackage.Description[] describe_contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
	{
		return _delegate.describe_contents(limit_type,exclude_inherited,max_returned_objs);
	}

	public org.omg.CORBA.AliasDef create_alias(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type)
	{
		return _delegate.create_alias(id,name,version,original_type);
	}

	public org.omg.CORBA.EnumDef create_enum(java.lang.String id, java.lang.String name, java.lang.String version, java.lang.String[] members)
	{
		return _delegate.create_enum(id,name,version,members);
	}

	public org.omg.CORBA.Contained lookup(java.lang.String search_name)
	{
		return _delegate.lookup(search_name);
	}

	public org.omg.CORBA.ValueDef base_value()
	{
		return _delegate.base_value();
	}

	public void version(java.lang.String a)
	{
		_delegate.version(a);
	}

	public org.omg.CORBA.ExtValueDef create_ext_value(java.lang.String id, java.lang.String name, java.lang.String version, boolean is_custom, boolean is_abstract, org.omg.CORBA.ValueDef base_value, boolean is_truncatable, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.ExtInitializer[] initializers)
	{
		return _delegate.create_ext_value(id,name,version,is_custom,is_abstract,base_value,is_truncatable,abstract_base_values,supported_interfaces,initializers);
	}

	public org.omg.CORBA.ContainedPackage.Description describe()
	{
		return _delegate.describe();
	}

	public void name(java.lang.String a)
	{
		_delegate.name(a);
	}

	public boolean is_abstract()
	{
		return _delegate.is_abstract();
	}

	public org.omg.CORBA.Container defined_in()
	{
		return _delegate.defined_in();
	}

	public org.omg.CORBA.OperationDef create_operation(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, java.lang.String[] contexts)
	{
		return _delegate.create_operation(id,name,version,result,mode,params,exceptions,contexts);
	}

	public boolean is_custom()
	{
		return _delegate.is_custom();
	}

	public org.omg.CORBA.Repository containing_repository()
	{
		return _delegate.containing_repository();
	}

	public org.omg.CORBA.ModuleDef create_module(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		return _delegate.create_module(id,name,version);
	}

	public void move(org.omg.CORBA.Container new_container, java.lang.String new_name, java.lang.String new_version)
	{
_delegate.move(new_container,new_name,new_version);
	}

	public org.omg.CORBA.AbstractInterfaceDef create_abstract_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.AbstractInterfaceDef[] base_interfaces)
	{
		return _delegate.create_abstract_interface(id,name,version,base_interfaces);
	}

	public void base_value(org.omg.CORBA.ValueDef a)
	{
		_delegate.base_value(a);
	}

	public java.lang.String version()
	{
		return _delegate.version();
	}

	public void supported_interfaces(org.omg.CORBA.InterfaceDef[] a)
	{
		_delegate.supported_interfaces(a);
	}

	public org.omg.CORBA.ValueMemberDef create_value_member(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, short access)
	{
		return _delegate.create_value_member(id,name,version,type,access);
	}

	public org.omg.CORBA.ConstantDef create_constant(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
	{
		return _delegate.create_constant(id,name,version,type,value);
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public org.omg.CORBA.Contained[] lookup_name(java.lang.String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		return _delegate.lookup_name(search_name,levels_to_search,limit_type,exclude_inherited);
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public void id(java.lang.String a)
	{
		_delegate.id(a);
	}

	public org.omg.CORBA.Contained[] contents(org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
	{
		return _delegate.contents(limit_type,exclude_inherited);
	}

	public org.omg.CORBA.LocalInterfaceDef create_local_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.InterfaceDef[] base_interfaces)
	{
		return _delegate.create_local_interface(id,name,version,base_interfaces);
	}

	public org.omg.CORBA.DefinitionKind def_kind()
	{
		return _delegate.def_kind();
	}

	public org.omg.CORBA.ValueDef[] abstract_base_values()
	{
		return _delegate.abstract_base_values();
	}

	public void is_custom(boolean a)
	{
		_delegate.is_custom(a);
	}

	public org.omg.CORBA.ValueBoxDef create_value_box(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType original_type_def)
	{
		return _delegate.create_value_box(id,name,version,original_type_def);
	}

	public boolean is_truncatable()
	{
		return _delegate.is_truncatable();
	}

	public void initializers(org.omg.CORBA.Initializer[] a)
	{
		_delegate.initializers(a);
	}

	public org.omg.CORBA.AttributeDef create_attribute(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode)
	{
		return _delegate.create_attribute(id,name,version,type,mode);
	}

	public org.omg.CORBA.UnionDef create_union(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
	{
		return _delegate.create_union(id,name,version,discriminator_type,members);
	}

	public org.omg.CORBA.ExceptionDef create_exception(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.StructMember[] members)
	{
		return _delegate.create_exception(id,name,version,members);
	}

	public java.lang.String name()
	{
		return _delegate.name();
	}

	public org.omg.CORBA.InterfaceDef[] supported_interfaces()
	{
		return _delegate.supported_interfaces();
	}

	public org.omg.CORBA.ValueDefPackage.FullValueDescription describe_value()
	{
		return _delegate.describe_value();
	}

	public org.omg.CORBA.InterfaceDef create_interface(java.lang.String id, java.lang.String name, java.lang.String version, org.omg.CORBA.InterfaceDef[] base_interfaces)
	{
		return _delegate.create_interface(id,name,version,base_interfaces);
	}

	public void is_abstract(boolean a)
	{
		_delegate.is_abstract(a);
	}

	public org.omg.CORBA.NativeDef create_native(java.lang.String id, java.lang.String name, java.lang.String version)
	{
		return _delegate.create_native(id,name,version);
	}

}
