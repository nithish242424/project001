package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
    private int id;
    private String bookname;
    private String name;
    private String takendate;
    private String duedate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTakendate() {
		return takendate;
	}
	public void setTakendate(String takendate) {
		this.takendate = takendate;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", bookname=" + bookname + ", name=" + name + ", takendate=" + takendate
				+ ", duedate=" + duedate + "]";
	}
	
	
}
