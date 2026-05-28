package lk.jiat.ecomm.user.remote;

import jakarta.ejb.Remote;
import lk.jiat.ecomm.user.dto.UserDTO;

import java.util.List;

@Remote
public interface UserRemote {

    UserDTO getUser(Long id);
    UserDTO getUserByEmail(String email);
    UserDTO createUser(UserDTO user);
    UserDTO updateUser(UserDTO user);
    void deleteUser(String username);
    List<UserDTO> getAllUsers();

}

