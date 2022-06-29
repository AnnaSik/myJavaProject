package school.lesson4.Task7;

public class Park {

    private String parkName;
    private Attraction attraction;

    public Park (String parkName){
        this.parkName = parkName;
    }
   private class Attraction {
        private String name;
        private String time1;
       private String time2;
        private int cost;

        public void setName(String name) {
            this.name=name;
        }

        public void setTime1(String time1) {
            this.time1= time1;
        }
       public void setTime2(String time2) {
           this.time2= time2;
       }

        public void setCost(int cost) {
            this.cost=cost;
        }
    }
     public String getAttraction (String attraction) {
        return attraction;
    }

    public String getAttraction() {
        if (attraction != null) {
            return ("Атракцион: " + attraction.name + " работает c " + attraction.time1 + " до "+attraction.time2 + ", одна поездка стоит: " + attraction.cost+ " рублей");
        } else {
            return ("Атракцион не найден!");
        }
    }
public void obtainAttraction(String name, String time1,String time2, int cost){
        attraction = new Attraction();
        attraction.setName(name);
        attraction.setTime1(time1);
        attraction.setTime2(time2);
        attraction.setCost(cost);
}
public String toString(){
        StringBuilder x = new StringBuilder(120);
        x.append("Парк "+parkName+ ":\n");
        x.append(getAttraction()+"\n");
        return x.toString();
}
}
