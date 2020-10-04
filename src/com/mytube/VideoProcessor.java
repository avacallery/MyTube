package com.mytube;

public class VideoProcessor {
    private VideoDatabase database;
    private VideoEncoder encoder;
    private NotificationService notificationService;

    //constructor injection
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }


    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
//        notificationService.notify(video.getUser());
    }
}

