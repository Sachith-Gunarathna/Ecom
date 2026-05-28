package lk.jiat.ecomm.user.bean;

import lk.jiat.ecomm.user.dto.UserDTO;
import lk.jiat.ecomm.user.remote.UserRemote;

import java.util.List;

public class UserSessionBean implements UserRemote {

    @Override
    public UserDTO getUser(Long id) {
        return new UserDTO();
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return new UserDTO();
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        return new UserDTO();
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return new UserDTO();
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("UserSessionBean: deleteUser");
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
