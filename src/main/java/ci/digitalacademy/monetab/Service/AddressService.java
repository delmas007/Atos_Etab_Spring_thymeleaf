package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Service.dto.AddressDTO;

import java.util.List;
import java.util.Optional;


public interface AddressService {

    AddressDTO save(AddressDTO addressDTO);
    AddressDTO update(AddressDTO addressDTO);
    Optional<AddressDTO> findOne(Long id);
    void delete(Long id);
    List<AddressDTO> findAll();

}

