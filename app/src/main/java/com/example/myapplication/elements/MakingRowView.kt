import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MakingRowView(MealName: String, CalorieValue: Float) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.LightGray, shape = RoundedCornerShape(3.dp))
            .drawBehind(
                onDraw = {
                    drawLine(
                        Color.Gray,
                        start = Offset(0.1f, size.height),
                        end = Offset(size.width - 0.1f, size.height),
                    )
                }
            )
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text(MealName
            ,
            modifier = Modifier.padding(5.dp,0.dp)
        )
        Text(CalorieValue.toString()
            ,modifier = Modifier.padding(5.dp,0.dp))
    }
}