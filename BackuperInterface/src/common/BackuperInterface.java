/**
 * created on 19:33:01 26 paź 2013 by Radoslaw Jarzynka
 * 
 * @author Radoslaw Jarzynka
 */
package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Vector;

import com.healthmarketscience.rmiio.RemoteInputStream;
//zdalny interfejs RMI
public interface BackuperInterface extends Remote {
	//wgranie pliku na serwer
	public void uploadFile(String username, String fileName, long lastModified, RemoteInputStream remoteFileData) throws RemoteException;
	//sciagniecie pliku z serwera
	public RemoteInputStream getFile(String username, String fileName) throws RemoteException;
	//pobranie md5 pliku
	public String getFileMD5(String username, String fileName) throws RemoteException;
	//pobranie wektora nazw plikow na serwerze
	public Vector<String> getListOfFilesOnServer(String username) throws RemoteException;
	//pobranie mapy <nazwapliku, lastmodified> plikow na serwerze
	public HashMap<String,Long> getMapOfFilesOnServer(String username) throws RemoteException;
	//logowanie na serwerze
	public boolean logIn(String username, String password) throws RemoteException;
	//rejestracja na serwerze
	public boolean register(String username, String password) throws RemoteException;
	//rozlaczenie z serwerem
	public void disconnect(String username) throws RemoteException;
	//usuniecie pliku z serwera
	public void removeSelectedFile(String username, String fileName) throws RemoteException;

}
