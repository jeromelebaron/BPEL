package fr.afcepf.atod26.bpel.seb.impl.un;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.bpel.seb.api.service.un.IService1;

@WebService(targetNamespace = "http://un.service.afcepf.fr", endpointInterface = "fr.afcepf.atod26.bpel.seb.api.service.un.IService1")
public class Service1Impl implements IService1 {

	private static final Logger LOGGER = Logger.getLogger(Service1Impl.class);

	@Override
	public String methodeUn() {
		LOGGER.info("methodeUn");
		return "Hello du service 1";
	}

}
