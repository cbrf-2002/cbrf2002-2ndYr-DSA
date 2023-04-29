//Mah original work bruh CBRF.2002

#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7, 3, POSITIVE);
byte volblock[8] = {
  0b11111, 0b11111, 0b11111, 0b11111, 0b11111, 0b11111, 0b11111, 0b11111
};

void setup() {
  Serial.begin(9600);
  lcd.begin(16,2);
  lcd.createChar(0, volblock);
}

void loop() {
  //don't use D0
  int mic = analogRead(A0);
  int micgoo = map(mic, 17, 900, 1, 16);
  lcd.clear();
  lcd.setCursor(0,0);
  lcd.print("Mic Vol:");
  lcd.setCursor(0,1);
  Serial.println(mic);

  for (int i = 1; i <= micgoo; i++) {
    lcd.print((char)0);
  }

  delay(100);
}
