package org.omg.DynamicAny;


/**
 * Generated from IDL interface "DynValueBox".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class DynValueBoxLocalTie
	extends _DynValueBoxLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private DynValueBoxOperations _delegate;

	public DynValueBoxLocalTie(DynValueBoxOperations delegate)
	{
		_delegate = delegate;
	}
	public DynValueBoxOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DynValueBoxOperations delegate)
	{
		_delegate = delegate;
	}
	public void insert_long(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_long(value);
	}

	public void rewind()
	{
_delegate.rewind();
	}

	public void insert_short_seq(short[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_short_seq(value);
	}

	public int component_count()
	{
		return _delegate.component_count();
	}

	public void assign(org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.assign(dyn_any);
	}

	public char get_char() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_char();
	}

	public void insert_dyn_any(org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_dyn_any(value);
	}

	public long[] get_ulonglong_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulonglong_seq();
	}

	public void from_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.from_any(value);
	}

	public boolean[] get_boolean_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_boolean_seq();
	}

	public void insert_ushort_seq(short[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ushort_seq(value);
	}

	public void insert_float_seq(float[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_float_seq(value);
	}

	public void insert_boolean(boolean value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_boolean(value);
	}

	public double[] get_longdouble_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_longdouble_seq();
	}

	public void insert_char(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_char(value);
	}

	public boolean equal(org.omg.DynamicAny.DynAny dyn_any)
	{
		return _delegate.equal(dyn_any);
	}

	public org.omg.CORBA.Object get_reference() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_reference();
	}

	public void set_boxed_value(org.omg.CORBA.Any boxed) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.set_boxed_value(boxed);
	}

	public org.omg.CORBA.Any to_any()
	{
		return _delegate.to_any();
	}

	public int[] get_ulong_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulong_seq();
	}

	public org.omg.DynamicAny.DynAny get_boxed_value_as_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
	{
		return _delegate.get_boxed_value_as_dyn_any();
	}

	public void insert_long_seq(int[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_long_seq(value);
	}

	public void insert_double(double value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_double(value);
	}

	public void insert_short(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_short(value);
	}

	public short get_short() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_short();
	}

	public void insert_longlong_seq(long[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_longlong_seq(value);
	}

	public void set_to_value()
	{
_delegate.set_to_value();
	}

	public void insert_reference(org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_reference(value);
	}

	public java.lang.String get_string() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_string();
	}

	public void insert_wchar_seq(char[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_wchar_seq(value);
	}

	public short get_ushort() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ushort();
	}

	public org.omg.CORBA.TypeCode type()
	{
		return _delegate.type();
	}

	public org.omg.DynamicAny.DynAny get_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_dyn_any();
	}

	public org.omg.DynamicAny.DynAny current_component() throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.current_component();
	}

	public int[] get_long_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_long_seq();
	}

	public void insert_wchar(char value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_wchar(value);
	}

	public boolean seek(int index)
	{
		return _delegate.seek(index);
	}

	public char[] get_char_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_char_seq();
	}

	public org.omg.CORBA.TypeCode get_typecode() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_typecode();
	}

	public void insert_wstring(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_wstring(value);
	}

	public void insert_string(java.lang.String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_string(value);
	}

	public void insert_longlong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_longlong(value);
	}

	public void insert_octet(byte value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_octet(value);
	}

	public void insert_ushort(short value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ushort(value);
	}

	public java.lang.String get_wstring() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_wstring();
	}

	public void insert_float(float value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_float(value);
	}

	public org.omg.CORBA.Any get_boxed_value() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
	{
		return _delegate.get_boxed_value();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public void insert_boolean_seq(boolean[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_boolean_seq(value);
	}

	public long get_ulonglong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulonglong();
	}

	public long[] get_longlong_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_longlong_seq();
	}

	public org.omg.CORBA.Any get_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_any();
	}

	public char get_wchar() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_wchar();
	}

	public void set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny boxed) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.set_boxed_value_as_dyn_any(boxed);
	}

	public short[] get_ushort_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ushort_seq();
	}

	public double[] get_double_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_double_seq();
	}

	public float get_float() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_float();
	}

	public void insert_ulonglong_seq(long[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulonglong_seq(value);
	}

	public java.io.Serializable get_val() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_val();
	}

	public void insert_octet_seq(byte[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_octet_seq(value);
	}

	public void insert_typecode(org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_typecode(value);
	}

	public long get_longlong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_longlong();
	}

	public void insert_any(org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_any(value);
	}

	public boolean is_null()
	{
		return _delegate.is_null();
	}

	public int get_ulong() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_ulong();
	}

	public byte get_octet() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_octet();
	}

	public void insert_ulonglong(long value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulonglong(value);
	}

	public void set_to_null()
	{
_delegate.set_to_null();
	}

	public int get_long() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_long();
	}

	public void insert_char_seq(char[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_char_seq(value);
	}

	public void insert_val(java.io.Serializable value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_val(value);
	}

	public boolean get_boolean() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_boolean();
	}

	public void insert_ulong_seq(int[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulong_seq(value);
	}

	public byte[] get_octet_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_octet_seq();
	}

	public double get_longdouble() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_longdouble();
	}

	public boolean next()
	{
		return _delegate.next();
	}

	public void insert_double_seq(double[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_double_seq(value);
	}

	public org.omg.DynamicAny.DynAny copy()
	{
		return _delegate.copy();
	}

	public void insert_longdouble(double value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_longdouble(value);
	}

	public void insert_longdouble_seq(double[] value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_longdouble_seq(value);
	}

	public short[] get_short_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_short_seq();
	}

	public char[] get_wchar_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_wchar_seq();
	}

	public void insert_ulong(int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
_delegate.insert_ulong(value);
	}

	public float[] get_float_seq() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_float_seq();
	}

	public double get_double() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue,org.omg.DynamicAny.DynAnyPackage.TypeMismatch
	{
		return _delegate.get_double();
	}

}
