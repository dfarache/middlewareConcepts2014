package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynUnion".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DynUnionOperations
	extends org.omg.DynamicAny.DynAnyOperations
{
	/* constants */
	/* operations  */
	org.omg.DynamicAny.DynAny get_discriminator();
	void set_discriminator(org.omg.DynamicAny.DynAny d) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	void set_to_default_member() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	void set_to_no_active_member() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;
	boolean has_no_active_member();
	org.omg.CORBA.TCKind discriminator_kind();
	org.omg.DynamicAny.DynAny member() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	java.lang.String member_name() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
	org.omg.CORBA.TCKind member_kind() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
}
