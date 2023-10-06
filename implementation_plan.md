### Bone Sorting Game - Implementation Plan

---

#### **1. Main Game Application Class**:
* **Purpose**: Entry point of the application; manages the game lifecycle.
* **Methods**:
    * `main()`: Launches the game.
    * `initializeGame()`: Set up the game components.
    * `startGame()`: Begins the game timer and bone generation.
    * `endGame()`: Handles the game-over logic and displays the score.

---

#### **2. Bone Class**:
* **Purpose**: Represents an individual bone.
* **Attributes**:
    * `boneType`: An enum value representing the bone type (Alien, Bird, Human).
    * `boneImage`: Image data of the bone.
* **Methods**:
    * `generateBoneImage()`: Use AI to generate and assign a bone image.
    * `getBoneType()`: Return the type of the bone.

---

#### **3. BoneGenerator Class**:
* **Purpose**: Manages the generation and presentation of bones.
* **Attributes**:
    * `currentBone`: Currently displayed bone.
* **Methods**:
    * `produceBone()`: Generate a new bone and display it for sorting.

---

#### **4. SortingArea Class**:
* **Purpose**: Represents one of the categories (Alien, Bird, Human) where bones are sorted.
* **Attributes**:
    * `areaType`: An enum value for the type of area (Alien, Bird, Human).
    * `bones`: List of bones currently in the sorting area.
* **Methods**:
    * `addBone(Bone bone)`: Accept a bone and add it to the area, triggering scoring checks.
    * `validateBone(Bone bone)`: Check if a bone belongs to this sorting area.

---

#### **5. Scoreboard Class**:
* **Purpose**: Manages and displays the player's score.
* **Attributes**:
    * `score`: Current score of the player.
* **Methods**:
    * `increaseScore(int value)`: Increases the score.
    * `getScore()`: Returns the current score.
    * `displayScore()`: Visualizes the current score on the game window.

---

#### **6. Timer Class**:
* **Purpose**: Manages the game timer and notifies when the game ends.
* **Attributes**:
    * `timeRemaining`: Amount of time remaining in seconds.
* **Methods**:
    * `startTimer()`: Begin the countdown.
    * `getTimeRemaining()`: Returns the remaining time.
    * `displayTime()`: Visualizes the current time on the game window.
    * `timeOut()`: Triggers when the timer reaches zero.

---

#### **7. UIManager Class**:
* **Purpose**: Manages the GUI components and their interactions.
* **Attributes**:
    * `gameWindow`: The main game JFrame.
    * `boneLabel`: Label displaying the current bone.
    * `sortingAreas`: List/Array of sorting areas.
    * `scoreDisplay`: Component displaying the current score.
    * `timerDisplay`: Component displaying the remaining time.
* **Methods**:
    * `initializeUIComponents()`: Sets up and positions all UI components.
    * `showFeedback(FeedbackType type)`: Displays visual feedback based on user actions.
    * `resetUI()`: Prepares the UI for a new game or restart.

---

#### **Interactions**:

1. **Main Game Application** manages the game lifecycle. It communicates with the **BoneGenerator** to produce bones and uses **UIManager** to display game components and respond to user interactions.

2. **BoneGenerator** interacts with the **Bone** class to get a new bone image and type.

3. **SortingArea** receives a bone, validates it using its type, and then updates the **Scoreboard** based on correctness.

4. **Timer** notifies **Main Game Application** when the time runs out.

5. **UIManager** manages the drag-and-drop functionality, using **Bone** and **SortingArea** to validate placements and update **Scoreboard** and **Timer** displays.

---