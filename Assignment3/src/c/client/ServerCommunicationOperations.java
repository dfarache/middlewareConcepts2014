package c.client;


/**
* c.client/ServerCommunicationOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Sunday, 1 June 2014 19:05:54 o'clock CEST
*/

public interface ServerCommunicationOperations 
{
  void register_callback (String Quote_info, Responder responder);
  void unregister_callback (Responder responder);
} // interface ServerCommunicationOperations
