package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.UserModel;

public interface UserService {
    UserModel addUser(UserModel user);
    String encrypt(String password);
    String updatePassword(UserModel user, String oldPassword, String newPassword, String confirmPassword);
}
