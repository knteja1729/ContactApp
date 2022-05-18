package in.aitacs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.aitacs.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
