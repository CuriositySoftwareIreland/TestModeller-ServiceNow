/**
 * ServiceNow_sys_atf_test_suite_resultStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.curiosity.snowclient;


/*
 *  ServiceNow_sys_atf_test_suite_resultStub java implementation
 */
public class ServiceNow_sys_atf_test_suite_resultStub extends org.apache.axis2.client.Stub {
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
    public ServiceNow_sys_atf_test_suite_resultStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ServiceNow_sys_atf_test_suite_resultStub(
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
    public ServiceNow_sys_atf_test_suite_resultStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://dev75196.service-now.com/sys_atf_test_suite_result.do?SOAP");
    }

    /**
     * Default Constructor
     */
    public ServiceNow_sys_atf_test_suite_resultStub()
        throws org.apache.axis2.AxisFault {
        this(
            "https://dev75196.service-now.com/sys_atf_test_suite_result.do?SOAP");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ServiceNow_sys_atf_test_suite_resultStub(
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
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
                "ServiceNow_sys_atf_test_suite_result" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[7];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result", "insert"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result", "update"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result",
                "getRecords"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result",
                "getKeys"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result",
                "deleteRecord"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result",
                "deleteMultiple"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/sys_atf_test_suite_result", "get"));
        _service.addOperation(__operation);

        _operations[6] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#insert
     * @param insert
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse insert(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert insert)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/insert");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "insert")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
                        "insert"));

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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#update
     * @param update
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse update(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update update)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/update");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "update")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
                        "update"));

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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#getRecords
     * @param getRecords
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse getRecords(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords getRecords)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/getRecords");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "getRecords")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
                        "getRecords"));

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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#getKeys
     * @param getKeys
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse getKeys(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys getKeys)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/getKeys");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "getKeys")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
                        "getKeys"));

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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#deleteRecord
     * @param deleteRecord
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse deleteRecord(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord deleteRecord)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/deleteRecord");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "deleteRecord")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#deleteMultiple
     * @param deleteMultiple
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse deleteMultiple(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple deleteMultiple)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/deleteMultiple");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "deleteMultiple")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse) object;
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
     * @see org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_result#get
     * @param get
     */
    public org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse get(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get get)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/sys_atf_test_suite_result/get");
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
                            "http://www.service-now.com/sys_atf_test_suite_result",
                            "get")),
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/sys_atf_test_suite_result",
                        "get"));

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
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse.class);

            return (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse) object;
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
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get.MY_QNAME,
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
            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultiple.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteMultipleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecord.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.DeleteRecordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Get.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeys.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetKeysResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecords.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetRecordsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.GetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Insert.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.InsertResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse.class.equals(
                        type)) {
                return org.curiosity.snowclient.ServiceNow_sys_atf_test_suite_resultStub.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //https://dev75196.service-now.com/sys_atf_test_suite_result.do?SOAP
    public static class GetRecordsResult_type0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = getRecordsResult_type0
           Namespace URI = http://www.service-now.com/sys_atf_test_suite_result
           Namespace Prefix = ns1
         */

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

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
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "deleteMultiple", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

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
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
            if ("http://www.service-now.com/sys_atf_test_suite_result".equals(
                        namespaceURI) &&
                    "getRecordsResult_type0".equals(typeName)) {
                return GetRecordsResult_type0.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class UpdateResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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

    public static class GetKeys implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "getKeys", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

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
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

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

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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

    public static class DeleteRecord implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                                    "http://www.service-now.com/sys_atf_test_suite_result",
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                            "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "getRecords", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

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
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

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

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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

    public static class GetResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "getResponse", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

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
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localSys_updated_byTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "update", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
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

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            namespace = "http://www.service-now.com/sys_atf_test_suite_result";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

    public static class Insert implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
                "insert", "ns1");

        /**
         * field for Base_suite_result
         */
        protected java.lang.String localBase_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBase_suite_resultTracker = false;

        /**
         * field for End_time
         */
        protected java.lang.String localEnd_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEnd_timeTracker = false;

        /**
         * field for Error_count
         */
        protected java.math.BigInteger localError_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_countTracker = false;

        /**
         * field for Execution_tracker
         */
        protected java.lang.String localExecution_tracker;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localExecution_trackerTracker = false;

        /**
         * field for Failure_count
         */
        protected java.math.BigInteger localFailure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFailure_countTracker = false;

        /**
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

        /**
         * field for Parent
         */
        protected java.lang.String localParent;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localParentTracker = false;

        /**
         * field for Pin
         */
        protected boolean localPin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPinTracker = false;

        /**
         * field for Previous_suite_result
         */
        protected java.lang.String localPrevious_suite_result;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPrevious_suite_resultTracker = false;

        /**
         * field for Rolled_up_test_error_count
         */
        protected java.math.BigInteger localRolled_up_test_error_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_error_countTracker = false;

        /**
         * field for Rolled_up_test_failure_count
         */
        protected java.math.BigInteger localRolled_up_test_failure_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_failure_countTracker = false;

        /**
         * field for Rolled_up_test_skip_count
         */
        protected java.math.BigInteger localRolled_up_test_skip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_skip_countTracker = false;

        /**
         * field for Rolled_up_test_success_count
         */
        protected java.math.BigInteger localRolled_up_test_success_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRolled_up_test_success_countTracker = false;

        /**
         * field for Run_time
         */
        protected java.lang.String localRun_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRun_timeTracker = false;

        /**
         * field for Schedule_run
         */
        protected java.lang.String localSchedule_run;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSchedule_runTracker = false;

        /**
         * field for Skip_count
         */
        protected java.math.BigInteger localSkip_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSkip_countTracker = false;

        /**
         * field for Start_time
         */
        protected java.lang.String localStart_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStart_timeTracker = false;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatusTracker = false;

        /**
         * field for Success
         */
        protected boolean localSuccess;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccessTracker = false;

        /**
         * field for Success_count
         */
        protected java.math.BigInteger localSuccess_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSuccess_countTracker = false;

        /**
         * field for Test_suite
         */
        protected java.lang.String localTest_suite;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTest_suiteTracker = false;

        public boolean isBase_suite_resultSpecified() {
            return localBase_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBase_suite_result() {
            return localBase_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Base_suite_result
         */
        public void setBase_suite_result(java.lang.String param) {
            localBase_suite_resultTracker = param != null;

            this.localBase_suite_result = param;
        }

        public boolean isEnd_timeSpecified() {
            return localEnd_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEnd_time() {
            return localEnd_time;
        }

        /**
         * Auto generated setter method
         * @param param End_time
         */
        public void setEnd_time(java.lang.String param) {
            localEnd_timeTracker = param != null;

            this.localEnd_time = param;
        }

        public boolean isError_countSpecified() {
            return localError_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getError_count() {
            return localError_count;
        }

        /**
         * Auto generated setter method
         * @param param Error_count
         */
        public void setError_count(java.math.BigInteger param) {
            localError_countTracker = param != null;

            this.localError_count = param;
        }

        public boolean isExecution_trackerSpecified() {
            return localExecution_trackerTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getExecution_tracker() {
            return localExecution_tracker;
        }

        /**
         * Auto generated setter method
         * @param param Execution_tracker
         */
        public void setExecution_tracker(java.lang.String param) {
            localExecution_trackerTracker = param != null;

            this.localExecution_tracker = param;
        }

        public boolean isFailure_countSpecified() {
            return localFailure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getFailure_count() {
            return localFailure_count;
        }

        /**
         * Auto generated setter method
         * @param param Failure_count
         */
        public void setFailure_count(java.math.BigInteger param) {
            localFailure_countTracker = param != null;

            this.localFailure_count = param;
        }

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
        }

        public boolean isParentSpecified() {
            return localParentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getParent() {
            return localParent;
        }

        /**
         * Auto generated setter method
         * @param param Parent
         */
        public void setParent(java.lang.String param) {
            localParentTracker = param != null;

            this.localParent = param;
        }

        public boolean isPinSpecified() {
            return localPinTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getPin() {
            return localPin;
        }

        /**
         * Auto generated setter method
         * @param param Pin
         */
        public void setPin(boolean param) {
            // setting primitive attribute tracker to true
            localPinTracker = true;

            this.localPin = param;
        }

        public boolean isPrevious_suite_resultSpecified() {
            return localPrevious_suite_resultTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPrevious_suite_result() {
            return localPrevious_suite_result;
        }

        /**
         * Auto generated setter method
         * @param param Previous_suite_result
         */
        public void setPrevious_suite_result(java.lang.String param) {
            localPrevious_suite_resultTracker = param != null;

            this.localPrevious_suite_result = param;
        }

        public boolean isRolled_up_test_error_countSpecified() {
            return localRolled_up_test_error_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_error_count() {
            return localRolled_up_test_error_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_error_count
         */
        public void setRolled_up_test_error_count(java.math.BigInteger param) {
            localRolled_up_test_error_countTracker = param != null;

            this.localRolled_up_test_error_count = param;
        }

        public boolean isRolled_up_test_failure_countSpecified() {
            return localRolled_up_test_failure_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_failure_count() {
            return localRolled_up_test_failure_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_failure_count
         */
        public void setRolled_up_test_failure_count(java.math.BigInteger param) {
            localRolled_up_test_failure_countTracker = param != null;

            this.localRolled_up_test_failure_count = param;
        }

        public boolean isRolled_up_test_skip_countSpecified() {
            return localRolled_up_test_skip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_skip_count() {
            return localRolled_up_test_skip_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_skip_count
         */
        public void setRolled_up_test_skip_count(java.math.BigInteger param) {
            localRolled_up_test_skip_countTracker = param != null;

            this.localRolled_up_test_skip_count = param;
        }

        public boolean isRolled_up_test_success_countSpecified() {
            return localRolled_up_test_success_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getRolled_up_test_success_count() {
            return localRolled_up_test_success_count;
        }

        /**
         * Auto generated setter method
         * @param param Rolled_up_test_success_count
         */
        public void setRolled_up_test_success_count(java.math.BigInteger param) {
            localRolled_up_test_success_countTracker = param != null;

            this.localRolled_up_test_success_count = param;
        }

        public boolean isRun_timeSpecified() {
            return localRun_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRun_time() {
            return localRun_time;
        }

        /**
         * Auto generated setter method
         * @param param Run_time
         */
        public void setRun_time(java.lang.String param) {
            localRun_timeTracker = param != null;

            this.localRun_time = param;
        }

        public boolean isSchedule_runSpecified() {
            return localSchedule_runTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSchedule_run() {
            return localSchedule_run;
        }

        /**
         * Auto generated setter method
         * @param param Schedule_run
         */
        public void setSchedule_run(java.lang.String param) {
            localSchedule_runTracker = param != null;

            this.localSchedule_run = param;
        }

        public boolean isSkip_countSpecified() {
            return localSkip_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSkip_count() {
            return localSkip_count;
        }

        /**
         * Auto generated setter method
         * @param param Skip_count
         */
        public void setSkip_count(java.math.BigInteger param) {
            localSkip_countTracker = param != null;

            this.localSkip_count = param;
        }

        public boolean isStart_timeSpecified() {
            return localStart_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStart_time() {
            return localStart_time;
        }

        /**
         * Auto generated setter method
         * @param param Start_time
         */
        public void setStart_time(java.lang.String param) {
            localStart_timeTracker = param != null;

            this.localStart_time = param;
        }

        public boolean isStatusSpecified() {
            return localStatusTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            localStatusTracker = param != null;

            this.localStatus = param;
        }

        public boolean isSuccessSpecified() {
            return localSuccessTracker;
        }

        /**
         * Auto generated getter method
         * @return boolean
         */
        public boolean getSuccess() {
            return localSuccess;
        }

        /**
         * Auto generated setter method
         * @param param Success
         */
        public void setSuccess(boolean param) {
            // setting primitive attribute tracker to true
            localSuccessTracker = true;

            this.localSuccess = param;
        }

        public boolean isSuccess_countSpecified() {
            return localSuccess_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSuccess_count() {
            return localSuccess_count;
        }

        /**
         * Auto generated setter method
         * @param param Success_count
         */
        public void setSuccess_count(java.math.BigInteger param) {
            localSuccess_countTracker = param != null;

            this.localSuccess_count = param;
        }

        public boolean isTest_suiteSpecified() {
            return localTest_suiteTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTest_suite() {
            return localTest_suite;
        }

        /**
         * Auto generated setter method
         * @param param Test_suite
         */
        public void setTest_suite(java.lang.String param) {
            localTest_suiteTracker = param != null;

            this.localTest_suite = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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

            if (localBase_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "base_suite_result",
                    xmlWriter);

                if (localBase_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "base_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBase_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localEnd_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "end_time", xmlWriter);

                if (localEnd_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "end_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEnd_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "error_count", xmlWriter);

                if (localError_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localExecution_trackerTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "execution_tracker",
                    xmlWriter);

                if (localExecution_tracker == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "execution_tracker cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localExecution_tracker);
                }

                xmlWriter.writeEndElement();
            }

            if (localFailure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "failure_count", xmlWriter);

                if (localFailure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFailure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localParentTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "parent", xmlWriter);

                if (localParent == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "parent cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localParent);
                }

                xmlWriter.writeEndElement();
            }

            if (localPinTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "pin", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "pin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPin));
                }

                xmlWriter.writeEndElement();
            }

            if (localPrevious_suite_resultTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "previous_suite_result",
                    xmlWriter);

                if (localPrevious_suite_result == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "previous_suite_result cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPrevious_suite_result);
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_error_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_error_count", xmlWriter);

                if (localRolled_up_test_error_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_error_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_error_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_failure_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_failure_count", xmlWriter);

                if (localRolled_up_test_failure_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_failure_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_failure_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_skip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "rolled_up_test_skip_count",
                    xmlWriter);

                if (localRolled_up_test_skip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_skip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRolled_up_test_success_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace,
                    "rolled_up_test_success_count", xmlWriter);

                if (localRolled_up_test_success_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rolled_up_test_success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRolled_up_test_success_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localRun_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "run_time", xmlWriter);

                if (localRun_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "run_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRun_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localSchedule_runTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "schedule_run", xmlWriter);

                if (localSchedule_run == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "schedule_run cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSchedule_run);
                }

                xmlWriter.writeEndElement();
            }

            if (localSkip_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "skip_count", xmlWriter);

                if (localSkip_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "skip_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSkip_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localStart_timeTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "start_time", xmlWriter);

                if (localStart_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "start_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStart_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localStatusTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "status", xmlWriter);

                if (localStatus == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus);
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccessTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success", xmlWriter);

                if (false) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "success cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess));
                }

                xmlWriter.writeEndElement();
            }

            if (localSuccess_countTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "success_count", xmlWriter);

                if (localSuccess_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "success_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSuccess_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localTest_suiteTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "test_suite", xmlWriter);

                if (localTest_suite == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "test_suite cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTest_suite);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "base_suite_result").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "base_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBase_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "end_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "end_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEnd_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "error_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "execution_tracker").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "execution_tracker" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setExecution_tracker(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "failure_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFailure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "parent").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "parent" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setParent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "pin").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "previous_suite_result").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "previous_suite_result" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPrevious_suite_result(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_error_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_error_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_error_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_failure_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_failure_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_failure_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_skip_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rolled_up_test_skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_skip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "rolled_up_test_success_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                "rolled_up_test_success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRolled_up_test_success_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "run_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "run_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRun_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "schedule_run").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "schedule_run" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSchedule_run(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "skip_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "skip_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSkip_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "start_time").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "start_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStart_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "status").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "success_count").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "success_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSuccess_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "test_suite").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "test_suite" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTest_suite(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                    namespace = "http://www.service-now.com/sys_atf_test_suite_result";

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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                            "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/sys_atf_test_suite_result",
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
         * field for Number
         */
        protected java.lang.String localNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNumberTracker = false;

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

        public boolean isNumberSpecified() {
            return localNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNumber() {
            return localNumber;
        }

        /**
         * Auto generated setter method
         * @param param Number
         */
        public void setNumber(java.lang.String param) {
            localNumberTracker = param != null;

            this.localNumber = param;
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
                        "http://www.service-now.com/sys_atf_test_suite_result");

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
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
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

            if (localNumberTracker) {
                namespace = "http://www.service-now.com/sys_atf_test_suite_result";
                writeStartElement(null, namespace, "number", xmlWriter);

                if (localNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "number cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNumber);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/sys_atf_test_suite_result")) {
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
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
                                "http://www.service-now.com/sys_atf_test_suite_result",
                                "number").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "number" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
