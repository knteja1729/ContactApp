package in.aitacs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aitacs.entity.Contact;
import in.aitacs.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		
		contact.setActiveSw("Y");
		repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		List<Contact> allContacts = repo.findAll();
		return allContacts ;
	}

	@Override
	public Contact getContact(int cid) {
		
		Optional<Contact> findById = repo.findById(cid);
		if(findById.isPresent()) {
			Contact contact = findById.get();
			return contact ;
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		
	repo.deleteById(cid);
//		Optional<Contact> findById = repo.findById(cid);
//		if(findById.isPresent()) {
//			Contact contact = findById.get();
//			contact.setActiveSw("N");
//			repo.save(contact);
//		}
//		
		return "Deleted";
	}

}
