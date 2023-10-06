### Bone Sorting Game - Version 1.0 Specification

---

**Title**: Crypt Bone Sorter

**Objective**: In a dimly lit crypt, players are presented with a series of bones. The goal is to sort these bones into their correct categories within a given timeframe to achieve the highest score.

---

#### **Game Components**:

1. **Bone Generator**:
    * Location: Left-hand side of the screen.
    * Functionality: Produces one bone at a time for the player to sort.
    * Bone Types: AI-generated bones which can be Alien, Bird, or Human.

2. **Sorting Categories**:
    * Categories: Three distinct areas or bins to drop bones into. These categories are:
        * Alien Bone
        * Bird Bone
        * Human Bone

3. **Scoreboard**:
    * Location: Top-right corner of the screen.
    * Functionality: Displays the current score, which increments based on correct bone placements.

4. **Timer**:
    * Location: Bottom-right corner of the screen.
    * Duration: Fixed time duration (e.g., 60 seconds). The game ends when the timer reaches zero.
    * Functionality: Countdown mechanism to add urgency to the sorting task.

---

#### **Gameplay Mechanics**:

1. **Bone Presentation**: A single bone appears in the bone generator area. Players must drag and drop the bone into one of the three categories.

2. **Scoring System**:
    * Correct Placement: Player earns points (e.g., +10 points) for correctly sorting a bone.
    * Incorrect Placement: No points are deducted for incorrect placements, but it costs the player valuable time.

3. **Timer**: The game lasts for a fixed duration (e.g., 60 seconds). Players must sort as many bones as they can within this timeframe.

4. **End of Game**:
    * When the timer runs out, the game ends.
    * A final score is presented to the player.
    * A prompt can ask if the player wants to play again.

---

#### **User Interface (UI)**:

1. **Crypt Background**: A dimly lit crypt background sets the ambiance.

2. **Bones**: AI-generated images representing Alien, Bird, or Human bones.

3. **Sorting Areas**: Clearly marked and distinguishable areas for each category, placed on the right side of the screen.

4. **Drag-and-Drop Mechanism**: Players can click on a bone, drag it to a category, and release to drop/place the bone.

5. **Feedback Mechanism**: Visual (and optionally auditory) feedback provided for correct and incorrect placements. For example, a brief green flash for a correct placement and a red flash for incorrect.

---

#### **Optional Enhancements**:

1. **High Score**: Display and store the highest score achieved in the current game session.

2. **Sound Effects**: Add auditory feedback for correct and incorrect placements, as well as a ticking sound for the timer.

---

This specification covers the basic gameplay mechanics and UI components for the Version 1.0 of the Crypt Bone Sorter game. The focus is on simplicity and ease of implementation, while ensuring the game remains engaging for the player. Future versions can build upon this foundation with added complexities and features.