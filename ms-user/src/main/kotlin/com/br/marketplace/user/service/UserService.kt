package com.br.marketplace.user.service

import com.br.marketplace.user.dto.UserRequest
import jakarta.enterprise.context.ApplicationScoped
import org.slf4j.LoggerFactory

@ApplicationScoped
class UserService {

    private val logger = LoggerFactory.getLogger(javaClass)

    fun retrieve(id: String): UserRequest {
        logger.info("Retrieving user by id:$id")
        return UserRequest(
                name = "Leonardo",
                age = 28
        )
    }
}