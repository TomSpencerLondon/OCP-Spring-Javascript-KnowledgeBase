package com.techprimers;

import com.techprimers.world.HelloWorld;
import com.techprimers.youtube.HelloYouTube;

public class Main {
    public static void main(String[] args) {
        HelloYouTube helloYouTube = new HelloYouTube();
        helloYouTube.hello();
        final HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
    }
}
