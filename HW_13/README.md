# HW Chapter 13: Chat application (Java Swing)

A chat application with chat windows, sign-up and login. Two participants can send typed messages and receive each other's messages.

## How to run

```bash
javac *.java
java ChatApp
```

## How to use

1. Type a username (3 to 15 letters, digits or `_`) and a password (at least 4 characters), then click **Sign up**.
2. Click **Log in**. A chat window opens.
3. The login window stays open. Sign up and log in a **second** user: a second chat window opens next to the first one.
4. Type a message and click **Send** (or press Enter). Both windows show the message with the time and the sender's name.
5. Closing a chat window means leaving the chat; the other window shows "left the chat". Closing the login window ends the program.

Accounts are saved in `users.txt` (username and a SHA-256 hash of the password, never the password itself), so they are still there after a restart.

## Files

| File | Purpose |
|---|---|
| `ChatApp.java` | Starts the program and opens the login window |
| `LoginWindow.java` | Sign-up and login window |
| `ChatWindow.java` | Chat window of one user (history, input field, Send button) |
| `ChatHub.java` | The chat room: delivers every message to all open chat windows and remembers the history |
| `UserStore.java` | Registered users, saved in a text file |
| `ChatTest.java` | Automatic checks of the sign-up, login and message logic |

## Test

```bash
java ChatTest
```

It prints one line per check and `All chat checks passed.` at the end.

## Notes

Both chat windows run inside one program and share the same chat room object, so no network is needed.
