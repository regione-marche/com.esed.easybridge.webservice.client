package com.esed.easybridge.webservice.source;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.esed.easybridge.webservice.dati.InviaCarrelloRTPRequest;
import com.esed.easybridge.webservice.dati.InviaCarrelloRTPResponse;


public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		try {
			EasybridgeLocator locator =new EasybridgeLocator();
			EasybridgeInterface service= locator.getEasybridgePort(new URL("http://localhost:9862/EasybridgeService/EasybridgePort"));
			InviaCarrelloRTPRequest in = new InviaCarrelloRTPRequest();
			
			String xmlCarrelloRTP = "";
			//D:\FileTemporanei\Payer\EasyBridge\carrelloRTP.xml
			try {
//				BufferedReader br = new BufferedReader(new FileReader("D:\\FileTemporanei\\Payer\\EasyBridge\\carrelloRTP.xml"));
				BufferedReader br = new BufferedReader(new FileReader("D:\\FileTemporanei\\Payer\\EasyBridge\\xml_CARRELLO_RPT-1.8.xml"));
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        //sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			    xmlCarrelloRTP = sb.toString();
			    br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
			}
			
			in.setXmlCarrelloRTP(xmlCarrelloRTP);
			InviaCarrelloRTPResponse res = service.inviaCarrelloRTP(in);
			
			System.out.println("Esito complessivo operazione: " + res.getEsitoComplessivoOperazione());
			if(res.getUrl() != null)
				System.out.println("Url Redirect: " + res.getUrl());
			
	
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} finally {
			System.out.println(messaggio);
		}
	}
}
