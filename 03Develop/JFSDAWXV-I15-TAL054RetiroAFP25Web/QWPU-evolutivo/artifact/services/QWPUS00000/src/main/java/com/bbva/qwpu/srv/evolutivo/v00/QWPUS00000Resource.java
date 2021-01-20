package com.bbva.qwpu.srv.evolutivo.v00;

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

@Path("/canal")
@ApxUriInfo(uri = "/evolutivo/v0")
public class QWPUS00000Resource extends AbstractResource {

    @DELETE
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-canal}")
    @ApxTransactionInfo(transactionCode = "QWPUT004", versionCode = "01", countryCode = "PE", method = "deleteCanal", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_201, HttpResponseCode.HTTP_CODE_404 })
    public Response deleteCanal(@PathParam("id-canal") String idCanal, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT004", "01", "PE", "deleteCanal", mc, this.bundleContext);
    }

    @PUT
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-canal}")
    @ApxTransactionInfo(transactionCode = "QWPUT003", versionCode = "01", countryCode = "PE", method = "updateCanal", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_404 })
    public Response updateCanal(@PathParam("id-canal") String idCanal, Map<String, Object> cuerpo, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT003", "01", "PE", "updateCanal", cuerpo, mc, this.bundleContext);
    }

    @POST
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT002", versionCode = "01", countryCode = "PE", method = "saveCanal", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response saveCanal(Map<String, Object> cuerpo, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT002", "01", "PE", "saveCanal", cuerpo, mc, this.bundleContext);
    }

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT000", versionCode = "01", countryCode = "PE", method = "getAllCanal", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_404 })
    public Response getAllCanal(@Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT000", "01", "PE", "getAllCanal", mc, this.bundleContext);
    }

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-canal}")
    @ApxTransactionInfo(transactionCode = "QWPUT001", versionCode = "01", countryCode = "PE", method = "getCanalById", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response getCanalById(@PathParam("id-canal") String idCanal, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT001", "01", "PE", "getCanalById", mc, this.bundleContext);
    }
}
