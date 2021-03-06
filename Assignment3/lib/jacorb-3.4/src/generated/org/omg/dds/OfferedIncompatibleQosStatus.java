package org.omg.dds;

/**
 * Generated from IDL struct "OfferedIncompatibleQosStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OfferedIncompatibleQosStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OfferedIncompatibleQosStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_policy_id;
	public org.omg.dds.QosPolicyCount[] policies;
	public OfferedIncompatibleQosStatus(int total_count, int total_count_change, int last_policy_id, org.omg.dds.QosPolicyCount[] policies)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_policy_id = last_policy_id;
		this.policies = policies;
	}
}
