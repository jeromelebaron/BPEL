package fr.afcepf.atod26.bpel.seb.impl.deux;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.bpel.seb.api.service.deux.IService2;

@WebService(targetNamespace = "http://deux.service.afcepf.fr", endpointInterface = "fr.afcepf.atod26.bpel.seb.api.service.deux.IService2")
public class Service1Impl implements IService2 {

	private static final Logger LOGGER = Logger.getLogger(Service1Impl.class);

	@Override
	public String methodeDeux() {
		LOGGER.info("methodeDeux");
		return "Hello du service 1";
	}

}
