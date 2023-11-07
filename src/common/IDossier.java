package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDossier extends Remote {
	
	String getDossierSuivi() throws RemoteException;
	
	void setDossierSuivi(String suivi) throws RemoteException;
}
