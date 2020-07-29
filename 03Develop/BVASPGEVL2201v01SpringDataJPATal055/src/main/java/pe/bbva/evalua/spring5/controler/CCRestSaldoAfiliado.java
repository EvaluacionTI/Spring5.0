package pe.bbva.evalua.spring5.controler;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.service.CSSaldoAfiliado;

@RestController
public class CCRestSaldoAfiliado {
	public static final Logger LOG = LoggerFactory.getLogger("CCRestSaldoAfiliado");

	@Autowired
	CSSaldoAfiliado poSaldo;

	@RequestMapping(value = "/afiliado/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<CESaldoAfiliadoCustom> getAllUsers(@PathVariable Integer id) {
		return poSaldo.getByIdSaldoAfiliado(id);
	}

	@RequestMapping(value = "/afiliadoByCodigo/{codigo}", method = RequestMethod.GET)
	public CESaldoAfiliadoCustom getPersoneByName(@PathVariable String codigo) {
		return poSaldo.getByCodigoSaldoAfiliado(codigo);
	}

	@RequestMapping(value = "/afiliado", method = RequestMethod.GET)
	public List<CESaldoAfiliadoCustom> getAll() {
		return poSaldo.getAllSaldoAfiliado();
	}

	@RequestMapping(value = "/afiliado/{id}", method = RequestMethod.DELETE)
	public HttpStatus deletePersnone(@PathVariable Integer id) {
		poSaldo.deleteSaldoAfiliado(id);
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/afiliado", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody CESaldoAfiliadoCustom poCESaldo) {
		return poSaldo.addSaldoAfiliado(poCESaldo) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/afiliado", method = RequestMethod.PUT)
	public HttpStatus updatePerson(@RequestBody CESaldoAfiliadoCustom poCESaldo) {
		return poSaldo.updateSaldoAfiliado(poCESaldo) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
