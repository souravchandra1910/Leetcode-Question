class UndergroundSystem {
 public class Average{
      public int total=0;
      public int cnt=0;
      public void updateAverage(int diff){
          total+=diff;
          cnt++;
      }
      
      double GetAverage(){
          return total*1.0/cnt;
       }
     }
    HashMap<Integer,Event>hm;
    HashMap<String,Average>map;
    public UndergroundSystem() {
        this.hm=new HashMap<>();
        this.map=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
       hm.put(id,new Event(id,stationName,t));
    }
    public void checkOut(int id, String stationName, int t) {
         Event e=hm.get(id);
         hm.remove(id);
         int diff=t-e.t;
         String str=e.stationName+"#"+stationName;
         Average avg;
         if(map.containsKey(str)){
            avg=map.get(str);
            avg.updateAverage(diff);
         }else{
            avg=new Average();
            avg.updateAverage(diff);
         }
        map.put(str,avg);
    }
    
    public double getAverageTime(String st, String ed) {
        String str=st+"#"+ed;
        return map.get(str).GetAverage();
    }
    
    public class Event{
        int id,t;
        String stationName;
        Event(int id,String StationName,int t){
            this.id=id;
            this.stationName=StationName;
            this.t=t;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */