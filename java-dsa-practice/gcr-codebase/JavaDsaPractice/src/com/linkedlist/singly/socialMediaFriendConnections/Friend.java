package com.linkedlist.singly.socialMediaFriendConnections;
import java.util.ArrayList;

class UserNode{
	int userId;
	String name;
	int age;
	ArrayList<Integer> friendIds;
	UserNode next;
	
	UserNode(	int userId,String name,int age){
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friendIds = new ArrayList<>();
		this.next = null;
	}	
}

public class Friend {
	 private UserNode head;
	
	public void addUser(int id , String name, int age) {
		UserNode newNode = new UserNode(id, name, age) ;
			newNode.next = head;
			head = newNode;
			
		}
	
	private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // 1️⃣ Add friend connection (bidirectional)
    public void addFriendConnection(int user1, int user2) {
		        UserNode u1 = findUser(user1);
		        UserNode u2 = findUser(user2);

		        if (u1 == null || u2 == null) {
		            System.out.println("User not found");
		            return;
		        }

		        if (!u1.friendIds.contains(user2)) {
		            u1.friendIds.add(user2);
		            u2.friendIds.add(user1);
		            System.out.println("Friend connection added");
		        } else {
		            System.out.println("Already friends");
		        }
		    }

		    // 2️⃣ Remove friend connection
		    public void removeFriendConnection(int user1, int user2) {
		        UserNode u1 = findUser(user1);
		        UserNode u2 = findUser(user2);

		        if (u1 == null || u2 == null) {
		            System.out.println("User not found");
		            return;
		        }

		        u1.friendIds.remove(Integer.valueOf(user2));
		        u2.friendIds.remove(Integer.valueOf(user1));
		        System.out.println("Friend connection removed");
		    }

		    // 3️⃣ Find mutual friends
		    public void findMutualFriends(int user1, int user2) {
		        UserNode u1 = findUser(user1);
		        UserNode u2 = findUser(user2);

		        if (u1 == null || u2 == null) {
		            System.out.println("User not found");
		            return;
		        }

		        System.out.println("Mutual Friends:");
		        boolean found = false;

		        for (int id : u1.friendIds) {
		            if (u2.friendIds.contains(id)) {
		                System.out.println("User ID: " + id);
		                found = true;
		            }
		        }

		        if (!found) {
		            System.out.println("No mutual friends");
		        }
		    }

		    // 4️⃣ Display all friends of a user
		    public void displayFriends(int userId) {
		        UserNode user = findUser(userId);

		        if (user == null) {
		            System.out.println("User not found");
		            return;
		        }

		        System.out.println("Friends of " + user.name + ":");
		        for (int id : user.friendIds) {
		            System.out.println("User ID: " + id);
		        }

		        if (user.friendIds.isEmpty()) {
		            System.out.println("No friends");
		        }
	}
}

	
	
	
