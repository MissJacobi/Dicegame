package se.jensen.felicia.DiceGame;


public class Player {
    private String firstname;
    private String lastname;
    private int score;

    public Player(){
        this.score = 0;
    }
    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty())
           throw new IllegalArgumentException ("Enter a name!");
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty())
            throw new IllegalArgumentException ("Enter a name!");
        this.lastname = lastname;
    }

    public void addToScore(int value){
        this.score += value;
    }

    public int getScore(){
        return score;
    }

    public String getFullName() {
        return firstname +" "+ lastname;
    }


}





