package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
@Embeddable
public class Computer {
	private String os;
	private String processor;
	private double ram;
	private double storage;
	
	public Computer() {
		super();
	}
	
	/**
	 * @param os
	 * @param processor
	 * @param ram
	 * @param storage
	 */
	public Computer(String os, String processor, double ram, double storage) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}
	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}
	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * @return the ram
	 */
	public double getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(double ram) {
		this.ram = ram;
	}
	/**
	 * @return the storage
	 */
	public double getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(double storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Computer [os=" + os + ", processor=" + processor + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
}
