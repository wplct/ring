package com.gmail.wplct1.ring.config;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.gmail.wplct1.ring.ring;

public class Config {
	ring ring;
	public  String  text_setsite_help;
	public  String  text_setsite_setit1_1;
	public  String  text_setsite_setit1_2;
	public  String  text_setsite_setit1_3;
	
	public  String  text_setsite_setit2_1;
	public  String  text_setsite_setit2_2;
	public  String  text_setsite_setit2_3;
	
	public  String  text_setsite_setit3_1;
	public  String  text_setsite_setit3_2;
	
	public  String  text_setsite_setit4_1;
	public  String  text_setsite_setit4_2;
	
	public  String  text_setsite_setit5_1;
	public  String  text_setsite_setit5_2;
	
	public  String  text_setsite_setit6_1;
	public  String  text_setsite_setit6_2;
	public  String  text_setsite_setit6_3;
	
	public  String  text_setsite_setit7_1;
	public  String  text_setsite_setit7_2;
	public  String  text_setsite_setit7_3;
	
	public  String  text_setsite_setit8_1;
	
	public  String  text_fight_showbrand_nobody_0;
	
	public  String  text_fight_showbrand_nochallenger_0;
	public  String  text_fight_showbrand_nochallenger_1;
	public  String  text_fight_showbrand_nochallenger_2;
	
	public  String  text_fight_showbrand_fighting_0;
	public  String  text_fight_showbrand_fighting_1;
	public  String  text_fight_showbrand_fighting_2;
	public  String  text_fight_showbrand_fighting_3;
	
	public  String  text_fight_operation_nobody_0;
	
	public  String  text_fight_operation_nochallenger_0;
	public  String  text_fight_operation_nochallenger_1;
	
	public  String  text_fight_operation_fighting_0;
	
	public  String  text_fight_message_onchallenger_0;
	public  String  text_fight_message_onchallenger_1;
	public  String  text_fight_message_onchallenger_2;
	public  String  text_fight_message_onchallenger_3;
	public  String  text_fight_message_onchallenger_4;
	public  String  text_fight_message_onchallenger_5;
	public  String  text_fight_message_onchallenger_6;
	
	public  String  text_fight_lose;
	public  String  text_fight_success;
	public  String  text_fight_overtime;
	
	public  int     set_time_fighttime;
	public  int     set_time_againtime;
	public  int     set_time_outtime;
	public  boolean set_message_state;
	public  int     set_message_distance;
	
	public  int     Data_number;
	public  List<ringData> ringData;
	
	public  FileConfiguration config;
	
	
	public Config(ring plugin){
		this.ring = plugin;
	}
	public FileConfiguration getFileData(String name)  
    {  
        FileConfiguration data = new YamlConfiguration();  
        File dataFile = new File(ring.getDataFolder(), name + ".yml");
        if (!dataFile.exists())  
        {
            ring.saveDefaultConfig();  
        }  
        try 
        {
            data.load(dataFile);  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
        return data;
    }
	public void load(){
		config = this.getFileData("config");
		text_setsite_help = config.getString("text.setsite.help","欢迎使用擂台挑战插件\n开始设置插件%num号擂台\n请按顺序设置擂台组成部分");
		
		text_setsite_setit1_1 = config.getString("text.setsite.setit1.1","请点击擂台的第一个角(三维)");
		text_setsite_setit1_2 = config.getString("text.setsite.setit1.2","是这里么，请输入/ring setit 确认");
		text_setsite_setit1_3 = config.getString("text.setsite.setit1.3","设置完成");
		
		text_setsite_setit2_1 = config.getString("text.setsite.setit2.1","现在请点击擂台的第二个个角(三维)");
		text_setsite_setit2_1 = config.getString("text.setsite.setit2.1","是这里么，请输入/ring setit 确认");
		text_setsite_setit2_1 = config.getString("text.setsite.setit2.1","设置完成;擂台高%h宽%w长%s有%num个方块");
		
		text_setsite_setit3_1 = config.getString("text.setsite.setit3.1","请站在挑战者出生点输入/ring setit");
		text_setsite_setit3_2 = config.getString("text.setsite.setit3.2","挑战者出生点设置完成");
		
		text_setsite_setit4_1 = config.getString("text.setsite.setit4.1","请站在擂主出生点输入/ring setit");
		text_setsite_setit4_2 = config.getString("text.setsite.setit4.2","擂主出生点设置完成");
		
		text_setsite_setit5_1 = config.getString("text.setsite.setit5.1","请站在退出点输入/ring setit");
		text_setsite_setit5_2 = config.getString("text.setsite.setit5.2","退出地点设置完成");
		
		text_setsite_setit6_1 = config.getString("text.setsite.setit6.1","请点击显示牌");
		text_setsite_setit6_2 = config.getString("text.setsite.setit6.2","是这里么，请输入/ring setit 确认");
		text_setsite_setit6_3 = config.getString("text.setsite.setit6.3","显示牌设置完成");
		
		text_setsite_setit7_1 = config.getString("text.setsite.setit7.1","请点击操作牌");
		text_setsite_setit7_2 = config.getString("text.setsite.setit7.2","是这里么，请输入/ring setit 确认");
		text_setsite_setit7_3 = config.getString("text.setsite.setit7.3","操作牌设置完成");
		
		text_setsite_setit8_1 = config.getString("text.setsite.setit8.1","擂台%num已经设置完成");
		
		text_fight_showbrand_nobody_0 = config.getString("text.fight.showbrand.nobody.0","点击木牌成为擂主接受挑战");
		
		text_fight_showbrand_nochallenger_0 = config.getString("text.fight.showbrand.nochallenger.0","当前赏金:%shangjin");
		text_fight_showbrand_nochallenger_1 = config.getString("text.fight.showbrand.nochallenger.1","当前擂主:%player1");
		text_fight_showbrand_nochallenger_2 = config.getString("text.fight.showbrand.nochallenger.2","点击花费%money挑战擂主");
		
		text_fight_showbrand_fighting_0 = config.getString("text.fight.showbrand.fighting.0","正在战斗中");
		text_fight_showbrand_fighting_1 = config.getString("text.fight.showbrand.fighting.1","当前赏金:%shangjin");
		text_fight_showbrand_fighting_2 = config.getString("text.fight.showbrand.fighting.2","当前擂主:%player1");
		text_fight_showbrand_fighting_3 = config.getString("text.fight.showbrand.fighting.3","当前挑战者:%player2");
		
		text_fight_operation_nobody_0 = config.getString("text.fight.operation.nobody.0","");
		
		text_fight_operation_nochallenger_0 = config.getString("text.fight.operation.nochallenger.0","当前赏金:%shangjin");
		text_fight_operation_nochallenger_1 = config.getString("text.fight.operation.nochallenger.1","剩余退出时间:%time");
		
		text_fight_operation_fighting_0 = config.getString("text.fight.operation.fighting.0","战斗剩余时间:%time");
		
		text_fight_message_onchallenger_0 = config.getString("text.fight.message.onchallenger.0","玩家%player2已开始挑战擂台，请准备");
		text_fight_message_onchallenger_1 = config.getString("text.fight.message.onchallenger.1","5秒后开始战斗");
		text_fight_message_onchallenger_2 = config.getString("text.fight.message.onchallenger.2","4秒后开始战斗");
		text_fight_message_onchallenger_3 = config.getString("text.fight.message.onchallenger.3","&c3秒后开始战斗");
		text_fight_message_onchallenger_4 = config.getString("text.fight.message.onchallenger.4","&c2秒后开始战斗");
		text_fight_message_onchallenger_5 = config.getString("text.fight.message.onchallenger.5","&c1秒后开始战斗");
		text_fight_message_onchallenger_6 = config.getString("text.fight.message.onchallenger.6","&c&l开始战斗");
		
		text_fight_lose = config.getString("text.fight.lose","[擂台%number]擂主%player1 战胜了 挑战者%player2，当前赏金为%shangjin");
		text_fight_success = config.getString("text.fight.success","[擂台%number]挑战者%player2战胜了擂主%player1，现在他成为了擂主！当前赏金为%shangjin，快来挑战他吧！");
		text_fight_overtime = config.getString("text.fight.overtime","[擂台%number]本次战斗超时");
		
		set_time_fighttime = config.getInt("set.time.fighttime",120);
		set_time_againtime = config.getInt("set.time.againtime",500);
		set_time_outtime = config.getInt("set.time.outtime",320);
		set_message_state = config.getBoolean("set.message.state",true);
		set_message_distance = config.getInt("set.message.distance",50);
		
		Data_number = config.getInt("Data.number",0);
		ringData = new ArrayList<ringData>();
		for(int i=0;i<Data_number;i++){
			Location ringLocation1 = this.loadRingLocation(i,"ringLocation1");
			Location ringLocation2 = this.loadRingLocation(i,"ringLocation2");
			Location arena         = this.loadRingLocation(i,"arena");
			Location challenger    = this.loadRingLocation(i,"challenger");
			Location out           = this.loadRingLocation(i,"out");
			Location showbrand     = this.loadRingLocation(i,"showbrand");
			Location operation     = this.loadRingLocation(i,"operation");
			ringData newData       = new ringData(ringLocation1,ringLocation2,arena,challenger,out,showbrand,operation);
			newData.id = i;
			newData.name = config.getString("Data."+i+".name");
			ringData.add(newData);
		}
		
	}
	public Location loadRingLocation(int i,String name){
		String worldname = config.getString("Data."+i+"."+name+".world");
		World world = Bukkit.getWorld(worldname);
		double x = config.getDouble("Data."+i+"."+name+".x");
		double y = config.getDouble("Data."+i+"."+name+".y");
		double z = config.getDouble("Data."+i+"."+name+".z");
		
		return new Location(world,x,y,z);
	}
}
