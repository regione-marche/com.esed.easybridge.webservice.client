/**
 * EsedFacetServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.operazioni;

public class EsedFacetServiceLocator extends org.apache.axis.client.Service implements com.esed.easybridge.webservice.operazioni.EsedFacetService {

    public EsedFacetServiceLocator() {
    }


    public EsedFacetServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EsedFacetServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EsedServicesPort
    private java.lang.String EsedServicesPort_address = "http://localhost:9862/EasybridgeService/EsedServicesPort";

    public java.lang.String getEsedServicesPortAddress() {
        return EsedServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EsedServicesPortWSDDServiceName = "EsedServicesPort";

    public java.lang.String getEsedServicesPortWSDDServiceName() {
        return EsedServicesPortWSDDServiceName;
    }

    public void setEsedServicesPortWSDDServiceName(java.lang.String name) {
        EsedServicesPortWSDDServiceName = name;
    }

    public com.esed.easybridge.webservice.operazioni.EsedServicesEndpoint getEsedServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EsedServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEsedServicesPort(endpoint);
    }

    public com.esed.easybridge.webservice.operazioni.EsedServicesEndpoint getEsedServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.esed.easybridge.webservice.operazioni.EsedServicesBindingStub _stub = new com.esed.easybridge.webservice.operazioni.EsedServicesBindingStub(portAddress, this);
            _stub.setPortName(getEsedServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEsedServicesPortEndpointAddress(java.lang.String address) {
        EsedServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.esed.easybridge.webservice.operazioni.EsedServicesEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                com.esed.easybridge.webservice.operazioni.EsedServicesBindingStub _stub = new com.esed.easybridge.webservice.operazioni.EsedServicesBindingStub(new java.net.URL(EsedServicesPort_address), this);
                _stub.setPortName(getEsedServicesPortWSDDServiceName());
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
        if ("EsedServicesPort".equals(inputPortName)) {
            return getEsedServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "EsedFacetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "EsedServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EsedServicesPort".equals(portName)) {
            setEsedServicesPortEndpointAddress(address);
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
