package dmacc.beans;

import java.util.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthdate;
	private String isMature;
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
	public User(long id, String username, Date birthdate, Computer cpu) {
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
	public User(String username, Date birthdate, Computer cpu) {
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
	public User(String username, Date birthdate) {
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
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the isMature
	 */
	public String isMature() {
		return isMature;
	}
	/**
	 * @param isMature the isMature to set
	 */
	public void setMature(Date birthdate) {
		LocalDate current = LocalDate.now();
		LocalDate matureDate = current.minusYears(18);
		Date m1 = convertToDateUsingDate(matureDate);
		if (birthdate.before(m1)) {
			this.isMature = "True";
		} else {
			this.isMature = "False";
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
	
	public static Date convertToDateUsingDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }
	
	public static java.util.Date convertToDateUsingInstant(LocalDate date) {
		java.util.Date newDate = java.util.Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        return newDate;
    }
	
		
}
