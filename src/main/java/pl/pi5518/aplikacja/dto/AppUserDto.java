package pl.pi5518.aplikacja.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AppUserDto {
    @NotEmpty(message = "Pole nie może być puste!")
    private String username;

    @NotEmpty(message = "Pole nie może być puste!")
    private String mail;

    @NotEmpty(message = "Pole nie może być puste!")
    @Size(min = 6, message = "Hasło musi mieć min 6 znaków!")
    private String password;
    @Size(min = 6, message = "Hasło musi mieć min 6 znaków!")
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
