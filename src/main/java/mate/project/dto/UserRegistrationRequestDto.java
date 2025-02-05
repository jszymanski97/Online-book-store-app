package mate.project.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import mate.project.validation.FieldMatch;

@Getter
@FieldMatch(password = "password", repeatPassword = "repeatPassword",
        message = "Passwords do not match")

public class UserRegistrationRequestDto {
    @NotNull
    @Size(min = 1, max = 255)
    @Email
    private String email;
    @NotNull
    @Size(min = 8, max = 255)
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
            message = "Password must contain at least one uppercase letter,"
                    + " one digit, and one special character.")
    private String password;
    @NotNull
    @Size(min = 8, max = 255)
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
            message = "Password must contain at least one uppercase letter,"
                    + " one digit, and one special character.")
    private String repeatPassword;
    @NotNull
    @Size(min = 1, max = 255)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 255)
    private String lastName;
    @Size(max = 500, message = "Shipping address must be less than 500 characters")
    private String shippingAddress;
}
