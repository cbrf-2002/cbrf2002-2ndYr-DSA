const int le = 5;
int ledConn[] = {
  2, 3, 4, 5, 6
};

void setup() {
  for (int i = 0; i < le; i++) {
    pinMode(ledConn[i], OUTPUT);
  }

}

void loop() {
  for (int i = 0; i < le; i++) {
    digitalWrite(ledConn[i], HIGH);
      delay(600);
    
    digitalWrite(ledConn[i], LOW);
      delay(300);
  }
}
