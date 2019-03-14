package studentdatabase;

public enum Days {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, PIDAY, TUEWEDNESDAY;

   @Override
   public String toString() {
      return super.toString().substring(0,1) + super.toString().substring(1).toLowerCase();
   }
}
