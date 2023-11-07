package common;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface IAnimal extends Remote {
	
	//SIGNATURE DES METHODES QUI SERONT IMPLEMENTEES
	
	String getNomAnimal() throws RemoteException;
	void  setNomAnimal(String nomAnimal) throws RemoteException;
	
	
	String getNomMaitre() throws RemoteException;
	void setNomMaitre(String nomMaitre) throws RemoteException;
	
	
	int getAgeAnimal() throws RemoteException;
	void  setAgeAnimal(int ageAnimal) throws RemoteException;
	
	
	String getNomComplet() throws RemoteException;
	
	
	String getDossier() throws RemoteException;
    void setDossier(String suivi) throws RemoteException;
    
    
    String getEspece()throws RemoteException;
    
    
    String nomEspece() throws RemoteException;
    void setNomEspece(String nom) throws RemoteException;
    
    
    int dureeVieEspece() throws RemoteException;
    void setDureeVieEspece(int vie) throws RemoteException;
    

}
