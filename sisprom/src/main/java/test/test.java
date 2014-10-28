package test;

import com.sisprom.framework.dominio.Auditoria;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.model.dao.impl.SecretariaDaoImpl;
import com.sisprom.framework.model.services.Services;
import com.sisprom.framework.model.xml.context.Context;

public class test {
	private static Services services= Context.getBeanFacade();
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		  Auditoria audi=new Auditoria(null, null, null, null);
		 Secretaria secre= new Secretaria(1,"sol", "camus", "tupac","32234242","1232345","usu1","cont1",audi,null,null);
		 services.saveSecretaria(secre);
		  

	}

}
