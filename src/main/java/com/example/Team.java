package com.example;

import java.util.ArrayList;

public class Team {
    private int size;


    
/* * * * * Beginning of Quiz * * * * */

    /**
     * Construct a new Team that has no Players on it, but is ready
     * to start adding players.
     */

    public Team(int size) {
        this.size = size;
    }

    
    /**
     * Add the given player to this team if there is room (i.e. the team is not at max size).
     * @param player Player to add
     */
    public void addPlayer(Player player){

    }

    /**
     * Remove the given Player from the team.
     * @param player player to remove
     */
    public void removePlayer(Player player){

    }
    /**
     * Return an <code>ArrayList</code> containing all players in this
     * <code>Team</code> that match the given player.
     * 
     * @param template template to match to
     * @return An <code>ArrayList</code> of all matching players.
     */
    public ArrayList<Player> getPlayers(Player template){
        return null;
    }


    /**
     * Return the first player in this <code>Team</code> that matches the
     * given template, or <code>null</code> if there are no matching players.
     * 
     * @param template template to match to
     * @return The first matching player, or <code>null</code> if there are
     *          no matching players in this <code>Team</code>.
     */
    public Player getPlayer(Player player){
        return null;
    }

    
    
}
