package fr.afcepf.atod26.bpel.seb.api.service.trois;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://trois.service.afcepf.fr")
public interface IService3 {

	@WebMethod(operationName = "methodeServiceTrois")
	@WebResult(name = "reponseServiceTrois")
	String methodeTrois();

}
