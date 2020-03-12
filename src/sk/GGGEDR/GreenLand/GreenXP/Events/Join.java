package sk.GGGEDR.GreenLand.GreenXP.Events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import sk.GGGEDR.GreenLand.GreenXP.Main;
import sk.GGGEDR.GreenLand.GreenXP.Status.ArenaStatus;

public class Join {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(ArenaStatus.getStatus() == ArenaStatus.LOBBY){
            e.setJoinMessage(Main.prefix +"§7Práve sa pripojil §a"+ e.getPlayer().getName() +" §7(§a"+ Bukkit.getServer().getOnlinePlayers().size() +"§7/§a"+ Bukkit.getMaxPlayers() +"§7)");
            int vypocet = Bukkit.getMaxPlayers() / 4;
            int prepocet = vypocet * 3;
            if(prepocet == Bukkit.getOnlinePlayers().size()){
                ArenaStatus.setStatus(ArenaStatus.WAIT);
            }
        }
    }
}
