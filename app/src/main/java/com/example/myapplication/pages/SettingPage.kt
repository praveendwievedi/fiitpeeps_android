package com.example.myapplication.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.AllIcons
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.brands.Instagram
import compose.icons.fontawesomeicons.brands.Twitter
import compose.icons.fontawesomeicons.brands.Youtube
import compose.icons.fontawesomeicons.regular.Smile
import compose.icons.fontawesomeicons.regular.User

//@Preview(showBackground = true)
@Composable
fun SettingPage() {

}

@Preview(showBackground = true)
@Composable
fun SettingPageBody() {
    Column(
        modifier = Modifier.background(Color.Blue)
    )
    {
        // this for Profile showing
        Box(
            modifier = Modifier
                .fillMaxHeight(0.2f)
                .fillMaxWidth()
                .background(color = Color.Blue, shape = RoundedCornerShape(10.dp))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                // Profile Picture
                Box(
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
                        .size(60.dp)
//                        .align(Alignment.CenterStart)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        FontAwesomeIcons.Regular.User,
                        modifier = Modifier.size(30.dp),
                        contentDescription = "ProfilePicture"
                    )
                }
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text("<UserName>")
                    Box() {
                        Text("<useremail or user-number>")
                    }
                }
            }
        }

        //general Settings
        Column(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(0.dp,10.dp)
//                .fillMaxHeight(0.5f)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(3.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
//                .padding(0.dp,10.dp)
//                .fillMaxHeight(0.5f)
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind(
                            onDraw = {
                                drawLine(
                                    Color.Gray,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height)

                                )
                            }
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterStart),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.AccountCircle,
                            contentDescription = "AccountDetails",
//                    tint = Color.Blue,
                            modifier = Modifier
                                .padding(5.dp, 0.dp)
//                        .align(Alignment.CenterStart)
                        )
                        Text(
                            "Account",
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Black,
                            modifier = Modifier
                                .padding(5.dp)
//                        .align (Alignment.Center)
                        )
                    }
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "More options",
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind(
                            onDraw = {
                                drawLine(
                                    Color.Gray,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height)

                                )
                            }
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(5.dp, 0.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Icon(
                            Icons.Default.Notifications,
                            contentDescription = "Notifications"
                        )
                        Text(
                            "Notification",
//                       color = Color.Blue,
                            fontStyle = FontStyle.Italic,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "More options",
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind(
                            onDraw = {
                                drawLine(
                                    Color.Gray,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height)

                                )
                            }
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .padding(5.dp, 0.dp)
                            .align(Alignment.CenterStart),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.DateRange,
                            contentDescription = "Calender",
//                        modifier = Modifier.align(Alignment.CenterStart)
                        )
                        Text(
                            "Calender",
                            fontStyle = FontStyle.Italic,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "More options",
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind(
                            onDraw = {
                                drawLine(
                                    Color.Gray,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height)

                                )
                            }
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .padding(5.dp, 0.dp)
                            .align(Alignment.CenterStart),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.DateRange,
                            contentDescription = "Calender",
//                        modifier = Modifier.align(Alignment.CenterStart)
                        )
                        Text(
                            "Calender",
                            fontStyle = FontStyle.Italic,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "More options",
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind(
                            onDraw = {
                                drawLine(
                                    Color.Gray,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height)

                                )
                            }
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .padding(5.dp, 0.dp)
                            .align(Alignment.CenterStart),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.DateRange,
                            contentDescription = "Calender",
//                        modifier = Modifier.align(Alignment.CenterStart)
                        )
                        Text(
                            "Calender",
                            fontStyle = FontStyle.Italic,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "More options",
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White, shape = RoundedCornerShape(50.dp, 50.dp, 0.dp, 0.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = RoundedCornerShape(16.dp),
                                clip = false // If true, the shadow won't bleed outside the shape
                            )
                            .background(Color.White, shape = RoundedCornerShape(20.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            FontAwesomeIcons.Brands.Instagram,
                            contentDescription = "",
                            tint = Color.Magenta
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = RoundedCornerShape(16.dp),
                                clip = false // If true, the shadow won't bleed outside the shape
                            )
                            .background(Color.White, shape = RoundedCornerShape(20.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            FontAwesomeIcons.Brands.Twitter,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .shadow(
                                elevation = 10.dp,
                                shape = RoundedCornerShape(16.dp),
                                clip = false // If true, the shadow won't bleed outside the shape
                            )
                            .background(Color.White, shape = RoundedCornerShape(20.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            FontAwesomeIcons.Brands.Youtube,
                            tint = Color.Red,
                            contentDescription = ""
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Here i will put my copyright",
                        modifier = Modifier.align(Alignment.TopStart)
                    )
                    Icon(
                        FontAwesomeIcons.Regular.Smile,
                        modifier = Modifier
                            .background(Color.Yellow, shape = CircleShape)
                            .size(40.dp),
                        tint = Color.Black,
                        contentDescription = ""
                    )
                }
            }
        }


    }
}