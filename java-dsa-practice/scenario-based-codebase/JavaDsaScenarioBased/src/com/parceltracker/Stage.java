package com.parceltracker;

class Stage {
    String stageName;
    Stage next;

    Stage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}

