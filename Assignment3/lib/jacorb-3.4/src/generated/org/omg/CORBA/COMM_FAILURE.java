package org.omg.CORBA;

/**
 * Generated from IDL exception "COMM_FAILURE".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class COMM_FAILURE
	extends org.omg.CORBA.SystemException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public COMM_FAILURE()
	{
		super( "", 0 ,org.omg.CORBA.CompletionStatus.COMPLETED_NO ) ;
	}

	public COMM_FAILURE( String reason )
	{
		super( reason, 0 ,org.omg.CORBA.CompletionStatus.COMPLETED_NO ) ;
	}

	public COMM_FAILURE(int minor, org.omg.CORBA.CompletionStatus completed )
	{
		super( "", minor, completed ) ;
	}

	public COMM_FAILURE(String reason, int minor, org.omg.CORBA.CompletionStatus completed )
	{
		super( reason, minor, completed ) ;
	}

}
