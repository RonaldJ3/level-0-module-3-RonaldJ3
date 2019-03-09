int x1 = 100;
int x2 = 1000;
void setup() {
  size(1400, 900);
  noFill();
}

void draw() {
  background(255,255,255);
x1+=10;
x2-=10;
  for (int i = 800; i>10; i = i-10) {
    noFill();
    ellipse(x1, 450, i, i);
  }
  noFill();
  for (int j = 10; j< 800; j = j+10) {
    ellipse(x2, 450, j, j);
  }
}
