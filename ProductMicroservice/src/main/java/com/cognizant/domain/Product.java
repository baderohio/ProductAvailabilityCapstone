package com.cognizant.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id @GeneratedValue
	private Long idProduct;
	private String name;
	private Long deptId;
	private String deptName;
	
	@SuppressWarnings("unused")
	private Product() {}

	public Product(String name) {
		
		this.setName(name);
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	

	
	

}
