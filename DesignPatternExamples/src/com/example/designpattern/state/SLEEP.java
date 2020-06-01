package com.example.designpattern.state;

calss SLEEP implements State {
 public void on_button(Light light){
   light.setState( new ON()  );
   }
 
 public void off_button(Light light){
   light.setState( new OFF()  );
   } 
}   
