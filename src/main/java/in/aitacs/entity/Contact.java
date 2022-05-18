package in.aitacs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_INFO")
@SecondaryTable(name = "CONTACT_ADDRESS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "contact_cid"))
public class Contact {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSw;
	
	@Column(name="address" ,table="CONTACT_ADDRESS")
	private String address;

}
