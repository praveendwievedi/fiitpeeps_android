package com.example.myapplication.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import kotlin.math.round

// i am trying to push this code using second-device brach

    val ProfileText = 20

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Column {
        HomePageHeading()
        HomePageBody()
    }
}

    //    @Preview(showBackground = true)
    @Composable
    fun HomePageHeading(){
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
//                Text("Home",
//                    color = Color.White,
//                    fontStyle = FontStyle.Italic,
//                    fontSize = 10.sp,
//                    modifier = Modifier.align(Alignment.BottomEnd)
//
//                )
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



    // the Body where we will show the calorie tracker and steps tracker

//    @Preview(showBackground = true)
    @Composable
    fun HomePageBody() {
        var descriptions by remember { mutableStateOf( "Here AI will describe how was your physical activity and how is ur calorie intake"
        ) }
        var reccomendations by remember { mutableStateOf("Here we gonna put the recommendation we get from AI") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            ,
//            contentAlignment = Alignment.Center
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
//                    .padding(10.dp,0.dp)
                    .background(color = Color.LightGray , shape = RoundedCornerShape(12.dp))
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f)
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("Calrie Tracker")
                }
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("5000/10,000")
                    CircularProgressIndicator(
                        progress = {0.5f},
                        modifier = Modifier
                            .fillMaxHeight()
//                         .fillMaxWidth(0.5f)
                            .width(120.dp)
                            .padding(5.dp)
                            .align(Alignment.Center),
                        strokeWidth = 10.dp,
                        color = Color.Yellow
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
//                    .padding(10.dp,0.dp)
                    .background(color = Color.LightGray , shape = RoundedCornerShape(12.dp))
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f)
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("Calrie Tracker")
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
//                        .padding(0.dp,20.dp)
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("5000/10,000",
                        modifier = Modifier.align(Alignment.BottomCenter))
                    LinearProgressIndicator(
                        progress = {0.5f},
                        modifier = Modifier
                            .height(20.dp)
                         .fillMaxWidth()
                            .align(Alignment.Center),
                        color = Color.Yellow,

                    )
                }
            }
            HomePageFooter(reccomendations,descriptions)
        }

    }




    // the rest part where we will add the recommendation section

    //    @Preview(showBackground = true)
    @Composable
    fun HomePageFooter(reccomendations : String , descriptions : String) {
        var textColor=Color.White
        Column(
            modifier = Modifier
//                .padding(20.dp)
                .fillMaxSize()
                .fillMaxHeight()
//                .border(2.dp, Color.Gray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,

        ){
            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Gray
            )
            Row(
                modifier = Modifier
//                    .align(Alignment.TopStart)
                    .padding(15.dp, 2.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(12.dp))
//                    .drawBehind(
//
//                        onDraw = {
//
//                        }
//                    )
                ,
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "AI",
                    color = textColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                )
                Text(
                    text = "Reccomendation",
                    color = textColor ,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .padding(10.dp, 5.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(12.dp))

            ) {
                Text(
                    "Descriptions",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(10.dp, 3.dp),

                    )
                HorizontalDivider(
                    thickness = 2.dp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(10.dp, 0.dp)
//                        .align(Ali)
                )
                Text(
                    descriptions,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(10.dp, 3.dp)
                )


            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .padding(10.dp, 5.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(12.dp))
            ) {
                Text(
                    "Improvements",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(10.dp, 3.dp),

                    )
                HorizontalDivider(
                    thickness = 2.dp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(10.dp, 0.dp)
//                        .align(Ali)
                )
                Text(
                    reccomendations,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(10.dp, 3.dp)
                )

            }
        }
    }


