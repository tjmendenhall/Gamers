package dmacc.beans;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String username;
	private LocalDate birthdate;
	private boolean isMature;
	@Autowired
	private Computer cpu;
	
	public User() {
		super();
	}
	
	/**
	 * @param id
	 * @param username
	 * @param birthdate
	 * @param cpu
	 */
	public User(long id, String username, LocalDate birthdate, Computer cpu) {
		super();
		this.id = id;
		this.username = username;
		this.birthdate = birthdate;
		setMature(birthdate);
		this.cpu = cpu;
	}

	/**
	 * @param username
	 * @param birthdate
	 * @param cpu
	 */
	public User(String username, LocalDate birthdate, Computer cpu) {
		super();
		this.username = username;
		this.birthdate = birthdate;
		setMature(birthdate);
		this.cpu = cpu;
	}

	/**
	 * @param username
	 * @param birthdate
	 */
	public User(String username, LocalDate birthdate) {
		super();
		this.username = username;
		this.birthdate = birthdate;
		setMature(birthdate);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the birthdate
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the isMature
	 */
	public boolean isMature() {
		return isMature;
	}
	/**
	 * @param isMature the isMature to set
	 */
	public void setMature(LocalDate birthdate) {
		LocalDate current = LocalDate.now();
		Period p = Period.between(birthdate, current);
		if (p.getYears() > 18) {
			this.isMature = true;
		} else {
			this.isMature = false;
		}
	}
	/**
	 * @return the cpu
	 */
	public Computer getCpu() {
		return cpu;
	}
	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(Computer cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthdate=" + birthdate + ", isMature=" + isMature
				+ ", cpu=" + cpu + "]";
	}
	
		
}
