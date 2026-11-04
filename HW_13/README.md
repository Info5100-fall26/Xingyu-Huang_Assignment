# HW 13: Chat application (Java Swing)

A chat application with chat windows, sign-up and login. Two participants can send and receive typed messages.

To run it, open a terminal in the folder with the files and type:

    javac *.java
    java ChatApp

How to use:

1. Sign up a user (username: 3 to 15 letters, digits or _; password: at least 4 characters), then log in. A chat window opens.
2. In the same login window, sign up and log in a second user. A second chat window opens.
3. Type a message and press Send or Enter. Both windows show the message.

To run the automatic checks:

    java ChatTest

Accounts are saved in users.txt. Passwords are saved as a hash, not as text.
