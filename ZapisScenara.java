package ScenarParsing;


/**
 * @author User
 * @version 1.0
 * @created 25-Apr-2018 4:05:41 PM
 */
public abstract class ZapisScenara {

	public ZapisScenara(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param textScenaraStream
	 */
	public abstract void spracujScenu(Scanner textScenaraStream);
}//end ZapisScenara