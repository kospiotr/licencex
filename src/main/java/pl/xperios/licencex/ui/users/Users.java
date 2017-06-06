package pl.xperios.licencex.ui.users;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @Email
    private String email;

    @NotNull
    private String password;

}
