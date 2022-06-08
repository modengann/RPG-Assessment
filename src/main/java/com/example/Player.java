package com.example;

public class Player {
/* * * * * You may need to add to or change variables in order to do later parts * * * * */

    private int number;
    private String lastName, position;

    public Player(int number, String lastName, String position){
        this.number = number;
        this.lastName = lastName;
        this.position = position;
    }

    public Player(Player other){
        this(other.number, other.lastName, other.position);
    }

    public int getNumber(){
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /* * * * * * * BEGIN QUIZ HERE * * * * * * * */


    /* * * * * * * B Level Problem * * * * * * * */
    /**
     * Determine whether this player matches another player. This is more complicated than a simple
     * <code>equals()</code> method, because not all the instance variables will be used as criteria
     * for comparison; if either <code>this</code> or <code>other</code> has -1 as its number
     * or <code>null</code> as its lastName or position, that property is automatically
     * assumed to match.
     * 
     * @param other other <code>Player</code> to compare to.
     * @return true if the two players match, false otherwise
     */
    public boolean matches(Player other){
        return false;
    }


    
    /**
     * Return the Team that this Player is in.
     * @return the Team that this Player is in
     */
    public Team getTeam(){
        return null;
    }


     /**
     * If this player is on a Team, <code>remove()</code> will remove it from the Team.
     * Otherwise, there will be no effect.
     */   
    public void remove(){

    }


    /**
     * Move this player to the given position on the given team. If it is already in that team,
     * only its position will be changed. In particular, this method will not change the position
     * of this player in the player list for its team if it is not, in fact, moving to a new team.
     * 
     * @param position position to move to
     * @param team team in which this player should end up. If <code>team</code> is null, the player
     *              is removed from its team.
     */
    public void move(String position, Team team){

    }

    /**
     * Move this player to the same location as the given player, in the same team as that player.
     * If it is already in that team, only its position will be changed. In particular, this method
     * will not change the position of this player in the player list for its team if it is not,
     * in fact, moving to a new team.
     * 
     * @param Player Other player to whose location this one should move
     */
    public void move(Player other) {
    }

    
}
