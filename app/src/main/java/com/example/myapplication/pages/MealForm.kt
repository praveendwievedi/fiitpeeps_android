import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.models.Meal


@Composable
fun MealForm(onMealAdded: (Meal) -> Unit, onCancel: () -> Unit) {
    var mealName by remember { mutableStateOf("") }
    var calorieInput by remember { mutableStateOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(value = mealName, onValueChange = { mealName = it }, label = { Text("Name") })
        TextField(value = calorieInput, onValueChange = { calorieInput = it }, label = { Text("Calories") })

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = {
                val calories = calorieInput.toFloatOrNull() ?: 0f
                if (mealName.isNotBlank()) {
                    onMealAdded(Meal(calories, mealName))
                }
            }) {
                Text("Submit")
            }

            OutlinedButton(onClick = onCancel) {
                Text("Cancel")
            }
        }
    }
}