package com.ubs.opsit.interviews;

import java.math.BigInteger;
import java.util.Arrays;

public class BerlinClock{

    /*
    displayBerlinTime method input parameter String Time
    Split the total total  based on second,minute and hours
    Based on input it return Berlin Clock

    */
    public String[]displayBerlinTime(String time){
        String seconds= updateSecondTime(time.substring(6,8));
        String hrs=Arrays.toString(updateHoursLamps(time.substring(0,2)));
        String minutes= Arrays.toString(updateMinutesLamps(time.substring(3,5)));
        String berlin[]={seconds,hrs.substring(1,5),hrs.substring(7,11),minutes.substring(1,12),minutes.substring(14,18)};
        return berlin;
    }

    /* yellow light blink at every 2 seconds

      updateSecondTime method input parameter String seconds
      return 'Y' or 'O"
    */
    public String updateSecondTime(String seconds) {
        if(Integer.valueOf(seconds)%2==0)
            return "Y";
        else
            return  "O";
    }

    /* Top row having 4 lights and each of 5 hours
       Bottom row have 4 light each of 1 hrs

     updateHoursLamps method input parameter String Hours
     Based on Input hours , divide by 5 , as each top bulbs 5 Hours
     Dividend is number top row hours light and Quotient is number of bottom
     row bulbs blinks.
     return String array - first element in array return top row light second
     element return bottom bulbs blink as -'R'
     */
    public String[] updateHoursLamps(String hours){
        BigInteger totalNumHours, eachTopRowBulbTime;

        totalNumHours = new BigInteger(hours);
        eachTopRowBulbTime= new BigInteger("5");

        BigInteger topBottomLamps[] = totalNumHours.divideAndRemainder(eachTopRowBulbTime);

        StringBuilder topRowLamp=new StringBuilder("OOOO");
        StringBuilder bottomRowLamps=new StringBuilder("OOOO");

        for(int i=0;i<topBottomLamps[0].intValue();i++){
            topRowLamp.setCharAt(i,'R');
        }

        for(int i=0;i<topBottomLamps[1].intValue();i++){
            bottomRowLamps.setCharAt(i,'R');
        }
        String berlinHourTimesDisplay[]={topRowLamp.toString(),bottomRowLamps.toString()};
        return berlinHourTimesDisplay;
    }


    /* Top row having 11 lights and each of 5 minutes
       Bottom row have 4 light each of 1 minute

     updateMinutesLamps method input parameter String Minutes
     Based on Input minutes , divide by 5 , as each top light is 5 minutes
     Dividend is number top minute row bulbs and Quotient is number of bottom
     row bulbs blinks.
     return String array - first element in array return top row bulbs second
     element return bottom bulbs blink as -'Y'
     In top minute row -3rd,6th,9th bulbs blink as 'R'
      */
    public String[] updateMinutesLamps(String minutes){

        BigInteger totalMinutes, eachTopRowMinuteBulbTime;

        totalMinutes = new BigInteger(minutes);
        eachTopRowMinuteBulbTime= new BigInteger("5");

        BigInteger topBottomLamps[] = totalMinutes.divideAndRemainder(eachTopRowMinuteBulbTime);

        StringBuilder topRowLamps =new StringBuilder("OOOOOOOOOOO");
        StringBuilder bottomRowLamps =new StringBuilder("OOOO");

        for(int i=0;i<topBottomLamps[0].intValue();i++){
            topRowLamps.setCharAt(i,'Y');
            if(i==2 ||i==5 || i==8){
                topRowLamps.setCharAt(i,'R');
            }
        }

        for(int i=0;i<topBottomLamps[1].intValue();i++){
            bottomRowLamps.setCharAt(i,'Y');
        }

        String berlinMinuteTimesDisplay[]={topRowLamps.toString(),bottomRowLamps.toString()};
        return berlinMinuteTimesDisplay;
    }

}
