package org.omg.CosCollection;


/**
 * Generated from IDL interface "EqualitySortedIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface EqualitySortedIteratorOperations
	extends org.omg.CosCollection.EqualityIteratorOperations , org.omg.CosCollection.SortedIteratorOperations
{
	/* constants */
	/* operations  */
	boolean set_to_first_element_with_value(org.omg.CORBA.Any element, org.omg.CosCollection.LowerBoundStyle style) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_last_element_with_value(org.omg.CORBA.Any element, org.omg.CosCollection.UpperBoundStyle style) throws org.omg.CosCollection.ElementInvalid;
	boolean set_to_previous_element_with_value(org.omg.CORBA.Any elementally) throws org.omg.CosCollection.ElementInvalid,org.omg.CosCollection.IteratorInvalid;
	boolean set_to_previous_element_with_different_value() throws org.omg.CosCollection.IteratorInvalid,org.omg.CosCollection.IteratorInBetween;
}
