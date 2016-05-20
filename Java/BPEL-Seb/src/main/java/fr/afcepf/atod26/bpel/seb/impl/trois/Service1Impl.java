package fr.afcepf.atod26.bpel.seb.impl.trois;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.bpel.seb.api.service.trois.IService3;

@WebService(targetNamespace = "http://troisservice.afcepf.fr", endpointInterface = "fr.afcepf.atod26.bpel.seb.api.service.trois.IService3")
public class Service1Impl implements IService3 {

	private static final Logger LOGGER = Logger.getLogger(Service1Impl.class);

	@Override
	public String methodeTrois() {
		LOGGER.info("methodeDeux");
		return "Hello du service 3";
	}

}
