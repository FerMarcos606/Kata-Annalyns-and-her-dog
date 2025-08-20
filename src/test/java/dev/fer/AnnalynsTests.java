package dev.fer;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnnalynsTests {
    

   @Test
    public void testCanFastAttackWhenKnightIsAwake() {
        boolean knightIsAwake = true;
        assertFalse(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

    @Test
    public void testCanFastAttackWhenKnightIsSleeping() {
        boolean knightIsAwake = false;
        assertTrue(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

     @Test
    void testCanSpyWhenAllAreSleeping() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    void testCannotSignalPrisonerWhenArcherIsAwakeAndPrisonerIsAsleep() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    void testCannotSignalPrisonerWhenBothAreAwake() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

     @Test
    void testCanFreePrisonerWithoutDogWhenEveryoneIsAsleepExceptPrisoner() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }

     @Test
    void testCannotFreePrisonerWithoutDogWhenKnightIsAwake() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}