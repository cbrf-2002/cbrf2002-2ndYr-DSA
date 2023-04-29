#include <Wire.h>
#include <LiquidCrystal_I2C.h>
#include "DHT.h"

//// LCDisplay ////
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7, 3, POSITIVE);
////cbrf2002/////
// DHT /////////
#define DHTPIN A0
#define DHTTYPE DHT11
DHT dht(DHTPIN, DHTTYPE);
///////////
//////////
//////// LCD IC2 gnd to gnd, vcc to 5V, SDA to A4, SCL on A5
////// DHT p1 on any input pin, p2 vcc on 5v, p3 on gnd
//

void setup() {
  // DHT section
  dht.begin();
  // LCD
  lcd.begin(16,2);
}

void loop() {
  delay(2000);
  lcd.clear();
  float h = dht.readHumidity();
  float t = dht.readTemperature();

  // if no output...
  if (isnan(h) || isnan(t)) {
    lcd.setCursor(0,0);
    lcd.print("Failed to read from DHT sensor!");
    delay(2000);
    lcd.clear();
    return;
  }

  float hic = dht.computeHeatIndex(t, h, false);

  //display to LCD
  lcd.setCursor(0,0);
  lcd.print("H:");
  lcd.print(h, 1);
  lcd.print("% T:");
  lcd.print(t);
  lcd.print("C");
  lcd.setCursor(0,1);
  lcd.print("HI: ");
  lcd.print(hic);
  lcd.print("C");

}
