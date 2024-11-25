package Project;

public class Game {
    private int roundNumber = 0; // Attention deux meme atribut sur Game et sur Round

    public void startgame(){
        Round round = new Round(roundNumber);       // Cela a le role de notre creatRound() inscrit dans le diagrame de sequence
        SectorCard sectorCard= new SectorCard();    // Cela a le role de notre createSectorCards() mit dans le diagrame de sequence
        CommandCard commandCard = new CommandCard();
    };

    public void placcCard(){};

    public void stopGame(){}; // Pourquoi faire ?

    public static void main(String[] args){
        Game game = new Game();
        game.startgame();
    }
}
