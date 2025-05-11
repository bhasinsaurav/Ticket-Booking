package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTime;
    private List<String> train;

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> train){

        this.seats = seats;
        this.train = train;
        this.stationTime = stationTimes;
        this.trainNo = trainNo;
        this.trainId = trainId;
    }
    public String getTrainId() {
        return trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public List<String> getTrain() {
        return train;
    }

    public void setTrain(List<String> train) {
        this.train = train;
    }

    public Map<String, String> getStationTime() {
        return stationTime;
    }

    public void setStationTime(Map<String, String> stationTime) {
        this.stationTime = stationTime;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }

}
