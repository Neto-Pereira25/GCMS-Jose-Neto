package br.edu.ifpe.recife.gcms.joseneto.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, World!")));
	}

	@Test
	public void shouldReturnNetoMessage() throws Exception {
		this.mockMvc.perform(get("/neto"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, Neto!")));
	}

	@Test

	public void shouldReturnPereiraMessage() throws Exception {
		this.mockMvc.perform(get("/pereira"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, Pereira!")));
	}

	public void shouldReturnJoseMessage() throws Exception {
		this.mockMvc.perform(get("/jose"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, Jose!")));
	}
}