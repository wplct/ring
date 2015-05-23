package com.gmail.wplct1.ring.command;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.wplct1.ring.SetStatus;
import com.gmail.wplct1.ring.ring;
import com.gmail.wplct1.ring.Listener.createListener;
import com.gmail.wplct1.ring.config.ringData;

public class create {
	public static void createRing0(CommandSender sender,ring plugin,String name){
		List<ringData> ringList = ring.config.ringData;
		if(ring.setOp != null&&ring.setOp != (Player) sender){
			sender.sendMessage("当前创建流程已经被占用，请联系其他op");
			return ;
		}
		for(int i=0;i<ringList.size();i++){//检测name是否被占用
			if(ringList.get(i).name.equals(name)){
				sender.sendMessage("该擂台名称已经被占用,请使用修改命令，或修改配置文件来修改");
				return;
			}
		}
		String str = ring.config.text_setsite_help;
		str = str.replaceAll("%name",name);
		sender.sendMessage(str);
		sender.sendMessage(ring.config.text_setsite_setit1_1);
		ring.setStatus = SetStatus.S1_3;//设置擂台创建过程中的状态
		ring.setOp = (Player) sender;//设置当前设置的op
		ring.tempData = new ringData();
		ring.tempData.name = name;
		ring.tempData.id = ring.config.ringData.size();
	}
}
