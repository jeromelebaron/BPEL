package fr.afcepf.atod26.bpel.ws.impl;

import javax.jws.WebService;

import fr.afcepf.atod26.bpel.ws.api.ICalculateurService;

@WebService(endpointInterface = "fr.afcepf.atod26.bpel.ws.api.ICalculateur", targetNamespace = "http://calculateur.bpel.jerome.atod26.afcepf.fr")
public class CalculateurServiceImpl implements ICalculateurService {

	@Override
	public double additition(final double paramPremier, final double paramDeuxieme) {
		return paramPremier + paramDeuxieme;
	}

	@Override
	public double multiplication(final double paramPremier, final double paramDeuxieme) {
		return paramPremier * paramDeuxieme;
	}

}
