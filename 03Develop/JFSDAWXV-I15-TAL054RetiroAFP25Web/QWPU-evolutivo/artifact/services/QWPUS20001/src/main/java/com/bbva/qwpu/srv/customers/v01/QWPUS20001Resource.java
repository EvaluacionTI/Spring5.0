package com.bbva.qwpu.srv.customers.v01;

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

@Path("/customers")
@ApxUriInfo(uri = "/customers/v1")
public class QWPUS20001Resource extends AbstractResource {

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT205", versionCode = "01", countryCode = "PE", method = "getListPaginationCustomer", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_404 })
    public Response getListPaginationCustomer(@QueryParam("paginationKey") String paginationKey, @QueryParam("pageSize") String pageSize, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT205", "01", "PE", "getListPaginationCustomer", mc, this.bundleContext);
    }

    @DELETE
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-customer}")
    @ApxTransactionInfo(transactionCode = "QWPUT204", versionCode = "01", countryCode = "PE", method = "deleteCustomer", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response deleteCustomer(@PathParam("id-customer") String idCustomer, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT204", "01", "PE", "deleteCustomer", mc, this.bundleContext);
    }

    @PUT
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-customer}")
    @ApxTransactionInfo(transactionCode = "QWPUT203", versionCode = "01", countryCode = "PE", method = "updateCustomer", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_202, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response updateCustomer(@PathParam("id-customer") String idCustomer, Map<String, Object> cuerpo, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT203", "01", "PE", "updateCustomer", cuerpo, mc, this.bundleContext);
    }

    @POST
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT202", versionCode = "01", countryCode = "PE", method = "saveCustomer", responses = { HttpResponseCode.HTTP_CODE_200 })
    public Response saveCustomer(Map<String, Object> cuerpo, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT202", "01", "PE", "saveCustomer", cuerpo, mc, this.bundleContext);
    }

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/{id-customer}")
    @ApxTransactionInfo(transactionCode = "QWPUT201", versionCode = "01", countryCode = "PE", method = "getCustomerById", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_404 })
    public Response getCustomerById(@PathParam("id-customer") String idCustomer, @Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT201", "01", "PE", "getCustomerById", mc, this.bundleContext);
    }

    @GET
    @Produces(value = { "application/json" })
    @Consumes(value = { "application/json" })
    @Path("/")
    @ApxTransactionInfo(transactionCode = "QWPUT200", versionCode = "01", countryCode = "PE", method = "getListAllCustomers", responses = { HttpResponseCode.HTTP_CODE_200, HttpResponseCode.HTTP_CODE_204, HttpResponseCode.HTTP_CODE_404 })
    public Response getListAllCustomers(@Context MessageContext mc) {
        return this.otmaPGApxRestfulService.otmaPgApxRestfulService("QWPUT200", "01", "PE", "getListAllCustomers", mc, this.bundleContext);
    }
}
