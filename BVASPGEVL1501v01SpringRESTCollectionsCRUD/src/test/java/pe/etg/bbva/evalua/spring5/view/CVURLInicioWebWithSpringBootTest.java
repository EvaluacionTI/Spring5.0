package pe.etg.bbva.evalua.spring5.view;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import pe.etg.bbva.evalua.spring5.controller.rest.CCURLInicioWeb;

@RunWith(SpringRunner.class)

// 1. Asignar el dato del controlador
@WebMvcTest(CCURLInicioWeb.class)
public class CVURLInicioWebWithSpringBootTest {

	// 2. Instanciar el Mockito
	@Autowired
	private MockMvc oMockMvc;
	
	String sContentExpect = "application/json;charset=UTF-8";
	String sContentDataMock = "application/json;charset=UTF-8";
	
	// 3. Realizar Test
	// El slash porque el servicio rest inicial con invocarlo muestra el mensaje http://localhost:8020/
	@Test
	public void testGetRevisionTest() throws Exception {
		
		this.oMockMvc.perform(get("/").accept(MediaType.parseMediaType(sContentDataMock)))
				.andExpect(status().isOk())
				.andExpect(content().contentType(sContentExpect));
	}
}
