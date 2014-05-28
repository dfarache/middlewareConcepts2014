// -*- C++ -*-
//
// $Id: BiDirTest_i.cpp,v 1.1 2001-11-13 08:32:40 jacorb Exp $

// ****  Code generated by the The ACE ORB (TAO) IDL Compiler ****
// TAO and the TAO IDL Compiler have been developed by:
//       Center for Distributed Object Computing
//       Washington University
//       St. Louis, MO
//       USA
//       http://www.cs.wustl.edu/~schmidt/doc-center.html
// and
//       Distributed Object Computing Laboratory
//       University of California at Irvine
//       Irvine, CA
//       USA
//       http://doc.ece.uci.edu/
//
// Information about TAO is available at:
//     http://www.cs.wustl.edu/~schmidt/TAO.html

#include "BiDirTest_i.h"

// Implementation skeleton constructor
ClientCallback_i::ClientCallback_i (void)
  {
  }
  
// Implementation skeleton destructor
ClientCallback_i::~ClientCallback_i (void)
  {
  }
  
void ClientCallback_i::hello (
    const char * message
  )
  ACE_THROW_SPEC ((
    CORBA::SystemException
  ))

  {
      cout << "ClientCallback received msg: " << message << endl;
  }
  
// Implementation skeleton constructor
CallbackServer_i::CallbackServer_i (void)
  {
  }
  
// Implementation skeleton destructor
CallbackServer_i::~CallbackServer_i (void)
  {
  }
  
void CallbackServer_i::callback_hello (
    ClientCallback_ptr cc,
    const char * message
  )
  ACE_THROW_SPEC ((
    CORBA::SystemException
  ))

  {
      cout << "CallbackServer received msg: " << message << endl;
      cc->hello( message );
  }
  
