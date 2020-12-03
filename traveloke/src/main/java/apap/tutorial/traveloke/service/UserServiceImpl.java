package apap.tutorial.traveloke.service;

import apap.tutorial.traveloke.model.UserModel;
import apap.tutorial.traveloke.repository.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDb userDb;

    @Override
    public String encrypt(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        return hashedPassword;
    }

    @Override
    public UserModel addUser(UserModel user) {
        String pass = encrypt(user.getPassword());
        user.setPassword(pass);
        return userDb.save(user);
    }

    @Override
    public String updatePassword(UserModel user, String oldPassword, String newPassword, String confirmPassword) {
        UserModel targetUser = userDb.findByUsername(user.getUsername());
        try {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            if (passwordEncoder.matches(oldPassword, targetUser.getPassword())){
                if (newPassword.equals(confirmPassword)){
                    String pass = encrypt(confirmPassword);
                    targetUser.setPassword(pass);
                    userDb.save(targetUser);
                    return "berhasil";
                } else {
                    return "Password baru dengan Konfirmasi password tidak sesuai!";
                }
            } else {
                return "Password lama tidak benar";
            }
        } catch (NullPointerException e){
            return null;
        }
    }
}
