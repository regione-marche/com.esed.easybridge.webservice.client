/**
 * EsedServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.operazioni;

public class EsedServicesBindingStub extends org.apache.axis.client.Stub implements com.esed.easybridge.webservice.operazioni.EsedServicesEndpoint {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
    	//inizio LP PG21XX07
        //_operations = new org.apache.axis.description.OperationDesc[4]; //LP PG190220
        _operations = new org.apache.axis.description.OperationDesc[6];
    	//fine LP PG21XX07
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoInviaRPT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPT"), com.esed.easybridge.webservice.operazioni.NodoInviaRPT.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "intestazionePPT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "intestazionePPT"), com.esed.easybridge.webservice.operazioni.head.IntestazionePPT.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPTRisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPTRisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoChiediStatoRPT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPT"), com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPT.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPTRisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPTRisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoChiediCopiaRT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRT"), com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRT.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRTRisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRTRisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;
        //inizio LP PG190220
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoInviaRispostaRevoca");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevoca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevoca"), com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevoca.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevocaRisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevocaRisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;
        //fine LP PG190220
    	//inizio LP PG21XX07
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoChiediListaPendentiRPT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPT"), com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPT.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPTRisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPTRisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nodoPAChiediInformativaPA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPA"), com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPA.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute"), com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPARisposta"));
        oper.setReturnClass(com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPARisposta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;
    	//fine LP PG21XX07
    }

    public EsedServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EsedServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EsedServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "intestazionePPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.head.IntestazionePPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "parametroCuteCute");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "stText35");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com/head", "stText5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "esitoChiediStatoRPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.EsitoChiediStatoRPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "faultBean");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.FaultBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediCopiaRTRisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //inizio LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediListaPendentiRPTRisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //fine LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoChiediStatoRPTRisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //inizio LP PG190220
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevoca");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevoca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRispostaRevocaRisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //fine LP PG190220
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoInviaRPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoInviaRPTRisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //inizio LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPA");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "nodoPAChiediInformativaPARisposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //fine LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "risposta");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.Risposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "stPassword");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "stText35");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
            //inizio LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "tipoListaRPTPendenti");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.TipoListaRPTPendenti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "tipoRPTPendente");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.TipoRPTPendente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //fine LP PG21XX07
            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "tipoStoricoRPT");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.TipoStoricoRPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://operazioni.webservice.easybridge.esed.com", "tipoStoricoVersamento");
            cachedSerQNames.add(qName);
            cls = com.esed.easybridge.webservice.operazioni.TipoStoricoVersamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta nodoInviaRPT(com.esed.easybridge.webservice.operazioni.NodoInviaRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.IntestazionePPT header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoInviaRPT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta nodoChiediStatoRPT(com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoChiediStatoRPT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, cutecute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta nodoChiediCopiaRT(com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoChiediCopiaRT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, cutecute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    //inizio LP PG190220
    public com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta nodoInviaRispostaRevoca(com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevoca bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoInviaRispostaRevoca"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, cutecute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    //fine LP PG190220
    //inizio LP PG21XX07
    public com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta nodoChiediListaPendentiRPT(com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoChiediListaPendentiRPT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, cutecute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta nodoPAChiediInformativaPA(com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPA bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "nodoPAChiediInformativaPA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyrichiesta, cutecute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta) org.apache.axis.utils.JavaUtils.convert(_resp, com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    //fine LP PG21XX07
}
