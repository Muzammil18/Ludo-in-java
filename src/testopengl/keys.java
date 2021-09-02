/*
 * To change this license header, choos   e License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopengl;

/**
 *
 * @author Muzammil
 */

import com.jogamp.opengl.GL2;
import com.sun.glass.events.KeyEvent;
import java.util.Random;
public class keys {
//   EventListener obj = new EventListener();
    Random obj1 = new Random();
    Goti_mar mar = new Goti_mar();
     Shapes shape=new Shapes();
    Goti Goties = new Goti();
    List Wnier = new  List();
    List player_1 = new List();
    List player_2 = new List();
    List player_3 = new List();
    List player_4 = new List();
    float x_diff =  7.5f, y_diff = 7.5f , x_Start =-5 , y_Start = (80-16.67f/2)-(7.5f/2);
    public void runway()
    {
       float x = x_Start-(16.67f/2),y = y_Start, x1 = x_Start+(x_diff/2), y1 = y_Start-(16.67f/2), x6 =0;
       float y6 = 0, x2 = x1,x3 = x2 -(10), y2 = -18.75f, y3 = y2, x4 = -55 -(x_diff/2);
       float x5 = x4, y4 =  35 + (y_diff/2), y5 = y4, x7 =(40-16.67f/2)-(x_diff/2), x8 =0;
       float y7 =0, x9 =x_Start+(x_diff/2), y8 =0, x10 =0, y9 =(-60+16.67f/2)+(7.5f/2), y10 = 0;
       float x11 =0, y11 = -15-y_diff/2,  x12=0,  y12=0, x13 = (-100+16.67f/2)+(x_diff/2), y13 =0, x14= -55 -(x_diff/2);
       float y14 = 0, x15 = 0, x16 = 0;    
        for (int i = 0; i <= 128; i++)
        {   
            if(y>31.25f)
            {
               player_1.Insert(x, y);
               y-= y_diff;
               y1 = y-(8.33f/2);
            }
            else if(x1<=40)
            {
                player_1.Insert(x1, y1);
                x1+= x_diff;
                x2 = x1;
            }
            else if (x2>40)
            {
                y1 = y1-(16.67f);
                x2-= x_diff;
                player_1.Insert(x2, y1);
                y1 = y1-(16.67f);
            }
            else if(x2>-5)
            {
                player_1.Insert(x2, y1);
                x2-= x_diff;
                x3 = x2-(8.33f/2);
            }
            else if(x7>-5)
            {
                player_2.Insert(x7, y1);
                x7-= x_diff;
            }
            else if(y2 > -60)
            {
                player_1.Insert(x3, y2);
                player_2.Insert(x3, y2);
                y2-= y_diff;
                y3 = y2;
            }
            else if (y3<-56.25)
            {
                x3 = x3-(16.67f);
                y3+= y_diff;
                player_1.Insert(x3, y3);
                player_2.Insert(x3, y3);
                x3 = x3-(16.67f);
            }
            else if(y9<-15)
            {
                player_3.Insert(x3, y9);
                y9+= y_diff;
            }
            else if(y3<-15)
            {
                player_1.Insert(x3, y3);
                player_2.Insert(x3, y3);
                y3+= y_diff;
                y6 = y3+(8.33f/2);
            }
            else if(x4>=-100)
            {
                player_1.Insert(x4, y6);
                player_2.Insert(x4, y6);
                player_3.Insert(x4, y6);
                x4-= x_diff;
                x5 = x4; 
            }
            else if (x5<-100)
            {
                y6 = y6+(16.67f);
                x5+= x_diff;
                player_1.Insert(x5, y6);
                player_2.Insert(x5, y6);
                player_3.Insert(x5, y6);  
                y6 = y6+(16.67f);
            }
            else if(x5<-55)
            {
                player_1.Insert(x5, y6);
                player_2.Insert(x5, y6);
                player_3.Insert(x5, y6);
                x5+= x_diff;
                x6 = x5+(8.33f/2);
            }
            else if(x13<-55)
            {
                player_4.Insert(x13, y6);
                x13+=x_diff;
            }   
            else if(y4 <= 76.25)
            {
                player_1.Insert(x6, y4);
                player_2.Insert(x6, y4);
                player_3.Insert(x6, y4);
                player_4.Insert(x6, y4);
                y4+= y_diff;
                y5 = y4;
            }
            else if (y5>76.25)
            {
                x6 = x6+(16.67f);
                y5-= y_diff;
                player_1.Insert(x6, y5);
                player_2.Insert(x6, y5);
                player_3.Insert(x6, y5);
                player_4.Insert(x6, y5);
                y7 = y5;
                x8 =  x6+(16.67f);
            }
            else if((y5>31.25f))
            {
                 y5-= y_diff;
                player_1.Insert(x6, y5);
               
            }
            else if(y7>31.25f)
            {
                player_2.Insert(x8, y7);
                player_3.Insert(x8, y7);
                player_4.Insert(x8, y7);
                y7-= y_diff;
                y8 = y7-(8.33f/2);
            }
            else if(x9<=40)
            {
                player_2.Insert(x9, y8);
                player_3.Insert(x9, y8);
                player_4.Insert(x9, y8);
                x9+= x_diff;
                x10 = x9;
            }
            else if(x10>40)
            {
                x10-= x_diff;
                y8 -= 16.67f;
                player_2.Insert(x10, y8);
                player_3.Insert(x10, y8);
                player_4.Insert(x10, y8);
                x11 = x10;
                y10 = y8-(16.67f);
            }
            else if(x10>-5)
            {
                 x10-= x_diff;
                player_2.Insert(x10, y8);    
            }
            else if(x11>-5)
            {
                player_3.Insert(x11, y10);
                player_4.Insert(x11, y10);
                x11-= x_diff;
                x12=x11-(8.33f/2);
            }
             else if(y11>-60)
            {
                player_3.Insert(x12, y11);
                player_4.Insert(x12, y11);
                y11-=y_diff;
                y12 = y11;
            }
            else if(y12<-60)
            {
                y12+=y_diff;
                x12 -= 16.67f;
                player_3.Insert(x12, y12);
                player_4.Insert(x12, y12);
                y13 =y12;
                x16=x12-16.67f;
            }
            else if(y12<-15)
            {
                 y12+=y_diff;  
                player_3.Insert(x12, y12);
            }
            else if(y13<-15)
            {
                player_4.Insert(x16, y13);
                y13+=y_diff;
                y14 = y13+8.33f/2;
            }
            else if(x14>=-100)
            {
                player_4.Insert(x14, y14);
                x14-= x_diff;
                x15 = x14;   
            }
            else if(x15<-100)
            {
                x15+= x_diff;
                y14+=16.67f;
                player_4.Insert(x15, y14);
            }
            else if(x15<-55)
            {
                x15+= x_diff;
                player_4.Insert(x15, y14);
            }
        }
    }
    void rrrr(GL2 gl)
    {
    //Node tem = player_1.head;
    //Node tem = player_2.head;
    // Node tem = player_3.head;
      Node tem = player_4.head;
    while (tem!=null)
    {
        shape.circle(gl, tem.x, tem.y, 2, 0, 0, 0);
        tem=tem.next;  
    }
    }
    public void runkey(GL2 gl)
    {
        runway();
        if(size!=3){ 
//             run_player_1(gl);
//             run_player_2(gl);
//              run_player_3(gl);
//              run_player_4(gl);
            if(countgoti_in_home != 4){
                if(Event_start.select_player==1){ 
                    shape.string(gl, 45, 70, "Player 1 role the dice.....", 0, 0, 0);
                    run_player_1(gl);}}
            if(countgoti_in_home_2 != 4){
                if(Event_start.select_player==2){shape.string(gl, 45, 70, "Player 2  role the dice.....", 0, 0, 0);
                run_player_2(gl);}}
            if(countgoti_in_home_3 != 4){
                if(Event_start.select_player==3){
                    shape.string(gl, 45, 70, "Player 3  role the dice.....", 0, 0, 0);
                    run_player_3(gl);}}
            if(countgoti_in_home_4 != 4){
                if(Event_start.select_player==4){
                    shape.string(gl, 45, 70, "Player 4  role the dice.....", 0, 0, 0);
                    run_player_4(gl);}}
            if(Event_start.select_player==5){
                Event_start.select_player=1;}
        }
        else{
            show_winer(gl);
        }
        show_player_1_gotian(gl);
        show_player_2_gotian(gl);
        show_player_3_gotian(gl);
        show_player_4_gotian(gl);
    }
    void show_winer(GL2 gl)
    {
        shape.rectangle(gl,42, 80,98,98,0,1,1);
        shape.string(gl, 60, 90, "Game End......", 0, 0, 0);
        if(Wnier.head.x==1)
            shape.string(gl, 45, 70, "Player 1 is 1st.....", 0, 0, 0);
        if(Wnier.head.x==2)
            shape.string(gl, 45, 70, "Player 2 is 1st.....", 0, 0, 0);
        if(Wnier.head.x==3)
            shape.string(gl, 45, 70, "Player 3 is 1st.....", 0, 0, 0);
        if(Wnier.head.x==4)
            shape.string(gl, 45, 70, "Player 4 is 1st.....", 0, 0, 0);
        if(Wnier.head.next.x==1)
            shape.string(gl, 45, 60, "Player 1 is 2nd.....", 0, 0, 0);
        if(Wnier.head.next.x==2)
            shape.string(gl, 45, 60, "Player 2 is 2nd.....", 0, 0, 0);
        if(Wnier.head.next.x==3)
            shape.string(gl, 45, 60, "Player 3 is 2nd.....", 0, 0, 0);
        if(Wnier.head.next.x==4)
            shape.string(gl, 45, 60, "Player 4 is 2nd.....", 0, 0, 0);
        if(Wnier.tail.x==1)
            shape.string(gl, 45, 50, "Player 1 is 3rd.....", 0, 0, 0);
        if(Wnier.tail.x==2)
            shape.string(gl, 45, 50, "Player 2 is 3rd.....", 0, 0, 0);
        if(Wnier.tail.x==3)
            shape.string(gl, 45, 50, "Player 3 is 3rd.....", 0, 0, 0);
        if(Wnier.tail.x==4)
            shape.string(gl, 45, 50, "Player 4 is 3rd.....", 0, 0, 0);
    }
    int size =0,count11=0, count12=0, count13=0,count14=0, countgoti_in_home=0;    
    Node temp11, temp12, temp13, temp14 ;
     public void run_player_1(GL2 gl)
    {
        int rcount1 =count11;
        Node rtemp1 = temp11;
        boolean check = false, check1 = false, check2 = false;
        int a = obj1.nextInt(6)+1;
        if(a!=6)
        {
             TestOpenGL.animator.pause();
        }
        shape.string(gl, 45, 60, "Player 1 get score  :       " + a, 0, 0, 0);
      // shape.string(gl, 55, 65, "Player 1 select whivh goti you you want to  move ", 0, 0, 0);
           if(count11!=57)
           {
                if(temp11 == null&&a==6)
                {
                    temp11 =player_1.head;
                    count11++;
                }
                else{
                    if(temp11==null)
                        return;
                    for(int i=1;i<=a&&temp11!=null;i++)
                    {
                        count11++;
                        temp11 = temp11.next;
                    }
                     mar.player_3_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                    if(count11>57)
                    {
                        temp11=rtemp1;
                        count11=rcount1;
                        check = true;
                    }
                }
                if(count11==57)
                {
                    countgoti_in_home++;         
                }
            }
            if(count11==57&&count12!=57||check == true)
            {  
                int rcount2 =count12;
                Node rtemp2 = temp12;
                if(temp12 == null&&a==6)
                {
                    temp12 =player_1.head;
                    count12++;
                }
                else{
                    if(temp12==null)
                        return;
                    for(int i=1;i<=a&&temp12!=null;i++)
                    {
                        count12++;
                        temp12 = temp12.next;
                    }
                     mar.player_3_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                    if(count12>57)
                    {
                        temp12=rtemp2;
                        count12=rcount2;
                        check1 = true;
                    }
                }
                if(count12==57)
                {
                    countgoti_in_home++;
                }
            }
            if(count12==57&&count13!=57|| check1 == true)
            {
                int rcount3 =count13;
                Node rtemp3 = temp13;
                if(temp13 == null&&a==6)
                {
                    temp13 =player_1.head;
                    count13++;
                }
                else{
                    if(temp13==null)
                        return;
                    for(int i=1;i<=a&&temp13!=null;i++)
                    {
                        count13++;
                        temp13 = temp13.next;
                    }
                     mar.player_3_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                    if(count13>57)
                    {
                        temp13=rtemp3;
                        count13=rcount3;
                        check2 = true;
                    }
                }
                if(count13==57)
                {
                    countgoti_in_home++;
                }
            }
            if(count13==57&&count14!=57|| check2 == true)
            {
                int rcount4 =count14;
                Node rtemp4 = temp14;
                if(temp14 == null&&a==6)
                {
                    temp14 =player_1.head;
                    count14++;
                }
                else{
                    if(temp14==null)
                        return;
                    for(int i=1;i<=a&&temp14!=null;i++)
                    {
                        count14++;
                        temp14 = temp14.next;
                    }
                     mar.player_3_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                    if(count14>57)
                    {
                        temp14=rtemp4;
                        count14=rcount4;
                    }
                }
                if(count14==57)
                {
                    countgoti_in_home++;
                }
                if(countgoti_in_home==4){
                    size=size+1;
                    Wnier.Insert_viner(1);
                }
            }
    }
   int count21=0, count22=0,count23=0, count24=0,countgoti_in_home_2;
    Node temp21 , temp22 ,temp23, temp24 ;
    public void run_player_2(GL2 gl)
    {
        boolean check =false, check1 =false,check2 =false;
        int rcount1 =count21;
        Node rtemp1 = temp21;
        int a =obj1.nextInt(6)+1;
         if(a!=6)
        {
             TestOpenGL.animator.pause();
        }
        shape.string(gl, 45, 60, "Player 2 get score  :       " + a, 0, 0, 0);
        if(count21!=57)
        {
           if(temp21 == null&&a==6)
           {       
              temp21 =player_2.head;
              count21++;
           }
           else{
               if(temp21==null)
                   return;
                for(int i=1;i<=a&&temp21!=null;i++)
                {
                    count21++;
                    temp21 = temp21.next;
                }
                 mar.player_1_mar_goti();
                mar.player_3_mar_goti();
                mar.player_4_mar_goti();
                if(count21>57)
                {
                    temp21=rtemp1;
                    count21=rcount1;
                    check=true;
                }
            }
            if(count21==57)
           {
             countgoti_in_home_2++;
           }
        }
        if(count21==57&&count22!=57|| check==true)
        {
            int rcount2 =count22;
            Node rtemp2 = temp22;
            if(temp22 == null&&a==6)
           {
               temp22 =player_2.head;
               count22++;
           }
           else{
               if(temp22==null)
                   return;
                for(int i=1;i<=a&&temp22!=null;i++)
                {
                    count22++;
                    temp22 = temp22.next;
                }
                 mar.player_1_mar_goti();
                mar.player_3_mar_goti();
                mar.player_4_mar_goti();
                if(count22>57)
                {
                    temp22=rtemp2;
                    count22=rcount2;
                    check1=true;
                }
            }
            if(count22==57)
            {
              countgoti_in_home_2++;
            }
        }
        if(count22==57&&count23!=57||check1==true)
        {
            int rcount3 =count23;
            Node rtemp3 = temp23;
            if(temp23 == null&&a==6)
            {
               temp23 =player_2.head;
               count23++;
            }
        else{
           if(temp23==null)
               return;
            for(int i=1;i<=a&&temp23!=null;i++)
            {
                count23++;
                temp23 = temp23.next;
            }
             mar.player_1_mar_goti();
                mar.player_3_mar_goti();
                mar.player_4_mar_goti();
            if(count23>57)
            {
                temp23=rtemp3;
                count23=rcount3;
                check2=true;
            }
        }
        if(count23==57)
        {
          countgoti_in_home_2++;
        }
    }
        if(count23==57&&count24!=57||check2==true)
         {
            int rcount4 =count24;
            Node rtemp4 = temp24;
           if(temp24 == null&&a==6)
           {
                temp24 =player_2.head;
                count24++;
           }
           else{
               if(temp24==null)
                   return;
               for(int i=1;i<=a&&temp24!=null;i++)
                {
                     count24++;
                    temp24 = temp24.next;
                }
                mar.player_1_mar_goti();
                mar.player_3_mar_goti();
                mar.player_4_mar_goti();
                if(count24>57)
                {
                    temp24=rtemp4;
                    count24=rcount4;
                }
            }
             if(count24==57)
            {
               countgoti_in_home_2++;
           }
           if(countgoti_in_home_2==4){
                size=size+1;
                Wnier.Insert_viner(2);
            }
        }
    }
     int count31=0, count32=0,count33=0, count34=0, countgoti_in_home_3=0;
    Node temp31 , temp32, temp33,temp34 ;
    public void run_player_3(GL2 gl)
    {
        boolean check =false, check1 =false,check2 =false;
        int rcount1 =count31;
        Node rtemp1 = temp31;
        int a =obj1.nextInt(6)+1;
         if(a!=6)
        {
             TestOpenGL.animator.pause();
        }
        shape.string(gl, 45, 60, "Player 3 get score  :       " + a, 0, 0, 0);
        if(count31!=57)
        {
           if(temp31 == null&&a==6)
           {       
              temp31 =player_3.head;
              count31++;
           }
           else{  
               if(temp31==null)
                   return;
                for(int i=1;i<=a&&temp31!=null;i++)
                {
                    count31++;
                    temp31 = temp31.next;
                }
                mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                if(count31>57)
                {
                    temp31=rtemp1;
                    count31=rcount1;
                    check=true;
                }
            }
           if(count31==57)
           {
                countgoti_in_home_3++;
           }
        }
        if(count31==57&&count32!=57||check==true)
        {
            int rcount2 =count32;
            Node rtemp2 = temp32;
            if(temp32 == null&&a==6)
            {
                temp32 =player_3.head;
                count32++;
            }
           else{
               if(temp32==null)
                   return;
                for(int i=1;i<=a&&temp32!=null;i++)
                {
                    count32++;
                    temp32 = temp32.next;
                }
                 mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                if(count32>57)
                {
                    temp32=rtemp2;
                    count32=rcount2;
                    check1 = true;
                }
            }
            if(count32==57)
            {
                 countgoti_in_home_3++;
            }
        }
        if(count32==57&&count33!=57||check1 == true)
        {
            int rcount3 =count33;
            Node rtemp3 = temp33;
            if(temp33 == null&&a==6)
            {
                temp33 =player_3.head;
                count33++;
            }
            else{
                if(temp33==null)
                   return;
                for(int i=1;i<=a&&temp33!=null;i++)
                {
                    count33++;
                    temp33 = temp33.next;
                }
                 mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                if(count33>57)
                {
                    temp33=rtemp3;
                    count33=rcount3;
                    check2 = true;
                }
            }
            if(count33==57)
            {
                countgoti_in_home_3++;
            }
        }
        if(count33==57&&count34!=57||check2 == true)
        {
            int rcount4 =count34;
            Node rtemp4 = temp34;
            if(temp34 == null&&a==6)
            {
                temp34 =player_3.head;
                count34++;
            }
            else{
               if(temp34==null)
                   return;
                for(int i=1;i<=a&&temp34!=null;i++)
                {
                    count34++;
                    temp34 = temp34.next;
                }
                 mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_4_mar_goti();
                if(count34>57)
                {
                    temp34=rtemp4;
                    count34=rcount4;
                }
                if(count34==57)
                {
                    countgoti_in_home_3++;
                }
            }
        }
        if(countgoti_in_home_3==4){
            size=size+1;
            Wnier.Insert_viner(3);
        }
    }
    int count41=0, count42=0,count43=0,count44=0,countgoti_in_home_4=0;
    Node temp41 ,temp42 ,temp43 , temp44 ;
    public void run_player_4(GL2 gl)
    {
        boolean check = false, check1 = false, check2 = false;
        int rcount1 =count41;
        Node rtemp1 = temp41;
        int a =obj1.nextInt(6)+1;
         if(a!=6)
        {
             TestOpenGL.animator.pause();
        }
        shape.string(gl, 45, 60, "Player 4 get score  :       " + a, 0, 0, 0);
        if(count41!=57)
        {
           if(temp41 == null&&a==6)
           {
               temp41 =player_4.head;
               count41++;
           }
           else{
               if(temp41==null)
                   return;
                for(int i=1;i<=a&&temp41!=null;i++)
                {
                    count41++;
                    temp41 = temp41.next;
                }
                mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_3_mar_goti();
                if(count41>57)
                {
                    temp41=rtemp1;
                    count41=rcount1;
                    check = true;
                }
            }
            if(count41==57)
            {
                countgoti_in_home_4++;
            }    
        }
        if(count41==57&&count42!=57||check == true)
        {
            int rcount2 =count42;
            Node rtemp2 = temp42;
            if(temp42 == null&&a==6)
            {
                temp42 =player_4.head;
                count42++;
            }
            else{
                if(temp42==null)
                   return;
                for(int i=1;i<=a&&temp42!=null;i++)
                {   
                    count42++;
                    temp42 = temp42.next;
                }
                mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_3_mar_goti();
                if(count42>57)
                {
                    temp42=rtemp2;
                    count42=rcount2;
                    check1 = true;
                }
            }
            if(count42==57)
            {
                countgoti_in_home_4++;
            }    
        }
        if(count42==57&&count43!=57||check1 == true)
        {
            int rcount3 =count43;
            Node rtemp3 = temp43;
            if(temp43 == null&&a==6)
            {
                temp43 =player_4.head;
                count43++;
            }
            else{
                if(temp43==null)
                   return;
                for(int i=1;i<=a&&temp43!=null;i++)
                {
                    count43++;
                    temp43 = temp43.next;
                }
                mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_3_mar_goti();
                if(count43>57)
                {
                    temp43=rtemp3;
                    count43=rcount3;
                    check2 = true;
                }
            }
            if(count43==57)
            {
                countgoti_in_home_4++;
            }    
        }
        if(count43==57&&count44!=57||check2 == true)
        {
            int rcount4 =count44;
            Node rtemp4 = temp44;
            if(temp44 == null&&a==6)
            {
                temp44 =player_4.head;
                count44++;
            }
            else{
                if(temp44==null)
                   return;
                for(int i=1;i<=a&&temp44!=null;i++)
                {
                    count44++;
                    temp44 = temp44.next;
                }
                mar.player_1_mar_goti();
                mar.player_2_mar_goti();
                mar.player_3_mar_goti();
                if(count44>57)
                {
                    temp44=rtemp4;
                    count44=rcount4;
                }
            }
            if(count44==57)
            {
                countgoti_in_home_4++;
            }    
        }
        if(countgoti_in_home_4==4){
            size=size+1;
            Wnier.Insert_viner(4);
        }
    }
     void show_player_1_gotian(GL2 gl)
    {
        if(temp11 == null)
           Goties.player_1_1_Goti(gl,9.5f, 65.5f);
        if(temp12 == null)
           Goties.player_1_2_Goti(gl,25.5f,  65.5f);
        if(temp13 == null)
           Goties.player_1_3_Goti(gl,9.5f, 49.5f);
        if(temp14 == null)
           Goties.player_1_4_Goti(gl, 25.5f, 49.5f);
        shape.string(gl,-30.414999f, 31.25f, "" +countgoti_in_home, 0, 0, 0);
        if(temp11!=null&&count11!=57)
            Goties.player_1_1_Goti(gl, temp11.x, temp11.y);
        if(temp12!=null&&count12!=57)
            Goties.player_1_2_Goti(gl, temp12.x, temp12.y);
        if(temp13!=null&&count13!=57)
            Goties.player_1_3_Goti(gl, temp13.x, temp13.y);
        if(temp14!=null&&count14!=57)
            Goties.player_1_4_Goti(gl, temp14.x, temp14.y);
    }
    void show_player_2_gotian(GL2 gl)
    {
         if(temp21 == null)
            Goties.player_2_1_Goti(gl,9.5f, -29.5f);
        if(temp22 == null)
            Goties.player_2_2_Goti(gl,25.5f, -29.5f);
        if(temp23 == null)
            Goties.player_2_3_Goti(gl,9.5f, -45.5f);
        if(temp24 == null)
            Goties.player_2_4_Goti(gl, 25.5f, -45.5f);
        shape.string(gl,-8.78f, 10.414999f, "" +countgoti_in_home_2, 0, 0, 0);
        if(temp21!=null&&count21!=57)
            Goties.player_2_1_Goti(gl, temp21.x, temp21.y);
        if(temp22!=null&&count22!=57)
            Goties.player_2_2_Goti(gl, temp22.x, temp22.y);
        if(temp23!=null&&count23!=57)
            Goties.player_2_3_Goti(gl, temp23.x, temp23.y);
        if(temp24!=null&&count24!=57)
            Goties.player_2_4_Goti(gl, temp24.x, temp24.y);
    }
    void show_player_3_gotian(GL2 gl)
    {
        if(temp31 == null)
            Goties.player_3_1_Goti(gl,-85.5f, -29.5f);
        if(temp32 == null)
            Goties.player_3_2_Goti(gl,-69.5f, -29.5f);
        if(temp33 == null)
            Goties.player_3_3_Goti(gl,-85.5f, -45.5f);
        if(temp34 == null)
            Goties.player_3_4_Goti(gl, -69.5f, -45.5f);
        shape.string(gl, -29.585f, -11.25f, "" +countgoti_in_home_3, 0, 0, 0);
        if(temp31!=null&&count31!=57)
            Goties.player_3_1_Goti(gl, temp31.x, temp31.y);
        if(temp32!=null&&count32!=57)
            Goties.player_3_2_Goti(gl, temp32.x, temp32.y);
        if(temp33!=null&&count33!=57)
            Goties.player_3_3_Goti(gl, temp33.x, temp33.y);
        if(temp34!=null&&count34!=57)
            Goties.player_3_4_Goti(gl, temp34.x, temp34.y);
    }
    void show_player_4_gotian(GL2 gl)
    {
        if(temp41 == null)
            Goties.player_4_1_Goti(gl,-85.5f, 65.5f);
        if(temp42 == null)
            Goties.player_4_2_Goti(gl,-69.5f, 65.5f);
        if(temp43 == null)
            Goties.player_4_3_Goti(gl, -85.5f, 49.5f);
        if(temp44 == null)
            Goties.player_4_4_Goti(gl, -69.5f, 49.5f);
        shape.string(gl,-51.25f, 9.585f, "" +countgoti_in_home_4, 0, 0, 0);
        if(temp41!=null&&count41!=57)
            Goties.player_4_1_Goti(gl, temp41.x, temp41.y);
        if(temp42!=null&&count42!=57)
            Goties.player_4_2_Goti(gl, temp42.x, temp42.y);
        if(temp43!=null&&count43!=57)
            Goties.player_4_3_Goti(gl, temp43.x, temp43.y);
        if(temp44!=null&&count44!=57)
            Goties.player_4_4_Goti(gl, temp44.x, temp44.y);
    }
}
