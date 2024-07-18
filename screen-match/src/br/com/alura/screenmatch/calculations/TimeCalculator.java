package br.com.alura.screenmatch.calculations;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void calculateTime(Movie m) {
//        totalTime += m.getDuration();
//    }
//
//    public void calculateTime(Serie s) {
//        totalTime += s.getDuration();
//    }
public void calculateTime(Title i) {
        totalTime += i.getDuration();
    }
}

