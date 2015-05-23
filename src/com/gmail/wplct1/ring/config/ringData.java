package com.gmail.wplct1.ring.config;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ringData {
	public Location ringLocation1 = null;
	public Location ringLocation2 = null;
	public Location arena = null;
	public Location challenger = null;
	public Location out = null;
	public Location showbrand = null;
	public Location operation = null;
	
	public Player Player1 = null;
	public Player Player2 = null;
	
	public int money = 0;
	
	public int id;
	public String name;
	
	int outtime;
	int overtime;
	public ringData(){}
	public ringData(Location ringLocation1,Location ringLocation2,Location arena,Location challenger,Location out,Location showbrand,Location operation){
		this.ringLocation1 = ringLocation1;
		this.ringLocation2 = ringLocation2;
		this.arena = arena;
		this.challenger = challenger;
		this.out = out;
		this.showbrand = showbrand;
		this.operation = operation;
	}
}
