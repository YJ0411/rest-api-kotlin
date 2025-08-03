package api.v1.controller

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.http.MediaType

@WebMvcTest(HelloController::class)
class HelloControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should return Hello World from YJ`() {
        mockMvc.get("/helloworld")
            .andExpect {
                status { isOk() }
                content { string("Hello World from YJ!") }
            }

    }
}
