package org.omg.PortableGroup;


/**
 * Generated from IDL interface "GOA".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface GOAOperations
	extends org.omg.PortableServer.POAOperations
{
	/* constants */
	/* operations  */
	byte[] create_id_for_reference(org.omg.CORBA.Object the_ref) throws org.omg.PortableGroup.NotAGroupObject;
	byte[][] reference_to_ids(org.omg.CORBA.Object the_ref) throws org.omg.PortableGroup.NotAGroupObject;
	void associate_reference_with_id(org.omg.CORBA.Object ref, byte[] oid) throws org.omg.PortableGroup.NotAGroupObject;
	void disassociate_reference_with_id(org.omg.CORBA.Object ref, byte[] oid) throws org.omg.PortableGroup.NotAGroupObject;
}
