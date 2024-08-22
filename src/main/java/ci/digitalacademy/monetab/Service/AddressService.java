package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.Address;

import java.util.List;
import java.util.Optional;


public interface AddressService {

    Address save(Address adress);
    Address update(Address adress);
    Optional<Address> findOne(Long id);
    void delete(Long id);
    List<Address> findAll();

}

