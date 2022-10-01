package uz.pdp.appdatarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.service.AddressService;

import java.util.List;

//@RestController
//@RequestMapping("/api/address")
public class AddressController {

//    @Autowired
//    AddressService addressService;
//
//    @GetMapping()
//    public HttpEntity<?> getAddresses(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
//        List<Address> addresses = addressService.getAddresses(page, size);
//        return ResponseEntity.ok(addresses);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getAddress(@PathVariable Integer id){
//
//       Address address=addressService.getAddress(id);
//       return ResponseEntity.status(address!=null? HttpStatus.OK:HttpStatus.CONFLICT).body(address);
//    }
//
//    @PostMapping
//    public HttpEntity<?> addAddress(@RequestBody Address address){
//        Address savedAddress=addressService.addAddress(address);
//        return ResponseEntity.status(201).body(savedAddress);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> editAddress(@PathVariable Integer id, @RequestBody Address address){
//
//        Address editedAddress=addressService.editAddress(id,address);
//        return ResponseEntity.status(editedAddress!=null?HttpStatus.ACCEPTED:HttpStatus.CONFLICT).body(editedAddress);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> deleteAddress(@PathVariable Integer id){
//
//        boolean deleted=addressService.deleteAddress(id);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }

}
