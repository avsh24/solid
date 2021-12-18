package com.solid.lsp.mediaplayer_lsp_solution;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");
    }

    public static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) {
        for(MediaPlayer player : allPlayers) {
            player.playAudio();
        }
    }
}