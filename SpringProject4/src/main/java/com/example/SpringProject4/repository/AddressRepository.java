package com.example.SpringProject4.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringProject4.model.Address;
public interface AddressRepository extends JpaRepository <Address , Long> {


}
