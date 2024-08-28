package ci.digitalacademy.monetab.Service.Mapper;
import ci.digitalacademy.monetab.Model.Address;
import ci.digitalacademy.monetab.Service.dto.AddressDTO;

public final class AdressMapper {
    private AdressMapper() {}

    public static AddressDTO fromEntity(Address address) {
        AddressDTO addressDTO = AddressDTO.builder()
            .id(address.getId())
            .street(address.getStreet())
            .city(address.getCity())
            .country(address.getCountry())
            .build();
        return addressDTO;
        }

    public static Address toEntity(AddressDTO addressDTO) {
        Address address = Address.builder()
            .id(addressDTO.getId())
            .street(addressDTO.getStreet())
            .city(addressDTO.getCity())
            .country(addressDTO.getCountry())
            .build();
        return address;
    }
}
