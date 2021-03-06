package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ServerRequestInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ServerRequestInfoOperations
	extends org.omg.PortableInterceptor.RequestInfoOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any sending_exception();
	java.lang.String server_id();
	java.lang.String orb_id();
	java.lang.String[] adapter_name();
	byte[] object_id();
	byte[] adapter_id();
	java.lang.String target_most_derived_interface();
	org.omg.CORBA.Policy get_server_policy(int type);
	void set_slot(int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;
	boolean target_is_a(java.lang.String id);
	void add_reply_service_context(org.omg.IOP.ServiceContext service_context, boolean replace);
}
