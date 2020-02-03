/**
 * ServiceNow_sys_atf_testStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.curiosity.snowclient.client;


/*
 *  ServiceNow_sys_atf_testStub java implementation
 */
public class ServiceNow_sys_atf_testStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public ServiceNow_sys_atf_testStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ServiceNow_sys_atf_testStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public ServiceNow_sys_atf_testStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://dev75196.service-now.com/sys_atf_test.do?SOAP");
    }

    /**
     * Default Constructor
     */
    public ServiceNow_sys_atf_testStub() throws org.apache.axis2.AxisFault {
        this("https://dev75196.service-now.com/sys_atf_test.do?SOAP");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ServiceNow_sys_atf_testStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "ServiceNow_sys_atf_test" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[7];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "getRecords"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "insert"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "update"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "getKeys"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "deleteRecord"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "deleteMultiple"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test", "get"));
        _service.addOperation(__operation);

        _operations[6] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#getRecords
     * @param getRecords
     */
    public ServiceNow_sys_atf_testStub.GetRecordsResponse getRecords(
        ServiceNow_sys_atf_testStub.GetRecords getRecords)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/getRecords");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getRecords,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test",
                            "getRecords")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test", "getRecords"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.GetRecordsResponse.class);

            return (ServiceNow_sys_atf_testStub.GetRecordsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getRecords"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getRecords"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getRecords"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#insert
     * @param insert
     */
    public ServiceNow_sys_atf_testStub.InsertResponse insert(
        ServiceNow_sys_atf_testStub.Insert insert)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/insert");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    insert,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test", "insert")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test", "insert"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.InsertResponse.class);

            return (ServiceNow_sys_atf_testStub.InsertResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "insert"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insert"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insert"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#update
     * @param update
     */
    public ServiceNow_sys_atf_testStub.UpdateResponse update(
        ServiceNow_sys_atf_testStub.Update update)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/update");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    update,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test", "update")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test", "update"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.UpdateResponse.class);

            return (ServiceNow_sys_atf_testStub.UpdateResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "update"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "update"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "update"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#getKeys
     * @param getKeys
     */
    public ServiceNow_sys_atf_testStub.GetKeysResponse getKeys(
        ServiceNow_sys_atf_testStub.GetKeys getKeys)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/getKeys");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getKeys,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test", "getKeys")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test", "getKeys"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.GetKeysResponse.class);

            return (ServiceNow_sys_atf_testStub.GetKeysResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getKeys"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getKeys"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getKeys"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#deleteRecord
     * @param deleteRecord
     */
    public ServiceNow_sys_atf_testStub.DeleteRecordResponse deleteRecord(
        ServiceNow_sys_atf_testStub.DeleteRecord deleteRecord)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/deleteRecord");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deleteRecord,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test",
                            "deleteRecord")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test",
                        "deleteRecord"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.DeleteRecordResponse.class);

            return (ServiceNow_sys_atf_testStub.DeleteRecordResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "deleteRecord"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteRecord"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteRecord"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#deleteMultiple
     * @param deleteMultiple
     */
    public ServiceNow_sys_atf_testStub.DeleteMultipleResponse deleteMultiple(
        ServiceNow_sys_atf_testStub.DeleteMultiple deleteMultiple)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/deleteMultiple");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deleteMultiple,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test",
                            "deleteMultiple")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test",
                        "deleteMultiple"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.DeleteMultipleResponse.class);

            return (ServiceNow_sys_atf_testStub.DeleteMultipleResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "deleteMultiple"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteMultiple"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteMultiple"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test#get
     * @param get
     */
    public ServiceNow_sys_atf_testStub.GetResponse get(
        ServiceNow_sys_atf_testStub.Get get)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test/get");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    get,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/sys_atf_test", "get")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test", "get"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    ServiceNow_sys_atf_testStub.GetResponse.class);

            return (ServiceNow_sys_atf_testStub.GetResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "get"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "get"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "get"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.GetRecords param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.GetRecords.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.GetRecordsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.GetRecordsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.Insert param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.Insert.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.InsertResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.InsertResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.Update param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.Update.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.UpdateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.UpdateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.GetKeys param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.GetKeys.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.GetKeysResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.GetKeysResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.DeleteRecord param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.DeleteRecord.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.DeleteRecordResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.DeleteRecordResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.DeleteMultiple param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.DeleteMultiple.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.DeleteMultipleResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.DeleteMultipleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.Get param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.Get.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        ServiceNow_sys_atf_testStub.GetResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(ServiceNow_sys_atf_testStub.GetResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.GetRecords param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.GetRecords.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.Insert param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.Insert.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.Update param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.Update.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.GetKeys param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.GetKeys.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.DeleteRecord param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.DeleteRecord.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.DeleteMultiple param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.DeleteMultiple.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        ServiceNow_sys_atf_testStub.Get param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    ServiceNow_sys_atf_testStub.Get.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (ServiceNow_sys_atf_testStub.DeleteMultiple.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.DeleteMultiple.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.DeleteMultipleResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.DeleteMultipleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.DeleteRecord.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.DeleteRecord.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.DeleteRecordResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.DeleteRecordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.Get.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.Get.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.GetKeys.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.GetKeys.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.GetKeysResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.GetKeysResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.GetRecords.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.GetRecords.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.GetRecordsResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.GetRecordsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.GetResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.GetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.Insert.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.Insert.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.InsertResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.InsertResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.Update.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (ServiceNow_sys_atf_testStub.UpdateResponse.class.equals(
                        type)) {
                return ServiceNow_sys_atf_testStub.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //https://dev75196.service-now.com/sys_atf_test.do?SOAP
    public static class GetRecordsResult_type0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = getRecordsResult_type0
           Namespace URI = http://www.service-now.com/sys_atf_test
           Namespace Prefix = ns1
         */

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_name
         */
        protected java.lang.String localSys_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_nameTracker = false;

        /**
         * field for Sys_package
         */
        protected java.lang.String localSys_package;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_packageTracker = false;

        /**
         * field for Sys_policy
         */
        protected java.lang.String localSys_policy;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_policyTracker = false;

        /**
         * field for Sys_scope
         */
        protected java.lang.String localSys_scope;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_scopeTracker = false;

        /**
         * field for Sys_update_name
         */
        protected java.lang.String localSys_update_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_update_nameTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_nameSpecified() {
            return localSys_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_name() {
            return localSys_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_name
         */
        public void setSys_name(java.lang.String param) {
            localSys_nameTracker = param != null;

            this.localSys_name = param;
        }

        public boolean isSys_packageSpecified() {
            return localSys_packageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_package() {
            return localSys_package;
        }

        /**
         * Auto generated setter method
         * @param param Sys_package
         */
        public void setSys_package(java.lang.String param) {
            localSys_packageTracker = param != null;

            this.localSys_package = param;
        }

        public boolean isSys_policySpecified() {
            return localSys_policyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_policy() {
            return localSys_policy;
        }

        /**
         * Auto generated setter method
         * @param param Sys_policy
         */
        public void setSys_policy(java.lang.String param) {
            localSys_policyTracker = param != null;

            this.localSys_policy = param;
        }

        public boolean isSys_scopeSpecified() {
            return localSys_scopeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_scope() {
            return localSys_scope;
        }

        /**
         * Auto generated setter method
         * @param param Sys_scope
         */
        public void setSys_scope(java.lang.String param) {
            localSys_scopeTracker = param != null;

            this.localSys_scope = param;
        }

        public boolean isSys_update_nameSpecified() {
            return localSys_update_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_update_name() {
            return localSys_update_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_update_name
         */
        public void setSys_update_name(java.lang.String param) {
            localSys_update_nameTracker = param != null;

            this.localSys_update_name = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecordsResult_type0", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecordsResult_type0", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_class_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_name", xmlWriter);

                if (localSys_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_packageTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_package", xmlWriter);

                if (localSys_package == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_package cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_package);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_policyTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_policy", xmlWriter);

                if (localSys_policy == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_policy cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_policy);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_scopeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_scope", xmlWriter);

                if (localSys_scope == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_scope cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_scope);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_update_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_update_name", xmlWriter);

                if (localSys_update_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_update_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_update_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecordsResult_type0 parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecordsResult_type0 object = new GetRecordsResult_type0();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecordsResult_type0".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecordsResult_type0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_class_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_mod_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_package").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_package" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_package(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_policy").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_policy" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_policy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_scope").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_scope" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_scope(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_update_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_update_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_update_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteMultiple implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "deleteMultiple", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_name
         */
        protected java.lang.String localSys_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_nameTracker = false;

        /**
         * field for Sys_package
         */
        protected java.lang.String localSys_package;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_packageTracker = false;

        /**
         * field for Sys_policy
         */
        protected java.lang.String localSys_policy;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_policyTracker = false;

        /**
         * field for Sys_scope
         */
        protected java.lang.String localSys_scope;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_scopeTracker = false;

        /**
         * field for Sys_update_name
         */
        protected java.lang.String localSys_update_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_update_nameTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_nameSpecified() {
            return localSys_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_name() {
            return localSys_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_name
         */
        public void setSys_name(java.lang.String param) {
            localSys_nameTracker = param != null;

            this.localSys_name = param;
        }

        public boolean isSys_packageSpecified() {
            return localSys_packageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_package() {
            return localSys_package;
        }

        /**
         * Auto generated setter method
         * @param param Sys_package
         */
        public void setSys_package(java.lang.String param) {
            localSys_packageTracker = param != null;

            this.localSys_package = param;
        }

        public boolean isSys_policySpecified() {
            return localSys_policyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_policy() {
            return localSys_policy;
        }

        /**
         * Auto generated setter method
         * @param param Sys_policy
         */
        public void setSys_policy(java.lang.String param) {
            localSys_policyTracker = param != null;

            this.localSys_policy = param;
        }

        public boolean isSys_scopeSpecified() {
            return localSys_scopeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_scope() {
            return localSys_scope;
        }

        /**
         * Auto generated setter method
         * @param param Sys_scope
         */
        public void setSys_scope(java.lang.String param) {
            localSys_scopeTracker = param != null;

            this.localSys_scope = param;
        }

        public boolean isSys_update_nameSpecified() {
            return localSys_update_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_update_name() {
            return localSys_update_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_update_name
         */
        public void setSys_update_name(java.lang.String param) {
            localSys_update_nameTracker = param != null;

            this.localSys_update_name = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteMultiple", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteMultiple", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_class_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_name", xmlWriter);

                if (localSys_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_packageTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_package", xmlWriter);

                if (localSys_package == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_package cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_package);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_policyTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_policy", xmlWriter);

                if (localSys_policy == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_policy cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_policy);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_scopeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_scope", xmlWriter);

                if (localSys_scope == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_scope cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_scope);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_update_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_update_name", xmlWriter);

                if (localSys_update_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_update_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_update_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteMultiple parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteMultiple object = new DeleteMultiple();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteMultiple".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteMultiple) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_class_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_mod_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_package").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_package" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_package(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_policy").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_policy" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_policy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_scope").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_scope" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_scope(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_update_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_update_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_update_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ExtensionMapper {
        public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://www.service-now.com/sys_atf_test".equals(namespaceURI) &&
                    "getRecordsResult_type0".equals(typeName)) {
                return GetRecordsResult_type0.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class GetKeys implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "getKeys", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_name
         */
        protected java.lang.String localSys_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_nameTracker = false;

        /**
         * field for Sys_package
         */
        protected java.lang.String localSys_package;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_packageTracker = false;

        /**
         * field for Sys_policy
         */
        protected java.lang.String localSys_policy;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_policyTracker = false;

        /**
         * field for Sys_scope
         */
        protected java.lang.String localSys_scope;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_scopeTracker = false;

        /**
         * field for Sys_update_name
         */
        protected java.lang.String localSys_update_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_update_nameTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * field for __encoded_query
         */
        protected java.lang.String local__encoded_query;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__encoded_queryTracker = false;

        /**
         * field for __limit
         */
        protected java.lang.String local__limit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__limitTracker = false;

        /**
         * field for __first_row
         */
        protected java.lang.String local__first_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__first_rowTracker = false;

        /**
         * field for __last_row
         */
        protected java.lang.String local__last_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__last_rowTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_nameSpecified() {
            return localSys_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_name() {
            return localSys_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_name
         */
        public void setSys_name(java.lang.String param) {
            localSys_nameTracker = param != null;

            this.localSys_name = param;
        }

        public boolean isSys_packageSpecified() {
            return localSys_packageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_package() {
            return localSys_package;
        }

        /**
         * Auto generated setter method
         * @param param Sys_package
         */
        public void setSys_package(java.lang.String param) {
            localSys_packageTracker = param != null;

            this.localSys_package = param;
        }

        public boolean isSys_policySpecified() {
            return localSys_policyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_policy() {
            return localSys_policy;
        }

        /**
         * Auto generated setter method
         * @param param Sys_policy
         */
        public void setSys_policy(java.lang.String param) {
            localSys_policyTracker = param != null;

            this.localSys_policy = param;
        }

        public boolean isSys_scopeSpecified() {
            return localSys_scopeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_scope() {
            return localSys_scope;
        }

        /**
         * Auto generated setter method
         * @param param Sys_scope
         */
        public void setSys_scope(java.lang.String param) {
            localSys_scopeTracker = param != null;

            this.localSys_scope = param;
        }

        public boolean isSys_update_nameSpecified() {
            return localSys_update_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_update_name() {
            return localSys_update_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_update_name
         */
        public void setSys_update_name(java.lang.String param) {
            localSys_update_nameTracker = param != null;

            this.localSys_update_name = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        public boolean is__encoded_querySpecified() {
            return local__encoded_queryTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__encoded_query() {
            return local__encoded_query;
        }

        /**
         * Auto generated setter method
         * @param param __encoded_query
         */
        public void set__encoded_query(java.lang.String param) {
            local__encoded_queryTracker = param != null;

            this.local__encoded_query = param;
        }

        public boolean is__limitSpecified() {
            return local__limitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__limit() {
            return local__limit;
        }

        /**
         * Auto generated setter method
         * @param param __limit
         */
        public void set__limit(java.lang.String param) {
            local__limitTracker = param != null;

            this.local__limit = param;
        }

        public boolean is__first_rowSpecified() {
            return local__first_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__first_row() {
            return local__first_row;
        }

        /**
         * Auto generated setter method
         * @param param __first_row
         */
        public void set__first_row(java.lang.String param) {
            local__first_rowTracker = param != null;

            this.local__first_row = param;
        }

        public boolean is__last_rowSpecified() {
            return local__last_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__last_row() {
            return local__last_row;
        }

        /**
         * Auto generated setter method
         * @param param __last_row
         */
        public void set__last_row(java.lang.String param) {
            local__last_rowTracker = param != null;

            this.local__last_row = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getKeys", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getKeys", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_class_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_name", xmlWriter);

                if (localSys_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_packageTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_package", xmlWriter);

                if (localSys_package == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_package cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_package);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_policyTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_policy", xmlWriter);

                if (localSys_policy == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_policy cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_policy);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_scopeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_scope", xmlWriter);

                if (localSys_scope == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_scope cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_scope);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_update_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_update_name", xmlWriter);

                if (localSys_update_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_update_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_update_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            if (local__encoded_queryTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__encoded_query", xmlWriter);

                if (local__encoded_query == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__encoded_query);
                }

                xmlWriter.writeEndElement();
            }

            if (local__limitTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__limit", xmlWriter);

                if (local__limit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__limit);
                }

                xmlWriter.writeEndElement();
            }

            if (local__first_rowTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__first_row", xmlWriter);

                if (local__first_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__first_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__last_rowTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__last_row", xmlWriter);

                if (local__last_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__last_row);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetKeys parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetKeys object = new GetKeys();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getKeys".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetKeys) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_class_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_mod_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_package").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_package" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_package(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_policy").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_policy" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_policy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_scope").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_scope" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_scope(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_update_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_update_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_update_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__use_view").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__encoded_query").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__encoded_query" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__encoded_query(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__limit").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__limit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__limit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__first_row").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__first_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__first_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__last_row").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__last_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__last_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class UpdateResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "updateResponse", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":updateResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "updateResponse", xmlWriter);
                }
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                UpdateResponse object = new UpdateResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"updateResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (UpdateResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteRecord implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "deleteRecord", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteRecord", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteRecord", xmlWriter);
                }
            }

            namespace = "http://www.service-now.com/sys_atf_test";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteRecord parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteRecord object = new DeleteRecord();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteRecord".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteRecord) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteRecordResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "deleteRecordResponse", "ns1");

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteRecordResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteRecordResponse", xmlWriter);
                }
            }

            if (localCountTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteRecordResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteRecordResponse object = new DeleteRecordResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteRecordResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteRecordResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteMultipleResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "deleteMultipleResponse", "ns1");

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteMultipleResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteMultipleResponse", xmlWriter);
                }
            }

            if (localCountTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteMultipleResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteMultipleResponse object = new DeleteMultipleResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteMultipleResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteMultipleResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Get implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "get", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":get", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "get", xmlWriter);
                }
            }

            namespace = "http://www.service-now.com/sys_atf_test";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            if (local__use_viewTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Get parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Get object = new Get();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"get".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Get) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__use_view").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetRecordsResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "getRecordsResponse", "ns1");

        /**
         * field for GetRecordsResult
         * This was an Array!
         */
        protected GetRecordsResult_type0[] localGetRecordsResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localGetRecordsResultTracker = false;

        public boolean isGetRecordsResultSpecified() {
            return localGetRecordsResultTracker;
        }

        /**
         * Auto generated getter method
         * @return GetRecordsResult_type0[]
         */
        public GetRecordsResult_type0[] getGetRecordsResult() {
            return localGetRecordsResult;
        }

        /**
         * validate the array for GetRecordsResult
         */
        protected void validateGetRecordsResult(GetRecordsResult_type0[] param) {
        }

        /**
         * Auto generated setter method
         * @param param GetRecordsResult
         */
        public void setGetRecordsResult(GetRecordsResult_type0[] param) {
            validateGetRecordsResult(param);

            localGetRecordsResultTracker = param != null;

            this.localGetRecordsResult = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param GetRecordsResult_type0
         */
        public void addGetRecordsResult(GetRecordsResult_type0 param) {
            if (localGetRecordsResult == null) {
                localGetRecordsResult = new GetRecordsResult_type0[] {  };
            }

            //update the setting tracker
            localGetRecordsResultTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localGetRecordsResult);
            list.add(param);
            this.localGetRecordsResult = (GetRecordsResult_type0[]) list.toArray(new GetRecordsResult_type0[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecordsResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecordsResponse", xmlWriter);
                }
            }

            if (localGetRecordsResultTracker) {
                if (localGetRecordsResult != null) {
                    for (int i = 0; i < localGetRecordsResult.length; i++) {
                        if (localGetRecordsResult[i] != null) {
                            localGetRecordsResult[i].serialize(new javax.xml.namespace.QName(
                                    "http://www.service-now.com/sys_atf_test",
                                    "getRecordsResult"), xmlWriter);
                        } else {
                            // we don't have to do any thing since minOccures is zero
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "getRecordsResult cannot be null!!");
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecordsResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecordsResponse object = new GetRecordsResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecordsResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecordsResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "getRecordsResult").equals(reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(GetRecordsResult_type0.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName(
                                            "http://www.service-now.com/sys_atf_test",
                                            "getRecordsResult").equals(
                                            reader.getName())) {
                                    list1.add(GetRecordsResult_type0.Factory.parse(
                                            reader));
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setGetRecordsResult((GetRecordsResult_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                GetRecordsResult_type0.class, list1));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetRecords implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "getRecords", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_name
         */
        protected java.lang.String localSys_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_nameTracker = false;

        /**
         * field for Sys_package
         */
        protected java.lang.String localSys_package;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_packageTracker = false;

        /**
         * field for Sys_policy
         */
        protected java.lang.String localSys_policy;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_policyTracker = false;

        /**
         * field for Sys_scope
         */
        protected java.lang.String localSys_scope;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_scopeTracker = false;

        /**
         * field for Sys_update_name
         */
        protected java.lang.String localSys_update_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_update_nameTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * field for __encoded_query
         */
        protected java.lang.String local__encoded_query;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__encoded_queryTracker = false;

        /**
         * field for __limit
         */
        protected java.lang.String local__limit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__limitTracker = false;

        /**
         * field for __first_row
         */
        protected java.lang.String local__first_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__first_rowTracker = false;

        /**
         * field for __last_row
         */
        protected java.lang.String local__last_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__last_rowTracker = false;

        /**
         * field for __order_by
         */
        protected java.lang.String local__order_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__order_byTracker = false;

        /**
         * field for __order_by_desc
         */
        protected java.lang.String local__order_by_desc;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__order_by_descTracker = false;

        /**
         * field for __exclude_columns
         */
        protected java.lang.String local__exclude_columns;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__exclude_columnsTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_nameSpecified() {
            return localSys_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_name() {
            return localSys_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_name
         */
        public void setSys_name(java.lang.String param) {
            localSys_nameTracker = param != null;

            this.localSys_name = param;
        }

        public boolean isSys_packageSpecified() {
            return localSys_packageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_package() {
            return localSys_package;
        }

        /**
         * Auto generated setter method
         * @param param Sys_package
         */
        public void setSys_package(java.lang.String param) {
            localSys_packageTracker = param != null;

            this.localSys_package = param;
        }

        public boolean isSys_policySpecified() {
            return localSys_policyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_policy() {
            return localSys_policy;
        }

        /**
         * Auto generated setter method
         * @param param Sys_policy
         */
        public void setSys_policy(java.lang.String param) {
            localSys_policyTracker = param != null;

            this.localSys_policy = param;
        }

        public boolean isSys_scopeSpecified() {
            return localSys_scopeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_scope() {
            return localSys_scope;
        }

        /**
         * Auto generated setter method
         * @param param Sys_scope
         */
        public void setSys_scope(java.lang.String param) {
            localSys_scopeTracker = param != null;

            this.localSys_scope = param;
        }

        public boolean isSys_update_nameSpecified() {
            return localSys_update_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_update_name() {
            return localSys_update_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_update_name
         */
        public void setSys_update_name(java.lang.String param) {
            localSys_update_nameTracker = param != null;

            this.localSys_update_name = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        public boolean is__encoded_querySpecified() {
            return local__encoded_queryTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__encoded_query() {
            return local__encoded_query;
        }

        /**
         * Auto generated setter method
         * @param param __encoded_query
         */
        public void set__encoded_query(java.lang.String param) {
            local__encoded_queryTracker = param != null;

            this.local__encoded_query = param;
        }

        public boolean is__limitSpecified() {
            return local__limitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__limit() {
            return local__limit;
        }

        /**
         * Auto generated setter method
         * @param param __limit
         */
        public void set__limit(java.lang.String param) {
            local__limitTracker = param != null;

            this.local__limit = param;
        }

        public boolean is__first_rowSpecified() {
            return local__first_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__first_row() {
            return local__first_row;
        }

        /**
         * Auto generated setter method
         * @param param __first_row
         */
        public void set__first_row(java.lang.String param) {
            local__first_rowTracker = param != null;

            this.local__first_row = param;
        }

        public boolean is__last_rowSpecified() {
            return local__last_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__last_row() {
            return local__last_row;
        }

        /**
         * Auto generated setter method
         * @param param __last_row
         */
        public void set__last_row(java.lang.String param) {
            local__last_rowTracker = param != null;

            this.local__last_row = param;
        }

        public boolean is__order_bySpecified() {
            return local__order_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__order_by() {
            return local__order_by;
        }

        /**
         * Auto generated setter method
         * @param param __order_by
         */
        public void set__order_by(java.lang.String param) {
            local__order_byTracker = param != null;

            this.local__order_by = param;
        }

        public boolean is__order_by_descSpecified() {
            return local__order_by_descTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__order_by_desc() {
            return local__order_by_desc;
        }

        /**
         * Auto generated setter method
         * @param param __order_by_desc
         */
        public void set__order_by_desc(java.lang.String param) {
            local__order_by_descTracker = param != null;

            this.local__order_by_desc = param;
        }

        public boolean is__exclude_columnsSpecified() {
            return local__exclude_columnsTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__exclude_columns() {
            return local__exclude_columns;
        }

        /**
         * Auto generated setter method
         * @param param __exclude_columns
         */
        public void set__exclude_columns(java.lang.String param) {
            local__exclude_columnsTracker = param != null;

            this.local__exclude_columns = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecords", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecords", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_class_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_name", xmlWriter);

                if (localSys_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_packageTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_package", xmlWriter);

                if (localSys_package == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_package cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_package);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_policyTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_policy", xmlWriter);

                if (localSys_policy == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_policy cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_policy);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_scopeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_scope", xmlWriter);

                if (localSys_scope == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_scope cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_scope);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_update_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_update_name", xmlWriter);

                if (localSys_update_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_update_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_update_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            if (local__encoded_queryTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__encoded_query", xmlWriter);

                if (local__encoded_query == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__encoded_query);
                }

                xmlWriter.writeEndElement();
            }

            if (local__limitTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__limit", xmlWriter);

                if (local__limit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__limit);
                }

                xmlWriter.writeEndElement();
            }

            if (local__first_rowTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__first_row", xmlWriter);

                if (local__first_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__first_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__last_rowTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__last_row", xmlWriter);

                if (local__last_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__last_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__order_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__order_by", xmlWriter);

                if (local__order_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__order_by);
                }

                xmlWriter.writeEndElement();
            }

            if (local__order_by_descTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__order_by_desc", xmlWriter);

                if (local__order_by_desc == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by_desc cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__order_by_desc);
                }

                xmlWriter.writeEndElement();
            }

            if (local__exclude_columnsTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "__exclude_columns",
                    xmlWriter);

                if (local__exclude_columns == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__exclude_columns cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__exclude_columns);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecords parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecords object = new GetRecords();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecords".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecords) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_class_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_mod_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_package").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_package" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_package(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_policy").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_policy" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_policy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_scope").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_scope" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_scope(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_update_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_update_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_update_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__use_view").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__encoded_query").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__encoded_query" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__encoded_query(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__limit").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__limit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__limit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__first_row").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__first_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__first_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__last_row").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__last_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__last_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__order_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__order_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__order_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__order_by_desc").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__order_by_desc" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__order_by_desc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "__exclude_columns").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__exclude_columns" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__exclude_columns(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Update implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "update", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":update", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "update", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            namespace = "http://www.service-now.com/sys_atf_test";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            namespace = "http://www.service-now.com/sys_atf_test";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Update parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Update object = new Update();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"update".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Update) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Insert implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "insert", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insert", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insert", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            namespace = "http://www.service-now.com/sys_atf_test";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Insert parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Insert object = new Insert();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insert".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Insert) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "getResponse", "ns1");

        /**
         * field for Active
         */
        protected boolean localActive;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localActiveTracker = false;

        /**
         * field for Description
         */
        protected java.lang.String localDescription;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDescriptionTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        /**
         * field for Remember
         */
        protected java.lang.String localRemember;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRememberTracker = false;

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_name
         */
        protected java.lang.String localSys_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_nameTracker = false;

        /**
         * field for Sys_package
         */
        protected java.lang.String localSys_package;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_packageTracker = false;

        /**
         * field for Sys_policy
         */
        protected java.lang.String localSys_policy;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_policyTracker = false;

        /**
         * field for Sys_scope
         */
        protected java.lang.String localSys_scope;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_scopeTracker = false;

        /**
         * field for Sys_update_name
         */
        protected java.lang.String localSys_update_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_update_nameTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        public boolean isActiveSpecified() {
            return localActiveTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getActive() {
            return localActive;
        }

        /**
         * Auto generated setter method
         * @param param Active
         */
        public void setActive(boolean param) {
            // setting primitive attribute tracker to true
            localActiveTracker = true;

            this.localActive = param;
        }

        public boolean isDescriptionSpecified() {
            return localDescriptionTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDescription() {
            return localDescription;
        }

        /**
         * Auto generated setter method
         * @param param Description
         */
        public void setDescription(java.lang.String param) {
            localDescriptionTracker = param != null;

            this.localDescription = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        public boolean isRememberSpecified() {
            return localRememberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRemember() {
            return localRemember;
        }

        /**
         * Auto generated setter method
         * @param param Remember
         */
        public void setRemember(java.lang.String param) {
            localRememberTracker = param != null;

            this.localRemember = param;
        }

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_nameSpecified() {
            return localSys_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_name() {
            return localSys_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_name
         */
        public void setSys_name(java.lang.String param) {
            localSys_nameTracker = param != null;

            this.localSys_name = param;
        }

        public boolean isSys_packageSpecified() {
            return localSys_packageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_package() {
            return localSys_package;
        }

        /**
         * Auto generated setter method
         * @param param Sys_package
         */
        public void setSys_package(java.lang.String param) {
            localSys_packageTracker = param != null;

            this.localSys_package = param;
        }

        public boolean isSys_policySpecified() {
            return localSys_policyTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_policy() {
            return localSys_policy;
        }

        /**
         * Auto generated setter method
         * @param param Sys_policy
         */
        public void setSys_policy(java.lang.String param) {
            localSys_policyTracker = param != null;

            this.localSys_policy = param;
        }

        public boolean isSys_scopeSpecified() {
            return localSys_scopeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_scope() {
            return localSys_scope;
        }

        /**
         * Auto generated setter method
         * @param param Sys_scope
         */
        public void setSys_scope(java.lang.String param) {
            localSys_scopeTracker = param != null;

            this.localSys_scope = param;
        }

        public boolean isSys_update_nameSpecified() {
            return localSys_update_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_update_name() {
            return localSys_update_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_update_name
         */
        public void setSys_update_name(java.lang.String param) {
            localSys_update_nameTracker = param != null;

            this.localSys_update_name = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getResponse", xmlWriter);
                }
            }

            if (localActiveTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "active", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "active cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localActive));
                }

                xmlWriter.writeEndElement();
            }

            if (localDescriptionTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "description", xmlWriter);

                if (localDescription == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "description cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDescription);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            if (localRememberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "remember", xmlWriter);

                if (localRemember == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "remember cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRemember);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_class_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_name", xmlWriter);

                if (localSys_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_packageTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_package", xmlWriter);

                if (localSys_package == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_package cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_package);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_policyTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_policy", xmlWriter);

                if (localSys_policy == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_policy cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_policy);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_scopeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_scope", xmlWriter);

                if (localSys_scope == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_scope cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_scope);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_update_nameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_update_name", xmlWriter);

                if (localSys_update_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_update_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_update_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetResponse object = new GetResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "active").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "active" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "description").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "description" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "remember").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "remember" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRemember(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_class_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_created_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_mod_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_package").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_package" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_package(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_policy").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_policy" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_policy(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_scope").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_scope" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_scope(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_update_name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_update_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_update_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_by").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_updated_on").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetKeysResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "getKeysResponse", "ns1");

        /**
         * field for Sys_id
         * This was an Array!
         */
        protected java.lang.String[] localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String[]
         */
        public java.lang.String[] getSys_id() {
            return localSys_id;
        }

        /**
         * validate the array for Sys_id
         */
        protected void validateSys_id(java.lang.String[] param) {
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String[] param) {
            validateSys_id(param);

            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param java.lang.String
         */
        public void addSys_id(java.lang.String param) {
            if (localSys_id == null) {
                localSys_id = new java.lang.String[] {  };
            }

            //update the setting tracker
            localSys_idTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localSys_id);
            list.add(param);
            this.localSys_id = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
        }

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getKeysResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getKeysResponse", xmlWriter);
                }
            }

            if (localSys_idTracker) {
                if (localSys_id != null) {
                    namespace = "http://www.service-now.com/sys_atf_test";

                    for (int i = 0; i < localSys_id.length; i++) {
                        if (localSys_id[i] != null) {
                            writeStartElement(null, namespace, "sys_id",
                                xmlWriter);

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    localSys_id[i]));

                            xmlWriter.writeEndElement();
                        } else {
                            // we have to do nothing since minOccurs is zero
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localCountTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetKeysResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetKeysResponse object = new GetKeysResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getKeysResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetKeysResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(reader.getElementText());

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // Ensure we are at the EndElement
                            while (!reader.isEndElement()) {
                                reader.next();
                            }

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName(
                                            "http://www.service-now.com/sys_atf_test",
                                            "sys_id").equals(reader.getName())) {
                                    list1.add(reader.getElementText());
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setSys_id((java.lang.String[]) list1.toArray(
                                new java.lang.String[list1.size()]));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class InsertResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test",
                "insertResponse", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Name
         */
        protected java.lang.String localName;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNameTracker = false;

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isNameSpecified() {
            return localNameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getName() {
            return localName;
        }

        /**
         * Auto generated setter method
         * @param param Name
         */
        public void setName(java.lang.String param) {
            localNameTracker = param != null;

            this.localName = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/sys_atf_test");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insertResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insertResponse", xmlWriter);
                }
            }

            if (localSys_idTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localNameTracker) {
                namespace = "http://www.service-now.com/sys_atf_test";
                writeStartElement(null, namespace, "name", xmlWriter);

                if (localName == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localName);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://www.service-now.com/sys_atf_test")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InsertResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                InsertResponse object = new InsertResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insertResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (InsertResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test",
                                "name").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "name" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }
}
