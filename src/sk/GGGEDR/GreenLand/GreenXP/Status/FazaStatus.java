package sk.GGGEDR.GreenLand.GreenXP.Status;

public enum FazaStatus{

    JEDEN, DVA, TRI, BRUTAL;

    private static ArenaStatus gm;


    public static void setStatus(ArenaStatus state){
        gm = state;
    }

    public static ArenaStatus getStatus(){
        return gm;
    }
}
