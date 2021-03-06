package org.omg.CORBA.InterfaceAttrExtensionPackage;

/**
 * Generated from IDL struct "ExtFullInterfaceDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtFullInterfaceDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ExtFullInterfaceDescription(){}
	public java.lang.String name = "";
	public java.lang.String id = "";
	public java.lang.String defined_in = "";
	public java.lang.String version = "";
	public org.omg.CORBA.OperationDescription[] operations;
	public org.omg.CORBA.ExtAttributeDescription[] attributes;
	public java.lang.String[] base_interfaces;
	public org.omg.CORBA.TypeCode type;
	public ExtFullInterfaceDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version, org.omg.CORBA.OperationDescription[] operations, org.omg.CORBA.ExtAttributeDescription[] attributes, java.lang.String[] base_interfaces, org.omg.CORBA.TypeCode type)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
		this.operations = operations;
		this.attributes = attributes;
		this.base_interfaces = base_interfaces;
		this.type = type;
	}
}
