package io.github.machadoborges.services;


import io.github.machadoborges.dto.UserDTO;

public interface UserService {

   void save(UserDTO dto);
   String loginAndGenerateToken(UserDTO dto);
}
