/**
 * InviaCarrelloRTPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.dati;

public class InviaCarrelloRTPResponse  extends com.esed.easybridge.webservice.dati.Risposta  implements java.io.Serializable {
    private java.lang.String esitoComplessivoOperazione;

    private java.lang.String url;

    private com.esed.easybridge.webservice.dati.FaultBean[] listaErroriRPT;

    public InviaCarrelloRTPResponse() {
    }

    public InviaCarrelloRTPResponse(
           com.esed.easybridge.webservice.dati.FaultBean fault,
           java.lang.String esitoComplessivoOperazione,
           java.lang.String url,
           com.esed.easybridge.webservice.dati.FaultBean[] listaErroriRPT) {
        super(
            fault);
        this.esitoComplessivoOperazione = esitoComplessivoOperazione;
        this.url = url;
        this.listaErroriRPT = listaErroriRPT;
    }


    /**
     * Gets the esitoComplessivoOperazione value for this InviaCarrelloRTPResponse.
     * 
     * @return esitoComplessivoOperazione
     */
    public java.lang.String getEsitoComplessivoOperazione() {
        return esitoComplessivoOperazione;
    }


    /**
     * Sets the esitoComplessivoOperazione value for this InviaCarrelloRTPResponse.
     * 
     * @param esitoComplessivoOperazione
     */
    public void setEsitoComplessivoOperazione(java.lang.String esitoComplessivoOperazione) {
        this.esitoComplessivoOperazione = esitoComplessivoOperazione;
    }


    /**
     * Gets the url value for this InviaCarrelloRTPResponse.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this InviaCarrelloRTPResponse.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the listaErroriRPT value for this InviaCarrelloRTPResponse.
     * 
     * @return listaErroriRPT
     */
    public com.esed.easybridge.webservice.dati.FaultBean[] getListaErroriRPT() {
        return listaErroriRPT;
    }


    /**
     * Sets the listaErroriRPT value for this InviaCarrelloRTPResponse.
     * 
     * @param listaErroriRPT
     */
    public void setListaErroriRPT(com.esed.easybridge.webservice.dati.FaultBean[] listaErroriRPT) {
        this.listaErroriRPT = listaErroriRPT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InviaCarrelloRTPResponse)) return false;
        InviaCarrelloRTPResponse other = (InviaCarrelloRTPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.esitoComplessivoOperazione==null && other.getEsitoComplessivoOperazione()==null) || 
             (this.esitoComplessivoOperazione!=null &&
              this.esitoComplessivoOperazione.equals(other.getEsitoComplessivoOperazione()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.listaErroriRPT==null && other.getListaErroriRPT()==null) || 
             (this.listaErroriRPT!=null &&
              java.util.Arrays.equals(this.listaErroriRPT, other.getListaErroriRPT())));
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
        if (getEsitoComplessivoOperazione() != null) {
            _hashCode += getEsitoComplessivoOperazione().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getListaErroriRPT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaErroriRPT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaErroriRPT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InviaCarrelloRTPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "InviaCarrelloRTPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esitoComplessivoOperazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "esitoComplessivoOperazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaErroriRPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "listaErroriRPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "faultBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.easybridge.esed.com", "fault"));
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
