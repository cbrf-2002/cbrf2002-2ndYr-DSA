// Pulse Monitor Test Script
//www.RobotLinking.com
//int sensorPin = 0;
double alpha = 0.75;
int period = 100;
double change = 0.0;
double minval = 0.0;

#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7, 3, POSITIVE);

void setup ()
{
  Serial.begin (9600);
  lcd.begin(16,2);
}
void loop ()
{
    static double oldValue = 0;
    static double oldChange = 0;
 
    int rawValue = analogRead (A0);
    double value = alpha * oldValue + (1 - alpha) * rawValue;
 
    Serial.print (rawValue);
    Serial.print (",");
    Serial.println (value);
    oldValue = value;

    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("HR Raw: ");
    lcd.print(rawValue);
    lcd.setCursor(0,1);
    lcd.print("HeartRate: ");
    lcd.print(value);

    delay (period);
}
