package fr.afcepf.atod26.bpel.ws.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://calculateur.bpel.jerome.atod26.afcepf.fr")
public interface ICalculateurService {

	@WebMethod(operationName = "ajouter")
	@WebResult(name = "resultatAddition")
	double additition(@WebParam(name = "premierAddition") double paramPremier,
			@WebParam(name = "deuxiemeAddition") double paramDeuxieme);

	@WebMethod(operationName = "multiplier")
	@WebResult(name = "resultatMultiplication")
	double multiplication(@WebParam(name = "premierMultiplication") double paramPremier,
			@WebParam(name = "deuxiemeMultiplication") double paramDeuxieme);
}
