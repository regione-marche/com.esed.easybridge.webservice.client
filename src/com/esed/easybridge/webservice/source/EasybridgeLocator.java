/**
 * EasybridgeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.source;

public class EasybridgeLocator extends org.apache.axis.client.Service implements com.esed.easybridge.webservice.source.Easybridge {

    public EasybridgeLocator() {
    }


    public EasybridgeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EasybridgeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EasybridgePort
    private java.lang.String EasybridgePort_address = "http://localhost:8611/EasybridgeService/EasybridgePort";

    public java.lang.String getEasybridgePortAddress() {
        return EasybridgePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EasybridgePortWSDDServiceName = "EasybridgePort";

    public java.lang.String getEasybridgePortWSDDServiceName() {
        return EasybridgePortWSDDServiceName;
    }

    public void setEasybridgePortWSDDServiceName(java.lang.String name) {
        EasybridgePortWSDDServiceName = name;
    }

    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EasybridgePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEasybridgePort(endpoint);
    }

    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub _stub = new com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getEasybridgePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }
    
    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort(java.net.URL portAddress, String httpUserName, String httpPassword) throws javax.xml.rpc.ServiceException {
        try {
            com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub _stub = new com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getEasybridgePortWSDDServiceName());
            _stub.setHttpUserName(httpUserName);
            _stub.setHttpPassword(httpPassword);
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEasybridgePortEndpointAddress(java.lang.String address) {
        EasybridgePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.esed.easybridge.webservice.source.EasybridgeInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub _stub = new com.esed.easybridge.webservice.source.EasybridgeSOAPBindingStub(new java.net.URL(EasybridgePort_address), this);
                _stub.setPortName(getEasybridgePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EasybridgePort".equals(inputPortName)) {
            return getEasybridgePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.easybridge.esed.com", "easybridge");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.easybridge.esed.com", "EasybridgePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EasybridgePort".equals(portName)) {
            setEasybridgePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
