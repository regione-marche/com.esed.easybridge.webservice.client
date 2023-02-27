/**
 * ParametroCuteCute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.operazioni.head;

public class ParametroCuteCute  implements java.io.Serializable {
    private java.lang.String cutecute;

    public ParametroCuteCute() {
    }

    public ParametroCuteCute(
           java.lang.String cutecute) {
           this.cutecute = cutecute;
    }


    /**
     * Gets the cutecute value for this ParametroCuteCute.
     * 
     * @return cutecute
     */
    public java.lang.String getCutecute() {
        return cutecute;
    }


    /**
     * Sets the cutecute value for this ParametroCuteCute.
     * 
     * @param cutecute
     */
    public void setCutecute(java.lang.String cutecute) {
        this.cutecute = cutecute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroCuteCute)) return false;
        ParametroCuteCute other = (ParametroCuteCute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cutecute==null && other.getCutecute()==null) || 
             (this.cutecute!=null &&
              this.cutecute.equals(other.getCutecute())));
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
        if (getCutecute() != null) {
            _hashCode += getCutecute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroCuteCute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cutecute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cutecute"));
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
