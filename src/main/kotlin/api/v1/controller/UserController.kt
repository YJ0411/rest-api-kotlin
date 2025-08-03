package api.v1.controller

import api.v1.model.User
import api.v1.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
    private val userRepository: UserRepository
) {

    @GetMapping
    fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userRepository.save(user)
    }
}
