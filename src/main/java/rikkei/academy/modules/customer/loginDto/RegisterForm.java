package rikkei.academy.modules.customer.loginDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterForm {
    private String username;
    private String password;
    private String email;
}
