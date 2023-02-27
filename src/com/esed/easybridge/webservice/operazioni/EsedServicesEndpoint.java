/**
 * EsedServicesEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.esed.easybridge.webservice.operazioni;

public interface EsedServicesEndpoint extends java.rmi.Remote {
    public com.esed.easybridge.webservice.operazioni.NodoInviaRPTRisposta nodoInviaRPT(com.esed.easybridge.webservice.operazioni.NodoInviaRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.IntestazionePPT header) throws java.rmi.RemoteException;
    public com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPTRisposta nodoChiediStatoRPT(com.esed.easybridge.webservice.operazioni.NodoChiediStatoRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException;
    public com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRTRisposta nodoChiediCopiaRT(com.esed.easybridge.webservice.operazioni.NodoChiediCopiaRT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException;
    //inizio LP PG190220
    public com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevocaRisposta nodoInviaRispostaRevoca(com.esed.easybridge.webservice.operazioni.NodoInviaRispostaRevoca bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException;
    //fine LP PG190220
    //inizio LP PG21XX07
    public com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPTRisposta nodoChiediListaPendentiRPT(com.esed.easybridge.webservice.operazioni.NodoChiediListaPendentiRPT bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException;
    public com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPARisposta nodoPAChiediInformativaPA(com.esed.easybridge.webservice.operazioni.NodoPAChiediInformativaPA bodyrichiesta, com.esed.easybridge.webservice.operazioni.head.ParametroCuteCute cutecute) throws java.rmi.RemoteException;
    //fine LP PG21XX07
}
