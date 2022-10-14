// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
           g.drawLine(25,25,250,25);
           g.drawLine(250,25,325,150);
           g.drawLine(25,25, 25,325);
           g.drawLine(25,25,100,150);
           g.drawLine(100,150,325,150);
           g.drawLine(325,150,324,400);
           g.drawLine(100,150,100, 400);
           g.drawLine(100,400, 325,400);
           g.drawLine(25,325,250,325);
           g.drawLine(250,25,250,325);
           g.drawLine(25,325, 100,400);
           g.drawLine(250,325, 325,400);


        // DRAW SPHERE

           g.drawOval(135,135,50,200);
           g.drawOval(110,135,100,200);
           g.drawOval(85,135,150,200);
           g.drawOval(72,135,175,200);
           g.drawOval(60,135,200,200);

           g.drawOval(60,210,200,50);
           g.drawOval(60,185,200,100);
           g.drawOval(60,160,200,150);




        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(455,130,130,130);

        // top
        g.drawLine(395,200,600,60);
        g.drawLine(600,60,575,300);

        //bottom
        g.drawLine(395,200, 575,300);

        g.drawOval(393,40,271,269);



        // DRAW APCS

         g.fillRect(50,450,75,25);
         g.fillRect(50,475,25,100);
         g.fillRect(100,475,25,100);
         g.fillRect(75,500,25,25);

         g.fillRect(150,450,25,125);
         g.fillRect(150,450, 50,25);
         g.fillRect(200,450, 25, 75);
         g.fillRect(175,500,25,25);

        g.fillRect(250,450,25,125);
        g.fillRect(275,450, 50,25);
        g.fillRect(275,550, 50,25);

        g.fillRect(350,450, 75,25);
        g.fillRect(350,450, 25,75);
        g.fillRect(350,500, 75,25);
        g.fillRect(400,500, 25,75);
        g.fillRect(350,550, 75,25);

        // DRAW PACMEN FLOWER

        g.fillArc(600,425,100,100,135,270);
        g.fillArc(660,500,100,100,45,270);
        g.fillArc(600,575,100,100,315,270);
        g.fillArc(540,500,100,100,225,270);


    }

}



