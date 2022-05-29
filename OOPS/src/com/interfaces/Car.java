package com.interfaces;

public class Car{
    private Engine engine;
    private Media media;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Media getMedia() {
        return media;
    }

    public Car(){
        this.engine = new PowerEngine();
        this.media = new CDPlayer();
    }

    public Car(Engine engine, Media media){
        this.engine = engine;
        this.media = media;
    }

    public void engineStart(){
        engine.start();
    }

    public void engineStop(){
        engine.stop();
    }

    public void engineAccelerate(){
        engine.acc();
    }

    public void mediaStart(){
        media.start();
    }

    public void mediaStop(){
        media.stop();
    }


}
