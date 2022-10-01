package uz.pdp.appdatarest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

//@Service
public class AddressService {

//    @Autowired
//    AddressRepository addressRepository;
//
//    public List<Address> getAddresses(int page, int size) {
//        Pageable pageable= PageRequest.of(page, size);
//        Page<Address> addressPage = addressRepository.findAll(pageable);
//        return addressPage.getContent();
//    }
//
//    public Address getAddress(Integer id) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        return optionalAddress.orElse(null);
//    }
//
//    public Address addAddress(Address address) {
//        Address savedAddress = addressRepository.save(address);
//        return savedAddress;
//   }
//
//    public Address editAddress(Integer id, Address address) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        if (optionalAddress.isPresent()) {
//            Address editingAddress = optionalAddress.get();
//            editingAddress.setCity(address.getCity());
//            editingAddress.setStreet(address.getStreet());
//            return addressRepository.save(editingAddress);
//        }
//        return null;
//    }
//
//    public boolean deleteAddress(Integer id) {
//
//        try {
//            addressRepository.deleteById(id);
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//    }
}
