//package com.example.myapplication
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AddCircle
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.Icon
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableIntStateOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
////import com.example.myapplication.pages.BodyHomePage
//import com.example.myapplication.pages.DiaryBody
//import com.example.myapplication.pages.DiaryHeading
//import com.example.myapplication.pages.HomePageBody
//import com.example.myapplication.pages.HomePageHeading
//import com.example.myapplication.pages.SettingPageBody
//
//@Preview(showBackground = true)
//@Composable
//fun MainScreen (){
//    var selectedScreen by remember { mutableIntStateOf(0) }
//    Scaffold(
//        topBar = {
//            when (selectedScreen){
//                0-> HomePageHeading()
//                1 -> DiaryHeading()
//            }
//        },
//        bottomBar = {
//            NavigationBar {
//                NavigationBarItem(
//                    selected = selectedScreen==0,
//                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
//                    onClick = {selectedScreen=0}
//                )
//                NavigationBarItem(
//                    selected = selectedScreen==1,
//                    icon = { Icon(Icons.Default.AddCircle, contentDescription = "Diary") },
//                    onClick = {selectedScreen=1}
//                )
//                NavigationBarItem(
//                    selected = selectedScreen==2,
//                    icon = { Icon(Icons.Default.Settings, contentDescription = "Profile") },
//                    onClick = {selectedScreen=2}
//                )
//            }
//        }
//    ) {
//        contentPadding ->
//        Column (
//            modifier = Modifier.padding(contentPadding)
//        ){
////            if(selectedScreen==0) BodyHomePage()
//////            if (selectedScreen==1) DiaryBody()
//            when (selectedScreen){
//                0 -> HomePageBody()
//                1 -> DiaryBody()
//                2-> SettingPageBody()
//            }
//
//        }
//    }
//
//}