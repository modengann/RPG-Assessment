package com.example;

import static org.junit.Assert.assertTrue;

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
                fixedLocation.matches(differentAction));

        assertFalse("A player should not match a player with different x.",
                fixedLocation.matches(differentX));

        assertFalse("A player should not match a player with different y.",
                fixedLocation.matches(differentY));

        assertTrue("An x of -1 should match any x.",
                fixedLocation.matches(anyX));

        assertTrue("A y of -1 should match any y.",
                fixedLocation.matches(anyY));

        assertTrue(
                "If one player matches any x and another matches any y, and their arguments match, the two should match.",
                anyX.matches(anyY));

        assertTrue(
                "If one player matches any action and another matches any argument, and their x and y match, the two should match.",
                anyArg.matches(anyAction));

        assertFalse(
                "Even if null or -1 are present in other characteristics, any characteristic that fails (x, in this case) should mean that the two don't match.",
                anyY.matches(anyArg));

        assertTrue("A Player with (-1, null, null) should match any player.",
                any.matches(fixedLocation) && any.matches(differentArgs) && any.matches(differentAction) &&
                        any.matches(differentX) && any.matches(differentY) && any.matches(anyY) && any.matches(anyX) &&
                        any.matches(anyArg) && any.matches(anyAction));

    }

    @Test
    public void testSearching() {

    }

    @Test
    public void testAddAndRemove() {

    }
}
