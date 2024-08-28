package ci.digitalacademy.monetab.Service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class AddressDTO {
    private Long id;
    private String street;
    private String city;
    private String country;
}
