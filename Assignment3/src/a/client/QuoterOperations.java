package a.client;

/**
* a.server/QuoterOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Saturday, 24 May 2014 15:04:29 o'clock CEST
*/

public interface QuoterOperations 
{
  float getQuoteByName (String stockName) throws QuoterPackage.InvalidStockName;
  float getQuoteByID (String stockID) throws QuoterPackage.InvalidStockID;
} // interface QuoterOperations
