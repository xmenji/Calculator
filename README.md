# Calculator

This project contains a program that effectively functions as a very basic calculator. Its functions mainly consists of arithmetic operators such as addition (+), subtraction (-), multiplication (×), division (÷), and exponential (xn). 
This calculator follows the order of operations (P.E.M.D.A.S), and so parenthesis “()” can be added around expressions to give them higher priority when solving. 
The calculator functions as follows: the user can select numbers or operators by clicking on their respective buttons and display them on the screen. To solve the expression, the user can simply press the “=” button and the result will immediately display on the screen. To delete the last input made, the user can press “C”. To clear out the entire expression that’s currently displayed on the screen, the user can press “CE”.

This calculator program is made up by a few different types of classes as per Object-Oriented Programming. It contains the Operator class, which is abstract to allow flexibility in programming its subclasses containing all of the arithmetic operators as well as for both parenthetical brackets. Each operator is represented as an object and contains the priority number that is used to determine in what order it should be evaluated. 
The Operand class contains functions that parses numbers represented as Strings and provides its value in Integer type. It also contains a method that validates whether the string represents an actual value or not.
The Evaluator class evaluates the expression entered by the user by parsing through the expression and obtaining its token via the StringTokenizer class. If the entered expression is valid, Evaluator runs through each token, entering them in either the operator or operand stacks, then proceeds to evaluate the expression based on the priority number of the operator entering the stack.
The algorithm used to evaluate the expressions is “Evaluation of Infix Expressions” which can be found here: http://csis.pace.edu/~murthy/ProgrammingProblems/16_Evaluation_of_infix_expressions. In general, the algorithm continuously enters the operators and operands onto their respective stacks until an operator that is about to enter the stack is encountered, and either 1) has a lower priority than the operator currently on top of the stack or 2) the right-hand side parenthesis is encountered which then begins the process of actually solving the expression. This algorithm continues to work until all of the tokens are processed, and both operator and operand stacks are emptied out. 


For this project, I contributed by completing the Operator class and programming its child classes. The child classes comprise of the addition, subtraction, multiplication, division, and a class for the left-hand side parenthetical bracket and a class for the right-hand side.
The Operand class was mostly completed and I added the programming statements to make the class functions complete. Specifically, I added the validation code that checks whether the operand is a valid number or not, as well as the code for the function that converts the String operand into Integer.
The Evaluator class had already part of the algorithm implemented and I completed this by adding conditions that determine when to start the process of evaluating the expressions depending on what the operator is, and what its priority number it has. 
For the EvaluatorUI class, I implemented the code that completes the ActionCommand method. It contains the actions that allows the user to input and evaluate the expressions entered in the text display box on the calculator interface. 


Development Environment:

Version of Java used: jdk-12.0.1_windows-x64_bin

IDE used: IntelliJ IDEA 2019.2.1 (Community Edition)
Build #IC-192.6262.58, built on August 20, 2019
Runtime version: 11.0.3+12-b304.39 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Windows 10 10.0
GC: ParNew, ConcurrentMarkSweep
Memory: 725M
Cores: 4
Registry: 
Non-Bundled Plugins: 
