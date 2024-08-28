package ci.digitalacademy.monetab.Service.Imp;

import ci.digitalacademy.monetab.Model.Address;
import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Repository.AddressRepository;
import ci.digitalacademy.monetab.Service.AddressService;
import ci.digitalacademy.monetab.Service.Mapper.AdressMapper;
import ci.digitalacademy.monetab.Service.dto.AddressDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        return AdressMapper.fromEntity(addressRepository.save(AdressMapper.toEntity(addressDTO)));
    }

    @Override
    public AddressDTO update(AddressDTO adress) {
        return findOne(adress.getId()).map(existingAddress -> {
            existingAddress.setStreet(adress.getStreet());
            existingAddress.setCity(adress.getCity());
            return save(existingAddress);
        }).orElseThrow(() -> new RuntimeException("Address not found"));
    }

    @Override
    public Optional<AddressDTO> findOne(Long id) {
        return addressRepository.findById(id).map(address -> {
            return AdressMapper.fromEntity(address);
        });
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public List<AddressDTO> findAll() {
        return addressRepository.findAll().stream().map(address -> {
            return AdressMapper.fromEntity(address);
        }).toList();
    }
}
