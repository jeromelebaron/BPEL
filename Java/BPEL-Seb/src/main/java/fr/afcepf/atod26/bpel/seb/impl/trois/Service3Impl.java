package fr.afcepf.atod26.bpel.seb.impl.trois;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.bpel.seb.api.service.trois.IService3;

@WebService(targetNamespace = "http://trois.service.afcepf.fr", endpointInterface = "fr.afcepf.atod26.bpel.seb.api.service.trois.IService3")
@Remote(IService3.class)
@Stateless
public class Service3Impl implements IService3 {

	private static final Logger LOGGER = Logger.getLogger(Service3Impl.class);

	@Override
	public String methodeTrois() {
		LOGGER.info("methodeTrois");
		return "Hello du service 3";
	}

}
