package ci.digitalacademy.monetab.Service.Imp;

import ci.digitalacademy.monetab.Model.Address;
import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Repository.AddressRepository;
import ci.digitalacademy.monetab.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address save(Address adress) {
        return addressRepository.save(adress);
    }

    @Override
    public Address update(Address adress) {
        Optional<Address> optionalAddress = findOne(adress.getId()); // recuperation d'un optionnal user
        if (optionalAddress.isPresent()){ // verification de l'existance d'un contenu dans le optional
            Address professorToUpdate = optionalAddress.get(); // declaration + affectation d'un user a partir du optional
            professorToUpdate.setCity(adress.getCity());
            professorToUpdate.setCountry(adress.getCountry());
            professorToUpdate.setStreet(adress.getStreet());
            return save(professorToUpdate); //enregistrement de l'utilisateur modifier
        }else {
            throw new IllegalArgumentException(); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        }
    }

    @Override
    public Optional<Address> findOne(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
