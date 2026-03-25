package com.debaxyz.tense.divider

import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.runtime.Composable

/**
 * Composable function that represents the home screen of the application.
 */



/* Divider */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextDivider2x2Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "V1",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "I/You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "V5",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
    }
}

   
    /*********************/
    /*  Present Perfect  */
    /*********************/

@Composable
fun PresentPerfectDivider2x2Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Have",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "I/You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Has",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
    }
}




@Composable
fun TextDivider3x3Grid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min), // IntrinsicSize.Min makes children match the height of the tallest child
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "is",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
               .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
                //color = Color.Gray
            )
            Text(
                "He/She/It & Singular nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
               .weight(1f)
               .padding(8.dp),
         
               fontWeight = FontWeight.Bold
                
            )
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "am",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "I",
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
        
        
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
            //color = Color.Gray
        )
        
           // Third Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "are",
                modifier = Modifier
               // .weight(1f)
                .width(80.dp)
                .padding(start=30.dp),
                fontWeight = FontWeight.Bold
            )
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp
              //  color = Color.Gray
            )
            Text(
                "You/We/They & Plural nouns",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                 .weight(1f)
                .padding(8.dp),
                fontWeight = FontWeight.Bold
              //   .width(100.dp)
            )
        }
        
    }
}
