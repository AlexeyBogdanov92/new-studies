package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
    this.stamina = stamina;

    if(countPlayers < 6)
    countPlayers++;
    }
    public void run(){
        if(stamina == 0)
            return;
        stamina--;
        if(stamina ==0)
            countPlayers--;

    }
    public static void info(){
        if(countPlayers<6){
            if(countPlayers==0||countPlayers==1){
                System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
            }else if(countPlayers==2||countPlayers==3||countPlayers==4){
                System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных места");
            }else {
                System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободное место");
            }
        }else if(countPlayers == 6){
            System.out.println("На поле нет свободных мест");
        }
    }
}
