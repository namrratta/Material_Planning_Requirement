package com.mrp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;


@Entity 
@Table
public class Bicycle {
	
	@Id   
	private int id;
	
	@Min(1)
    @Column(nullable = false)
	private int seat;
	
	@Min(1)
    @Column(nullable = false)
	private int frame;
	
	@Min(1)
	@Column(nullable = false)
	private int brakeSet;
	
	@Min(1)
	@Column(nullable = false)
	private int handleBar;
	
	@Min(1)
	@Column(nullable = false)
	private int wheels;
	
	@Min(1)
	@Column(nullable = false)
	private int tires;
	
	@Min(1)
	@Column(nullable = false)
	private int chain;
	
	@Min(1)
	@Column(nullable = false)
	private int crankset;
	
	@Min(1)
	@Column(nullable = false)
	private int padels;
	
	@Min(1)
	@Column(nullable = false)
	private int brakePaddel;
	
	@Min(1)
	@Column(nullable = false)
	private int brakeCable;
	
	@Min(1)
	@Column(nullable = false)
	private int brakeLaver;
	
	@Min(1)
	@Column(nullable = false)
	private int brakeShoe;
	
	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicycle(int id, int seat, int frame, int brakeSet, int handleBar, int wheels, int tires, int chain,
			int crankset, int padels, int brakePaddel, int brakeCable, int brakeLaver, int brakeShoe) {
		super();
		this.id = id;
		this.seat = seat;
		this.frame = frame;
		this.brakeSet = brakeSet;
		this.handleBar = handleBar;
		this.wheels = wheels;
		this.tires = tires;
		this.chain = chain;
		this.crankset = crankset;
		this.padels = padels;
		this.brakePaddel = brakePaddel;
		this.brakeCable = brakeCable;
		this.brakeLaver = brakeLaver;
		this.brakeShoe = brakeShoe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getFrame() {
		return frame;
	}

	public void setFrame(int frame) {
		this.frame = frame;
	}

	public int getBrakeSet() {
		return brakeSet;
	}

	public void setBrakeSet(int brakeSet) {
		this.brakeSet = brakeSet;
	}

	public int getHandleBar() {
		return handleBar;
	}

	public void setHandleBar(int handleBar) {
		this.handleBar = handleBar;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public int getChain() {
		return chain;
	}

	public void setChain(int chain) {
		this.chain = chain;
	}

	public int getCrankset() {
		return crankset;
	}

	public void setCrankset(int crankset) {
		this.crankset = crankset;
	}

	public int getPadels() {
		return padels;
	}

	public void setPadels(int padels) {
		this.padels = padels;
	}

	public int getBrakePaddel() {
		return brakePaddel;
	}

	public void setBrakePaddel(int brakePaddel) {
		this.brakePaddel = brakePaddel;
	}

	public int getBrakeCable() {
		return brakeCable;
	}

	public void setBrakeCable(int brakeCable) {
		this.brakeCable = brakeCable;
	}

	public int getBrakeLaver() {
		return brakeLaver;
	}

	public void setBrakeLaver(int brakeLaver) {
		this.brakeLaver = brakeLaver;
	}

	public int getBrakeShoe() {
		return brakeShoe;
	}

	public void setBrakeShoe(int brakeShoe) {
		this.brakeShoe = brakeShoe;
	}

	@Override
	public String toString() {
		return "Biycle [id=" + id + ", seat=" + seat + ", frame=" + frame + ", brakeSet=" + brakeSet + ", handleBar="
				+ handleBar + ", wheels=" + wheels + ", tires=" + tires + ", chain=" + chain + ", crankset=" + crankset
				+ ", padels=" + padels + ", brakePaddel=" + brakePaddel + ", brakeCable=" + brakeCable + ", brakeLaver="
				+ brakeLaver + ", brakeShoe=" + brakeShoe + "]";
	}

	

}
