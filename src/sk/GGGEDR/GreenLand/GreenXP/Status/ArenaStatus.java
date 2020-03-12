package sk.GGGEDR.GreenLand.GreenXP.Status;

public enum ArenaStatus{

    LOBBY, WAIT, FULL,INGAME,RESTART;

    private static ArenaStatus gm;


    public static void setStatus(ArenaStatus state){
        gm = state;
    }

    public static ArenaStatus getStatus(){
        return gm;
    }
}
