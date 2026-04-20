package com.example.myapplication.pages

import android.text.style.ClickableSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun DiaryPage() {
    Column {
        DiaryHeading()
        DiaryBody()
    }
}

//@Preview(showBackground = true)
@Composable
fun DiaryHeading(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(color = Color.Blue)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
            ,
            contentAlignment = Alignment.Center
        ){
            Text("FiitPeeps",
                color = Color.White,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold)
            Text("Diary",
                color = Color.White,
                fontStyle = FontStyle.Italic,
                fontSize = 10.sp,
                modifier = Modifier.align(Alignment.BottomEnd)

            )
        }
        Box(
            modifier = Modifier
                .padding(20.dp)
                .width(40.dp)
                .fillMaxHeight()
                .background(color = Color.White, shape = CircleShape)
                .border(2.dp, Color.Magenta, CircleShape)
            ,
            contentAlignment = Alignment.Center
        ){
            Text("F",
                color = Color.Blue,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Black)
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun DiaryBody() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = Color.Gray)
            ,
            contentAlignment = Alignment.Center
        ){
            Row (
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("Here we gonna show Calories so far")
                }
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .fillMaxHeight()
                    ,
                    contentAlignment = Alignment.Center
                ){
                    CircularProgressIndicator(
                        progress = {0.5f},
                        color = Color.Yellow,
                        strokeWidth = 10.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                    )

                }

            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
//            .background(color = Color.White,sha)
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                ,
                contentAlignment = Alignment.Center
            ){
                Text("Add BreakFast"
                    , color = Color.Blue
                    , modifier = Modifier.padding(12.dp)
                        .align(Alignment.TopStart)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                ,
                contentAlignment = Alignment.Center
            ){
                Text("Add Lunch" , color = Color.Blue
                    , modifier = Modifier.padding(12.dp)
                        .align(Alignment.TopStart)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                ,
                contentAlignment = Alignment.Center
            ){
                Text("Add Dinner" , color = Color.Blue
                    , modifier = Modifier.padding(12.dp)
                        .align(Alignment.TopStart))
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.LightGray, shape = RoundedCornerShape(12.dp))
                ,
                contentAlignment = Alignment.Center
            ){
                Text("Add Snacks" , color = Color.Blue
                    , modifier = Modifier.padding(12.dp)
                        .align(Alignment.TopStart))
            }
        }
    }
}
