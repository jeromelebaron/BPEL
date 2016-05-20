package fr.afcepf.atod26.bpel.seb.api.service.un;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://un.service.afcepf.fr")
public interface IService1 {

	@WebMethod(operationName = "methodeServiceUn")
	@WebResult(name = "reponseServiceUn")
	String methodeUn();

}
