/**
 * Easybridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.source;

public interface Easybridge extends javax.xml.rpc.Service {
    public java.lang.String getEasybridgePortAddress();

    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort() throws javax.xml.rpc.ServiceException;

    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public com.esed.easybridge.webservice.source.EasybridgeInterface getEasybridgePort(java.net.URL portAddress, String httpUserName, String httpPassword) throws javax.xml.rpc.ServiceException;
}
