package com.trafficmanager;

class TrafficManager {

    private RoundAbout roundabout;
    private VehicleQueue waitingQueue;

    TrafficManager(int roundaboutCapacity, int queueCapacity) {
        roundabout = new RoundAbout(roundaboutCapacity);
        waitingQueue = new VehicleQueue(queueCapacity);
    }

    public void enterVehicle(int id) {
        if (!roundabout.isFull()) {
            roundabout.addVehicle(id);
        } else {
            waitingQueue.enqueue(id);
        }
    }

    public void exitVehicle(int id) {
        roundabout.removeVehicle(id);

        if (waitingQueue.hasWaiting() && !roundabout.isFull()) {
            int nextVehicle = waitingQueue.dequeue();
            if (nextVehicle != -1)
                roundabout.addVehicle(nextVehicle);
        }
    }

    public void showStatus() {
        roundabout.printRoundabout();
    }
}

