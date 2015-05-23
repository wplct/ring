package com.gmail.wplct1.ring;


import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.wplct1.ring.Listener.brand;
import com.gmail.wplct1.ring.command.create;
import com.gmail.wplct1.ring.config.Config;
import com.gmail.wplct1.ring.config.ringData;
import com.iCo6.system.Account;

public class ring extends JavaPlugin{
	public static Config config;
	public static SetStatus setStatus = SetStatus.NO;
	public static Player setOp = null;
	public static ringData tempData = null;
	public void onEnable(){
		//载入配置
		config = new Config(this);
		config.load();
		//注册监听器
		getServer().getPluginManager().registerEvents(new brand(),this);
		
		
//		Account account = new Account("wplct");
//		System.out.println("wplct                    "+account.getHoldings().getBalance());
		
	}
	private void load() {
		Config Config = new Config(this);
		Config.getFileData("config");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(args.length<2){
    		return false;
    	}
		if(args[0].equals("create")){//创建擂台命令
			if(setStatus != SetStatus.NO){
				sender.sendMessage("重新开始创建擂台");
			}
			if (!(sender instanceof Player)){
				sender.sendMessage("该命令只能由op使用，创建擂台也可以修改用配置文件的方法完成");
				return false;
			}else{
				String ringName = args[1];
				create.createRing0(sender,this,ringName);
				return true;
			}
		}
		return false;
	}
	
	

}
