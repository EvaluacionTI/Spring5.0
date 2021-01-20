package com.bbva.qwpu.srv.employed.v00;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.bbva.elara.physical.restful.connector.OtmaPGApxRestfulService;
import com.bbva.elara.raml.RamlGenerator;
import org.osgi.framework.BundleContext;


public class AbstractResource {
	
	protected OtmaPGApxRestfulService otmaPGApxRestfulService;
	protected BundleContext bundleContext;
	
	
	/**
	 * 
	 */
	protected RamlGenerator ramlGenerator;
	
	@GET
	@Path("/model")
	public Response ramlEndpoint(){
		return this.ramlGenerator.getRamlTransactionalService("QWPU", "100", "employed", "00");
	}
	
	/**
	 * @param ramlGenerator the ramlGenerator to set
	 */
	public void setRamlGenerator(RamlGenerator ramlGenerator) {
		this.ramlGenerator = ramlGenerator;
	}
	
	/**
	 * @param otmaPGApxRestfulService the otmaPGApxRestfulService to set
	 */
	public void setOtmaPGApxRestfulService(OtmaPGApxRestfulService otmaPGApxRestfulService) {
		this.otmaPGApxRestfulService = otmaPGApxRestfulService;
	}
	
	/**
	 * @param bundleContext the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}	
}
