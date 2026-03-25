package com.debaxyz.tense.screen

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api

import com.debaxyz.tense.divider.*
import com.debaxyz.tense.ui.theme.Accent400
import com.debaxyz.tense.ui.theme.Accent50


/**
 * Composable function that represents the home screen of the application.
 */


@Composable
fun PastScreen() {

Box(modifier = Modifier.fillMaxSize(), 
   contentAlignment = Alignment.Center) 
   {
 PastLazyColumnExample()
   }  
 }
 



/* Divider */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PastLazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(start=16.dp, end=16.dp, bottom=8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
    
    /*******************/
    /*  Past Simple    */
    /*******************/
    
     // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
      //  elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Past Simple",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Row(modifier = Modifier.padding(0.dp)){
        
        Text( text = "Sub+V2+O.W",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ଲ/ଲା/ଲି/ଲୁ/ଲେ",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              
              modifier = Modifier
              .background(color = Accent50,RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        
      }
      
     // OutlinedCard(modifier = Modifier.padding(16.dp) )
      
     // {  TextDivider2x2Grid() }
      
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp, top=16.dp)){
              
              Text( text = "I ate - ମୁଁ ଖାଇଲି",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "I ate rice - ମୁଁ ଭାତ ଖାଇଲି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "I went - ମୁଁ ଗଲି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "He played - ସେ ଖେଳିଲେ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "We sang - ଆମେ ଗାଇଲୁ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They found - ସେମାନେ ପାଇଲେ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              
          }
         }
       }
      }
      
      // end
      
    /***********************/
    /*  Present Continuous */
    /***********************/
    
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
      //  elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Present Continuous",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Column( modifier = Modifier.padding(start=10.dp,end=10.dp),horizontalAlignment = Alignment.Start)
         {
        
        Text( text = "Sub+is/am/are/V4+O.W",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.height(8.dp))  
        
         // Right-aligned using Box
    Box(modifier = Modifier.fillMaxWidth()){
    
        Text( text = "ଉଛ/ଉଛି/ଉଛୁ/ଉଛେ/ଉଛନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              
              modifier = Modifier
              .align(Alignment.CenterEnd)
              .background(color = Accent50,RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        }
      }
      OutlinedCard(modifier = Modifier.padding(16.dp) ){
                TextDivider3x3Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I am going - ମୁଁ ଯାଉଛି",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              
               Text( text = "He is Playing - ସେ ଖେଳୁଛି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They are studying - ସେମାନେ ପଡୁଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Rita is eating - ରିତା ଖାଉଛି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You are writing - ତୁମେ ଲେଖୁଛ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Children are crying - ପିଲାମାନେ ଖାନ୍ଦୁଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
          }
         }
       }
      }
      
      // end
      
       
    /*********************/
    /*  Present Perfect  */
    /*********************/
    
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
      //  elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Present Perfect",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Row(modifier = Modifier.padding(0.dp)){
        
        Text( text = "Sub+V1/V5+O.W",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ଏ/ଆ/ଉ/ଆନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              
              modifier = Modifier
              .background(color = Accent50,RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        
      }
      OutlinedCard(modifier = Modifier.padding(16.dp) ){
                TextDivider2x2Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I eat - ମୁଁ ଖାଏ",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "I eat rice - ମୁଁ ଭାତ ଖାଏ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "He comes - ସେ ଆସନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Priya studies - ପ୍ରିୟା ପଡ଼େ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "We eat - ଆମେ ଖାଉ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You dance- ତୁମେ ନାଚ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They Play- ସେମାନେ ଖେଳନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
          }
         }
       }
      }
      
      // end
        
    /********************************/
    /*  Present Perfect Continuous  */
    /********************************/
        
        // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
      //  elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Present Perfect Continuous",
              fontWeight = FontWeight.Bold,
              style = MaterialTheme.typography.titleLarge )
             //  
                
      }
        
        Row(modifier = Modifier.padding(0.dp)){
        
        Text( text = "Sub+V1/V5+O.W",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ଏ/ଆ/ଉ/ଆନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400, // A400 color
              
              modifier = Modifier
              .background(color = Accent50,RoundedCornerShape(18.dp) )
              .height(35.dp)
              
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=6.dp)
                )
                
        
      }
      OutlinedCard(modifier = Modifier.padding(16.dp) ){
                TextDivider2x2Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I eat - ମୁଁ ଖାଏ",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "I eat rice - ମୁଁ ଭାତ ଖାଏ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "He comes - ସେ ଆସନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Priya studies - ପ୍ରିୟା ପଡ଼େ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "We eat - ଆମେ ଖାଉ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You dance- ତୁମେ ନାଚ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They Play- ସେମାନେ ଖେଳନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
          }
         }
       }
      }
      
      // end
    }
}