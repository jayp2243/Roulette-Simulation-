
/**
 * See Assignment 5 instructions on Blackboard
 * 
 * 
 * @author JAYMIN PATEL
 */
import java.util.*;
public class RouletteSimulation {

	public static void main(String[] args) {
		
	long redCount = 0; 
	long blackCount= 0;
	long repeatCount = 0;
	long threepeatCount = 0;
	boolean wasRepeat = false;
	int evenStreak = 1;
	int oddStreak = 1;
	int evenStreakRecord = 0;
	int oddStreakRecord = 0;
	int lastNumber = -1;

Random r = new Random();

//TRIAL 100

for (int i=1; i<=100; i++) {
    
int numb = r.nextInt(37);
//Determine if number is the same as the previous random number
if(numb == lastNumber){
   

if(wasRepeat == true){
    threepeatCount++;
    wasRepeat = false;
}
else {
    repeatCount++;
    wasRepeat = true;
}

}
else{
    wasRepeat = false;
}

//determine if number is part of an even streak
if((numb % 2) == 0 && (lastNumber % 2) == 0 && numb != 0 && lastNumber != 0){
evenStreak++;
}

else{
    if(evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;
    
    }
evenStreak = 1;
}

//determine if number is part of an odd streak
if((numb % 2) == 1 && (lastNumber % 2) == 1 && numb != 0 && lastNumber != 0){
 oddStreak++;
 }
 else{
     if(oddStreak > oddStreakRecord){
         oddStreakRecord = oddStreak;
         
}
oddStreak = 1;
}
//blackCount
if( (numb>=1 && numb <= 10) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 1){
    blackCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 1){
    blackCount++;
}

//redCount

if( (numb>=1 && numb <= 10) && numb % 2 == 1){
    redCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 0){
    redCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 1){
    redCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 0){
    redCount++;
}

lastNumber = numb;

}


if (evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;

}

if(oddStreak > oddStreakRecord){
    oddStreakRecord = oddStreak;
}

System.out.println("Trial 100 Results:");
System.out.println("Red Count  " + (redCount));
System.out.println("Black Count  " + (blackCount));
System.out.println("Repeat Count  " + (repeatCount));
System.out.println("Threepeat Count  " + (threepeatCount));
System.out.println("Even Streak Record  " + (evenStreakRecord));
System.out.println("Odd Streak Record  " + (oddStreakRecord));



//TRIAL 1,000,000

for (int i=1; i<=1000000; i++) {
    
int numb = r.nextInt(37);
//Determine if number is the same as the previous random number
if(numb == lastNumber){
   

if(wasRepeat == true){
    threepeatCount++;
    wasRepeat = false;
}
else {
    repeatCount++;
    wasRepeat = true;
}

}
else{
    wasRepeat = false;
}

//determine if number is part of an even streak
if((numb % 2) == 0 && (lastNumber % 2) == 0 && numb != 0 && lastNumber != 0){
evenStreak++;
}

else{
    if(evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;
    
    }
evenStreak = 1;
}

//determine if number is part of an odd streak
if((numb % 2) == 1 && (lastNumber % 2) == 1 && numb != 0 && lastNumber != 0){
 oddStreak++;
 }
 else{
     if(oddStreak > oddStreakRecord){
         oddStreakRecord = oddStreak;
         
}
oddStreak = 1;
}
//blackCount
if( (numb>=1 && numb <= 10) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 1){
    blackCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 1){
    blackCount++;
}

//redCount

if( (numb>=1 && numb <= 10) && numb % 2 == 1){
    redCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 0){
    redCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 1){
    redCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 0){
    redCount++;
}

lastNumber = numb;

}


if (evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;

}

if(oddStreak > oddStreakRecord){
    oddStreakRecord = oddStreak;
}

System.out.println("Trial 1,000,000 Results:");
System.out.println("Red Count  " + (redCount));
System.out.println("Black Count  " + (blackCount));
System.out.println("Repeat Count  " + (repeatCount));
System.out.println("Threepeat Count  " + (threepeatCount));
System.out.println("Even Streak Record  " + (evenStreakRecord));
System.out.println("Odd Streak Record  " + (oddStreakRecord));


//TRIAL 1billion

for (int i=1; i<=1000000000; i++) {
    
int numb = r.nextInt(37);
//Determine if number is the same as the previous random number
if(numb == lastNumber){
   

if(wasRepeat == true){
    threepeatCount++;
    wasRepeat = false;
}
else {
    repeatCount++;
    wasRepeat = true;
}

}
else{
    wasRepeat = false;
}

//determine if number is part of an even streak
if((numb % 2) == 0 && (lastNumber % 2) == 0 && numb != 0 && lastNumber != 0){
evenStreak++;
}

else{
    if(evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;
    
    }
evenStreak = 1;
}

//determine if number is part of an odd streak
if((numb % 2) == 1 && (lastNumber % 2) == 1 && numb != 0 && lastNumber != 0){
 oddStreak++;
 }
 else{
     if(oddStreak > oddStreakRecord){
         oddStreakRecord = oddStreak;
         
}
oddStreak = 1;
}
//blackCount
if( (numb>=1 && numb <= 10) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 1){
    blackCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 0){
    blackCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 1){
    blackCount++;
}

//redCount

if( (numb>=1 && numb <= 10) && numb % 2 == 1){
    redCount++;
}

if( (numb>=11 && numb <= 18) && numb % 2 == 0){
    redCount++;
}

if( (numb>=19 && numb <= 28) && numb % 2 == 1){
    redCount++;
}

if( (numb>=29 && numb <= 36) && numb % 2 == 0){
    redCount++;
}

lastNumber = numb;

}


if (evenStreak > evenStreakRecord){
    evenStreakRecord = evenStreak;

}

if(oddStreak > oddStreakRecord){
    oddStreakRecord = oddStreak;
}

System.out.println("Trial 1,000,000,000 Results:");
System.out.println("Red Count  " + (redCount));
System.out.println("Black Count  " + (blackCount));
System.out.println("Repeat Count  " + (repeatCount));
System.out.println("Threepeat Count  " + (threepeatCount));
System.out.println("Even Streak Record  " + (evenStreakRecord));
System.out.println("Odd Streak Record  " + (oddStreakRecord));










}
}
