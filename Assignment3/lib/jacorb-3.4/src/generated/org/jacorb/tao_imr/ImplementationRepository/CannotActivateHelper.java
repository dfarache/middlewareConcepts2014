package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL exception "CannotActivate".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class CannotActivateHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CannotActivateHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(org.jacorb.tao_imr.ImplementationRepository.CannotActivateHelper.id(),"CannotActivate",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("reason", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.jacorb.tao_imr.ImplementationRepository.CannotActivate s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.jacorb.tao_imr.ImplementationRepository.CannotActivate extract (final org.omg.CORBA.Any any)
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
		return "IDL:ImplementationRepository/CannotActivate:1.0";
	}
	public static org.jacorb.tao_imr.ImplementationRepository.CannotActivate read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0=in.read_string();
		final org.jacorb.tao_imr.ImplementationRepository.CannotActivate result = new org.jacorb.tao_imr.ImplementationRepository.CannotActivate(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.jacorb.tao_imr.ImplementationRepository.CannotActivate s)
	{
		out.write_string(id());
		java.lang.String tmpResult1260 = s.reason;
out.write_string( tmpResult1260 );
	}
}
