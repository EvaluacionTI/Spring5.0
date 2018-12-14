package pe.etg.bbva.spring.view;

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

import pe.etg.bbva.spring.controller.CCURLInicioWeb;

@RunWith(SpringRunner.class)
// 1. Asignar el dato del controlador
@WebMvcTest(CCURLInicioWeb.class)
public class CV1301v01SprintBootURLWebTest {

	// 2. Instanciar el Mockito
	@Autowired
	private MockMvc oMockMvc;
	
	// 3. Realizar Test
	@Test
	public void testGetRevisionTest() throws Exception {
		
		this.oMockMvc.perform(get("/")
					.accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
				).andExpect(status().isOk())
				 .andExpect(content().contentType("application/json"));
		
	}

}
