/* Creates Visual Poetry at random, from preconfigured sets or user input.


This file is part of Visual Poetry Generator.

Visual Poetry Generator is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Visual Poetry Generator is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Visual Poetry Generator. If not, see <http://www.gnu.org/licenses/>.

Copyright (C) Ante Wessels.


    
@version 2026
@author: Ante Wessels


Elements of this applet:

Input: preconfigured sets, user input, mixed set: preconfigured/user input.
The msg (paint) are the lines of the poems, centered or aligned, etc.
The msg are grouped in msg groups: same size & color, some can be relocated.
The templates make the poems. They set the lay out, colors, content, relocation, 
which msg are used.
There are 5 colorsets, colors are randomly chosen from these sets, including black,
which is also the background color. So, part of the poem may dissolve into the background,
making the templates dynamic. Very dynamic: sometimes the whole poem...


*/





  import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;
        


        public class poem_black_2026 extends Applet implements Runnable, ActionListener {
        
        
                Thread thread1;
                boolean isRunning = true;
                boolean goOnAfter = true;
                boolean goFlag = true;
                Button suspendButton, resumeButton;


                TextField text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, textLovers;
                Button buttonSet1, buttonSet2, buttonSet3, buttonSet4,  buttonSet5, buttonOKinput, buttonHelp, buttonIntro;




                String in1, in2, in3, in4, in5, in6, in7, in8, in9, in10, inSentence1, inSentence2, inSentence3, inSentence4;
                String msg = "";
                String msg1 = "";
                String msg2 = "";
                String msg3 = "";
                String msg4 = "";
                String msg5 = "";
                String msg6 = "";
                String msg7 = "";
                String msg8 = "";
                String msg9 = "";
                String msg10 = "";
                String msg11 = "";
                String msg12 = "";
                String msgCenter = "";
                String msgNorth = "";
                String msgWest = "";
                String msgEast = "";
                String msgSouth = "";
                String msgDouble1 = "";
                String msgDouble13 = "";
                String msg3CenterBig = "";
                String msg11CenterBig = "";
                String msg4Right = "";
                String msg7Right = "";
                String msg5Left = "";
                String msg8Left = "";
                String msgLittleStairs1 = "";
                String msgLittleStairs2 = "";
                String msgLittleStairs3 = "";
                String msgBigStairs1 = "";
                String msgBigStairs2 = "";
                String msgBigStairs3 = "";
                String spaceOut1 = "    ";
                String spaceOut2 = "    ";
                String spaceOut3 = "    ";
                String spaceOut4 = "    ";
                String spaceOut5 = "    ";
                String spaceOut6 = "    ";
                String spaceOut7 = "    ";
                String spaceOut8 = "    ";
                String spaceOut9 = "    ";
                String spaceOut10 = "    ";
                String spaceOut11 = "    ";
                String spaceOut12 = "    ";
                String spaceOut13 = "    ";
                


                String out1, out2, out3, out4, out5, out6, out7, out8, out9, out10, out11, out12, out13, out14, out15, out16, out17, out18, out19, out20, out21, out22, out23, out24, out25, out26, out27, out28, out29, out30, out31, outSentence1, outSentence2, outSentence3, outSentence4;

                int x = 0;
                int y = 0;
                int x1 = 0;
                int x2 = 0;
                int x3 = 0;
                int x4 = 0;
                int x5 = 0;
                int x6 = 0;
                int x7 = 0;
                int x8 = 0;
                int x9 = 0;
                int x10 = 0;
                int x11 = 0;
                int x12 = 0;
                int xCenter = 0;
                int xNorth = 0;
                int heightCenter = 0;
                int widthCenter = 0;
                int xWest = 0;
                int xEast = 0;
                int xSouth = 0;
                int xCenterEnd = 0;
                int xDouble1 = 0;
                int xDouble13 = 0;
                int x4Right = 0;
                int x7Right = 0;
                int x3Center = 0;
                int x11Center = 0;
                int xBigStairs1 = 0;
                int xBigStairs2 = 0;
                int xBigStairs3 = 0;
                int xBigStairs3End = 0;
                int xLittleStairs1 = 0;
                int xLittleStairs2 = 0;
                int xLittleStairs3 = 0;
                int STAIRS = 250;
                
                int template = 1;
                int contentSet = 6;
                int TEMPLATE_IN = 1;
                double perColorSet1 = 10;
                double perColorSet2 = 10;
                double perColorSet3 = 10;
                double perColorSet4 = 10;
                

                FontMetrics fontmetrics;
                String words[] = new String[10];
                String sentences[] = new String[10];
                boolean ownInput = true;
                boolean showintroimage = true;
                
                int LOCKTEMPLATE = 0;

                int SIZE;
                
                int fontM2 = 2;
                int fontM3 = 2;
                int fontM7 = 2;
                int fontM8 = 2;
                int fontM9 = 2;
                
                
                
                String spaceIn[] = new String[10];
                

                int randomRelocateModifier = 30;
                double thresholdRelocateMain = 0.1;
                double thresholdRelocateX = 0.1;
                double thresholdRelocateY = 0.1;
                int randomRelocateX1Out = 0;
                int randomRelocateY8Out = 0;

                int pmX =1;
                int pmY =1;
                
                

                
                Color bgColor;
                
                Color color1 = Color.white;
                Color color2 = Color.white;
                Color color3 = Color.white;
                Color color4 = Color.white;
                Color color5 = Color.white;
                Color color6 = Color.red;
                Color color7 = Color.white;
                Color color8 = Color.white;
                Color color9 = Color.white;
                
                Color colorArray_A[] = new Color[10];
                Color colorArray_B[] = new Color[10];
                Color colorArray_C[] = new Color[10];
                Color colorArray_D[] = new Color[10];

                int colorSet = 5;                
                

                poemhelpFrame helpmenuWindow;
                Image introimage;
                












                public void init(){

                
                


                        bgColor = Color.black;

                
                        setBackground(bgColor);



// default background color textfield: overall background color.
// default background color button: white
                        
                        

                        text1 = new TextField(20);
//                                  text1.setBackground(Color.red);
                        text1.setForeground(Color.white);
                        add(text1);

                        text2 = new TextField(20);
                        text2.setForeground(Color.white);                     
                        add(text2);

                        text3 = new TextField(20);
                        text3.setForeground(Color.white);
                        add(text3);

                        text4 = new TextField(20);
                        text4.setForeground(Color.white);
                        add(text4);


                        text5 = new TextField(20);
                        text5.setForeground(Color.white);                     
                        add(text5);

                        text6 = new TextField(20);
                        text6.setForeground(Color.white);                        
                        add(text6);

                        text7 = new TextField(20);
                        text7.setForeground(Color.white);                        
                        add(text7);

                        text8 = new TextField(20);
                        text8.setForeground(Color.white);                        
                        add(text8);


                        text9 = new TextField(20);
                        text9.setForeground(Color.white);                        
                        add(text9);

                        text10 = new TextField(20);
                        text10.setForeground(Color.white);                        
                        add(text10);
                        
                        
                        text11 = new TextField(45);
                        text11.setForeground(Color.white);                        
                        add(text11);





                        text12 = new TextField(45);
                        text12.setForeground(Color.white);                        
                        add(text12);


                        text13 = new TextField(45);
                        text13.setForeground(Color.white);                        
                        add(text13);



                        text14 = new TextField(45);
                        text14.setForeground(Color.white);                        
                        add(text14);
                        
                        suspendButton = new Button("Suspend");
                        suspendButton.setBackground(Color.black);                        
                        suspendButton.setForeground(Color.white);                        
                        add(suspendButton); 
                        suspendButton.addActionListener(this);
                        
                        resumeButton = new Button("Resume");
                        resumeButton.setForeground(Color.white);                        
                        resumeButton.setBackground(Color.black);                        
                        add(resumeButton); 
                        resumeButton.addActionListener(this);        

                        

                        buttonSet1 = new Button("Hacker's Delight");
                        buttonSet1.setForeground(Color.white);                        
                        buttonSet1.setBackground(Color.black);                        
                        add(buttonSet1);
                        buttonSet1.addActionListener(this);

                        buttonSet4 = new Button("Amorvita");
                        buttonSet4.setForeground(Color.white);                        
                        buttonSet4.setBackground(Color.black);                        
                        add(buttonSet4);
                        buttonSet4.addActionListener(this);

                        buttonSet2 = new Button("On the Road");
                        buttonSet2.setForeground(Color.white);                        
                        buttonSet2.setBackground(Color.black);                        
                        add(buttonSet2);
                        buttonSet2.addActionListener(this);

                        buttonSet3 = new Button("Shakescene");
                        buttonSet3.setForeground(Color.white);                        
                        buttonSet3.setBackground(Color.black);                        
                        add(buttonSet3);
                        buttonSet3.addActionListener(this);
                        
                        textLovers = new TextField("Paola", 10);
                        textLovers.setForeground(Color.white); 
                        add(textLovers);
                        

                        buttonSet5 = new Button("You !");
                        buttonSet5.setForeground(Color.white);                        
                        buttonSet5.setBackground(Color.black);                        
                        add(buttonSet5);
                        buttonSet5.addActionListener(this);
                        


                        buttonOKinput = new Button("Own Input");
                        buttonOKinput.setForeground(Color.white);                        
                        buttonOKinput.setBackground(Color.black);                        
                        add(buttonOKinput);
                        buttonOKinput.addActionListener(this);

                        buttonIntro = new Button("Introduction");
                        buttonIntro.setForeground(Color.white); 
                        buttonIntro.setBackground(Color.black);
                        add(buttonIntro);
                        buttonIntro.addActionListener(this);
                        
                        buttonHelp = new Button("Help");
                        buttonHelp.setForeground(Color.white); 
                        buttonHelp.setBackground(Color.black);                       
                        add(buttonHelp);
                        buttonHelp.addActionListener(this);                        

                        helpmenuWindow = new poemhelpFrame("Help");
                        helpmenuWindow.resize(560, 700);
                        
                        introimage = getImage(getCodeBase(), "intro.gif");
                        
                        
                        STAIRS = Integer.parseInt(getParameter("pStairs"));
                        LOCKTEMPLATE = Integer.parseInt(getParameter("pLockTemplate"));
                        TEMPLATE_IN = Integer.parseInt(getParameter("pTemplateNumber"));
                        
// default font size = 2 * SIZE.

	                  SIZE = Integer.parseInt(getParameter("pFontsize"));                        
                        
                        
                       colorArray_A[0] = Color.white;
                       colorArray_A[1] = Color.blue;
                       colorArray_A[2] = Color.green;
                       colorArray_A[3] = Color.red;
                       colorArray_A[4] = Color.cyan;
                       colorArray_A[5] = Color.gray;
                       colorArray_A[6] = Color.yellow;
                       colorArray_A[7] = Color.red;
                       colorArray_A[8] = Color.blue;
                       colorArray_A[9] = Color.cyan;
             
                       
                       colorArray_B[0] = Color.white;
                       colorArray_B[1] = Color.black;
                       colorArray_B[2] = Color.white;
                       colorArray_B[3] = Color.black;
                       colorArray_B[4] = Color.gray;
                       colorArray_B[5] = Color.gray;
                       colorArray_B[6] = Color.lightGray;
                       colorArray_B[7] = Color.lightGray;
                       colorArray_B[8] = Color.darkGray;
                       colorArray_B[9] = Color.darkGray;     
                       
                       colorArray_C[0] = Color.white;
                       colorArray_C[1] = Color.white;
                       colorArray_C[2] = Color.white;
                       colorArray_C[3] = Color.white;
                       colorArray_C[4] = Color.white;
                       colorArray_C[5] = Color.white;
                       colorArray_C[6] = Color.black;
                       colorArray_C[7] = Color.black;
                       colorArray_C[8] = Color.black;
                       colorArray_C[9] = Color.red;
         

                       colorArray_D[0] = Color.white;
                       colorArray_D[1] = Color.blue;
                       colorArray_D[2] = Color.red;
                       colorArray_D[3] = Color.cyan;
                       colorArray_D[4] = Color.yellow;
                       colorArray_D[5] = Color.black;
                       colorArray_D[6] = Color.black;
                       colorArray_D[7] = Color.black;
                       colorArray_D[8] = Color.black;
                       colorArray_D[9] = Color.black;
                       
                }
                
          

                   public void start() {
                       thread1 = new Thread(this);
                       thread1.start();
                   }

                   public void stop() {
                        isRunning = false;            
                   } 

                   public void run() {
                         while(isRunning){


                           autoPoem();
                           repaint();


                        try {Thread.sleep(5000);
                            synchronized(this){
                                while(!goFlag)
                                    wait();
                            }
                        }
                        catch(InterruptedException e) { }
                        }
                        
                   }       

                
                

 //               public void actionPerformed (ActionEvent e){
               public synchronized void actionPerformed(ActionEvent e){
               
               
               
               
             if(e.getSource() == suspendButton){
                 goOnAfter = false;             
                 goFlag = false; 
             }
             if(e.getSource() == resumeButton){
                 goOnAfter = true;
                 goFlag = true; 
                 notify();
             }               



                        if(e.getSource() == buttonSet1){
                        
                            contentSet = 1;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }
                        

                        if(e.getSource() == buttonSet2){
                        
                            contentSet = 2;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }


                        if(e.getSource() == buttonSet3){
                        
                            contentSet = 3;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }

                        if(e.getSource() == buttonSet4){

                            contentSet = 4;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }                    

                        if(e.getSource() == buttonSet5){

                            contentSet = 5;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }                    


// grabbing the user input:

                        if(e.getSource() == buttonOKinput){

                            contentSet = 6;
                            goFlag = false; 
                            goOnAfter = false;
                            makePoem();
                            requestFocus();
                        }






                if(e.getSource() == buttonHelp){
                
                         goFlag = false;
                         goOnAfter = false;                         
                         helpmenuWindow.setVisible(true);
                }



                 if(e.getSource() == buttonIntro){
                          if(goFlag == true){
                                goFlag = false;

                          }
                          else{
                              if(goOnAfter == true){
                                  goFlag = true; 
                                  notify();  
                              }
                              else{
                                  template();
                              }
                          }                
                 
                     showintroimage = !showintroimage;
                
                }
                
                
                repaint();

        }
        
        


    

        public void autoPoem(){



         
              contentSet = (int) (10*Math.random());

                            
              
              if(contentSet == 6){
                      if(text1.getText().equals("")){
                      contentSet = 1;
                      }
                      else{
                      contentSet = 6;
                      }
              }

              if(contentSet == 7){
                      if(text1.getText().equals("")){
                      contentSet = 2;
                      }
                      else{
                      contentSet = 6;
                      }
              }


              if(contentSet == 8){
                      if(text1.getText().equals("")){
                      contentSet = 4;
                      }
                      else{
                      contentSet = 6;
                      }
              }
              
              if(contentSet == 9){
                      if(text1.getText().equals("Paola")){
                      contentSet = 3;
                      }
                      else{
                      contentSet = 5;
                      }
              }              
              if(contentSet == 0){
                      contentSet = 5;
              }


              makePoem();

         }
         
         
         
         
         
        
        
        
                   public void makePoem(){
                       showintroimage = false;
                       clean();
                       content();
                       generate();
                       template();
                       relocate();
                       setColors();  
                       check();
//                                    tryOut();                       
                   }
                   
                   
                   
                   
                   
                   
                   
                   public void clean(){
                              msg = "";
                              msg1 = "";
                              msg2 = "";
                              msg3 = "";
                              msg4 = "";
                              msg5 = "";
                              msg6 = "";
                              msg7 = "";
                              msg8 = "";
                              msg9 = "";
                              msg10 = "";
                              msg11 = "";
                              msg12 = "";


                              msgCenter = "";
                              msgNorth = "";
                              msgWest = "";
                              msgEast = "";
                              msgSouth = "";
                              msgDouble1 = "";
                              msgDouble13 = "";
                              msg3CenterBig = "";
                              msg11CenterBig = "";
                              msg4Right = "";
                              msg7Right = "";
                              msg5Left = "";
                              msg8Left = "";


                              msgBigStairs1 = "";
                              msgBigStairs2 = "";
                              msgBigStairs3 = "";
                              msgLittleStairs1 = "";
                              msgLittleStairs2 = "";
                              msgLittleStairs3 = "";                   
                   }
 
                   
                   



                  public void content(){


// preconfigured input

                        if(contentSet == 1){
                            in1 = "+ operator";
                            in2 = "class";
                            in3 = "{";
                            in4 = "}";
                            in5 = "integer";
                            in6 = "null";
                            in7 = "false";
                            in8 = "true";
                            in9 = "core";
                            in10 = "dump";
                            inSentence1 = "Use the force";
                            inSentence2 = "Read the source";
                            inSentence3 = "Sweet + operator";
                            inSentence4 = "I got e-mail from Linus Torvalds!";

                            ownInput = false;
                        }

                        if(contentSet == 2){
                            in1 = "Paradise";
                            in2 = "sadness";
                            in3 = "aunt";
                            in4 = "schedule";
                            in5 = "soul";
                            in6 = "dig";
                            in7 = "Dean";
                            in8 = "lessgo!";
                            in9 = "frantic";
                            in10 = "Yes!";
                            inSentence1 = "Listen, Terry, I am not a pimp";
                            inSentence2 = "Where's Marylou, man?";
                            inSentence3 = "And there we were with a stolen car right on our doorstep";
                            inSentence4 = "Poor Sal always wants to sleep";

                            ownInput = false;
                        }


                        if(contentSet == 3){
                            in1 = "eternal";
                            in2 = "rough winds";
                            in3 = "darling buds";
                            in4 = "Summer";
                            in5 = "heaven";
                            in6 = "eye";
                            in7 = "fade";
                            in8 = "Summer's day";
                            in9 = "lovely";
                            in10 = "too hot";
                            inSentence1 = "Signifying nothing";
                            inSentence2 = "full of sound and fury";
                            inSentence3 = "it is a tale";
                            inSentence4 = "a walking shadow";

                            ownInput = false;
                        }

                        if(contentSet ==4){
                            in1 = "tears";
                            in2 = "love";
                            in3 = "mythmaker";
                            in4 = "amazons";
                            in5 = "oh Muse";
                            in6 = "Beatrice";
                            in7 = "ir";
                            in8 = "...";
                            in9 = "reconciliation";
                            in10 = "pain";
                            inSentence1 = "donna de la salute";
                            inSentence2 = "18 lifetimes ago";
                            inSentence3 = "She was your mother";
                            inSentence4 = "... a child!";

                        ownInput = false;
                        }                    

                        if(contentSet == 5){
                            in1 = "love";
                            in2 = "want";
                            in3 = "darling";
                            in4 = "beauty";
                            in5 = "...";
                            in6 = "&";
                            in7 = "!";
                            in8 = "You!";
                            in9 = "sweetheart";
                            inSentence1 = "hand in hand";
                            inSentence2 = "across the bridge";
                            inSentence3 = "I love you";
                            inSentence4 = "nourishing & transcendental";
                        
                            in10 = textLovers.getText();                           
                            ownInput = false;
                        }


// grabbing the user input: in.    (default)

                        if(contentSet == 6){


                            in1 = text1.getText();
                            in2 = text2.getText();
                            in3 = text3.getText();
                            in4 = text4.getText();
                            in5 = text5.getText();
                            in6 = text6.getText();
                            in7 = text7.getText();
                            in8 = text8.getText();
                            in9 = text9.getText();
                            in10 = text10.getText();
                            inSentence1 = text11.getText();
                            inSentence2 = text12.getText();
                            inSentence3 = text13.getText();
                            inSentence4 = text14.getText();
                        }


                }







           public void generate(){




// making a lock:  
// This way, the applet uses only one output template. 
// For testing a template without having to wait for it to show up at random.  
// the lock can be made in the html source, fill in an integer 0 till 9 there.





                    if(LOCKTEMPLATE == 0){
                          template = (int) (10*Math.random() );
                               }
                    else{
                         template = TEMPLATE_IN;
                           }






// input to words (array)


                       words[0] = in1;
                       words[1] = in2;
                       words[2] = in3;
                       words[3] = in4;
                       words[4] = in5;
                       words[5] = in6;
                       words[6] = in7;
                       words[7] = in8;
                       words[8] = in9;
                       words[9] = in10;
            
                       sentences[0] = inSentence1;
                       sentences[1] = inSentence2;
                       sentences[2] = inSentence3;
                       sentences[3] = inSentence4;
                       sentences[4] = inSentence1;
                       sentences[5] = inSentence2;
                       sentences[6] = inSentence3;
                       sentences[7] = inSentence4;
                       sentences[8] = inSentence1;
                       sentences[9] = inSentence2;


// out: random of words (~input)



                       out1 = words[(int) (10*Math.random() )];
                       out2 = words[(int) (10*Math.random() )];
                       out3 = words[(int) (10*Math.random() )];
                       out4 = words[(int) (10*Math.random() )];
                       out5 = words[(int) (10*Math.random() )];
                       out6 = words[(int) (10*Math.random() )];
                       out7 = words[(int) (10*Math.random() )];
                       out8 = words[(int) (10*Math.random() )];
                       out9 = words[(int) (10*Math.random() )];
                       out10 = words[(int) (10*Math.random() )];
                       out11 = words[(int) (10*Math.random() )];
                       out12 = words[(int) (10*Math.random() )];
                       out13 = words[(int) (10*Math.random() )];
                       out14 = words[(int) (10*Math.random() )];
                       out15 = words[(int) (10*Math.random() )];
                       out16 = words[(int) (10*Math.random() )];
                       out17 = words[(int) (10*Math.random() )];
                       out18 = words[(int) (10*Math.random() )];
                       out19 = words[(int) (10*Math.random() )];
                       out20 = words[(int) (10*Math.random() )];
                       out21 = words[(int) (10*Math.random() )];
                       out22 = words[(int) (10*Math.random() )];
                       out23 = words[(int) (10*Math.random() )];
                       out24 = words[(int) (10*Math.random() )];
                       out25 = words[(int) (10*Math.random() )];
                       out26 = words[(int) (10*Math.random() )];
                       out27 = words[(int) (10*Math.random() )];
                       out28 = words[(int) (10*Math.random() )];
                       out29 = words[(int) (10*Math.random() )];
                       out30 = words[(int) (10*Math.random() )];
                       out31 = words[(int) (10*Math.random() )];



                       outSentence1 = sentences[(int) (10*Math.random() )];
                       outSentence2 = sentences[(int) (10*Math.random() )];
                       outSentence3 = sentences[(int) (10*Math.random() )];
                       outSentence4 = sentences[(int) (10*Math.random() )];
                       
                       
// font size modifier


                             double thresholdFontM = 0.2;


                        

                             if(Math.random()< thresholdFontM){
                                  if(Math.random()< 0.7){
                                  fontM2 = 4;
                                  }
                                  if(Math.random()< 0.7){
                                  fontM3 = 1;
                                  }                                  
                                  
                             }
                             else{
                                  fontM2 = 2;
                                  fontM3 = 2;
                             }    
                             


                             if(Math.random()< thresholdFontM){
                                  if(Math.random()< 0.5){
                                  fontM7 = 1;
                                  }
                             

                                  
                             }
                             else{
                                  fontM7 = 2;
                             }    
                             
                             

                             if(Math.random()< thresholdFontM){
                                  if(Math.random()< 0.5){
                                  fontM8 = 1;
                                  }
                                  
                             }
                             else{
                                  fontM8 = 2;
                             }    
                             
                             

                             if(Math.random()< thresholdFontM){
                                  if(Math.random()< 0.5){
                                  fontM9 = 1;
                                  }
                             
                                  else{
                                  fontM9 = 4;
                                  }
                                  
                             }
                             else{
                                  fontM9 = 2;
                             }   
                 
                       
         }








       public void template(){



// configuring the output: lay out templates. 
// Templates: content (msg) and chance on a colorSet to use are given here. Location of MSGs in method paint.



// template 0. Location of MSGs in method paint.
//  same as template 3, which was made earlier, here with added spaces.

                        if(template == 0){
                        
                        spaceIn[0] = "";                        
                        spaceIn[1] = " ";
                        spaceIn[2] = "    ";
                        spaceIn[3] = "        ";
                        spaceIn[4] = "            ";
                        spaceIn[5] = "                ";
                        spaceIn[6] = "                    ";
                        spaceIn[7] = "                        ";
                        spaceIn[8] = "                            ";
                        spaceIn[9] = "                                ";


                        spaceOut1 = spaceIn[(int) (10*Math.random() )];
                        spaceOut2 = spaceIn[(int) (10*Math.random() )];
                        spaceOut3 = spaceIn[(int) (10*Math.random() )];
                        spaceOut4 = spaceIn[(int) (10*Math.random() )];
                        spaceOut5 = spaceIn[(int) (10*Math.random() )];
                        spaceOut6 = spaceIn[(int) (10*Math.random() )];
                        spaceOut7 = spaceIn[(int) (10*Math.random() )];
                        spaceOut8 = spaceIn[(int) (10*Math.random() )];
                        spaceOut9 = spaceIn[(int) (10*Math.random() )];
                        spaceOut10 = spaceIn[(int) (10*Math.random() )];
                        spaceOut11 = spaceIn[(int) (10*Math.random() )];
                        spaceOut12 = spaceIn[(int) (10*Math.random() )];
                        spaceOut13 = spaceIn[(int) (10*Math.random() )];

                                               
                        
                        
                              msg1 = out1 + spaceOut1 + out1 +
                              spaceOut2 + out1;
                              msg2 = out8 + spaceOut3 + out9 +
                              spaceOut4 + out1 + out10;
                              msg3 = out1 + spaceOut5 + out1 +
                              spaceOut6 + out1;
                              msg4 =   out2 + spaceOut7 + out1 +
                              spaceOut8 + out2 + out6 + out7;
                              msg5 = "";
                              msg6 = outSentence1;
                              msg7 = spaceOut9 + out3 + out4 + out5;
                              msg8 = out1 + spaceOut10 + out2;
                              msg9 = out3 + spaceOut11 + out4;
                              msg10 = outSentence2;
                              msg11 = outSentence3 + spaceOut12 + out4;
                              msg12 = out1 + spaceOut13 + outSentence4;

                              
     
// percentage colorSet
// 10 % chance on colorSet 1, 20 % on 2, 30 % on 4, 0 % on 4, 40% (remaining) on colorSet 5. 

                              perColorSet1 = 10;
                              perColorSet2 = 20;
                              perColorSet3 = 30;
                              perColorSet4 = 0;                             
                             

                              randomRelocateModifier = 5;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;

                           }



// template 8.
                        if(template == 8){
                            
                              msg = out1;
                              msg1 = out1;
                              msg2 = out1;
                              msg3 = out1;
                              msg4 = out1;
                              msg5 = out1;
                              msg6 = out1;
                              msg7 = out1;
                              msg8 = out1;
                              msg9 = out1;
                              msg10 = out1;
                              msg11 = out1;
                              msg12 = out1;


                              msgCenter = out1;
                              msgNorth = out1;
                              msgWest = out2;
                              msgEast = out1;
                              msgSouth = out1;
                              msgDouble1 = out1;
                              msgDouble13 = out1;
                              msg3CenterBig = out1;
                              msg11CenterBig = out1;
                              msg4Right = out1;
                              msg7Right = out1;
                              msg5Left = out1;
                              msg8Left = out1;
                              msgLittleStairs1 = out1;
                              msgLittleStairs2 = out1;
                              msgLittleStairs3 = out1;
                              msgBigStairs1 = out1;
                              msgBigStairs2 = out1;
                              msgBigStairs3 = out1;   
                              
                              
                              
                              perColorSet1 = 50;
                              perColorSet2 = 20;
                              perColorSet3 = 10;
                              perColorSet4 = 0;                              
                              
                              
                              

                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;
            }                           




// template 9. (etc.)
                        if(template == 9){

                           
                              msg = out1;
                              msg1 = out1;
                              msg2 = out2;
                              msg3 = out3;
                              msg4 = out4;
                              msg5 = out5;
                              msg6 = out6;
                              msg7 = out7;
                              msg8 = out8;
                              msg9 = out9;
                              msg10 = out10;
                              msg11 = out11;
                              msg12 = out12;


                              msgCenter = out13;
                              msgNorth = out14;
                              msgWest = out15;
                              msgEast = out16;
                              msgSouth = out17;
                              msgDouble1 = out18;
                              msgDouble13 = out19;
                              msg3CenterBig = out20;
                              msg11CenterBig = out21;
                              msg4Right = out22;
                              msg7Right = out23;
                              msg5Left = out24;
                              msg8Left = out25;
                              msgLittleStairs1 = outSentence1;
                              msgLittleStairs2 = outSentence2;
                              msgLittleStairs3 = outSentence3;
                              msgBigStairs1 = out26;
                              msgBigStairs2 = out27;
                              msgBigStairs3 = out28;      
                              
                              
                              perColorSet1 = 20;
                              perColorSet2 = 20;
                              perColorSet3 = 10;
                              perColorSet4 = 40;                              
                              
                              
                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;
                            
                                  
                 }







                        if(template == 1){

                              msg1 = out1;
                              msg2 = out2;
                              msg3 = out2 + " " + out1 + " " + out2;
                              msg4 = out2;
                              msg5 = out1 + " " + out3 + " " + out1;
                              msg6 = out1 + " " + out2 + " " + out2 + " " + out1;
                              msg7 = out1;
                              msg8 = out1 + " " + out2 + " " + out1;
                              msg9 = out1 + " " + out2 + " " + out1;
                              msg10 = out1 + " " + out2 + " " + out1;
                              msg11 = out2 + " " + out2;
                              msg12 = out1;
                              
                              
                              perColorSet1 = 10;
                              perColorSet2 = 10;
                              perColorSet3 = 30;
                              perColorSet4 = 0;                              

                              
                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;
                           
                        
               }




                        if(template == 2){


                              msg1 = out1;
                              msg2 = outSentence1;
                              msg3 = out1 + out1 + out1 + out1;
                              msg4 = out1 + out1 + out1 + out1 + out1 + out1;
                              msg5 = out1 + out1 + out1 + out1 + out1 + out1 + out1;
                              msg6 = out1 + out1 + out1 + out1 + out1 + out1 + out1;
                              msg7 = out1 + out1 + out1 + out1 + out1 + out1 + out1;
                              msg8 = out1 + " " + out2;
                              
                              
                              perColorSet1 = 10;
                              perColorSet2 = 10;
                              perColorSet3 = 10;
                              perColorSet4 = 0;                              


                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;

                }




                        if(template == 3){
                              msg1 = out1 + " " + out1 +
                              " " + out1;
                              msg2 = out8 + " " + out9 +
                              " " + out1 + out10;
                              msg3 = out1 + " " + out1 +
                              " " + out1;
                              msg4 =   out2 + " " + out1 +
                              " " + out2 + out6 + out7;
                              msg5 = "";
                              msg6 = outSentence1;
                              msg7 = "                " + out3 + out4 + out5;
                              msg8 = out1 + " " + out2;
                              msg9 = out3 + " " + out4;
                              msg10 = outSentence2;
                              msg11 = outSentence3 + " " + out4;
                              msg12 = out1 + " " + outSentence4;
                              
                              
                              perColorSet1 = 10;
                              perColorSet2 = 20;
                              perColorSet3 = 30;
                              perColorSet4 = 0;
                              

                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.5;
                           


                        }




                        if(template == 4){




                              msgCenter = out1;
                              msgNorth = out2;
                              msgWest = out3;
                              msgEast = out4;
                              msgSouth = outSentence1;
                              
                              
                              perColorSet1 = 10;
                              perColorSet2 = 10;
                              perColorSet3 = 10;
                              perColorSet4 = 0;                              

                              
                              
                        }


                        if(template == 5){


                              msg2 = outSentence1;
                              msg3 = out1;
                              msg4 = out2;
                              msg5 = out1;
                              msg6 = outSentence2;
                              msg7 = outSentence3;
                              msg8 = out1;
                              msg9 = out3;
                              msg10 = out1;
                              msg11 = outSentence4;



                              msgDouble1 = out1;
                              msgDouble13 = out1;
                              
                              
                              
                              perColorSet1 = 10;
                              perColorSet2 = 10;
                              perColorSet3 = 10;
                              perColorSet4 = 0;
                              
                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 0.4;
                              thresholdRelocateX = 0.5;
                              thresholdRelocateY = 0.2;


                 }






                        if(template == 6) {


                              msg6 = out9 + "." + out2 + "." + out10;

                              msg3CenterBig = out1;
                              msg11CenterBig = out2;
                              msg4Right = outSentence1;
                              msg7Right = out6 + "." + out7 + "." + out8 ;
                              msg5Left = out3 + "." + out4 + "." + out5;
                              msg8Left = outSentence2;
                              
                              
                              perColorSet1 = 20;
                              perColorSet2 = 30;
                              perColorSet3 = 30;
                              perColorSet4 = 0;
                              
                              
                              randomRelocateModifier = 30;
                              thresholdRelocateMain = 1;
                              thresholdRelocateX = 0.35;
                              thresholdRelocateY = 0;

                     
                            
                   }
                   
                   
                   
                   
                   


                        if(template == 7){



                              msgBigStairs1 = out1;
                              msgBigStairs2 = out2;
                              msgBigStairs3 = out3;
                              msgLittleStairs1 = outSentence1;
                              msgLittleStairs2 = outSentence2;
                              msgLittleStairs3 = outSentence3;
                              
                              
                              perColorSet1 = 20;
                              perColorSet2 = 30;
                              perColorSet3 = 30;
                              perColorSet4 = 0;
                       }

         }



            public void relocate(){

// relocate some msg

                             int randomRelocate = (int) (10*Math.random());
                             
                             
                             

                             if(Math.random()< thresholdRelocateMain){
                                  if(Math.random()< thresholdRelocateX){
                                  randomRelocateX1Out = randomRelocateModifier*randomRelocate;
                                  }
                                  else{
                                  randomRelocateX1Out = 0; 
                                  }
                             
                             
                                  if(Math.random()< thresholdRelocateY){
                                  randomRelocateY8Out = 60;
                                  }
                                  else{
                                  randomRelocateY8Out = 0;
                                  }
      
                                  
                                  
                            }
                            else{
                                randomRelocateX1Out = 0;  
                                randomRelocateY8Out = 0;  

                            }    
                           
                         
                             
                       
// relocate to the left or to the right, up or down.                       
                       

                       if(Math.random()<0.5){
                       pmX = -1;
                       }
                       else{
                       pmX = 1;
                       }



                       if(template == 5){
                       pmY = 1;
                       }
                       else if(Math.random()<0.5){
                       pmY = -1;
                       }
                       else{
                       pmY = 1;
                       }

             }          
                       










 
       public void setColors(){
       
       

// percentage colorSet       
//    perColorSet1 % chance on colorSet 1, perColorSet2 % on 2, perColorSet3 % on 3, 
//    perColorSet4 % on 4, remaining % chance on colorSet 5.        
//    f.i. template 0: 10 % chance on colorSet 1, 20 % on 2, 30 % on 4, 0 % on 4, 40% (remaining) on colorSet 5. 
       
       
        if(Math.random()<(perColorSet1/100)){
        colorSet = 1;
        }
   
   
   
        else if(Math.random()<(perColorSet2/(100-perColorSet1))){
        colorSet = 2;
        }   
   
   
        else if(Math.random() < (perColorSet3/(100-perColorSet1-perColorSet2))){
        colorSet = 3;
        }      
   

   
        else if(Math.random() < (perColorSet4/(100-perColorSet1-perColorSet2-perColorSet3))){
        colorSet = 4;
        }       
        
        
        
        else{
        colorSet = 5;
        }
          


        if(colorSet == 1){
         color1 = colorArray_A[(int) (10*Math.random() )];
         color2 = colorArray_A[(int) (10*Math.random() )];
         color3 = colorArray_A[(int) (10*Math.random() )];
         color4 = colorArray_A[(int) (10*Math.random() )];
         color5 = colorArray_A[(int) (10*Math.random() )];
         color6 = colorArray_A[(int) (10*Math.random() )];
         color7 = colorArray_A[(int) (10*Math.random() )];
         color8 = colorArray_A[(int) (10*Math.random() )];
         color9 = colorArray_A[(int) (10*Math.random() )];
         }
   
  
   
         if(colorSet == 2){
         color1 = colorArray_B[(int) (10*Math.random() )];
         color2 = colorArray_B[(int) (10*Math.random() )];
         color3 = colorArray_B[(int) (10*Math.random() )];
         color4 = colorArray_B[(int) (10*Math.random() )];
         color5 = colorArray_B[(int) (10*Math.random() )];
         color6 = colorArray_B[(int) (10*Math.random() )];
         color7 = colorArray_B[(int) (10*Math.random() )];
         color8 = colorArray_B[(int) (10*Math.random() )];
         color9 = colorArray_B[(int) (10*Math.random() )];
         }

        
         if(colorSet == 3){
         color1 = colorArray_C[(int) (10*Math.random() )];
         color2 = colorArray_C[(int) (10*Math.random() )];
         color3 = colorArray_C[(int) (10*Math.random() )];
         color4 = colorArray_C[(int) (10*Math.random() )];
         color5 = colorArray_C[(int) (10*Math.random() )];
         color6 = colorArray_C[(int) (10*Math.random() )];
         color7 = colorArray_C[(int) (10*Math.random() )];
         color8 = colorArray_C[(int) (10*Math.random() )];
         color9 = colorArray_C[(int) (10*Math.random() )];
         }
                     
                     

// a mixed set:  white; high chance on white: _D; no chance on white: _A.
// only with template 9.


         if(colorSet == 4){
         color1 = Color.black;
         color2 = colorArray_D[(int) (10*Math.random() )];
         color3 = colorArray_D[(int) (10*Math.random() )];
         color4 = colorArray_D[(int) (10*Math.random() )];
         color5 = colorArray_A[(int) (10*Math.random() )];
         color6 = colorArray_A[(int) (10*Math.random() )];
         color7 = colorArray_D[(int) (10*Math.random() )];
         color8 = Color.black;
         color9 = colorArray_D[(int) (10*Math.random() )];
         }    
                     
                     
// fixed.                     
        
    
         if(colorSet == 5){
         color1 = Color.white;
         color2 = Color.white;
         color3 = Color.white;
         color4 = Color.white;
         color5 = Color.white;
         color6 = Color.red;
         color7 = Color.white;
         color8 = Color.white;
         color9 = Color.white;
         }
        
}






      public void check(){


            
// checking whether in templates with only 2 colors both colors are black.



            if(template == 0 || template == 1 || template == 2 || template == 3){
                    if(color1 == Color.black && color8 == Color.black){
                        color1 = colorArray_A[(int) (10*Math.random() )];
                        color8 = colorArray_A[(int) (10*Math.random() )];  
                    }
            }
            

            if(template == 4 && color2 == Color.black && color3 == Color.black){
                color2 = colorArray_A[(int) (10*Math.random() )];
                color3 = colorArray_A[(int) (10*Math.random() )];
            }


            if(template == 7 && color5 == Color.black && color6 == Color.black){
                color5 = colorArray_A[(int) (10*Math.random() )];
                color6 = colorArray_A[(int) (10*Math.random() )];
            }
            


      }





       public void tryOut(){

       clean();

       }





    public void paint(Graphics g)
    {

    
    

        if(showintroimage == true){

//                        g.drawRect(ptAnchor.x, ptAnchor.y, drawWidth, drawHeight);
                        clean();
                        g.drawImage(introimage, 0, 250, this);
                        
             }
             
             




// Here are the msg groups.
// msg1 to msg12 are the basic msg. 
// They are used by many templates. They are divided into 2 groups.



        String fontname1 = "Roman"; 
        int type1 = Font.PLAIN;  
        int size1 = 2*SIZE;
        Font font1;




        font1 = new Font(fontname1, type1, size1);
        g.setFont(font1); 
        g.setColor(color1);

// centering the output

        fontmetrics = getFontMetrics(font1);
        x1 = (size().width - fontmetrics.stringWidth(msg1)) / 2;
        x3 = (size().width - fontmetrics.stringWidth(msg3)) / 2;
        x5 = (size().width - fontmetrics.stringWidth(msg5)) / 2;
        x7 = (size().width - fontmetrics.stringWidth(msg7)) / 2;
        x9 = (size().width - fontmetrics.stringWidth(msg9)) / 2;
        x11 = (size().width - fontmetrics.stringWidth(msg11)) / 2;




// (rem) center y:       y = (size().height + fontmetrics.getHeight()) / 2;



        g.drawString(msg1, x1+randomRelocateX1Out*pmX, 300);
        g.drawString(msg3, x3+randomRelocateX1Out*pmX, 360);
        g.drawString(msg5, x5+randomRelocateX1Out*pmX, 420);
        g.drawString(msg7, x7+randomRelocateX1Out*pmX, 480);
        g.drawString(msg9, x9+randomRelocateX1Out*pmX, 540);
        g.drawString(msg11, x11+randomRelocateX1Out*pmX, 600);

        

     
        String fontname8 = "Roman"; 
        int type8 = Font.PLAIN;  
	  int size8 = fontM8*SIZE; 
	  Font font8;



        font8 = new Font(fontname8, type8, size8);
        g.setFont(font8); 
        g.setColor(color8);        
        
        fontmetrics = getFontMetrics(font8);     
     
     
        x2 = (size().width - fontmetrics.stringWidth(msg2)) / 2;
        x4 = (size().width - fontmetrics.stringWidth(msg4)) / 2;
        x6 = (size().width - fontmetrics.stringWidth(msg6)) / 2;
        x8 = (size().width - fontmetrics.stringWidth(msg8)) / 2;
        x10 = (size().width - fontmetrics.stringWidth(msg10)) / 2;
        x12 = (size().width - fontmetrics.stringWidth(msg12)) / 2;

        g.drawString(msg2, x2, 330+randomRelocateY8Out*pmY);
        g.drawString(msg4, x4, 390+randomRelocateY8Out*pmY);
        g.drawString(msg6, x6, 450+randomRelocateY8Out*pmY);
        g.drawString(msg8, x8, 510+randomRelocateY8Out*pmY);
        g.drawString(msg10, x10, 570+randomRelocateY8Out*pmY);
        g.drawString(msg12, x12, 630+randomRelocateY8Out*pmY);
     
        
// left and right aligning. comes with msg6 and 2 times CenterBig: template 6.

        String fontname7 = "Roman"; 
        int type7 = Font.PLAIN;  
	  int size7 = fontM7*SIZE;
        Font font7;




        font7 = new Font(fontname7, type7, size7);
        g.setFont(font7); 
        g.setColor(color7);        
        
        fontmetrics = getFontMetrics(font7);

 // aligning right


        x4Right = size().width - fontmetrics.stringWidth(msg4Right);
        x7Right = size().width - fontmetrics.stringWidth(msg7Right);
       
        g.drawString(msg4Right, x4Right-randomRelocateX1Out, 390);
        g.drawString(msg7Right, x7Right-randomRelocateX1Out, 480);
        
 // aligning left        
        
        g.drawString(msg5Left, 0+randomRelocateX1Out, 420);
        g.drawString(msg8Left, 0+randomRelocateX1Out, 510);        
        
        
        
        
        
// the center msg, template 4
// comes with north, east, south and west.
// a big font (4 times msg1, if not changed in the html page.)


        String fontname2 = "Roman"; 
        int type2 = Font.PLAIN;   
	  int size2 = fontM2*SIZE*4;
        Font font2;

        font2 = new Font(fontname2, type2, size2);
        g.setFont(font2); 

        fontmetrics = getFontMetrics(font2);

        g.setFont(font2); 
        g.setColor(color2);

        xCenter = (size().width - fontmetrics.stringWidth(msgCenter)) / 2;
        heightCenter = fontmetrics.getHeight();
        xCenterEnd = (size().width + fontmetrics.stringWidth(msgCenter)) / 2;


        g.drawString(msgCenter, xCenter, 540);



  
// two times centerBig msg - comes with left and right and msg6: template 6.
// a big font (4 times msg1, if not changed in the html page.)
  
        String fontname9 = "Roman"; 
        int type9 = Font.PLAIN;   
	  int size9 = fontM9*SIZE*4;
        Font font9;

        font9 = new Font(fontname9, type9, size9);
        g.setFont(font9); 

        fontmetrics = getFontMetrics(font9);

        g.setFont(font9); 
        g.setColor(color9);

  
        x3Center = (size().width - fontmetrics.stringWidth(msg3CenterBig)) / 2;
        x11Center = (size().width - fontmetrics.stringWidth(msg11CenterBig)) / 2;
  
        g.drawString(msg3CenterBig, x3Center, 360);
        g.drawString(msg11CenterBig, x11Center, 600);
  
  
  // east ,west, south best + north: template 4.
 

        String fontname3 = "Roman"; 
        int type3 = Font.PLAIN;
	  int size3 = fontM3*SIZE;
        Font font3;

        font3 = new Font(fontname3, type3, size3);
        g.setFont(font3); 

        fontmetrics = getFontMetrics(font3);

        g.setFont(font3); 
        g.setColor(color3);


// position relative to msgCenter

        xNorth = (size().width - fontmetrics.stringWidth(msgNorth)) / 2;
        xWest = xCenter - 30 - fontmetrics.stringWidth(msgWest);
        xEast = xCenterEnd + 30;
        xSouth = (size().width - fontmetrics.stringWidth(msgSouth)) / 2;

        g.drawString(msgNorth, xNorth, (540 - heightCenter));
        g.drawString(msgWest, xWest, (540 - (heightCenter/2)));
        g.drawString(msgEast, xEast, (540 - (heightCenter/2)));
        g.drawString(msgSouth, xSouth, 600);



// double: header top and bottom: template 5.

        String fontname4 = "Roman"; 
        int type4 = Font.PLAIN;    
	  int size4 = SIZE*4;
        Font font4;

        font4 = new Font(fontname4, type4, size4);
        g.setFont(font4); 

        fontmetrics = getFontMetrics(font4);

        g.setFont(font4); 
        g.setColor(color4);


        xDouble1 = (size().width - fontmetrics.stringWidth(msgDouble1)) / 2;
        xDouble13 = (size().width - fontmetrics.stringWidth(msgDouble13)) / 2;

        g.drawString(msgDouble1, xDouble1, 290+randomRelocateY8Out*pmY/2);
        g.drawString(msgDouble13, xDouble13, 660+randomRelocateY8Out*pmY/2);


// BigStairs1, 2, 3 and LittleStairs1, 2, 3  go together (red over black): template 7.
// make a staircase: 
//           - STAIRS 
//                  centered 
//                          + STAIRS

// bigstairs


        String fontname5 = "Roman"; 
        int type5 = Font.PLAIN;      
	  int size5 = SIZE*8;
        Font font5;

        font5 = new Font(fontname5, type5, size5);
        g.setFont(font5); 

        fontmetrics = getFontMetrics(font5);

        g.setFont(font5); 
        g.setColor(color5);




        xBigStairs1 = (size().width - fontmetrics.stringWidth(msgBigStairs1) - STAIRS) / 2;
        xBigStairs2 = (size().width - fontmetrics.stringWidth(msgBigStairs2)) / 2;
        xBigStairs3 = (size().width - fontmetrics.stringWidth(msgBigStairs3) + STAIRS) / 2;
        xBigStairs3End = (size().width + fontmetrics.stringWidth(msgBigStairs3) + STAIRS) / 2;

        g.drawString(msgBigStairs1, xBigStairs1, 350);
        g.drawString(msgBigStairs2, xBigStairs2, 430);
        g.drawString(msgBigStairs3, xBigStairs3, 520);





// LittleStairs

        String fontname6 = "Roman"; 
        int type6 = Font.PLAIN;   
	  int size6 = SIZE*2;
        Font font6;

        font6 = new Font(fontname6, type6, size6);
        g.setFont(font6); 

        fontmetrics = getFontMetrics(font6);

        g.setFont(font6); 
        g.setColor(color6);

        xLittleStairs1 = xBigStairs1;
        xLittleStairs2 = (size().width - fontmetrics.stringWidth(msgLittleStairs2)) / 2;
        xLittleStairs3 = xBigStairs3End - fontmetrics.stringWidth(msgLittleStairs3);

        g.drawString(msgLittleStairs1, xLittleStairs1, 330);
        g.drawString(msgLittleStairs2, xLittleStairs2, 410);
        g.drawString(msgLittleStairs3, xLittleStairs3, 500);




       }












        public String getAppletInfo() {
              return "Title: Poem Generator\nAuthor: Ante Wessels\nCreates Visual Poetry";
        }




}
// end of class 




class poemhelpFrame extends Frame implements WindowListener, ActionListener {

        Menu Menu1;                    
        MenuBar Menubar1;                                                      
        MenuItem menuitem4;  
        TextArea textarea1;
                                                                                                                                      
        poemhelpFrame(String title){                                               
                super(title);                                                  
                
                setLayout(new GridLayout(1, 1));     
                textarea1 = new TextArea ("\nWelcome to the Poem Generator.\n\nThe Poem Generator can be run automatically - suspend, resume - \nor manually: choose one of the poems like Hacker's Delight.\nTo create your own poem fill in the empty textfields.\nUp to 10 words, up to 4 sentences.\nYou can leave fields blank - but do use the first textfield.\n\nTake the keywords of a dream, meeting or some other event.\nThen choose Own Input or resume.\nExtra option: In the special textfield ( ' Paola ' ), fill in the name of the One You Love. \nThen choose You ! or resume.\nLack of self-confidence? Fill in your own name!\n\nThe Poem Generator uses random generators:\n  - Each time you will get another poem.\n  - Sometimes the poem dissolves into the background: Nirvana...\n  - You will not get the same poem back, so, if you like one, save it!\n\nHow to save?\nUnfortunately, for security reasons you cannot save from a Java Applet.\nYou can make a screenshot however.\nWindows: push the Printscreen key on your keyboard, open a graphical program,\nlike programs - accessories - paint, choose paste and save.\n\nYou can go off line while using the poem generator.\nSource code & download: see the links at the bottom of the html page.\nYou are free to use & copy this applet.\n\nRestart Auto function: resume.\n\nThe poems Hacker's Delight & You ! were made for this Poem Generator.\nAmorvita is inspired by ! Amorvita ! by Ante Wessels.\nOn the Road is inspired by the novel by Jack Kerouac.\nShakescene is inspired by the works of William Shakespeare.\n\nPoem Generator\nby Ante Wessels\nvitanova@freemail.nl\nhttp://huizen.dds.nl/~vitanova\n\nHave fun!");
               
                add (textarea1);   
                textarea1.setEditable(false);                       
                Menubar1 = new MenuBar();                                      
                Menu1 = new Menu("File");
                                                                                                                                      

                Menubar1.add(Menu1); 
                setMenuBar(Menubar1);
                                                                                                                                      
                Menu1.addSeparator();                                          
                                                                                                                                      
                menuitem4 = new MenuItem("Exit");                              
                menuitem4.addActionListener(this);                             
                Menu1.add(menuitem4);   
                

        addWindowListener(this);
    }

/*  Implements WindowListener  */
    public void windowActivated(WindowEvent e){
    } 
    public void windowClosed(WindowEvent e){
    } 
    public void windowClosing(WindowEvent e){
           dispose();
           System.exit(0);
    } 
    public void windowDeactivated(WindowEvent e){
    } 
    public void windowDeiconified(WindowEvent e){
    } 
    public void windowIconified(WindowEvent e){
    } 
    public void windowOpened(WindowEvent e){
    } 

                          
                                                                              
                                                                                                                                      
        public void actionPerformed(ActionEvent event){    
                    

            if(event.getSource() == menuitem4){  
            
                    setVisible(false);


            }      
           
               
            if (event.getActionCommand()== "Exit") {
                 dispose();
                 System.exit(0);
           }            
        }                                                              
 }

 

 
 
 
 
 
 
 


 

