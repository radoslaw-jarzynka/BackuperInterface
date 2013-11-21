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

public interface BackuperInterface extends Remote {

	public void uploadFile(String username, String fileName, long lastModified, String md5hex, RemoteInputStream remoteFileData) throws RemoteException;
	public RemoteInputStream getFile(String username, String fileName) throws RemoteException;
	public String getFileMD5(String username, String fileName) throws RemoteException;
	public long getFileLastModified (String username, String fileName) throws RemoteException;
	public Vector<String> getListOfFilesOnServer(String username) throws RemoteException;
	public HashMap<String,Long> getMapOfFilesOnServer(String username) throws RemoteException;
	public boolean logIn(String username, String password) throws RemoteException;
	public boolean register(String username, String password) throws RemoteException;
	public void disconnect(String username) throws RemoteException;
	public void removeSelectedFile(String username, String fileName) throws RemoteException;

}
