#include "SevSeg.h"
#include "DHT.h"

SevSeg sevseg;

// DHT
#define DHTPIN A0
#define DHTTYPE DHT11
DHT dht(DHTPIN, DHTTYPE);

void setup() {
  dht.begin();
  
  // 7-seg setup
  byte numDigits = 4;
  byte digitPins[] = {10, 11, 12, 13};
  byte segmentPins[] = {9, 2, 3, 5, 6, 8, 7, 4};
  bool resistorsOnSegments = true;
  byte hardwareConfig = COMMON_CATHODE;
  sevseg.begin(hardwareConfig, numDigits, digitPins, segmentPins, resistorsOnSegments);
}

void loop() {
  float t = dht.readTemperature();
  t = t * 100;
  if (isnan(t)) {
    return;
  }
  static unsigned long timer = millis();
  if (millis() >= timer) {
    timer += 300;
    sevseg.setNumber(t, 2);
  }
  sevseg.refreshDisplay();
}
