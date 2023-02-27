/**
 * NodoChiediStatoRPTRisposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.operazioni;

public class NodoChiediStatoRPTRisposta  extends com.esed.easybridge.webservice.operazioni.Risposta  implements java.io.Serializable {
    private com.esed.easybridge.webservice.operazioni.EsitoChiediStatoRPT esito;

    public NodoChiediStatoRPTRisposta() {
    }

    public NodoChiediStatoRPTRisposta(
           com.esed.easybridge.webservice.operazioni.FaultBean fault,
           com.esed.easybridge.webservice.operazioni.EsitoChiediStatoRPT esito) {
        super(
            fault);
        this.esito = esito;
    }


    /**
     * Gets the esito value for this NodoChiediStatoRPTRisposta.
     * 
     * @return esito
     */
    public com.esed.easybridge.webservice.operazioni.EsitoChiediStatoRPT getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this NodoChiediStatoRPTRisposta.
     * 
     * @param esito
     */
    public void setEsito(com.esed.easybridge.webservice.operazioni.EsitoChiediStatoRPT esito) {
        this.esito = esito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodoChiediStatoRPTRisposta)) return false;
        NodoChiediStatoRPTRisposta other = (NodoChiediStatoRPTRisposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodoChiediStatoRPTRisposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPTRisposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "esitoChiediStatoRPT"));
        elemField.setMinOccurs(0);
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
