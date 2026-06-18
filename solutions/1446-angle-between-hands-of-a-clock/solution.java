class Solution {
    public double angleClock(int hour, int minutes) {
      double tetha=Math.abs((30*hour)-((11.0/2)*minutes));
    double angle;
      if(tetha>180)
      {
        angle=360-tetha;

      }
      else{
        angle=tetha;
      }
      return angle;  
    }
}
