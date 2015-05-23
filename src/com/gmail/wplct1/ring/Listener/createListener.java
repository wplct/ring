package com.gmail.wplct1.ring.Listener;

import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gmail.wplct1.ring.SetStatus;
import com.gmail.wplct1.ring.ring;

public class createListener implements Listener {
	@EventHandler
	public void aMethodName(PlayerInteractEvent e){//玩家与块交互事件监听器
		if(e.getAction()==Action.LEFT_CLICK_BLOCK||e.getAction()==Action.RIGHT_CLICK_BLOCK){
			switch(ring.setStatus){
			case S1_2:
				System.out.println(ring.config.text_setsite_setit1_2);
				break;
			default:System.out.println("ring插件createListener错误，请联系管理员");
			}
		}
	}

}
