package api.v1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/helloworld")
    fun hello(): String {
        return "Hello World from YJ!"
    }
}
