package org.jacorb.util.tracing;


/**
 * Generated from IDL interface "TracingService".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public interface TracingServiceOperations
{
	/* constants */
	/* operations  */
	int get_id();
	org.jacorb.util.tracing.TraceData getTrace(org.jacorb.util.tracing.Request source) throws org.jacorb.util.tracing.TracingServicePackage.NoSuchRequestId;
	void logTraceAtPoint(org.jacorb.util.tracing.Request origin, java.lang.String operation, long client_time, long server_time) throws org.jacorb.util.tracing.TracingServicePackage.NoSuchRequestId;
	void registerSubTrace(org.jacorb.util.tracing.Request original, org.jacorb.util.tracing.Request nested) throws org.jacorb.util.tracing.TracingServicePackage.NoSuchRequestId;
}
