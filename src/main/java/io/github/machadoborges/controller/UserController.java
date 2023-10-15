package io.github.machadoborges.controller;



import io.github.machadoborges.dto.UserDTO;
import io.github.machadoborges.services.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/market")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    @Inject
    UserService userService;

    @POST
    @Path("/register")
    @Transactional
    public Response registerUser(UserDTO dto) {
        userService.save(dto);

        return Response
                .status(Response.Status.CREATED.getStatusCode())
                .entity(dto)
                .build();

    }

    @POST
    @Path("/login")
    @Transactional
    public Response loginUser(UserDTO dto) {
       String token = userService.loginAndGenerateToken(dto);

       return Response.status(Response.Status.OK)
               .entity(token)
               .build();
    }
}