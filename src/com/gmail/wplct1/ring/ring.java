package com.gmail.wplct1.ring;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.wplct1.ring.config.Config;
import com.iCo6.system.Account;

public class ring extends JavaPlugin{
	public static Config config;
	public void onEnable(){
		//载入配置
		config = new Config(this);
		config.load();
		//注册监听器
		
		
		
//		Account account = new Account("wplct");
//		System.out.println("wplct                    "+account.getHoldings().getBalance());
		
	}
	private void load() {
		Config Config = new Config(this);
		Config.getFileData("config");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		
		
		
		
		
		return false;
	}
	
	

}
