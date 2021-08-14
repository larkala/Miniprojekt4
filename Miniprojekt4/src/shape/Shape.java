package shape;
import java.awt.Graphics;

import point.Point;

public interface Shape
  {
  public void draw(Graphics g);
  public Point getPosition();
  public double getWidth();
  public double getHeight();
  public boolean intersects(Point point);
  public void moveTo(Point point);
  public void move(double dx, double dy);
  public void resizeTo(Point point);
  public Shape peel();
  }
