package com.parceltracker;

class ParcelTracker {

    private Stage head;

    // Add stage at end
    public void addStage(String stageName) {
        Stage newStage = new Stage(stageName);
        if (head == null) {
            head = newStage;
            return;
        }
        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // Add intermediate checkpoint
    public void addAfter(String existingStage, String newStageName) {
        Stage temp = head;
        while (temp != null) {
            if (temp.stageName.equals(existingStage)) {
                Stage newStage = new Stage(newStageName);
                newStage.next = temp.next;
                temp.next = newStage;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found: " + existingStage);
    }

    // Forward tracking
    public void trackParcel() {

        if (head == null) {
            System.out.println("No tracking info available");
            return;
        }

        Stage temp = head;

        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stageName + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL (Delivered / Lost)");
    }
}

