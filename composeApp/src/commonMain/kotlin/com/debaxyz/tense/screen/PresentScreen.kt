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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api

import com.debaxyz.tense.divider.*
import com.debaxyz.tense.ui.theme.Accent400
import com.debaxyz.tense.ui.theme.Accent50



/**
 * Composable function that represents the home screen of the application.
 */

@Composable
fun PresentScreen() {
Box(modifier = Modifier.fillMaxSize(), 
   contentAlignment = Alignment.Center) 
   {
 OutlinedCardLazyColumnExample()
   }  
 }
 
 
 /* Divider */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedCardLazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(start=16.dp, end=16.dp, bottom=8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
    
    /*******************/
    /*  Present Simple */
    /*******************/
    
     // Start
        items(1) { 
            ElevatedCard(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom=2.dp),
        shape = RoundedCornerShape(topStart=30.dp, topEnd=30.dp,bottomStart=30.dp, bottomEnd=30.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        
        ) 
     {
    Column(modifier = Modifier.fillMaxWidth()
   .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center )
    
     {
     Column(modifier = Modifier.padding(10.dp)){
        Text( text = "Present Simple",
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
              color = Accent400,
              
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
              
              Text( text = "I play - ମୁଁ ଖେଳେ",
                    fontSize = 14.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "We go - ଆମେ ଯାଉ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "You eat - ତୁମେ ଖାଅ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "He goes - ସେ ଯାଏ (ପୁଂ)",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "She goes - ସେ ଯାଏ (ସ୍ତ୍ରୀ)",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They go -  ସେମାନେ ଯାଆନ୍ତି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "It works - ଏହା କାମ କରେ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Theses people go - ଏହି ଲୋକମାନେ ଯାଆନ୍ତି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Debashis goes to Cuttack- ଦେବାଶିଷ କଟକ ଯାଏ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
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
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        
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
              color = Accent400,
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.height(8.dp))  
        
         // Right-aligned using Box
    Box(modifier = Modifier.fillMaxWidth()){
    
        Text( text = "ଉଛ/ଉଛି/ଉଛୁ/ଉଛନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400,
              
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
              
              Text( text = "I am playing - ମୁଁ ଖେଳୁଛି",
                    fontSize = 14.sp,fontWeight = FontWeight.Bold)
                  
              
               Text( text = "We are going - ଆମେ ଯାଉଛୁ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "You are going - ତୁମେ ଯାଉଛ",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "He is going - ସେ ଯାଉଛି (ପୁଂ)",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "She is going - ସେ ଯାଉଛି (ସ୍ତ୍ରୀ)",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They are going - ସେମାନେ ଯାଉଛନ୍ତି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "It is working - ଏହା କାମ କରୁଛି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "These people are going- ଏହି ଲୋକମାନେ ଯାଉଛିନ୍ତି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Debashis is going to Cuttack -ଦେବାଶିଷ କଟକ ଯାଉଛି",
              fontSize = 14.sp,fontWeight = FontWeight.Bold)
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
        
        Column( modifier = Modifier.padding(start=10.dp,end=10.dp),horizontalAlignment = Alignment.Start)
         {
        
        Text( text = "Sub+has/have/V3+O.W",
              fontWeight = FontWeight.Bold,
              color = Accent400,
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.height(8.dp))  
        
         // Right-aligned using Box
    Box(modifier = Modifier.fillMaxWidth()){
    
        Text( text = "ଇଛ/ଇଛି/ଇଛୁ/ଇଛନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400,
              
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
                PresentPerfectDivider2x2Grid()
        
    }
              Column(modifier = Modifier.fillMaxWidth().padding(start=16.dp)){
              
              Text( text = "I have played - ମୁଁ ଖେଳିଛି",
                    fontSize = 18.sp,fontWeight = FontWeight.Bold)
                  
              Text( text = "We have gone - ଆମେ ଯାଇଛୁ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
               Text( text = "You have gone - ତୁମେ ଯାଇଛ",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "He has gone - ସେ ଯାଇଛି (ପୁଂ)",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "She has gone - ସେ ଯାଇଛି (ସ୍ତ୍ରୀ)",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "They have gone - ସେମାନେ ଯାଇଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "It has worked - ଏହା କାମ କରିଛି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "These people have gone - ଏହି ଲୋକମାନେ ଯାଇଛନ୍ତି",
              fontSize = 18.sp,fontWeight = FontWeight.Bold)
              
              Text( text = "Debashis has gone to Cuttack - ଦେବାଶିଷ କଟକ ଯାଇଛି",
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
              color = Accent400,
              modifier = Modifier
               .background(color = Accent50,RoundedCornerShape(18.dp))
                 .height(35.dp)
              // .width(150.dp)
                .padding(start=8.dp, end=8.dp, top=5.dp) )
                
        Spacer(modifier = Modifier.width(16.dp))  
        
        
        Text( text = "ଏ/ଆ/ଉ/ଆନ୍ତି",
              fontWeight = FontWeight.Bold,
              color = Accent400,
              
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