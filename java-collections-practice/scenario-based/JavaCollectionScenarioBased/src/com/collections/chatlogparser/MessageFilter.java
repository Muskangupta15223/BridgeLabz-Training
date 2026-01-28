package com.collections.chatlogparser;

public interface MessageFilter<T> {
    boolean shouldKeep(T message);
}
