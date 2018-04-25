

/**
 * @author Dano
 * @version 1.0
 * @created 25-Apr-2018 4:05:17 PM
 */
public interface Repository {

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param entita
	 */
	public T pridaj(T entita){
		return null;
	}

	/**
	 * 
	 * @param entita
	 */
	public T uprav(T entita){
		return null;
	}

	/**
	 * 
	 * @param entita
	 */
	public T vymaz(T entita){
		return null;
	}

	/**
	 * 
	 * @param specifikacia
	 */
	public T ziskaj(T specifikacia){
		return null;
	}
}//end Repository