package fr.afcepf.atod26.bpel.ws.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.bpel.ws.api.ICalculateurService;

@WebService(targetNamespace = "http://calculateur.bpel.jerome.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.bpel.ws.api.ICalculateurService")
@Remote(ICalculateurService.class)
@Stateless
public class CalculateurServiceImpl implements ICalculateurService {

	private Logger logger = Logger.getLogger(CalculateurServiceImpl.class);

	@Override
	public double additition(final double paramPremier, final double paramDeuxieme) {
		logger.info("Méthode additition");
		System.out.println("addition");
		return paramPremier + paramDeuxieme;
	}

	@Override
	public double multiplication(final double paramPremier, final double paramDeuxieme) {
		logger.info("Méthode multiplication");
		System.out.println("multiplication");
		return paramPremier * paramDeuxieme;
	}

}
