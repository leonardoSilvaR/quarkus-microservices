package com.br.marketplace.user.controller

import com.br.marketplace.user.dto.UserRequest
import com.br.marketplace.user.service.UserService
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import java.net.URI
import java.util.*

@Path("/v1/users")
class UserController(
    @Inject
    private val userService: UserService
) {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun create(
        userRequest: UserRequest
    ): Response {
        return Response
            .created(URI.create("/users/${UUID.randomUUID()}"))
            .build()
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun retrieve(@PathParam("id") id: String): Response {
        val result = userService.retrieve(id)
        return Response.ok(
            result
        ).build()
    }
}

