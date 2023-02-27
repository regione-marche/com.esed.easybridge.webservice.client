/**
 * InviaCarrelloRTPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.dati;

public class InviaCarrelloRTPRequest  implements java.io.Serializable {
    private java.lang.String xmlCarrelloRTP;

    public InviaCarrelloRTPRequest() {
    }

    public InviaCarrelloRTPRequest(
           java.lang.String xmlCarrelloRTP) {
           this.xmlCarrelloRTP = xmlCarrelloRTP;
    }


    /**
     * Gets the xmlCarrelloRTP value for this InviaCarrelloRTPRequest.
     * 
     * @return xmlCarrelloRTP
     */
    public java.lang.String getXmlCarrelloRTP() {
        return xmlCarrelloRTP;
    }


    /**
     * Sets the xmlCarrelloRTP value for this InviaCarrelloRTPRequest.
     * 
     * @param xmlCarrelloRTP
     */
    public void setXmlCarrelloRTP(java.lang.String xmlCarrelloRTP) {
        this.xmlCarrelloRTP = xmlCarrelloRTP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InviaCarrelloRTPRequest)) return false;
        InviaCarrelloRTPRequest other = (InviaCarrelloRTPRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlCarrelloRTP==null && other.getXmlCarrelloRTP()==null) || 
             (this.xmlCarrelloRTP!=null &&
              this.xmlCarrelloRTP.equals(other.getXmlCarrelloRTP())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getXmlCarrelloRTP() != null) {
            _hashCode += getXmlCarrelloRTP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InviaCarrelloRTPRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", ">InviaCarrelloRTPRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlCarrelloRTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "xmlCarrelloRTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
