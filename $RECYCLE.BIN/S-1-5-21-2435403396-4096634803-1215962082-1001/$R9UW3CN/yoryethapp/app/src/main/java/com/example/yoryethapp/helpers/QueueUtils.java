package com.example.yoryethapp.helpers;

public class QueueUtils {
}
    public static synchronized QueueObject getInstance(Context context) {
        if (uniqueInstance == null) {
            uniqueInstance = new QueueObject(context);
        }
        return uniqueInstance;
    }