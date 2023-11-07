package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICabinet extends Remote {
	
	void ajouterAnimal(String nomAnimal, String nomMaitre, int ageAnimal, Espece espece) throws RemoteException;
	void ajouterAnimal(String nomAnimal, String nomMaitre, int ageAnimal, String nomEspece, int dureeVie) throws RemoteException;
	
	//voir les infos d'un patient
	void getCabinet() throws RemoteException;
	
    void removeAnimal(String nomAnimal, String nomMaitre, int ageAnimal, Espece espece) throws RemoteException;
	void removeAnimal(String nomAnimal, String nomMaitre, int ageAnimal, String nomEspece, int dureeVie) throws RemoteException;
	
	void rechercherAnimal(String nom)throws RemoteException;
	
}
