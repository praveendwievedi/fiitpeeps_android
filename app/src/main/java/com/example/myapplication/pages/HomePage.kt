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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import kotlin.math.round

// i am trying to push this code using second-device brach

class HomePage {

    val ProfileText = 20
    var reccomendations = "Here we will get the recommendation form AI "
//        by remember { mutableStateOf("Here we will get the recommendation form AI ") }

    var descriptions =
        "Here AI will describe how was your physical activity and how is ur calorie intake"

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun HomeScreen() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
//                .scrollable()
        ) {
            Heading()
            BodyHomePage()
            HomePageFooter()
//            FooterTraversal()
        }
    }

    //    @Preview(showBackground = true)
    @Composable
    fun Heading() {
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxWidth()
                .height(80.dp)
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
//            Icon(
//
//            )
            Text(
                text = "FiitPeeps",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterStart)
            )
//            CircleShape
            Box(
                modifier = Modifier
                    .background(color = Color.White, shape = CircleShape)
                    .align(Alignment.CenterEnd)
                    .size(40.dp)
//                    .padding(2.dp)
                    .border(2.dp, color = Color.Green, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                // profile-photo
                Text(
                    text = "P",
                    color = Color.Magenta,
                    fontWeight = FontWeight.Black,
                    fontSize = ProfileText.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }
    }

//    annotation class TextUnit(val value: androidx.compose.ui.unit.TextUnit)

    //    @Preview(showBackground = true)
    @Composable
    fun BodyHomePage() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
//            contentAlignment = Alignment.Center
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(12.dp)
                    )
//                  .size(200.dp,100.dp)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(100.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Text(
                    "Steps tracker",
//                 fontSize = TextUnit.,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic,
//                    modifier = Modifier.align(Alignment.CenterStart)
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)// Make it tall enough for text
                ) {
                    CircularProgressIndicator(
                        progress = { 0.5F },
                        modifier = Modifier
                            .fillMaxSize()
//                            .fillMaxWidth(0.8f)
                            .align(Alignment.TopCenter),
                        color = Color.Green,
                        strokeWidth = 10.dp
                    )
                    Text(
                        text = "${(0.5F * 10000).toInt()}/10000",
                        modifier = Modifier
//                            .padding(10.dp)
                            .align(Alignment.Center)
//                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
            Row(
                modifier = Modifier
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(12.dp)
                    )
//                  .size(200.dp,100.dp)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(100.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Text(
                    "Total Calorie",
//                 fontSize = TextUnit.,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic,
//                    modifier = Modifier.align(Alignment.CenterStart)
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .size(120.dp)
                        .padding(10.dp)// Make it tall enough for text
                ) {
                    LinearProgressIndicator(
                        progress = { 0.5F },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                    )
                    Text(
                        text = "${(0.5F * 10000).toInt()}/10000",

                        )
                }
            }
        }

    }

//    @Composable
//    fun divider(){
//        Box(
//            modifier = Modifier
//                .background(color = Color.Gray)
//        ){
//
//        }
//    }

    //    @Preview(showBackground = true)
    @Composable
    fun HomePageFooter() {
        Column(
            modifier = Modifier
//                .padding(20.dp)
                .fillMaxSize()
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
                    .padding(10.dp, 2.dp)
//                    .background(Color.Gray , shape = RoundedCornerShape(12.dp))
                ,
                horizontalArrangement = Arrangement.spacedBy(3.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "AI",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                )
                Text(
                    text = "Reccomendation",
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

//    private fun drawLine(
//        color: Color,
//        start: Offset,
//        end: Offset,
//        strokeWidth: Any
//    ): (DrawScope) -> Unit {
//    }

    @Composable
    fun FooterTraversal() {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            HorizontalDivider(
                thickness = 2.dp,
                color = Color.Black
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    "Home",
                    modifier = Modifier
                        .border(2.dp, Color.Black)
                )
                Text("Diary")
                Text("Setting")
                Text("Profile")
            }
        }
    }

}