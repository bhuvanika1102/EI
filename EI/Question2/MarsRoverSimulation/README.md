Mars Rover Simulation
----------------------
Overview
This Java-based simulation emulates a Mars Rover navigating a grid-based terrain. The rover can move forward, turn left, and turn right while avoiding obstacles and staying within grid boundaries. The program showcases the use of Object-Oriented Programming principles and design patterns including Command, Composite, and SOLID principles.


Features
•	Grid Initialization: Define the dimensions of the grid and place obstacles.
•	Rover Control: Control the rover's movements with commands to move forward, turn left, and turn right.
•	Obstacle Detection: The rover avoids moving to positions with obstacles.
•	Status Reporting: The rover can report its current position and direction.
•	Dynamic Input: Input grid size, obstacles, starting position, and commands dynamically through the console.


Design Patterns and Principles
•	Command Pattern: Encapsulates commands (Move, TurnLeft, TurnRight) as objects for flexible execution.
•	Composite Pattern: Represents the grid and obstacles, allowing for easy management of grid elements.
•	SOLID Principles: Applied to ensure clean, maintainable, and scalable code.





Direction.java   	                      -->       # Enum for rover's direction
Grid.java        	                      -->       # Represents the grid and obstacles
MarsRover.java   	       		      -->       # Mars Rover implementation
Command.java     	                      -->       # Command interface
MoveCommand.java 	                      -->       # Command to move the rover
TurnLeftCommand.java                          -->  	# Command to turn the rover left
TurnRightCommand.java                         -->	# Command to turn the rover right
RoverControl.java                             -->	# Invoker for commands
MarsRoverSimulation.java                      -->	# Main class to run the simulation
 README.md                                    -->       # Project documentation
 build/                                       -->       # Build artifacts



Prerequisites
•	Java Development Kit (JDK) 8 or later
•	Command Line Interface (CLI) for compilation and execution


Installation
•	Clone the repository:
git clone https://github.com/bhuvanika1102/EI/tree/main/EI/Question2/MarsRoverSimulation.git
cd mars-rover-simulation
•	Compile the source code:
		javac src/*.java -d build/
•	Run the simulation:
java -cp build MarsRoverSimulation


Follow the prompts to:
1.	Enter Grid Size: Define the width and height of the grid.
2.	Enter Obstacles: Specify the number of obstacles and their coordinates.
3.	Enter Starting Position: Provide the initial x, y coordinates and direction (N, E, S, W) of the rover.
4.	Enter Commands: Input a sequence of commands (M for move, L for turn left, R for turn right).

Output
The program will display the final grid with obstacles and the rover’s status, including its final position and facing direction.


SAMPLE OUTPUT
INFO: Executed MoveCommand: Rover moved to (1, 3)
Final Grid:
. . . . . . . . . .
. . . . . . . . . .
. . . . . . . . . .
. . . . . . . . . .
. . . X . . . . . .
. . . . . . . . . .
. ^ . . . . . . . .
. . X . . . . . . .
. . . . . . . . . .
. . . . . . . . . .
Rover is at (1, 3) facing NORTH. 2 Obstacles detected.


Contact
For questions or feedback, please contact bhuvani1102@gmail.com.

