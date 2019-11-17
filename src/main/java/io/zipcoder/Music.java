package io.zipcoder;

import java.util.Map;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clickNext = 0;
        int clickBack = 0;

        for(int i = startIndex; i <= playList.length;i++){

            if(playList[i].equals(selection)){
                break;
            }
            clickNext++;

            if(i == (playList.length -1)) {
                i = -1;
            }
        }

        for(int j = startIndex; j >= 0 ; j --){

            if(playList[j].equals(selection)){
                break;
            }
            clickBack++;
            if(j == 0){
                j = playList.length;
            }
        }
        return Math.min(clickNext, clickBack);
    }
}
