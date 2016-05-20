package fr.afcepf.atod26.bpel.seb.api.service.deux;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://deux.service.afcepf.fr")
public interface IService2 {

	@WebMethod(operationName = "methodeServiceDeux")
	@WebResult(name = "reponseServiceDeux")
	String methodeDeux();

}
