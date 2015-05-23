package com.gmail.wplct1.ring.Listener;

import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gmail.wplct1.ring.SetStatus;
import com.gmail.wplct1.ring.ring;
import com.gmail.wplct1.ring.command.create;
import com.gmail.wplct1.ring.config.ringData;

public class brand implements Listener{
	@EventHandler
	public void aMethodName(PlayerInteractEvent e){//玩家与块交互事件监听器
		if(e.getAction()==Action.LEFT_CLICK_BLOCK||e.getAction()==Action.RIGHT_CLICK_BLOCK){
			if(ring.setStatus != SetStatus.NO)
				if(e.getPlayer().equals(ring.setOp)){
					if(ring.setStatus == SetStatus.S1_3){
						e.getPlayer().sendMessage(ring.config.text_setsite_setit1_3);
						e.getPlayer().sendMessage(ring.config.text_setsite_setit2_1);
						ring.tempData.ringLocation1 = e.getClickedBlock().getLocation();
						ring.setStatus = SetStatus.S2_3;
					}else if(ring.setStatus == SetStatus.S2_3){
						Location nowLocation = e.getClickedBlock().getLocation();
						ring.tempData.ringLocation2 = nowLocation;
						String temp = ring.config.text_setsite_setit2_3;
						int h = Math.abs(ring.tempData.ringLocation1.getBlockY()-nowLocation.getBlockY())+1;
						int w = Math.abs(ring.tempData.ringLocation1.getBlockX()-nowLocation.getBlockX())+1;
						int s = Math.abs(ring.tempData.ringLocation1.getBlockZ()-nowLocation.getBlockZ())+1;
						temp = temp.replaceAll("%h",""+h);
						temp = temp.replaceAll("%w",""+w);
						temp = temp.replaceAll("%s",""+s);
						temp = temp.replaceAll("%num",""+(s*h*w));
						e.getPlayer().sendMessage(temp);
						e.getPlayer().sendMessage(ring.config.text_setsite_setit3_1);
						ring.setStatus = SetStatus.S3_2;
					}else if(ring.setStatus == SetStatus.S3_2){//设置挑战者
						Location nowLocation = e.getClickedBlock().getLocation();
						ring.tempData.challenger = nowLocation;
						e.getPlayer().sendMessage(ring.config.text_setsite_setit3_2);
						e.getPlayer().sendMessage(ring.config.text_setsite_setit4_1);
						ring.setStatus = SetStatus.S4_2;
					}else if(ring.setStatus == SetStatus.S4_2){//设置擂主
						Location nowLocation = e.getClickedBlock().getLocation();
						ring.tempData.arena = nowLocation;
						e.getPlayer().sendMessage(ring.config.text_setsite_setit4_2);
						e.getPlayer().sendMessage(ring.config.text_setsite_setit5_1);
						ring.setStatus = SetStatus.S5_2;
					}else if(ring.setStatus == SetStatus.S5_2){//设置退出点
						Location nowLocation = e.getClickedBlock().getLocation();
						ring.tempData.out = nowLocation;
						e.getPlayer().sendMessage(ring.config.text_setsite_setit5_2);
						e.getPlayer().sendMessage(ring.config.text_setsite_setit6_1);
						ring.setStatus = SetStatus.S6_3;
					}else if(ring.setStatus == SetStatus.S6_3){//设置显示牌
						if(e.getClickedBlock().getState() instanceof Sign){
							Location nowLocation = e.getClickedBlock().getLocation();
							ring.tempData.showbrand = nowLocation;
							e.getPlayer().sendMessage(ring.config.text_setsite_setit6_3);
							e.getPlayer().sendMessage(ring.config.text_setsite_setit7_1);
							ring.setStatus = SetStatus.S7_3;
						}
					}else if(ring.setStatus == SetStatus.S7_3){//设置操作牌
						if(e.getClickedBlock().getState() instanceof Sign){
							Location nowLocation = e.getClickedBlock().getLocation();
							ring.tempData.operation = nowLocation;
							e.getPlayer().sendMessage(ring.config.text_setsite_setit7_3);
							e.getPlayer().sendMessage(ring.config.text_setsite_setit8_1);
							ring.setStatus = SetStatus.NO;
							ring.config.ringData.add(ring.tempData);
							ring.tempData = null;
							ring.config.Data_number++;
							ring.config.save();
						}
					}
					return;
				}
			if(e.getClickedBlock().getState() instanceof Sign){//判断是否是Sign的实现
				//Sign sign = (Sign)e.getClickedBlock().getState();//获取Sign对象
				Location BlockLocation = e.getClickedBlock().getLocation();
				for(int i=0;i<ring.config.ringData.size();i++){
					if(ring.config.ringData.get(i).operation.equals(BlockLocation)){
						
					}
					
				}
				
				
				
			}
		}
	}
}
