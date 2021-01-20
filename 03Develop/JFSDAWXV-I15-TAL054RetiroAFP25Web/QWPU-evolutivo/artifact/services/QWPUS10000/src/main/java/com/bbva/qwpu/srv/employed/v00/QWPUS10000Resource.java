package com.bbva.qwpu.srv.employed.v00;

import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.MessageContext;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.elara.physical.restful.annotation.ApxTransactionInfo;
import com.bbva.elara.physical.restful.annotation.ApxUriInfo;
import com.bbva.elara.physical.restful.annotation.PATCH;

@Path("/analista")
@ApxUriInfo(uri = "/employed/v0")
public class QWPUS10000Resource extends AbstractResource {

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT100", versionCode = "01", countryCode = "PE", method = "getListAllEmployed", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_202, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response getListAllEmployed(@Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT100", "01", "PE", "getListAllEmployed", mc, this.bundleContext);
    }
}
