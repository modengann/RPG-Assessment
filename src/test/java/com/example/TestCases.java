package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestCases {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMatches() {
        Player fixedPlayer = new Player(3, "A", "B");
        Player differentObjects = new Player(3, new String("A"), new String("B"));
        Player differentName = new Player(3, "B", "B");
        Player differentPosition = new Player(3, "A", "C");
        Player differentNumber = new Player(2, "A", "B");
        Player anyNumber = new Player(-1, "A", "B");
        Player anyName = new Player(3, null, "B");
        Player anyPosition = new Player(3, "A", null);
        Player any = new Player(-1, null, null);

        // Test constructor, getters, and setters
        // I already wrote these; this is to make sure you didn't do something
        // that would stop them from working.
        assertTrue("The getNumber() method should return the number that was passed to the constructor.",
                fixedPlayer.getNumber() == 3);
        assertTrue("The getLastName() method should return the last name that was passed to the constructor.",
                ("A").equals(fixedPlayer.getLastName()));
        assertTrue("The getPosition() method should return the position that was passed to the constructor.",
                ("B").equals(fixedPlayer.getPosition()));

        // Test matches()
        assertTrue("A player should always match itself.", fixedPlayer.matches(fixedPlayer));

        assertTrue("Even if my last name and position are different String objects, they should match if they contain the same value. Are you comparing them with == rather than .equals()?", fixedPlayer.matches(differentObjects));

        

        assertFalse("A player should not match a player with different action.",
                fixedPlayer.matches(differentName));

        assertFalse("A player should not match a player with different number.",
                fixedPlayer.matches(differentNumber));

        assertTrue("An number of -1 should match any number.",
                fixedPlayer.matches(anyNumber));

        assertTrue(
                "If one player matches any number and another matches any name, and their positions match, the two should match.",
                anyNumber.matches(anyName));

        assertTrue(
                "If one player matches any name and another matches any position, and their numbers match, the two should match.",
                anyPosition.matches(anyName));

        assertTrue("A Player with (-1, null, null) should match any player.",
                any.matches(fixedPlayer) && any.matches(differentObjects) && any.matches(differentName) &&
                        any.matches(differentPosition) && any.matches(differentNumber) && any.matches(anyNumber) && any.matches(anyName) &&
                        any.matches(anyPosition));

    }

    @Test
    public void testSearching() {
        Player a = new Player(1, null, null);
        Player b = new Player(1, null, null);
        Player c = new Player(1, null, null);
        Player d = new Player(2, null, null);
        Player e = new Player(1, null, null);
        Player n = new Player(9, null, null);
        
        Team team = new Team();
        team.addPlayer(a);
        team.addPlayer(b);
        team.addPlayer(c);
        team.addPlayer(d);
        team.addPlayer(e);
        
        // Test the basic getPlayer
        assertTrue("The Player added first should be the one returned by the simple getPlayer(Player).", team.getPlayer(a) != e);
        assertTrue("Using a Player itself as a template should always locate that Player in a Team.", team.getPlayer(a) == a);
        assertTrue("If a Player is not in a team, getPlayer(Player) should return null.", team.getPlayer(n) == null);
        
        // Test the array getPlayers()
        ArrayList<Player> players = team.getPlayers(new Player(1, null, null));
        assertTrue("The getPlayers(players) method should return an array of all the Players that match the given template.", players != null && players.size() == 4);
        assertTrue("The getPlayers(players) method should Players listed in the order they were added.", players.get(0) == a && players.get(1) == b && players.get(2) == c && players.get(3) == e);
        players = team.getPlayers(n);
        assertTrue("If there are no Players matching the template, |getPlayers()| should return an empty ArrayList.", players != null && players.isEmpty());

    }

    @Test
    public void testAddAndRemove() {
        Team team1 = new Team(), team2 = new Team();
        Player a = new Player(1, null, null);
        
        // Test the methods that work from the |Team| side of things.
        assertTrue("A newly created Player should have Team null; it is not in any Team yet.", a.getTeam() == null);

        team1.addPlayer(a);
        assertTrue("Adding a Player to a Team with addPlayer() should change the Team of that Player.", a.getTeam() == team1);
        assertTrue("Adding a Player to a Team should make it visible to getPlayer() in that Team.", team1.getPlayer(a) == a);


        team1.removePlayer(a);
        assertTrue("Removing a Player from a Team should set its Team to null.", a.getTeam() == null);
        assertTrue("If a Player has been removed from a Team, I should not find it when I ask that Team to getPlayer().", team1.getPlayer(a) == null);

        team2.addPlayer(a);
        team1.addPlayer(a);
        assertTrue("If I add a Player to another team, it should be removed from the team it is in.", team2.getPlayer(a) == null);
        assertTrue("If I add a Player to another team, it should appear inthe new team.", team1.getPlayer(a) == a);
    }
}
