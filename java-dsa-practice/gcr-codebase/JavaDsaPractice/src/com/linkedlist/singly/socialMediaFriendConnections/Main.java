package com.linkedlist.singly.socialMediaFriendConnections;
public class Main {
    public static void main(String[] args) {

        Friend list = new Friend();

        list.addUser(1, "Aman", 21);
        list.addUser(2, "Muskan", 22);
        list.addUser(3, "Ravi", 20);
        list.addUser(4, "Neha", 23);

        list.addFriendConnection(1, 2);
        list.addFriendConnection(1, 3);
        list.addFriendConnection(2, 3);
        list.addFriendConnection(2, 4);

        list.displayFriends(2);

        list.findMutualFriends(1, 2);

        list.removeFriendConnection(1, 3);

        list.displayFriends(1);
    }
}

