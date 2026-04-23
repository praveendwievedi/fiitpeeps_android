import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.AllIcons
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Regular

@Preview(showBackground = true)
@Composable
fun HomePage() {
    Column {
        HomePageTopBar()
        HomePageBody()
//        AnimatedHeartButton()

    }
}

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageTopBar() {
    var darkMode by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(
                0.2f
            ),
        contentAlignment = Alignment.CenterStart
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 0.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "F",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                "FiitPeeps",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold
            )
        }
        IconToggleButton(
            modifier = Modifier.align(Alignment.CenterEnd),

            checked = darkMode,
            onCheckedChange = {
                darkMode = !darkMode
            },
//            interactionSource = MutableInteractionSource(
//                check(darkMode)
//            )
        ) {
            when (darkMode) {
                false -> Icon(
                    Icons.Outlined.DarkMode,
                    tint = Color.DarkGray,
                    contentDescription = "Dark mode"
                )

                true -> Icon(
                    Icons.Filled.LightMode,
                    tint = Color.Yellow,
                    contentDescription = "lighMode"
                )
            }
        }
    }
}

//@Preview(showBackground = )
@Composable
fun HomePageBody() {
    Column {

        // Greetings
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxWidth()
                    .padding(10.dp, 0.dp),
            ) {
                Text("<Date>")
                Box(
//                    modifier = Modifier.
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Good Morning, Alex",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.SemiBold
                    )
//                    Icon(Icons.Default.)
                }
            }
            IconButton(
                onClick = {},
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Icon(Icons.Default.Notifications, contentDescription = "")
            }
        }

        // Slides for the Workout
        Column(
            modifier = Modifier
                .padding(12.dp)
                .shadow(
                    elevation = 10.dp
                )
                .height(200.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp))
        ) {

            Row(
                modifier = Modifier
                    .padding(0.dp, 10.dp)
                    .fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text("Today's Calories")
                Box(
                    modifier = Modifier
                        .size(100.dp, 20.dp)
                        .background(Color.Blue, shape = RoundedCornerShape(12.dp))
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Text("On Track"
                        ,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(10.dp, 0.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        progress = {0.5f},
                        strokeWidth = 10.dp,
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .fillMaxHeight()
                            .align(Alignment.Center)
                    )
                   Box(
                       modifier = Modifier
                           .padding(0.dp, 30.dp)
                           .fillMaxHeight()
                       , contentAlignment = Alignment.Center
                   ){
                       Icon(Icons.Outlined.LocalFireDepartment,
                           tint = Color.Yellow,
                           contentDescription = "",
                           modifier = Modifier.align(Alignment.TopCenter))
                       Text("<calorie_value>",
                           modifier = Modifier.align(Alignment.Center)
                           )
                   }
                }
                Column (
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                    ,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    LinearProgressIndicator(
                        progress = {0.5f},
                        color = Color.Blue,
                        gapSize = (-0).dp,
                        modifier = Modifier.height(10.dp)
//                        strokeCap = 10.dp
                    )
                    LinearProgressIndicator(
                        progress = {0.5f},
                        modifier = Modifier.height(10.dp)
                    )
                    LinearProgressIndicator(
                        progress = {0.5f},
                        modifier = Modifier.height(10.dp)
                    )
                }
            }
        }

       StepsCardView()
    }
}


// veiw card
@Composable
fun StepsCardView() {
    Row(
        modifier = Modifier
            .padding(10.dp, 5.dp)
            .fillMaxWidth()
        ,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        MediumCardVeiw()
        MediumCardVeiw()
        MediumCardVeiw()
    }

}


// cards
@Composable
fun MediumCardVeiw(backGroudColor: String = "Color.White") {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .width(100.dp)
            .height(100.dp)
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ){}

}

// Reccomendation Card 

@Composable
fun ReccomendationCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f)
        ){}
        Row(){
            Box(){}
            Box(){}
            Box(){}
        }
    }
}


//@Composable
//fun AnimatedHeartButton() {
//    var isChecked by remember { mutableStateOf(false) }
//
////    // 1. Create a transition based on the checked state
////    val transition = updateTransition(targetState = isChecked, label = "FavoriteAnim")
////
////    // 2. Define the animation for the size (scale)
////    val scale by transition.animateFloat(
////        label = "Scale",
////        transitionSpec = {
////            if (false isTransitioningTo true) {
////                // When turning ON: springy bounce
////                spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow)
////            } else {
////                // When turning OFF: simple quick shrink
////                tween(durationMillis = 200)
////            }
////        }
////    ) { state ->
////        if (state) 1.5f else 1.0f // Scale up to 1.5x when checked
////    }
//
//    // 3. Apply the scale to your Icon
//    IconToggleButton(
//        checked = isChecked,
//        onCheckedChange = { isChecked = it }
//    ) {
//        Icon(
//            imageVector = if (isChecked) Icons.Filled.LightMode else Icons.Outlined.DarkMode,
//            contentDescription = null,
//            tint = if (isChecked) Color.Yellow else Color.Gray,
////            modifier = Modifier.graphicsLayer(scaleX = scale, scaleY = scale) // The magic line
//        )
//    }
//}