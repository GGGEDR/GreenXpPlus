package sk.GGGEDR.GreenLand.GreenXP;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String prefix = "§7[§aGreenXP§7] ";

    public void send(String msg){
        this.getLogger().info(prefix + msg);
    }

    @Override
    public void onEnable(){
        send("Plugin bol úspešne spustený");
        send("Developed By GGGEDR");
    }

    @Override
    public void onDisable(){
        send("Plugin bol úspešne vypnutí");
        send("Developed By GGGEDR");
    }
}
