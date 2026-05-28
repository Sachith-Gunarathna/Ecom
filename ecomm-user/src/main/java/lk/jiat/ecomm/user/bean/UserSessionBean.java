package lk.jiat.ecomm.user.bean;

import lk.jiat.ecomm.user.dto.UserDTO;
import lk.jiat.ecomm.user.remote.UserRemote;

import java.util.List;

public class UserSessionBean implements UserRemote {

    @Override
    public UserDTO getUser(String username) {
        return null;
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return null;
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public List getAllUsers() {
        return List.of();
    }
}
