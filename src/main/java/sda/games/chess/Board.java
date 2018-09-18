package sda.games.chess;

public class Board {
   public Spot[][] spots;
    private boolean isCheckmate;
    private boolean isDraw;
    private GameState gameState;


    public void makeAMove (Move move){
        int fromX = move.getFromX();
        int fromY = move.getFromY();
        int toX = move.getToX();
        int toY = move.getToY();

        int distanceX = toX-fromX;
        int disanceY =toY-fromY;
        if (Math.abs(disanceY)==Math.abs(distanceX)) //to znaczy ze idzie po skosie
            if (Math.abs(disanceY)==0 && Math.abs(distanceX)> 0) // lezie na boki
                if (Math.abs(disanceY)>0 && Math.abs(distanceX)== 0) // góra dół
                    if( (Math.abs(disanceY)==1 && Math.abs(distanceX)== 2 )||( Math.abs(disanceY)==2 && Math.abs(distanceX)== 1  )) // jest koniem

                        if (spots[fromX][fromY].isEmpty()) {
            if (spots[fromX][fromY].getFigure().isMoveValid(move)) {


                if (spots[toX][toY].isEmpty()) {

                    spots[toX][toY].setFigure(spots[fromX][fromY].getFigure());//ustawiam na docelowym miejscu figurę
                    spots[fromX][fromY].setEmpty(true); // zeruje jej poprzednie miejsce na empty
                }

            }
        }
        //sprawdzić czy dane pole nie jest puste
        // jak coś stoi, to czy ruch ktory chce wykonać jest valid z punktu widzenia figury
        //jak jest ok, to - nie może wykraczać poza plansze
        // - nie może mieć nic po drodze
        // - sprawdzić czy pole jest wolne na ktore chce isć
        // - jak wolne to super, staje tam i nara
        //- jak zajęte to bije (skoro ruch jest valid to mogę, innym przypadkiem jest pionek)
        // - jak pionek  to w pionku musi być implementacja że ruch po skosie jest valid tylko gdy coś na nim stoi == chce bić
        // - wszystko to jescze opakować w warunek że mogę ruszyć tylko swoją figurą
        // - no i bic nie mogę swoich figur


    }

    public Board() {
        BoardGenerator boardGenerator = new BoardGenerator();
        this.spots = boardGenerator.generateBoard();
        this.gameState = GameState.INPROGRESS;
        this.spots = boardGenerator.generateBoard();
    }

    public GameState getGameState() {
        return gameState;
    }

}
